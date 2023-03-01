package modernjavainaction.chap03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Study_lambda2 {


    public static void process(Runnable r){
        r.run();
    }

    public String processFile() throws IOException{
        try (BufferedReader br =
                new BufferedReader(new FileReader("data.txt"))){
        return br.readLine();}
    }

    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Hello world");

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world2");
            }
        };

        process(r1);
        process(r2);
    }

}
