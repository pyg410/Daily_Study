import java.io.*;
import java.util.*;

public class prb_20291 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> files = new HashMap<>();
        for(int i=0; i<N; i++){
            String s = br.readLine();
            int index = s.indexOf(".")+1;
            s = s.substring(index);
            if(files.containsKey(s)){
                files.put(s, files.get(s) + 1);
            }else {
                files.put(s, 1);
            }
        }
        List<String> outputFiles = new ArrayList<>();
        for(Map.Entry<String, Integer> pair : files.entrySet()){
            outputFiles.add(pair.getKey() + " " + pair.getValue());
        }
        Collections.sort(outputFiles);
        StringBuilder sb = new StringBuilder();
        for(String s : outputFiles){
            sb.append(s).append("\n");
        }

        System.out.println(sb);

    }
}
