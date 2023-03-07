import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prb_1913 {
    static int[][] arr;
    static int N;
    static int[] answer;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        int[] firstCoordinate = {N/2, N/2};
        count = 1;
        pingping(firstCoordinate, 0);

        int answerX=0;
        int answerY=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(arr[i][j]==M){
                    answerX=i+1;
                    answerY=j+1;
                }
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
        System.out.println( answerX+ " " + answerY);
    }
    static void pingping(int[] firstCoordinate, int prevNum){
        if(firstCoordinate[0]==0 && firstCoordinate[1]==0){
            return;
        }
        int num = prevNum+1;
        int dirx = firstCoordinate[0];
        int diry = firstCoordinate[1];
        if(count == 1){
            arr[firstCoordinate[0]][firstCoordinate[1]] = num;
            num = num+1;
        }


        dirx = dirx-1;
        arr[dirx][diry] = num;

        for(int i=1; i<=2*count-1; i++){
            diry += 1;
            num += 1;
            arr[dirx][diry] = num;
        }

        for(int i=1; i<=2*count; i++){
            dirx += 1;
            num+=1;
            arr[dirx][diry] = num;
        }

        for(int i=1; i<=2*count; i++){
            diry -=1;
            num+=1;
            arr[dirx][diry] = num;
        }

        for(int i=1; i<=2*count; i++){
            dirx-=1;
            num+=1;
            arr[dirx][diry] = num;
        }

        int[] a = {dirx, diry};
        count++;
        pingping(a, arr[dirx][diry]);


    }
}
