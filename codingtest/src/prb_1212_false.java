import java.io.*;

public class prb_1212_false {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split("");

        StringBuilder sb = new StringBuilder();
        for(String s : inputArr){
            sb.append(solution(Integer.parseInt(s)));
        }

        String output = sb.toString();
        if(output.charAt(0) == '0'){
            output = output.replaceFirst("0", "");
            if(output.charAt(0)=='0'){
                output = output.replaceFirst("0", "");
            }
        }
        System.out.println(output);
    }

    public static String solution(int eightNum){
        StringBuilder twoNum = new StringBuilder();
        while(true){
            if(eightNum == 1){
                twoNum.append("1");
                break;
            }
            twoNum.append(eightNum % 2);
            eightNum /= 2;
        }
        while(twoNum.length()<3){
            twoNum.append("0");
        }
        return twoNum.reverse().toString();
    }
}
