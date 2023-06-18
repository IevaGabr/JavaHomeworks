package io.codelex.triviagame;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

public class TriviaGameApp {
    static ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    static int score = 0;

    public static void main(String[] args) throws IOException {
        Set<String> numbers = new HashSet<>();
        Map<String, String> factsAboutNumbers = mapper.readValue(new URL("http://numbersapi.com/" + getNumbersForFacts(0, numbers)), Map.class);
        checkIfNumbersHasSomeFact(numbers, factsAboutNumbers);
        while (factsAboutNumbers.size() != 10) {
            System.out.println(factsAboutNumbers.size());
            factsAboutNumbers.putAll(getMoreFacts(numbers, factsAboutNumbers));
        }
        System.out.println(factsAboutNumbers.size());
        playGame(factsAboutNumbers, numbers);
        System.out.println("Your result: " + score + "/10!");
    }

    public static void playGame(Map<String, String> facts, Set<String> numbers) {
        Scanner input = new Scanner(System.in);
        numbers.clear();
        numbers = facts.keySet();
        for (String number : numbers) {
            System.out.println(StringUtils.capitalize(facts.get(number).replaceAll(number + " is ", "")));
            Set<String> answers = new HashSet<>();
            answers.add(number);
            Random random = new Random();
            while (answers.size() < 5) {
                answers.add(Integer.toString(random.nextInt(1000)));
            }
            List<String> answerList = new ArrayList<>(answers);
            Map<String, String> optionsForAnswer = new HashMap<>();
            int index = random.nextInt(answerList.size());
            optionsForAnswer.put("A", answerList.get(index));
            answerList.remove(index);
            index = random.nextInt(answerList.size());
            optionsForAnswer.put("B", answerList.get(index));
            answerList.remove(index);
            index = random.nextInt(answerList.size());
            optionsForAnswer.put("C", answerList.get(index));
            answerList.remove(index);
            optionsForAnswer.put("D", answerList.get(0));
            System.out.println(optionsForAnswer.entrySet().stream().map(e -> e.getKey() + ":" + e.getValue()).collect(Collectors.joining("\n")));
            String playerAnswer = input.nextLine();
            if (optionsForAnswer.get(playerAnswer.toUpperCase()).equals(number)) {
                score++;
            }
        }
    }

    public static Map<String, String> checkIfNumbersHasSomeFact(Set<String> numbers, Map<String, String> factsAboutNumber) {
        for (String number : numbers) {
            if (factsAboutNumber.get(number).equals(number + " is a number for which we're missing a fact (submit one to numbersapi at google mail!).") ||
                    factsAboutNumber.get(number).equals(number + " is an uninteresting number.") ||
                    factsAboutNumber.get(number).equals(number + " is an unremarkable number.") ||
                    factsAboutNumber.get(number).equals(number + " is a boring number.")) {
                factsAboutNumber.remove(number);
            }
        }
        return factsAboutNumber;
    }

    public static String getNumbersForFacts(int size, Set<String> numbers) {
        Random randomNumber = new Random();
        while (numbers.size() != 11 - size) {
            numbers.add(Integer.toString(randomNumber.nextInt(1000)));
        }
        System.out.println(numbers);
        return String.join(",", numbers);

    }

    public static Map<String, String> getMoreFacts(Set<String> numbers, Map<String, String> resp) throws IOException {
        numbers.clear();
        Map<String, String> moreFacts = mapper.readValue(new URL("http://numbersapi.com/" + getNumbersForFacts(resp.size(), numbers)), Map.class);
        return checkIfNumbersHasSomeFact(numbers, moreFacts);
    }
}
