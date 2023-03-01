import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class prb_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> hashSet = new HashSet<String>();
        for(int i =0; i<N; i++){
            hashSet.add(br.readLine());
        }

        List<String> list = new ArrayList<>();
        for(int i=0; i<M; i++){
            String inputM = br.readLine();
            if(hashSet.contains(inputM)){
                list.add(inputM);
            }
        }

        Collections.sort(list);

        System.out.println(list.size());
        for(String s : list){
            System.out.println(s);
        }
    }
}
