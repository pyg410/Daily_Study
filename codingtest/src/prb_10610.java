import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 입력
 * N을 입력받는다. N는 최대 10^5개의 숫자로 구성되어 있으며, 0으로 시작하지 않는다.
 *
 * 출력
 * 미르코가 만들고 싶어하는 수가 존재한다면 그 수를 출력하라. 그 수가 존재하지 않는다면, -1을 출력하라.
 *
 * 시간제한
 * 1초
 *
 * 메모리
 * 256MB
 */
public class prb_10610 {
    public static void main(String[] args) throws IOException {
        // 조건 1. 뒷 자리에 0이 포함되어야함.
        // 조건 2. 각 숫자의 합이 3의 배수여야함
        // String으로 입력받고, 사전순 배열, 0 포함되어있는지 확인, 각 숫자합이 3의배수인지 확인 -> 통과시 ? 그 숫자 출력 : -1 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputNum = br.readLine();
        char[] numSort = inputNum.toCharArray();
        Arrays.sort(numSort);
        String outputNum ="";
        for(int i=numSort.length-1; i>=0; i--){
            outputNum += numSort[i];
        }
        if(inputNum.contains("0")){
            int sum =0;
            for(int i=0; i<numSort.length; i++){
                sum += numSort[i]-'0';
            }
            if(sum%3==0){
                System.out.println(outputNum);
                return;
            }
        }

        System.out.println("-1");


    }
}
