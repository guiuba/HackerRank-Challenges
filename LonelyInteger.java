import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LonelyInteger {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 3, 2, 1));
        System.out.println(lonelyinteger(arr));
    }

    public static int lonelyinteger(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            int aux = arr.remove(i);
            if (!arr.contains(aux))
                return aux;
        }
        return 0;
        //   return arr.stream().forEach(elem -> elem != elem).;
    }
}

/*
Given an array of integers, where all elements but one occur twice, find the unique element.
e.g. arr = [1, 2, 3, 4, 3, 2, 1]
The unique element is 4.
 */
