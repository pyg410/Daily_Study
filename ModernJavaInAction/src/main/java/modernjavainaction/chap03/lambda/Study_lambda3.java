package modernjavainaction.chap03.lambda;

import modernjavainaction.chap03.lambda.BufferedReaderProcessor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Study_lambda3 {
    public static void main(String[] args) throws IOException{
        String oneLine = processFile((BufferedReader br) -> br.readLine()); // 한 행 처리
        String twoLines = processFile((BufferedReader br) -> br.readLine() + br.readLine());
    }

    public static String processFile(BufferedReaderProcessor processor) throws IOException{
        try (BufferedReader br
                = new BufferedReader(new FileReader("data.txt"))){
            return processor.process(br);
        }
    }
}
