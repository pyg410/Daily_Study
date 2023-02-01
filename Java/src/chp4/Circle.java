package chp4;

public class Circle {
    public static void main(String[] args) {
        Circle pizza = new Circle(10, "자바피자");

        double area = pizza.getArea();
        System.out.println(area);
    }
        int radius;
        String name;

        public Circle(){
            radius=1;
            name="";
        }

        public Circle(int r, String n){
            radius=r;
            name=n;
        }

        public double getArea(){
            return 3.14*radius*radius;
        }
    }