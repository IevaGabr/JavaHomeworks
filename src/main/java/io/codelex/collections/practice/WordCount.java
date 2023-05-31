package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> lines = Files.readAllLines(path, charset);
        System.out.println("Lines = " + lines.size());
        List<String> words = new ArrayList<>();
        for (String line : lines) {
            String[] wordArray = line.split(" ");
            for (int i = 0; i < wordArray.length; i++) {
                char[] charsOfWord = wordArray[i].toCharArray();
                int countCharactersInWord = 0;
                for (char character : charsOfWord) {
                    if (Character.isLetterOrDigit(character)) {
                        countCharactersInWord++;
                    }
                }
                if (countCharactersInWord > 0) {
                    words.add(wordArray[i]);
                }
            }
        }
        System.out.println("Words = " + words.size());
        List<String> chars = new ArrayList<>();
        for (String line : lines) {
            chars.addAll(Arrays.asList(line.split("")));
        }
        System.out.println("Chars = " + chars.size());

    }
}
