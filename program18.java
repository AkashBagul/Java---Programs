import java.lang.*;

class Base
{
    public void Display()
    {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
    }
}

class program18
{
    public static void main(String arg[])
    {
        Base obj=new Base();
        obj.Display();
    }
}