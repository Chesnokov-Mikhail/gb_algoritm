package org.example;

public class ListNodeUtils {

    // метод добавления первого элемента в связный список
    public static ListNode addFirst(int value, ListNode node) {
        ListNode firstNode = new ListNode(value);
        if (node != null) {
            firstNode.next = node;
        }
        return firstNode;
    }

    // метод удаления первого элемента в связном списке
    public static ListNode removeFirst(ListNode node) {
        if (node != null) {
            if (node.next != null) {
                return node.next;
            }
        }
        return null;
    }

    // метод разворота связного списка
    public static ListNode reverse(ListNode node) {
        if (node != null) {
            ListNode temp = null;
            while (node.next != null) {
                ListNode next = node.next;
                node.next = temp;
                temp = node;
                node = next;
            }
            node.next = temp;
        }
        return node;
    }
}
