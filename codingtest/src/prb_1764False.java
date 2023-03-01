import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class prb_1764False {
    public static void main(String args[])throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int count=0;
        for(int i=0; i<(N+M); i++){
            String inputWord = br.readLine();
            if(list.contains(inputWord)){
                count++;
                sb.append(inputWord).append("\n");
                continue;
            }
            list.add(inputWord);
        }
        System.out.println(count);
        System.out.println(sb);
    }
}
