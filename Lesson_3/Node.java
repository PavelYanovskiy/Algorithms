package Lesson_3;

public class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}

class Answer {
    Node head; // Поле для хранения головы списка

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Сохраняем следующий узел
            current.next = prev; // Меняем ссылку на следующий узел на предыдущий узел
            prev = current; // Перемещаем указатель предыдущего узла на текущий узел
            current = next; // Перемещаем указатель текущего узла на следующий узел
        }

        head = prev; // Обновляем голову списка
    }
}


