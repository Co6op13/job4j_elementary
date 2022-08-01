package ru.job4j.loop;

import ru.job4j.condition.Tour;

public class Board {
    public static void paint(int width, int height) {
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= width; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Board.paint(3, 3);
        System.out.println();
        Board.paint(4, 4);
    }
}
