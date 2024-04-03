import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewYearChaos {
    public static void main(String[] args) {
        //   List<Integer> q = new ArrayList<>(List.of(2, 1, 5, 3, 4));
        //     List<Integer> q = new ArrayList<>(List.of(2, 5, 1, 3, 4));
        List<Integer> q = new ArrayList<>(List.of(1, 2, 5, 3, 7, 8, 6, 4));
        minimumBribes(q);

    }

    public static void minimumBribes(List<Integer> q) {
        int tempCount = 0;
        outer:
        for (int i = 0; i < q.size() - 1; i++) {
            int warningFlag = 0;
            int skipper = 0;
            for (int j = i + 1; j < q.size(); j++) {
                if (q.get(i) > q.get(j)) {
                    tempCount++;
                    warningFlag++;
                    skipper++;

                    if (warningFlag > 2) {
                        System.out.println("Too chaotic");
                        return;
                    }
                } else {
                    skipper++;
                }
                if (skipper > 30) {
                    continue outer;
                }
            }

        }


        System.out.println(tempCount);
    }


}

/* colleague solution
                public static void minimumBribes(List<Integer> q) {
                    int[] persons = {1, 2, 3};
                    int bribes = 0;
my solution (not    for(int i = 0; i < q.size(); i++){                   optmized):
   public static        if(q.get(i) == persons[0]){                      void minimumBribes(List<Integer> q) {
        List<Int            persons[0] = persons[1];                    eger> orderedList = new ArrayList<>(q);
        Collecti            persons[1] = persons[2];                    ons.sort(orderedList);
    //    System            persons[2]++;                               .out.println(q);
   //     System        }else if(q.get(i) == persons[1]){               .out.println(orderedList);
        int numO            persons[1] = persons[2];                    fBribes = 0;
        for (int            persons[2]++;                                i = q.size() - 2; i >= 0; i--) {  // size = 8 begins with i = 6
            int             bribes++;                                   value = q.get(i);
            int         }else if(q.get(i) == persons[2]){               temp = calculateBribe(q, i + 1, value);
            if (            persons[2]++;                               temp < 3) {
                            bribes += 2;                                numOfBribes += temp;
            } el        }else{                                          se {
                            System.out.println("Too chaotic");          System.out.println("Too chaotic");
                            return;                                     return;
            }           }
        }           }
        System.o    System.out.println(bribes);                         ut.println(numOfBribes);
                }
    }

    static int calculateBribe(List<Integer> q, int index, int value) {
        int counter = 0;
        for (int i = index; i < q.size(); i++) {
            if (value > q.get(i)) {
                counter++;
            }
        }
        return counter;
    }

        List<Integer> orderedList = new ArrayList<>(q);
        Collections.sort(orderedList);
        System.out.println(q);
        System.out.println(orderedList);
        int numOfBribes = 0;
        for (int i = 0; i < q.size(); i++) {
            int pos = q.get(i);
            int idealPosIndex = orderedList.indexOf(pos);
            if (idealPosIndex > i) {
                int bribeLength = idealPosIndex - i;
                if (bribeLength > 2) {
                    System.out.println("Too chaotic");
                    return;
                } else {
                    numOfBribes += bribeLength;
                }
            }
        }
        System.out.println(numOfBribes);
I don't understand most of the solutions here so I'm going to post the key insight that solved the problem for me (I used C++):

The number of bribes given by each "person" in the sequence is the equal to the number of lower-numbered "people" to their right.

So iterating right to left, track the lowest, second lowest and third lowest numbers you've seen so far, and count how many of
those are smaller than the current "person." If the current is larger than all 3, it's too chaotic. Otherwise, count up as you go.
 */