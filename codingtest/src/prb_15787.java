import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class prb_15787 {
    static int[] train;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        train = new int[N+1];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            int trainIdx = Integer.parseInt(st.nextToken());
            int seatNum = st.hasMoreTokens()?(Integer.parseInt(st.nextToken())):0;
            switch(cmd){
                case 1:{
                    train[trainIdx] = train[trainIdx]|(1<<seatNum);
                    break;
                }
                case 2:{
                    train[trainIdx] = train[trainIdx] & ~(1<<seatNum);
                    break;
                }
                case 3:{
                    //System.out.println(Integer.toBinaryString(train[trainIdx]));
                    train[trainIdx] = train[trainIdx]<<1;
                    //System.out.println(Integer.toBinaryString(train[trainIdx]));
                    train[trainIdx] = (train[trainIdx] & ~(1<<21));
                    //System.out.println(Integer.toBinaryString(train[trainIdx]));
                    break;
                }
                case 4:{
                    train[trainIdx] = train[trainIdx]>>1;
                    train[trainIdx] = (train[trainIdx] & (~1));
                    break;
                }
            }
        }
        HashSet<Integer> trainValidate = new HashSet<>();
        for(int i=1; i<N+1; i++){
            trainValidate.add(train[i]);
        }
        System.out.println(trainValidate.size());
    }
}
