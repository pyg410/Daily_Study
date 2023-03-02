import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prb_9251_second {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputA = br.readLine();
        String inputB = br.readLine();
        int count =0;
        for(int i=0; i<inputB.length(); i++){
            if(inputA.contains(String.valueOf(inputB.charAt(i)))){
                inputA = inputA.replaceFirst(String.valueOf(inputB.charAt(i)), "");
                System.out.println(inputA);
                count++;
            }
        }
        System.out.println(count);
    }
}
