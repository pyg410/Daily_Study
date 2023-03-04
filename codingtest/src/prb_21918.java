import java.io.*;
import java.util.*;

public class prb_21918 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lightNum = Integer.parseInt(st.nextToken());
        int operationNum = Integer.parseInt(st.nextToken());

        List<Boolean> light = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        // 전구 상태 초기화
        for(int i=0; i<lightNum; i++){
            light.add(st.nextToken().equals("1"));
        }

        // 명령 수행
        for(int i=0; i<operationNum; i++){
            st = new StringTokenizer(br.readLine());
            switch (Integer.parseInt(st.nextToken())){
                case 1:
                    int lightIndex = Integer.parseInt(st.nextToken())-1;
                    boolean lightState = st.nextToken().equals("1");
                    light.set(lightIndex, lightState);
                    break;
                case 2:
                    int firstIndex = Integer.parseInt(st.nextToken())-1;
                    int endIndex = Integer.parseInt(st.nextToken())-1;
                    for(int j=firstIndex; j<=endIndex; j++){
                        light.set(j, !light.get(j).equals(true));
                    }
                    break;
                case 3:
                    firstIndex = Integer.parseInt(st.nextToken())-1;
                    endIndex = Integer.parseInt(st.nextToken())-1;
                    for(int j=firstIndex; j<=endIndex; j++){
                        light.set(j, false);
                    }
                    break;
                case 4:
                    firstIndex = Integer.parseInt(st.nextToken())-1;
                    endIndex = Integer.parseInt(st.nextToken())-1;
                    for(int j=firstIndex; j<=endIndex; j++){
                        light.set(j, true);
                    }
                    break;
            }

        }
        // 출력
        for(Boolean b: light){
            System.out.print(b?1+ " ":0 + " ");
        }
    }
}
