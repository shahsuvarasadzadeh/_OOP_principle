package _Abstraction;

public abstract class A {
    abstract void calculate();

    public static void main(String[] args){
        System.out.println("calculating");
        A x = (A) null;
        x.calculate(); // does compile, but throws NullPointerException
    }
}
