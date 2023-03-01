import java.io.*;

public class prb_2941 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputWord = br.readLine();
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(int i=0; i<croatia.length; i++){
            if(inputWord.contains(croatia[i])){
                inputWord = inputWord.replace(croatia[i],"!");
            }
        }

        System.out.println(inputWord.length());
    }
}
