package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first == second || second == third || third == first) {
            System.out.print("Присутствуют равные числа это");
//                if (first == second && second == third && third == first) {
//                    result = first;
//                }
            System.out.print(first == second ? "first & second " : first == third ? " first & third" : "second == third");
            int equal = first == second ? first : first == third ? first : third;

            result = first >= equal ? first : second >= equal ? second : third >= equal ? third : equal;

        }
        if (first > second && first > third) {
            result = first;
        }
        if (second > first && second > third) {
            result = second;
        }

        return result;
    }
}