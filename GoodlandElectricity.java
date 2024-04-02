import java.util.ArrayList;
import java.util.List;

public class GoodlandElectricity {
    public static void main(String[] args) {
       /* List<Integer> arr = new ArrayList<>(List.of(1, 1, 1, 1, 1, 1)); // 2 caraca
        int k = 2;*/
        /*List<Integer> arr = new ArrayList<>(List.of(0, 1, 1, 1, 1, 0)); // 2
        int k = 2;*/
        List<Integer> arr = new ArrayList<>(List.of(0, 1, 1, 1, 0, 0, 0)); //-1
        int k = 3;
      /*  List<Integer> arr = new ArrayList<>(List.of(0, 1, 0, 0, 0, 1, 1, 1, 1, 1)); // 3
        int k = 3;*/
        System.out.println(pylons(k, arr));

    }

    public static int pylons(int k, List<Integer> arr) {
        // Write your code here

        int count = 0;                   //
        int i = 0;
        int loc = k + i - 1;            //
        while (i < arr.size()) {       //   (0, 1, 1, 1, 0, 0, 0))
            if(arr.get(loc) == 1) {    //
                i = loc + k;           //
                loc = k + i - 1;       //
                count++;
                if (loc >= arr.size()) {
                    loc = arr.size() - 1;  //
                }
            } else {
                loc--;
                if (loc < i - k + 1 || loc < 0) {  // escape loc < i - k + 1  to see how it works
                    return -1;

                }
            }

        }
        return count;
    }
}

/*
Goodland is a country with a number of evenly spaced cities along a line. The distance between
adjacent cities is  unit. There is an energy
infrastructure project planning meeting, and the government needs to know the fewest number of
power plants needed to provide electricity to the entire list of cities. Determine that number.
If it cannot be done, return -1.

You are given a list of city data. Cities that may contain a power plant have been labeled .
Others not suitable for building a plant are labeled . Given a distribution range of , find the
lowest number of plants that must be built such that all cities are served. The distribution range
limits supply to cities where distance is less than k.

Example


Each city is  unit distance from its neighbors, and we'll use  based indexing. We see there are
cities suitable for power plants, cities  and . If we build a power plant at , it can serve  through
because those endpoints are at a distance of  and . To serve , we would need to be able to build a
plant in city  or . Since none of those is suitable, we must return -1. It cannot be done using the
current distribution constraint.

Function Description

Complete the pylons function in the editor below.

pylons has the following parameter(s):

int k: the distribution range
int arr[n]: each city's suitability as a building site
Returns

int: the minimum number of plants required or -1
Input Format

The first line contains two space-separated integers  and , the number of cities in Goodland and the plants' range constant.
The second line contains  space-separated binary integers where each integer indicates suitability for building a plant.

Constraints

Each .
Subtask

 for  of the maximum score.
Output Format

Print a single integer denoting the minimum number of plants that must be built so that all of Goodland's cities have electricity. If this is not possible for the given value of , print .

Sample Input

STDIN         Function
-----         --------
6 2           arr[] size n = 6, k = 2
0 1 1 1 1 0   arr = [0, 1, 1, 1, 1, 0]
Sample Output

2
Explanation

Cities , , , and  are suitable for power plants. Each plant will have a range of . If we build in cities  cities,  and , then all cities will have electricity.
 */