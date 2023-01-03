import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class prb_10773 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int k = Integer.parseInt(br.readLine());
        int sum=0;

        for(int i =0; i<k; i++){
            int a = Integer.parseInt(br.readLine());
            switch(a) {
                case 0:
                    sum -= stack.pop();
                    break;
                default:
                    sum += stack.push(a);
                    break;
            }
        }
        System.out.println(sum);
    }
}
