package InnerClasses;

public class OuterClass {
    private String username = "Jay";


    public void display(){
        final String password = "jshfbjwwdxi";
        System.out.println("your name is " + username);

        class InnerClass{
           public void Print(){
               System.out.println("This is your name " + username);
               System.out.println("This is your password " + password);
            }
        }
        InnerClass run = new InnerClass();
        run.Print();
    }

    public static void main(String[] args) {
        OuterClass inner = new OuterClass();
        inner.display();
    }
}
