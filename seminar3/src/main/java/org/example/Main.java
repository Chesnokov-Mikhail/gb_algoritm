package org.example;

public class Main {
    public static void main(String[] args) {
        // Инициализация связного списка
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        // вывод первоночального списка
        for (Integer integer : listNode) {
            System.out.println(integer);
        }
        System.out.println();

        // добавление в начало связного списка
        ListNode resultAdd = ListNodeUtils.addFirst(5,listNode);
        // вывод связного списка после добавления элемента в начало
        for (Integer integer : resultAdd) {
            System.out.println(integer);
        }
        System.out.println();

        // удаление первого элемента связного списка
        ListNode resultRemove = ListNodeUtils.removeFirst(listNode);
        // вывод связного списка после удаления первого элемента
        for (Integer integer : resultRemove) {
            System.out.println(integer);
        }
        System.out.println();

        // разворота связного списка
        ListNode resultReverse = ListNodeUtils.reverse(listNode);
        // выаод развернутого связного списка
        for (Integer integer : resultReverse) {
            System.out.println(integer);
        }
        System.out.println();

        // проверка работы метода по развороту пустого связного списка
        ListNode b = new ListNode();
        ListNode resultReverseB = ListNodeUtils.reverse(b);
        for (Integer integer : resultReverseB) {
            System.out.println(integer);
        }
    }
}
