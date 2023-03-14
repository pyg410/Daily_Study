import java.io.*;
import java.util.StringTokenizer;

public class prb_2615 {
    static int[][] map = new int[21][21]; // padding
    static int[][][] whereIWent = new int[21][21][4];
    static int[] dx = {1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i=1; i<=19; i++){
            st = new StringTokenizer(br.readLine());
            for(int j= 1; j<=19; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(findGo());
    }

    static String findGo(){
        for(int i=1; i<=19; i++){
            for(int j=1; j<=19; j++){
                if(map[j][i]!=0){
                    for(int d=0; d<4; d++){
                        // 한번도 안간 곳이고 && 방향으로 5개의 같은 색깔 돌이 있다면?
                        if(whereIWent[j][i][d]==0 && checkFiveOfMap(j, i, d)==5){
                            return map[j][i] + "\n" + j + " " + i + "\n";
                        }
                    }
                }
            }
        }
        return "0";
    }
    static int checkFiveOfMap(int x, int y, int dir){
        int nx = x + dx[dir];
        int ny = y + dy[dir];

        if(map[nx][ny]==map[x][y]){ // 지금 있는 곳과, 다음 있을 곳의 색이 같다면?
            return whereIWent[nx][ny][dir] = checkFiveOfMap(nx, ny, dir) +1; // count 반복.
        }
        return 1; // 아니라면 1 출력
    }
}
