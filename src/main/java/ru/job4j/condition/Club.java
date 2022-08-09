package ru.job4j.condition;

public class Club {
    public static void permission(boolean hasFriend, boolean hasMoney) {
        if (hasFriend == true | hasMoney == true) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
