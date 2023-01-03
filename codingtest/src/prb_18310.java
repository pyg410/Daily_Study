import java.util.*;
import java.io.*;

public class prb_18310 {
    static int n;
    static long[] arr;

    public static long abss(){
        Arrays.sort(arr);
        long res = 0;
        long min=Long.MAX_VALUE;
        long sum=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        for(int i=0; i<n; i++){
            if(min>Math.abs(sum-(n*arr[i]))){
                min = Math.abs(sum-(n*arr[i]));
                res =arr[i];
                System.out.println("디버깅 : " + res);
            }
        }

        return res;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        long min = abss();

        System.out.println(min);


    }
}
