package modernjavainaction.chap03.FunctionOverloading;

public class FunctionOverloading {
    public static void main(String[] args) {
        FunctionOverloading d = new FunctionOverloading();
        d.excute((Runnable) () -> {});
    }

    public void excute(Runnable r){
        r.run();
    }

    public void excute(Action a){
        a.act();
    }
    @FunctionalInterface
    interface Action{
        void act();
    }
}
