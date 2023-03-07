import java.io.*;

public class prb_1212_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] binary = {"000", "001", "010", "011", "100", "101", "110", "111"};

        String T = br.readLine();
        StringBuilder sb = new StringBuilder();

        if (T.equals("0")) System.out.println("0"); //0일 경우
        else {
            String[] arr = T.split("");

            for (String s : arr) {
                sb.append(binary[Integer.parseInt(s)]);
            }

            if (sb.charAt(0) == '0' && sb.charAt(1) == '1') System.out.println(sb.substring(1));
            else if (sb.charAt(0) == '0' && sb.charAt(1) =='0') {
                System.out.println(sb.substring(2));
            } else System.out.println(sb);
        }
    }
}