class Person
{
    String name;
}
public class ex4 {
    public static void main(String[] args) {
        Object instance = null;
        instance = new Person();
        System.out.println(instance);
        Person person = (Person) instance;
        System.out.println(person.name);
        instance = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(instance);
        int[] nums = (int[]) instance;
        System.out.println(nums[3]);
        instance = new String("String Instance");
        System.out.println(instance);
        String str = (String) instance;
        System.out.println(str.toLowerCase());
    }
}
