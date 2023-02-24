package modernjavainaction.chap03;

public class Study_lambda2 {


    public static void process(Runnable r){
        r.run();
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
