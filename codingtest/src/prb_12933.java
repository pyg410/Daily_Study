import java.io.*;

public class prb_12933 {

    static int count;
    static int duckIndex=0;
    static char[] duckSoundArr;
    static int changeCount=0;
    static boolean isGameOver = false;
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
        while(!isGameOver){
            isGameOver = true;
            findDuck();
            if(duckIndex!=0) {
                count = -1;
                break;
            }
        }
        if(changeCount!=duckSoundArr.length || duckSoundArr.length%5!=0){
            System.out.println(-1);
        }else{
            System.out.println(count);
        }
    }

    static void findDuck(){
        char findWord = 'q';
        for(int i=0; i<duckSoundArr.length; i++){
            if(duckSoundArr[i]==findWord){
                isGameOver = false;
                duckSoundArr[i]='X';
                changeCount+=1;
                duckIndex +=1;
                if(duckIndex==5){
                    duckIndex=0;
                }
                findWord = duckWords[duckIndex];
            }
        }
        if(isGameOver==false){
            count +=1;
        }

//        if(duckWords[duckIndex]!='q'){
//            isGameOver=true;
//            count = -1;
//        }
    }
}
// quac qquac qquac