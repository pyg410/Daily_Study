import java.io.*;
import java.util.*;

public class Main {
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        List<Integer> bulb = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            bulb.add(Integer.parseInt(st.nextToken()));
        }
        int studentNum = Integer.parseInt(br.readLine());
        int[][] student = new int[studentNum][2];
        for(int i=0; i<studentNum; i++){
            st = new StringTokenizer(br.readLine());
            student[i][0] = Integer.parseInt(st.nextToken());
            student[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<studentNum; i++){
            if(student[i][0]==1){
                bulb = man(student[i][1], bulb);
            }
            if(student[i][0]==2){
                bulb = woman(student[i][1], bulb);
            }
        }
        int count = 0;
        boolean a= false;
        for(Integer num : bulb){
            if(count%20==0 && a){
                System.out.println();
            }
            a= true;
            count++;
            System.out.print(num + " ");
        }

    }

    static List<Integer> man(int num, List<Integer> bulb){
        int drainage = n/ num;
        for(int i=1; i<=drainage; i++){
            bulb.set(num*i-1, bulb.get(num*i-1).equals(1)?0:1);
        }
        return bulb;
    }

    static List<Integer> woman(int num, List<Integer> bulb){
        boolean exit = false;
        int sideNum = 0;
        while(!exit){
            if(num - sideNum -1 >=0 && num + sideNum-1 <n){
                if(bulb.get(num-sideNum-1).equals(bulb.get(num+sideNum-1))){
                    sideNum++;
                    continue;
                }
            }
            exit = true;
        }
        sideNum --;
        for(int i=num-sideNum-1; i<=num+sideNum-1; i++){
            bulb.set(i, bulb.get(i).equals(1)?0:1); // 왼쪽숫자
        }

        return bulb;
    }
}
