package io.codelex.javaadvancedtest.exercise3;

public class Joiner<T> {
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... item) {
        String result = "";
        for (T i : item) {
            result = result + i.toString() + this.separator;
        }
        return result.substring(0, result.length() - this.separator.length());
    }
}
