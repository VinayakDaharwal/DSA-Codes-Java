package Inheritence;

class MyTest1 {

    static int x = 10;
    int y;

    void show() {
        System.out.println("X : " + x);
        System.out.println("Y : " + y);
    }

    static void display() {
        System.out.println("X : " + x);
    }

    public static void main(String[] args) {

        MyTest1 t1 = new MyTest1();
        t1.show();

        t1.x++;

        MyTest1 t2 = new MyTest1();
        t2.show();

        System.out.println(MyTest1.x);

        MyTest1.display();
    }
}

