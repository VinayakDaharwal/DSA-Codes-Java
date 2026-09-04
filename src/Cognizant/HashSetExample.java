package Cognizant;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Character> set1 = new HashSet<>(Set.of('A','B','C','D','E','F'));
        Set<Character> set2 = new HashSet<>(Set.of('E','F','G','H'));

        set1.add('X');
        set1.add('Y');
        set1.add('Y');

        Set<Character> set3 = new HashSet<>(Set.of('A','B','C','D','E','F'));
        Set<Character> set4 = new HashSet<>(Set.of('E','F','G','H'));

        System.out.println("Before addall :" + set3);
        set3.addAll(set4);
        System.out.println("After AddAll :" + set3);

        Set<Character> set5 = new HashSet<>(Set.of('A','B','C','D','E','F'));
        System.out.println("Before Remove F :" + set5);

        set5.remove('F');
        System.out.println("After Remove F :"+set5);

        set5.remove('G');
        System.out.println("After Remove G :" + set5);


        Set<Character> set6 = new HashSet<>(Set.of('A','B','C','D','E','F'));
        Set<Character> set7 = new HashSet<>(Set.of('E','F','G','H'));

        set6.removeAll(set7);
        System.out.println("Remove Set 7 :" + set6);


        Set<Character> set8 = new HashSet<>(Set.of('A','B','C','D','E','F'));
        boolean isPresent = set8.contains('E');

        System.out.println("Before Contains E :" + isPresent);

        isPresent = set8.contains('X');
        System.out.println("After Conatins E :" + isPresent);

        Set<Character> set9 = new HashSet<>(Set.of('A','B','C','D','E','F','G','H'));
        Set<Character> set10 = new HashSet<>(Set.of('E','F','G','H'));

        isPresent = set9.containsAll(set10);
        System.out.println("After Conatins Set10 :" + isPresent);

        Set<Character> set11 = new HashSet<>(Set.of('A','B','C','D','E','F','G','H'));
        System.out.println("Without clear :" + set11);
        set11.clear();
        System.out.println("With Clear Function :" + set11);

        Set<Character> set12 = new HashSet<>(Set.of('A','B','C','D','E','F','G','H'));
        int nSize = set12.size();
        System.out.println(nSize);

        set12.clear();
        nSize = set12.size();
        System.out.println("Removing all element :" + nSize);


        Set<Character> set13 = new HashSet<>(Set.of('A','B','C','D','E','F','G','H'));
        boolean isEmpty = set13.isEmpty();

        System.out.println("Before Clear :" + isEmpty);
        set13.clear();
        isEmpty = set13.isEmpty();
        System.out.println("After clear :" + isEmpty);
    }
}
