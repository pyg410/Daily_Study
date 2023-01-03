import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class prb_9012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        String s;


        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            boolean b = true;
            s = br.readLine();
            for(int j=0; j<s.length(); j++) {
                if (s.charAt(j) == '(') {
                    stack.push('(');
                } else if (stack.empty()) {
                    b = false;
                    break;
                }
                else{
                    stack.pop();
                }
            }
            if(stack.empty() && b == true){
                sb.append("YES").append('\n');
            }
            else{
                sb.append("NO").append('\n');
            }
        }

        System.out.println(sb);
    }
}
