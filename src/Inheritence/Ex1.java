package Inheritence;

class circle
{
    private float radius;

    public circle()
    {
        this.radius = 10.0f;
    }

    public circle(float radius)
    {
        this.radius = radius;
    }

    public float getRadius()
    {
        return radius;
    }
    public void setRadius(float radius)
    {
        this.radius = radius;
    }
    public float area()
    {
        float a = (float) (Math.PI * Math.pow(this.radius,2));
        return a;
    }
    public float perimeter()
    {
        float p = (float) (2 * Math.PI * this.radius);
        return p;
    }
}

class cylinder extends circle
{
    private float height;
    public cylinder()
    {
        super();
        this.height = 90;
    }
    public cylinder(float radius,float height)
    {
        super(radius);
        this.height = height;

    }
    public float volume()
    {
        float v = (float) (Math.PI * Math.pow(this.getRadius(),2) * this.height);
        return v;
    }

}
public class Ex1 {
    public  static void main(String[] args)
    {
        cylinder c1 = new cylinder();
        cylinder c2 = new cylinder(12,100);
        float a = c2.area();
        System.out.println(a);

        float p = c2.perimeter();
        System.out.println(p);


        float v = c2.volume();
        System.out.println(v);

    }
}
