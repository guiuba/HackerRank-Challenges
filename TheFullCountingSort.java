import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class TheFullCountingSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

       countSort(arr);

        bufferedReader.close();
/*        List<List<String>> arr = List.of(
                List.of("0", "ab"),
                List.of("6", "cd"),
                List.of("0", "ef"),
                List.of("6", "gh"),
                List.of("4", "ij"),
                List.of("0", "ab"),
                List.of("6", "cd"),
                List.of("0", "ef"),
                List.of("6", "gh"),
                List.of("0", "ij"),
                List.of("4", "that"),
                List.of("3", "be"),
                List.of("0", "to"),
                List.of("0", "be"),
                List.of("5", "question"),
                List.of("1", "or"),
                List.of("2", "not"),
                List.of("4", "is"),
                List.of("2", "to"),
                List.of("4", "the")
        );
        countSort(arr);*/

    }
    public static void countSort(List<List<String>> arr) {
        // Write your code here

      //  List<List<String>> result = new ArrayList<>();
     /*   String[][] result = new String[20][2];
        for (int i = 0; i < arr.size() / 2; i++) {
          result[i][0] = "-";
        }
        Arrays.asList(result).forEach(array ->System.out.println(Arrays.toString(array)));*/
        //colleague 0:
        List<String>[] buckets = new List[100];
        int n = 0;
        for (int i=0; i<100; i++)
            buckets[i] = new ArrayList<String>();
        for (List<String> entry: arr)
            buckets[Integer.parseInt(entry.get(0))]
                    .add((n++<arr.size()/2) ? "-" : entry.get(1));
        for (List<String> bucket: buckets)
            bucket.forEach(s-> System.out.print(s+" "));

         //colleague 1:
     /*        StringBuilder [] arrList = new StringBuilder[101];
        for(int i=0;i<arr.size();i++) {
            if(i < arr.size()/2) {
                arr.get(i).set(1, "-");
            }
            StringBuilder st = arrList[Integer.valueOf(arr.get(i).get(0))];
            if(st == null) {
                st = new StringBuilder("");
            }
            arrList[Integer.valueOf(arr.get(i).get(0))] = st.append(arr.get(i).get(1)).append(" ");
        }

        for(int i=0;i<100;i++) {
            if(arrList[i] != null) {
                System.out.print(arrList[i]);
            }
        }*/
      //  arr.forEach(System.out::println);
    }
}

/*
Use the counting sort to order a list of strings associated with integers. If two strings are associated with the same integer, they must be printed in their original order, i.e. your sorting algorithm should be stable. There is one other twist: strings in the first half of the array are to be replaced with the character - (dash, ascii 45 decimal).

Insertion Sort and the simple version of Quicksort are stable, but the faster in-place version of Quicksort is not since it scrambles around elements while sorting.

Design your counting sort to be stable.

Example

The first two strings are replaced with '-'. Since the maximum associated integer is , set up a helper array with at least two empty arrays as elements. The following shows the insertions into an array of three empty arrays.

i	string	converted	list
0				[[],[],[]]
1 	a 	-		[[-],[],[]]
2	b	-		[[-],[-],[]]
3	c			[[-,c],[-],[]]
4	d			[[-,c],[-,d],[]]
The result is then printed:  .

Function Description

Complete the countSort function in the editor below. It should construct and print the sorted strings.

countSort has the following parameter(s):

string arr[n][2]: each arr[i] is comprised of two strings, x and s
Returns
- Print the finished array with each element separated by a single space.

Note: The first element of each , , must be cast as an integer to perform the sort.

Input Format

The first line contains , the number of integer/string pairs in the array .
Each of the next  contains  and , the integers (as strings) with their associated strings.

Constraints


 is even


 consists of characters in the range

Output Format

Print the strings in their correct order, space-separated on one line.
 */