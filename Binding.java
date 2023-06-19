
class A {
    void show() {
        System.out.println("Show on A");
    }
}

class B extends A {
    void show() {
        System.out.println("Show on B");
    }
}

public class Binding {

    public static void main(String[] args) {
        A a = new B();
        a.show();
    }

}
