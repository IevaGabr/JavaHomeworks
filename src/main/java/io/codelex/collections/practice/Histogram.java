package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        System.out.println(scores);
        String[] scoresArray = scores.split(" ");
        Map<String, String> histogram = new LinkedHashMap<>();
        for (int i = 0; i <= 100; i += 10) {
            String key = "";
            if (i < 10) {
                key = "0" + i + "-0" + (i + 9);
            } else if (i < 100) {
                key = i + "-" + (i + 9);
            } else {
                key = "  " + i;
            }
            String value = displayScoresInGivenInterval(i, i + 9, scoresArray);
            histogram.put(key, value);
        }
        histogram.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static String displayScoresInGivenInterval(int start, int end, String[] scoreArray) {
        String result = "";
        for (String score : scoreArray) {
            if (Integer.parseInt(score) >= start && Integer.parseInt(score) <= end) {
                result = result + "*";
            }
        }
        return result;
    }
}
