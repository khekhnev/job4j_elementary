package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
       String rls = "I don't know. Please, ask another question.";
        if ("Hi, bot".equals(question)) {
            rls = "Hi, SmartAss.";
        } else if ("Bye.".equals(question)) {
            rls = "See you later.";
        }
        return rls;
    }

    public static void main(String[] args) {
        String rls = DummyBot.answer("Hi, bot");
        System.out.println(rls);
        rls = DummyBot.answer("Bye.");
        System.out.println(rls);
        }
}
