
public class InsertaNodeAtTheTailOfaLinkedList {

    static SinglyLinkedListNode head;

    public static void main(String[] args) {
        head = new SinglyLinkedListNode(10);
        SinglyLinkedListNode second = new SinglyLinkedListNode(11);
        SinglyLinkedListNode third = new SinglyLinkedListNode(12);
        head.next = second;
        second.next = third;
        SinglyLinkedListNode current = insertNodeAtTail(head, 13);
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if (head == null) {
            head = new SinglyLinkedListNode(data);
            return head;
        }

        SinglyLinkedListNode current = head;
        SinglyLinkedListNode previous = null;
        while (current != null) {
            previous = current;
            current = current.next;
        }
        previous.next = new SinglyLinkedListNode(data);
        return head;

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
You are given the pointer to the head node of a linked list and an integer to add to the list.
Create a new node with the given integer.
Insert this node at the tail of the linked list and return the head node of the linked list
formed after inserting this new node. The given head pointer may be null, meaning that the
initial list is empty.

Function Description

Complete the insertNodeAtTail function in the editor below.

insertNodeAtTail has the following parameters:

SinglyLinkedListNode pointer head: a reference to the head of a list
int data: the data value for the node to insert
Returns

SinglyLinkedListNode pointer: reference to the head of the modified linked list
Input Format

The first line contains an integer n, the number of elements in the linked list.
The next n lines contain an integer each, the value that needs to be inserted at tail.

Constraints
1 <= n <= 1000
1 <= list i <= 1000
Sample Input

STDIN Function ----- -------- 5 size of linked list n = 5 141 linked list data
values 141..474 302 164 530 474

Sample Output

141
302
164
530
474
Explanation

First the linked list is NULL. After inserting 141, the list is 141 -> NULL.
After inserting 302, the list is 141 -> 302 -> NULL.
After inserting 164, the list is 141 -> 302 -> 164 -> NULL.
After inserting 530, the list is 141 -> 302 -> 164 -> 530 -> NULL. After inserting 474,
the list is 141 -> 302 -> 164 -> 530 -> 474 -> NULL, which is the final list.
 */