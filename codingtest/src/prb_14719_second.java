import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prb_14719_second {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int answer=0;
        int[] arr = new int[w];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<w; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<w-1; i++){
            int current = arr[i];
            int leftMax = current;
            int rightMax = current;
            for(int j=i-1; j>=0; j--){
                if(arr[j] > current){
                    leftMax = Math.max(leftMax, arr[j]);
                }
            }
            for(int j=i+1; j<w; j++){
                if(arr[j] > current){
                    rightMax = Math.max(rightMax, arr[j]);
                }
            }
            if(Math.min(rightMax, leftMax) > current){
                answer+= Math.min(rightMax, leftMax) -current;
            }
        }
        System.out.println(answer);
    }
}
