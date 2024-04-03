import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public static void main(String[] args) {

        List<String> strings = List.of("ab", "ab", "abc");
        List<String> queries = List.of("ab", "abc", "bc"); // results = [2, 1, 0]
        System.out.println(matchingStrings(strings, queries));

    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> results = new ArrayList<>();
      /*  for (String q : queries) { //minha solução
            results.add((int) strings.stream().filter(q::equals).count());
        }*/
        queries.forEach(query -> {
            results.add((int)strings.stream().filter(string -> string.equals(query)).count());
        });
        return results;
    }
}

/*
There is a collection of input strings and a collection of query strings.
 each query string, determine how many times it occurs in the list of input
 strings. Return an array of the results.

 solução colega:
     final List<Integer> responseList = new ArrayList<>();
    queries.stream().forEach(query -> {
        responseList.add((int) strings.stream().filter(str -> str.equals(query))            .count());
    });

    return responseList;
 */