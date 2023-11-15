package Main;

public class Main {
    public static void main(String[] args) {
        /*
        String name = "Alex";
        int age = 21;
        hello(name, age);
    }

    static void hello(String title, int age){
        System.out.println("Hello "+title+" you are "+age);
        */
        int x = 3;
        int y = 4;
        int z = add(x, y);
        System.out.println(z);
    }
    static int add(int x, int y){
        int z = x + y;
        return z;
    }
}