package designpatterns.singleton;

public final class SingletonDesignPattern {
    private static SingletonDesignPattern instanceOfSingleton = null;

    private SingletonDesignPattern() {

    }

    public static SingletonDesignPattern getInstanceOfSingleton() {
        if(instanceOfSingleton == null)
            instanceOfSingleton = new SingletonDesignPattern();
        return instanceOfSingleton;
    }
}
