package Inheritence;

class StaticKeyword {
    public Object show;
    int x = 12;
    static int y;

    static {
        System.out.println("MyStaticBlockTest");
        System.out.println("Block-1");
        y = 17;
    }

    static {
        System.out.println("Block-2");
        System.out.println(y);
        sayHello();
    }

    public static void sayHello() {
        System.out.println("Hello From JVM");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Example-3 Class Function");
        Class.forName("Inheritence.StaticKeyword");
    }
}