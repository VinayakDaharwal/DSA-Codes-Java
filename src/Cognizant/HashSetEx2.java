package Cognizant;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>(Set.of("Vinayak","Devkumar"));
        Set<String> s2 = new HashSet<>(Set.of("Hardik" , "Anuj" , "Mahak"));

        s1.add("Daharwal");
        s1.add("Mandal");
        s1.add("Mandal");

        Set<String> s3 = new HashSet<>(Set.of("Vinayak","Devkumar"));
        Set<String> s4 = new HashSet<>(Set.of("Hardik" , "Anuj" , "Mahak"));
        System.out.println("Before AddAll :" + s3);
        s3.addAll(s4);
        System.out.println("After AddAll s4 :" + s3);

        Set<String> s5= new HashSet<>(Set.of("Vinayak","Devkumar"));
        System.out.println("Before Remove Devkumar :" + s5);

        s5.remove("Devkumar");
        System.out.println("After Rempve Devkumar :" + s5);

        Set<String> s6 = new HashSet<>(Set.of("Vinayak","Devkumar" ,"Pranay","Samarth"));
        Set<String> s7 = new HashSet<>(Set.of("Pranay","Samarth","Hardik" , "Anuj" , "Mahak"));

        s6.removeAll(s7);
        System.out.println("After Remove s7 :" + s6);

        Set<String> s8 = new HashSet<>(Set.of("Vinayak","Devkumar" ,"Pranay","Samarth"));
        boolean isPresent = s8.contains("Samarth");
        System.out.println("Before Contains Samarth :" + isPresent);

        isPresent = s8.contains("Pranay");
        System.out.println("After Conatins Pranay :" + isPresent);



    }
}
