package mockTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindTheMedian {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6)); //3
        System.out.println(findMedian(arr));
    }
    static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        return arr.get(arr.size() / 2);

    }
}

/*
The median of a list of numbers is essentially its middle element after sorting. The same number of
elements occur after it as before. Given a list of numbers with an odd number of elements, find the median?
Example arr = {5, 3, 1, 2, 4}
The sorted array {1, 2, 3, 4, 5}. The middle element and the median is 3.

 */