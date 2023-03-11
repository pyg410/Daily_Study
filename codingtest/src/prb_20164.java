import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prb_20164 {
    static int MIN = Integer.MAX_VALUE;
    static int MAX = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        cutNum(N, oddNum(N));
        System.out.println(MIN + " " + MAX);
    }

    static void cutNum(int N, int finalNum){
        if(N<10){
            MIN = Math.min(MIN, finalNum);
            MAX = Math.max(MAX, finalNum);
        }
        else if(N<100){
            int sum = (N/10) + (N%10);
            cutNum(sum, finalNum+oddNum(sum));
        }else{
            String nToString = Integer.toString(N);
            int len = nToString.length()-1;
            for(int i=1; i<=len-1; i++){
                for(int j=i+1; j<=len; j++){
                    int a1 = Integer.parseInt(nToString.substring(0,i));
                    int a2 = Integer.parseInt(nToString.substring(i,j));
                    int a3 = Integer.parseInt(nToString.substring(j));
                    int sum = a1+a2+a3;
                    cutNum(sum, finalNum+oddNum(sum));
                }
            }
        }
    }

    static int oddNum(int num){
        int countOdd=0;
        while(num>0){
            int digit = num%10;
            if(digit%2==1) countOdd++;
            num /= 10;
        }
        return countOdd;
    }
}
