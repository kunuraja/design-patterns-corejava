package singletondesignpattern;

public class MainApplication {

    public static void main(String[] args) {
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();
        System.out.println(object1);
        System.out.println(object2);

    }






}
