package presentation;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String arg[]) {

        TreeSet<String> androidNames = new TreeSet<>();

        androidNames.add("KitKat");
        androidNames.add("JellyBean");
        androidNames.add("Lollipop");
        androidNames.add("Marshmallow");
        androidNames.add("KitKat");

        System.out.println(androidNames);
    }
}
