package list;

import java.util.Objects;

public class LinkedList {
    private Node head;
    private int size = 0;

    private class Node {
        Object data;
        Node next;
        Node(Object data) { this.data = data; }
    }

    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public void delete(Object data) {
        if (head == null) return;
        
        // head.data.equals(data) 대신 Objects.equals를 쓰면 null 안전성이 높아집니다.
        if (Objects.equals(head.data, data)) {
            head = head.next;
            size--;
        } else {
            Node temp = head;
            while (temp.next != null && !Objects.equals(temp.next.data, data)) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
                size--;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.add("Spring");
        link.add("JPA");
        link.delete("Spring");
        System.out.println("LinkedList 삭제 테스트 완료");
    }
}