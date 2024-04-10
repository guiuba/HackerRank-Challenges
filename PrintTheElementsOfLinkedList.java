import studies.SinglyLinkedList;

public class PrintTheElementsOfLinkedList {

    static SinglyLinkedListNode head; //ListNode

    public static void main(String[] args) {
        head = new SinglyLinkedListNode(10);
        SinglyLinkedListNode second = new SinglyLinkedListNode(11);
        SinglyLinkedListNode  third = new SinglyLinkedListNode(12);
        head.next = second;
        second.next = third;
        printLinkedList(head);

    }

    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static class SinglyLinkedListNode {
        private int data;
        SinglyLinkedListNode next;

        public SinglyLinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}

/*
Problem:
This is to practice traversing a linked list.
Given a pointer to the head node of a linked list, print each node's data element, one per line.
If the head pointer is null (indicating the list is empty), there is nothing to print.

Function Description

Complete the printLinkedList function in the editor below.

printLinkedList has the following parameter(s):

SinglyLinkedListNode head: a reference to the head of the list
Print

For each node, print its data value on a new line (console.log in Javascript).
Input Format

The first line of input contains , the number of elements in the linked list.
The next n lines contain one element each, the data values for each node.

Note: Do not read any input from stdin/console. Complete the printLinkedList function in the editor below.

Constraints
1 <= n <= 1000
1 <= list[i] <= 1000
, where list[i] is the th element of the linked list.
Sample Input

2
16
13
Sample Output

16
13
 */


