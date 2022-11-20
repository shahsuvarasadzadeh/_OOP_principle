package _Polymorphism;

public class Dog extends Animal {
    public Dog() {
        this.age = 6;
    }

    @Override
    public void showAge() {
        System.out.println(this.age);
    }

    public void run() {
        System.out.println("Dog running");
    }

}
