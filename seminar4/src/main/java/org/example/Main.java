package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random ri = new Random();
        Scanner scn = new Scanner(System.in, "Cp866");
        int selectValue = 0;
        Tree<Integer> tree = new Tree<>();
        // Инициализация дерева
        for (int i = 0; i < 8; i++) {
            tree.add(ri.nextInt(0, 100));
        }
        // вывод значений дерева по уровням
        tree.printTree();
        System.out.println("Введите цифру для поиска по дереву, или ничего для выхода:");
        try {
            selectValue = Integer.parseInt(scn.nextLine());
            // поиск значения в дереве
            boolean result = tree.contains(selectValue);

            System.out.println((result) ? "Цифра найдена в дереве" : "Цифра не найдена в дереве");
        } catch (Exception e) {
            System.out.println("Что-то не так с введенным значением" + e.getLocalizedMessage());
        }
    }
}