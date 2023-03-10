import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prb_22858 {
    static int[] D;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] S = new int[N];
        D = new int[N];

        StringTokenizer s = new StringTokenizer(br.readLine());
        StringTokenizer d = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            S[i] = Integer.parseInt(s.nextToken());
            D[i] = Integer.parseInt(d.nextToken());
        }

        for(int i=0; i<K; i++){
            S = cardMix(S);
        }

        for(int i=0; i<S.length; i++){
            System.out.print(S[i] + " ");
        }
    }

    static int[] cardMix(int[] S){
        int[] result = new int[S.length];
        for(int i=0; i<D.length; i++){
            result[D[i]-1] = S[i];
        }
        return result;
    }
}
