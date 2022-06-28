package InnerClasses;

public class StaticInnerClass {
    private String name = "John";
    private static int age = 23;

    static class StaticClass{
        public void run(){
            System.out.println("My age is "+ age);
        }
    }

    public static void main(String[] args) {
        StaticInnerClass run = new StaticInnerClass();
        StaticInnerClass.StaticClass print = new StaticClass();
        print.run();
    }
}
