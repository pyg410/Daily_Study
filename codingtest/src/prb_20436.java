import java.io.*;
import java.util.*;

public class prb_20436 {
    static Map<String, int[]> leftKey;
    static Map<String, int[]> rightKey;
    static int count;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        leftKey = new HashMap<>();
        rightKey = new HashMap<>();
        count = 0;

        makeKeyBoard();

        int[] leftLocation = leftKey.get(st.nextToken());
        int[] rightLocation = rightKey.get(st.nextToken());

        String input = br.readLine();
        leastDistance(input, leftLocation, rightLocation);

        System.out.println(count);


    }
    private static void leastDistance(String input, int[] leftL, int[] rightL){
        int[] leftLocation = leftL;
        int[] rightLocation= rightL;
        String nextString;
        String firstWord=String.valueOf(input.charAt(0));
        if(input.length()>1){
            nextString = input.substring(1);
        }else{
            if(leftKey.containsKey(input)){
                count += 1+ distance(leftLocation, firstWord);
            }
            else {
                count += 1+ distance(rightLocation, firstWord);
            }
            return;
        }
        if(leftKey.containsKey(firstWord)){
            count += 1+ distance(leftLocation, firstWord);
            leftLocation = leftKey.get(firstWord);
        }
        else {
            count += 1+ distance(rightLocation, firstWord);
            rightLocation = rightKey.get(firstWord);
        }

        leastDistance(nextString, leftLocation, rightLocation);
    }

    private static int distance(int[] location1, String firstWord){
        int[] location2 = (leftKey.containsKey(firstWord))?(leftKey.get(firstWord)):(rightKey.get(firstWord));
        return Math.abs(location1[0]-location2[0])+Math.abs(location1[1]-location2[1]);
    }


    private static void makeKeyBoard() {
        leftKey.put("q", new int[]{0, 0});
        leftKey.put("w", new int[]{0, 1});
        leftKey.put("e", new int[]{0, 2});
        leftKey.put("r", new int[]{0, 3});
        leftKey.put("t", new int[]{0, 4});
        rightKey.put("y", new int[]{0, 5});
        rightKey.put("u", new int[]{0, 6});
        rightKey.put("i", new int[]{0, 7});
        rightKey.put("o", new int[]{0, 8});
        rightKey.put("p", new int[]{0, 9});

        leftKey.put("a", new int[]{1, 0});
        leftKey.put("s", new int[]{1, 1});
        leftKey.put("d", new int[]{1, 2});
        leftKey.put("f", new int[]{1, 3});
        leftKey.put("g", new int[]{1, 4});
        rightKey.put("h", new int[]{1, 5});
        rightKey.put("j", new int[]{1, 6});
        rightKey.put("k", new int[]{1, 7});
        rightKey.put("l", new int[]{1, 8});

        leftKey.put("z", new int[]{2, 0});
        leftKey.put("x", new int[]{2, 1});
        leftKey.put("c", new int[]{2, 2});
        leftKey.put("v", new int[]{2, 3});
        rightKey.put("b", new int[]{2, 4});
        rightKey.put("n", new int[]{2, 5});
        rightKey.put("m", new int[]{2, 6});
    }
}

