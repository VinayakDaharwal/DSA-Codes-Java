package Cognizant;

import java.util.HashSet;
import java.util.Set;

public class HashSetStudents {

    private int id;
    private String Name;
    private int Age;


    HashSetStudents(int id, String Name, int Age){
        this.id = id;
        this.Name = Name;
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "id : " + id + "..name : " + Name +"..Age :" + Age;
    }

    static void main(String[] args) {
        HashSetStudents s1 = new HashSetStudents(1,"Vinayak", 23);
        HashSetStudents s2 = new HashSetStudents(2,"Dev", 23);
        HashSetStudents s3 = new HashSetStudents(3,"Hardik", 23);
        HashSetStudents s4 = new HashSetStudents(4,"Anuj", 23);
        HashSetStudents s5 = new HashSetStudents(5,"Mahak", 23);
        HashSetStudents s6 = new HashSetStudents(6,"Nakul", 23);
        HashSetStudents s7 = new HashSetStudents(7,"Vansika", 23);
        HashSetStudents s8 = new HashSetStudents(8,"Anurup", 23);
        HashSetStudents s9 = new HashSetStudents(9,"Pranay", 23);
        HashSetStudents s10 = new HashSetStudents(10,"Samarth", 23);

        Set<HashSetStudents> collection = new HashSet<>();
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);
        collection.add(s4);
        collection.add(s5);
        collection.add(s6);
        collection.add(s7);
        collection.add(s8);
        collection.add(s9);
        collection.add(s10);
        System.out.println(collection);

        collection.remove(s2);
        System.out.println("After remove Dev:");
        System.out.println(collection);

        System.out.println("Size: " + collection.size());

        collection.clear();
        System.out.println("After clear:");
        System.out.println(collection);

    }

}
