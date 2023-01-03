import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * N : 숫자카드(1~500000)
 * N_arr : 숫자카드 정수(-10,000,000 ~ 10,000,000)
 * M : 몇 개 가지고 있는 숫자카드인지 구해야할 정수(1~500000)
 * M_arr : -10,000,000 ~ 10,000,000
 */
public class prb_10816 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> N_map = new HashMap<>();
        StringTokenizer st;

        // Input
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int key = Integer.parseInt(st.nextToken());
            N_map.put(key, N_map.getOrDefault(key, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++){
            int key = Integer.parseInt(st.nextToken());
            sb.append(N_map.getOrDefault(key, 0)).append(" ");
        }

        System.out.println(sb);
    }
}
