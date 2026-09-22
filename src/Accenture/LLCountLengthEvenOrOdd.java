package Accenture;

public class LLCountLengthEvenOrOdd {
    public static class Node{
        int data;
        Node next;
    }
    public static boolean evenOdd(Node head){
        int count = 0;
        while (head!= null){
            count++;
            head = head.next;

        }
        if (count%2 == 0){
            return true;

        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
//        Node n4 = new Node();

        n1.data = 10;
        n2.data = 20;
        n3.data = 30;
//        n4.data = 40;

        n1.next = n2;
        n2.next = n3;
        n3.next = null;
//        n4.next = null;
        System.out.println("IsEven :" + evenOdd(n1));
    }
}
