package io.codelex.enums.practice;

public enum ScissorPaperStone {
    SCISSOR("Scissor", "Paper", "cuts"),
    PAPER("Paper", "Stone", "covers"),
    STONE("Stone", "Scissor", "breaks");

    private final String name;
    private final String strongerThan;
    private final String operation;


    ScissorPaperStone(String name, String strongerThan, String operation) {
        this.name = name;
        this.strongerThan = strongerThan;
        this.operation = operation;
    }

    public String getName() {
        return name;
    }

    public String getStrongerThan() {
        return strongerThan;
    }

    public String getOperation() {
        return operation;
    }

    public static ScissorPaperStone getUserChoice(String userChoice) {
        switch (userChoice) {
            case "s" -> {
                return SCISSOR;
            }
            case "p" -> {
                return PAPER;
            }
            case "t" -> {
                return STONE;
            }
        }
        return STONE;
    }

    public boolean winsGame(ScissorPaperStone choice) {
        return this.getStrongerThan().equals(choice.getName());
    }
}
