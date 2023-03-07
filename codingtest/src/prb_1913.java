import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prb_1913 {
    static int[][] arr;
    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for(int i=1; i<=N; i++){
            pingping(i);
        }
    }
    static void pingping(int i){

    }

    static void makePingPing(){
        // 초기 x좌표 = N/2+1
        // 초기 y좌표 = N/2+1
        int[] dirx = {-1,};
        int[] diry = {0};

    }
}
