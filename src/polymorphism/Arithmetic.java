package polymorphism;

public class Arithmetic {
    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(add(2.5f,5.5f));
    }

    // method overloading - same name but diff signature
    public static int add(int f ,int s) {
        return f + s;
    }
    public static float add(float f ,int s) {
        return f + s;
    }
    public static float add(int f ,float s) {
        return f + s;
    }
    public static float add(float f ,float s) {
        return f + s;
    }

}
