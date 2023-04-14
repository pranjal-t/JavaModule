package demo;

interface A
{
    default void display()
    {
        System.out.println("Inside A's display");
    }

    public void demo();
}
interface B
{
//    default void display()
//    {
//        System.out.println("Inside B's display");
//    }

    //public void demo();
}

public class InterfaceDemo implements A,B {

    public static void main(String[] args) {

        InterfaceDemo interfaceDemo = new InterfaceDemo();
        interfaceDemo.display();

        System.out.println();
    }

    @Override
    public void demo() {

    }
}
