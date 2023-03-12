import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prb_14719 {
    static int[][] blockArr;
    static int realCount=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        blockArr = new int[h][w];
        StringTokenizer inputBlockNum = new StringTokenizer(br.readLine());
        for(int j=0; j<w; j++){
            int wInput = Integer.parseInt(inputBlockNum.nextToken());
            for(int i=h-1; i>=0; i--){
                if(wInput>0){
                    blockArr[i][j] =1;
                    wInput--;
                }else{
                    blockArr[i][j] =0;
                }
            }
        }

        for(int i=0; i<h; i++){
            int count =0;
            int prevWord = 2;
            boolean countOpen = false;
            for(int j=0; j<w; j++){
                if(blockArr[i][j]==1){
                    if(count!=0){
                        realCount+=count;
                        count =0;
                    }
                    if(prevWord==0){
                        countOpen = false;
                    }else{
                        countOpen = true;
                    }

                }
                else if(countOpen && blockArr[i][j]==0) count++;
                prevWord=blockArr[i][j];
            }
        }

        System.out.println(realCount);


    }
}
