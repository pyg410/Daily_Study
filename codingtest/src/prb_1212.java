import java.io.*;

public class prb_1212 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split("");

        String answer = "";
        for(String s : inputArr){
            System.out.println("aa : " + s);
            answer = answer + solution(Integer.parseInt(s));
        }
        if(answer.charAt(0)=='0'){
            answer.replaceFirst("0", "");
            answer.
        }

        System.out.println(answer);



    }

    public static String solution(int eightNum){
        StringBuilder twoNum = new StringBuilder();
        while(true){
            if(eightNum == 1){
                twoNum.append("1");
                break;
            }
            int divideNum = eightNum % 2;
            twoNum.append(String.valueOf(divideNum));
            eightNum /= 2;
        }

        return twoNum.reverse().toString();
    }
}
