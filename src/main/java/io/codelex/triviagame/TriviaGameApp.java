package io.codelex.triviagame;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.exit;

public class TriviaGameApp {
    static ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    public static void main(String[] args) {
        Set<String> numbers = new HashSet<>();
        Map<String, String> factsAboutNumbers = null;
        try {
            factsAboutNumbers = mapper.readValue(new URL("http://numbersapi.com/" + getNumbersForFacts(0, numbers)), Map.class);
            checkIfNumbersHasSomeFact(numbers, factsAboutNumbers);
        } catch (IOException e) {
            System.out.println("Error!");
        }

        while (factsAboutNumbers.size() < 21) {
            try {
                factsAboutNumbers.putAll(getMoreFacts(numbers, factsAboutNumbers));
            } catch (IOException e) {
                System.out.println("Error! Close program!");
                exit(0);
            }
        }
        playGame(factsAboutNumbers, numbers);

    }

    public static void playGame(Map<String, String> facts, Set<String> numbers) {
        int score = 0;
        int countQuestions = 0;
        Scanner input = new Scanner(System.in);
        numbers.clear();
        numbers = facts.keySet();
        for (String number : numbers) {
            countQuestions++;
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
            } else if (countQuestions == 20) {
                System.out.println(StringUtils.capitalize(facts.get(number).replaceAll(number + " is ", "")));
                System.out.println("Correct answer:" + number);
            }
        }
        System.out.println("Your result: " + score + "/" + countQuestions + "!");
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
        while (numbers.size() < 21 - size) {
            numbers.add(Integer.toString(randomNumber.nextInt(1000)));
        }
        return String.join(",", numbers);

    }

    public static Map<String, String> getMoreFacts(Set<String> numbers, Map<String, String> resp) throws IOException {
        numbers.clear();
        Map<String, String> moreFacts = mapper.readValue(new URL("http://numbersapi.com/" + getNumbersForFacts(resp.size(), numbers)), Map.class);
        return checkIfNumbersHasSomeFact(numbers, moreFacts);
    }
}
