import java.io.*;
import java.util.*;

public class prb_2578 {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        List<Integer> player = new ArrayList<>();
        List<Integer> referee = new ArrayList<>();
        StringTokenizer st;
        int count=0;
        for(int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<5; j++){
                player.add(Integer.parseInt(st.nextToken()));
            }
        }
        for(int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<5; j++){
                referee.add(Integer.parseInt(st.nextToken()));
            }
        }

        int bingoCount = 0;
        for(int i=0; i<24; i++){
            count++;
            int bingoNum = player.indexOf(referee.get(i));
            player.set(bingoNum, -1);

            bingoCount = bingoChecker(player);
            if(bingoCount>=3){
                break;
            }
        }

        System.out.println(count);
    }

    static int bingoChecker(List<Integer> player){
        int bingoCount=0;
        // 가로빙고
        for(int i=0; i<25; i+=5){
            int countWidth=0;
            for(int j=0; j<5; j++){
                if(player.get(i+j).equals(-1)){
                    countWidth++;
                }
            }
            if(countWidth==5) bingoCount++;
        }
        // 세로빙고
        for(int i=0; i<5; i++){
            int countHeight =0;
            for(int j=0; j<25; j+=5){
                if(player.get(i+j).equals(-1)){
                    countHeight++;
                }
            }
            if(countHeight==5) bingoCount++;
        }
        // 대각선 빙고
        int countCross =0;
        for(int i=0; i<25; i+=6){
            if(player.get(i).equals(-1)){
                countCross++;
            }
        }
        if(countCross==5) bingoCount++;
        // 대각선 빙고 2
        countCross=0;
        if(player.get(4).equals(-1)) countCross++;
        if(player.get(8).equals(-1)) countCross++;
        if(player.get(12).equals(-1)) countCross++;
        if(player.get(16).equals(-1)) countCross++;
        if(player.get(20).equals(-1)) countCross++;
        if(countCross==5) bingoCount++;

        return bingoCount;
    }
}
