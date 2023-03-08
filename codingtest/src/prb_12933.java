import java.io.*;

public class prb_12933 {

    static int count;
    static char[] duckSoundArr;
    static char[] duckWords = {'q', 'u', 'a', 'c', 'k'};
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String duckSounds = br.readLine();
        duckSoundArr = duckSounds.toCharArray();
        count =0;

        // 이거 함수로 빼고, 재귀로 돌리면 깔끔해질 것 같은데?
        // for문이 문자,시작지점 제외하고 전부 같음.
        // 파라미터로 찾는 문자, 시작하는 index
        // 출력값으로는? 없어도 되지 않나? ( 단, count를 클래스 멤버로 빼야한다. 그리고 static 붙여주어야한다.)
        for(int i =0; i<duckSoundArr.length; i++){
            if(duckSoundArr[i] == 'q'){
                duckSoundArr[i] = 'X';
                for(int j=i; j<duckSoundArr.length; j++){

                }
            }
        }
        
    }

    static void findDuck(char findWord, int startIndex){
        int duckIndex=0;
        for(int i=startIndex; i<duckSoundArr.length; i++){
            if(duckSoundArr[i]==findWord){

            }
        }
    }
}
