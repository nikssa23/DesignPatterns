public class Main {

    public static void main(String args[]) {


        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton.equals(singleton1) && singleton1.equals(singleton2));

    }
}
