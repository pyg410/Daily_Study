import java.io.*;
import java.util.Stack;

public class prb_17413 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputSnt = br.readLine().split("");

        StringBuilder result = new StringBuilder();
        boolean specialWord = false;

        Stack<String> stack = new Stack<>();
        for (String word : inputSnt) {
            if (word.equals("<")) {
                if(!stack.isEmpty()){
                    while(!stack.isEmpty()){
                        result.append(stack.pop());
                    }
                }
                specialWord = true;
            }
            if (word.equals(">")) {
                specialWord = false;
                result.append(word);
                continue;
            }
            if (specialWord) {
                result.append(word);
                continue;
            }

            if (word.equals(" ") && !stack.isEmpty()) {
                StringBuilder reversing = new StringBuilder();
                while(!stack.isEmpty()){
                    reversing.append(stack.pop());
                }
                result.append(reversing).append(word);
                continue;
            } else if (word.equals(" ")) {
                result.append(word);
                continue;
            } else {
                stack.push(word);
            }
        }
        if(!stack.isEmpty()){
            while(!stack.isEmpty()){
                result.append(stack.pop());
            }
        }
        System.out.println(result);
    }
}
