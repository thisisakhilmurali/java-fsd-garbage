package designpatterns.singleton;

public class Main {
    public static void main(String[] args) {

        SingletonDesignPattern classInstanceOne = SingletonDesignPattern.getInstanceOfSingleton();
        SingletonDesignPattern classInstanceTwo = SingletonDesignPattern.getInstanceOfSingleton();

        if(classInstanceOne.equals(classInstanceTwo))
            System.out.println("Both instances are same");
        else
            System.out.println("Both Instances are same");

    }
}
