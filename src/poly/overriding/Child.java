package poly.overriding;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void method() {
        System.out.println("Child.method");
    }

    public void call() {
        System.out.println("Child.call");
    }
}
