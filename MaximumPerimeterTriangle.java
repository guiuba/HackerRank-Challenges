import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaximumPerimeterTriangle {
    public static void main(String[] args) {
     //   List<Integer> sticks = new ArrayList<>(List.of(1, 2, 3, 4, 5, 10));
        List<Integer> sticks = new ArrayList<>(List.of(1, 1, 1, 2, 3, 5));
        System.out.println(maximumPerimeterTriangle(sticks));

    }

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here
/*        List<Integer> sample = sticks.stream().filter((a, b, c) -> {
            a + b > c;
            b + c > a;
            a + c > b;
        }).collect(Collectors.toList());*/
        Collections.sort(sticks);
        List<List<Integer>> triangles = new ArrayList<>();
        for (int i = 0; i < sticks.size() - 2; i++) {
            for (int j = i + 1; j < sticks.size() - 1; j++) {
                for (int k = j + 1; k < sticks.size(); k++) {
                    int a = sticks.get(i);
                    int b = sticks.get(j);
                    int c = sticks.get(k);
                    if (a + b > c && b + c > a && a + c > b) {
                        triangles.add(new ArrayList<>(List.of(a, b, c)));
                    }
                }
            }
        }
        if (triangles.isEmpty()) {
            return new ArrayList<Integer>(List.of(-1));
        }
       return triangles.get(triangles.size() - 1);

      /*  triangles.forEach(System.out::println);
        System.out.println();
        System.out.println(triangles.get(triangles.size() - 1));
        System.out.println();
     //   System.out.println(IntStream.of(triangles.size() - 1).sum());
        triangles.forEach(triangle ->
                        System.out.println(triangle.stream().reduce(Integer::sum).get())
                );
        System.out.println();
       // triangles.get(triangles.size() - 1)
     //   return Collections.singletonList(IntStream.of(triangles.size() - 1).sum());

        return sticks;*/
    }
}

/*
Given an array of stick lengths, use 3 of them to construct a non-degenerate triangle with
the maximum possible perimeter. Return an array of the lengths of its sides as 3 integers
in non-decreasing order.

If there are several valid triangles having the maximum perimeter:

Choose the one with the longest maximum side.
If more than one has that maximum, choose from them the one with the longest minimum side.
If more than one has that maximum as well, print any one them.
If no non-degenerate triangle exists, return .

Example

The triplet  will not form a triangle. Neither will  or , so the problem is reduced to  and .
The longer perimeter is .

Function Description

Complete the maximumPerimeterTriangle function in the editor below.

maximumPerimeterTriangle has the following parameter(s):

int sticks[n]: the lengths of sticks available
Returns

int[3] or int[1]: the side lengths of the chosen triangle in non-decreasing order or -1
Input Format

The first line contains single integer , the size of array .
The second line contains  space-separated integers , each a stick length.

Constraints

Explanation

Sample Case 0:
There are  possible unique triangles:

The second triangle has the largest perimeter, so we print its side lengths on a new line in non-decreasing order.

Sample Case 1:
The triangle  is degenerate and thus can't be constructed, so we print -1 on a new line.
 */