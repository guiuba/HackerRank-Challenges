import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) {
        List<List<Integer>> queries = List.of(
                List.of(1, 0, 5),
                List.of(1, 1, 7),
                List.of(1, 0, 3),
                List.of(2, 1, 0),
                List.of(2, 1, 1)
        );
        System.out.println(dynamicArray(2, queries));

    }

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        List<Integer> answers = new ArrayList<>();
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }
        int lastAnswer = 0;
        for (List<Integer> query : queries) { //List<Integer> query : queries
            int x = query.get(1);
            int y = query.get(2);
            int idx = (x ^ lastAnswer) % n;
            if (query.get(0) == 1) {
                arr.get(idx).add(y);
            } else {
                lastAnswer = arr.get(idx).get(y % arr.get(idx).size());
                answers.add(lastAnswer);
            }
        }
        return answers;
    }
}

/*
Declare a 2-dimensional array, arr, of  n empty arrays. All arrays are zero indexed.
Declare an integer, lastAnswer, and initialize it to 0.

There are 2 types of queries, given as an array of strings for you to parse:

Query: 1 x y
Let .
Append the integer  to .
Query: 2 x y
Let .
Assign the value  to .
Store the new value of  to an answers array.
Note:  is the bitwise XOR operation, which corresponds to the ^ operator in most languages. Learn more about it on Wikipedia.  is the modulo operator.
Finally, size(arr[idx]) is the number of elements in arr[idx]

Function Description

Complete the dynamicArray function below.

dynamicArray has the following parameters:
- int n: the number of empty arrays to initialize in
- string queries[q]: query strings that contain 3 space-separated integers

Returns

int[]: the results of each type 2 query in the order they are presented
Input Format

The first line contains two space-separated integers, , the size of  to create, and , the number of queries, respectively.
Each of the  subsequent lines contains a query string, .
 */