class A1 {
    void m1() {
        System.out.println("coming from M1");
    }
}

class B1 extends A1 {
    @Override
    void m1() {
        System.out.println("coming from M2");
    }
}

public class Dpoly {
    public static void main(String[] args) {
        System.out.println("A");
        A1 b1 = new B1();
        b1.m1();
    }
}
