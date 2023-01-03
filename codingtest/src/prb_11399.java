import java.util.Arrays;
import java.util.Scanner;

public class prb_11399 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for(int i=0; i<n; i++){
            p[i] = in.nextInt();
        }

        Arrays.sort(p);
        int sum=0;
        for(int i=n; i>0; i--){
            sum += p[n-i]*i;
        }
        System.out.println(sum);
    }
}
