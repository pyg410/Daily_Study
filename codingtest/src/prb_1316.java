import java.io.*;

public class prb_1316 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int output=0;

        for(int i=0; i<N; i++){
            String input = br.readLine();
            if(input.length() == solution(input)){
                output++;
            }
        }

        System.out.println(output);
    }

    public static int solution(String input){
        String answer="";
        char prevWord=input.charAt(0);
        for(int i=0; i<input.length(); i++){
            // 중복 문자열 제거
            if(input.indexOf(input.charAt(i)) == i){
                answer += input.charAt(i);
                prevWord = input.charAt(i);
                continue;
            }
            // 연속된 문자일 경우
            if(prevWord==input.charAt(i)){
                answer+= input.charAt(i);
            }
        }
        return answer.length();
    }
}
