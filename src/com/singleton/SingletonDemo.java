package com.singleton;

class SingletonExample
{
    static String message;
    static SingletonExample singletonExample = null;
    private SingletonExample() {
        message = "This is a singleton class";
    }

    public static SingletonExample getInstance()
    {
        if(singletonExample==null)
            singletonExample = new SingletonExample();

          return singletonExample;
    }


}
public class SingletonDemo {

    public static void main(String[] args) {

        SingletonExample obj = SingletonExample.getInstance();

        SingletonExample obj1 = SingletonExample.getInstance();


        System.out.println(obj.hashCode() + " " + obj1.hashCode());



    }
}
