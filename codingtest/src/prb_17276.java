import java.io.*;
import java.util.*;

public class prb_17276 {
    static int n;
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int k=0; k<T; k++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int[][] arr = new int[n][n];
            for(int i=0; i<n; i++){
                StringTokenizer arrSt = new StringTokenizer(br.readLine());
                for(int j=0; j<n; j++){
                    arr[i][j] = Integer.parseInt(arrSt.nextToken());
                }
            }
            int count = (d!=0)?(Math.abs(d)/45):0;
            for(int i=0; i<count; i++){
                arr = rotation(arr, d);
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);


    }

    static int[][] rotation(int[][] inputArr, int d){
        int[][] returnArr = new int[inputArr.length][];
        for(int i=0; i<inputArr.length; i++){
            returnArr[i] = inputArr[i].clone();
        }

        int standardNum = n/2;
        int center= standardNum;
        // d가 양수
        if(d>0){
            for(int j=1; j<=standardNum; j++){
                // 12시 -> 1시
                returnArr[center-j][center+j]=inputArr[center-j][center];
                // 1시 -> 3시
                returnArr[center][center+j] = inputArr[center-j][center+j];
                // 3시 -> 5시
                returnArr[center+j][center+j] = inputArr[center][center+j];
                // 5시 -> 6시
                returnArr[center+j][center] = inputArr[center+j][center+j];
                // 6시 -> 7시
                returnArr[center+j][center-j] = inputArr[center+j][center];
                // 7시 -> 9시
                returnArr[center][center-j] = inputArr[center+j][center-j];
                // 9시 -> 11시
                returnArr[center-j][center-j] = inputArr[center][center-j];
                // 11시 -> 12시
                returnArr[center-j][center] = inputArr[center-j][center-j];
            }
            return returnArr;
        }
        // d가 음수면?
        else if(d<0){
            for(int j=1; j<=standardNum; j++){
                // 12시 -> 11시
                returnArr[center-j][center-j]=inputArr[center-j][center];
                // 11시 -> 9시
                returnArr[center][center-j] = inputArr[center-j][center-j];
                // 9시 -> 7시
                returnArr[center+j][center-j] = inputArr[center][center-j];
                // 7시 -> 6시
                returnArr[center+j][center] = inputArr[center+j][center-j];
                // 6시 -> 5시
                returnArr[center+j][center+j] = inputArr[center+j][center];
                // 5시 -> 3시
                returnArr[center][center+j] = inputArr[center+j][center+j];
                // 3시 -> 1시
                returnArr[center-j][center+j] = inputArr[center][center+j];
                // 1시 -> 12시
                returnArr[center-j][center] = inputArr[center-j][center+j];
            }
            return returnArr;
        }else{
            return inputArr;
        }
    }
}
