import java.util.Scanner;

class SumOfPrimeNo{

    public int primeSum(int n) {

        int sum = 0;

        for (int i = 2; i <= n; i++) {

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        SumOfPrimeNo obj = new SumOfPrimeNo();
        System.out.println("Sum of prime numbers = " + obj.primeSum(n));

        sc.close();
    }
}