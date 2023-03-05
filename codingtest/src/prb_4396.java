import java.io.*;

public class prb_4396 {
    static int n;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        boolean[][] boom = new boolean[n][n];
        for(int i=0; i<n; i++){
            String[] arr = br.readLine().split("");
            for(int j=0; j<n; j++){
                boom[i][j] = arr[j].equals("*");
            }
        }
        String[][] answer = new String[n][n];
        boolean isBoomOn = false;
        for(int i=0; i<n; i++){
            String[] isOpen = br.readLine().split("");
            for(int j=0; j<n; j++){
                if (isOpen[j].equals("x")) {
                    answer[i][j] = isBoomNearby(boom, i, j);
                    if(boom[i][j]){
                        isBoomOn = true;
                    }
                } else {
                    answer[i][j] = ".";
                }
            }
        }
        if(isBoomOn){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(boom[i][j]){
                        answer[i][j] = "*";
                    }
                }
            }
        }


        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(answer[i][j]);
            }
            System.out.println();
        }

    }

    static String isBoomNearby(boolean[][] boom, int i, int j){
        //i의 경우 -> 0, n-1
        //j의 경우 -> 0, N-1
        int count =0;
        int[] x = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] y = {0, 1, 1, 1, 0, -1, -1, -1};

        for(int a=0; a<8; a++){
            int newx = i+ x[a];
            int newy = j+ y[a];
            if(newx>=0 && newx<n && newy >=0 && newy <n && boom[newx][newy]){
                count++;
            }
        }

        return String.valueOf(count);
    }
}
