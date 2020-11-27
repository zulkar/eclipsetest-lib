package org.jetbrains.eclipselib;
public class LibImpl {

    private final String name;

    public LibImpl(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println(new LibUtil().getHello() + " " + name + "!");
    }
}
