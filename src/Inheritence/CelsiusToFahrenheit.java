package Inheritence;

import java.util.Scanner;

public class CelsiusToFahrenheit {
public static float celsiustofahrenheit(float c){
    return ((c * 9.0f / 5.0f) + 32.0f);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();

        System.out.println(celsiustofahrenheit(c));
        sc.close();
    }
}
