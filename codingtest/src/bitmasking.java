public class bitmasking {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString((1<<21)-1).length() );
        System.out.println(Integer.toBinaryString(~(1<<21)));

    }
}
