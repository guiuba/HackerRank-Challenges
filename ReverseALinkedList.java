import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseALinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> llist = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        System.out.println(reverse(llist));

    }
    public static LinkedList<Integer> reverse(LinkedList<Integer> llist) {
        // Write your code here
        LinkedList<Integer> reversed = new LinkedList<>();
        llist.forEach(reversed::addFirst);

       return reversed;
       /*
         SinglyLinkedListNode prev = null;
    SinglyLinkedListNode next = null;
    SinglyLinkedListNode current = llist;
    while(current!=null){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    current = prev;

    return current;
        */

    }
}

/*
Problem:
This challenge is part of a tutorial track by MyCodeSchool and is accompanied by a video lesson.

Given the pointer to the head node of a linked list, change the next pointers of the nodes so that their order is reversed. The head pointer given may be null meaning that the initial list is empty.

Example
head references the list 1 -> 2 -> 3 -> NULL

Manipulate the next pointers of each node in place and return head, now referencing the head of the list 3 -> 2 -> 1 -> NULL.

Function Description

Complete the reverse function in the editor below.

reverse has the following parameter:

SinglyLinkedListNode pointer head: a reference to the head of a list
Returns

SinglyLinkedListNode pointer: a reference to the head of the reversed list
Input Format

The first line contains an integer t, the number of test cases.

Each test case has the following format:

The first line contains an integer n, the number of elements in the linked list.
Each of the next n lines contains an integer, the data values of the elements in the linked list.

Constraints
1 <= t <= 10
1 <= n <= 1000
1 <= list[i] <= 1000, where list[i] is the i th  element in the list.
Sample Input

1
5
1
2
3
4
5
Sample Output

5 4 3 2 1
Explanation

The initial linked list is: .
1 -> 2 -> 3 -> 4 -> 5 ->NULL

The reversed linked list is: 
5 -> 4 -> 3 -> 2 -> 1 ->NULL
 */