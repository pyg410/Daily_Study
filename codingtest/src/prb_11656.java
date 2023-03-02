import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class prb_11656 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String inputWord = br.readLine();
        List<String> inputArr = new ArrayList<>();

        for(int i=0; i<inputWord.length(); i++){
            inputArr.add(inputWord.substring(i));
        }

        Collections.sort(inputArr);

        for(String s : inputArr){
            System.out.println(s);
        }
    }
}
