import java.util.Scanner;

public class prb_10828 {
    public static int top = -1;    //인덱스
    public static int size= 10000;    //스택 배열의 크기
    public static int [] stack = new int[size];
    public static void push(int x){
        stack[++top] = x;
    }
    public static void pop(){
        if(top==-1){
            System.out.println("-1");
        }
        else {
            int pop = stack[top];
            stack[top--] = 0;
            System.out.println(pop);
        }
    }
    public static void size(){
        int count = 0;
        for (int i =0; i<50; i++){
            if(stack[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void empty(){
        if(top==-1){
            System.out.println("1");
        }
        else System.out.println("0");
    }
    public static void top(){
        if(top==-1) System.out.println("-1");
        else System.out.println(stack[top]);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String oper;
        int number;

        for(int i =0; i<n; i++){
            oper = in.next();
            switch (oper){
                case "push":
                    number = in.nextInt();
                    push(number);
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "top":
                    top();
                    break;
            }
        }

        in.close();
    }
}
