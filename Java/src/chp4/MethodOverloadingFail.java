package chp4;

public class MethodOverloadingFail {
    public int getSum(int i, double j){
        return i;
    }
    public int getSum(double i, int j){
        return j;
    }
}
