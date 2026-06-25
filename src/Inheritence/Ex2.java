package Inheritence;

class phone
{
    private String phonenumber;
    // no argument constructor
    public phone()
    {
        System.out.println("phone no-argument constructor");
    }
    // all argument constructor
    public phone(String phonenumber)
    {
        this.phonenumber = phonenumber;
    }
    public void audiocall()
    {
        System.out.println(" making call with phone");
    }
    public void text()
    {
        System.out.println("sending text witn phone");

    }
}

class smartphone extends phone
{
    private String macID;
    private int ram;
    private int rom;

    public smartphone()
    {
        System.out.println("smartphone no argument constructor");

    }
    public smartphone(String phonenumber, String macID, int ram, int rom)
    {
        super(phonenumber);
        this.macID = macID;
        this.ram = ram;
        this.rom = rom;
    }
    public void videocall()
    {
        System.out.println("making video call with smartphone");

    }
    public void chat()
    {
        System.out.println("chatting via smartphone");
    }

}
public class Ex2
{
    public static void  main(String [] args)
    {
        smartphone samsung = new smartphone();
        smartphone apple = new smartphone("762467646" , " 4fwr2rsd", 23,556);

    }
}
