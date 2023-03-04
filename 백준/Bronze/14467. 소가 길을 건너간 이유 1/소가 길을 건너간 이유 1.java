import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Cow[] cows;
        cows = new Cow[10];
        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cowNum =Integer.parseInt(st.nextToken())-1;
            boolean changeCowState = st.nextToken().equals("1");
            if(cows[cowNum]==null){
                cows[cowNum] = new Cow(changeCowState);
                continue;
            }
            // n번째 소의 상태 변경값 == 전 소의 상태 => n번째 소의count++;
            if(cows[cowNum].cowState!=changeCowState){
                cows[cowNum].cowState=changeCowState;
                cows[cowNum].cowCount += 1;
            }
        }

        int max = 0;
        for(Cow cow : cows){
            if(cow == null){
                continue;
            }
            max += cow.cowCount;
        }
        System.out.println(max);
    }
    static class Cow{
        public int cowCount;
        public boolean cowState;
        Cow(boolean cowState){
            this.cowCount=0;
            this.cowState = cowState;

        }
    }
}
