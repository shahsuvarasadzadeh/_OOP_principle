package elaveInterfaceHaqinda;

public interface ITest {
    public static void main(String[] args) {
        System.out.println("This method compile successfully and print this");
    }
    { System.out.println("Instance block doesn't compile in Interface"); }
    static { System.out.println("Static block doesn't compile in Interface"); }
    public ITest() {
        System.out.println("Constructor does not compile in Interface");
    }
}
