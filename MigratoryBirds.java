import java.util.*;

public class MigratoryBirds {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 1, 2, 2, 3)); // 1
        System.out.println(migratoryBirds(arr));

    }
     private static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int type = 0;
        int value= 0;
        Map<Integer, Integer> map = new TreeMap<>();
        Set<Integer> set = new HashSet<>(arr);
        set.forEach(num -> {
            int counter = 0;
            for (int number : arr) {
                if (number == num) {
                    counter++;
                }
            }
            map.put(num, counter);
        });

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > value) {
                type = entry.getKey();
                value = entry.getValue();
            }
        }
        return type;
    }
}

/*
Given an array of bird sightings where every element represents a bird type id, determine the id of the
most frequently sighted type. If more than 1 type has been spotted that maximum amount, return the
smallest of their ids.

Example

There are two each of types  and , and one sighting of type . Pick the lower of the two types seen twice: type .

Function Description

Complete the migratoryBirds function in the editor below.

migratoryBirds has the following parameter(s):

int arr[n]: the types of birds sighted
Returns

int: the lowest type id of the most frequently sighted birds
Input Format

The first line contains an integer, , the size of .
The second line describes  as  space-separated integers, each a type number of the bird sighted.

Constraints

It is guaranteed that each type is , , , , or .

colega:
      int[] buckets = new int[5];
        for (int s : arr)
            buckets[s - 1]++;
        int maxBucket = 4;
        for (int i = maxBucket; i >= 0; i--)
            if (buckets[maxBucket] <= buckets[i])
                maxBucket = i;
        return maxBucket + 1;
 */