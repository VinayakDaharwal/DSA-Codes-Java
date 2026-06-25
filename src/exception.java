public class exception
    {
        public static void method3()
        {
            try
            {
                System.out.println("Start of Method-3");
                System.out.println(19/5);
                System.out.println("End Of Method-3");
            }
            catch (ArithmeticException e)
            {
                System.out.println(e);
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        public static void method2()
        {
            System.out.println("Start Of Method-2");
            method3();
            System.out.println("End Of Method-2");
        }
        public static void method1()
        {
            System.out.println("Start Of Method-1");
            method2();
            System.out.println("End Of Method-1");
        }
        public static void main(String[] args)
        {
            method1();
        }
    }


