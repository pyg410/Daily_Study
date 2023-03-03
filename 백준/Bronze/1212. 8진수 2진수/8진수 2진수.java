import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputNum = br.readLine();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<inputNum.length(); i++){
            String midNum = Integer.toBinaryString(inputNum.charAt(i)- '0');
            while(midNum.length()<3 && i!=0){
                midNum = "0" + midNum;
            }
            sb.append(midNum);
        }
        System.out.println(sb);
    }
}
