import java.lang.*;

class Base
{
    public void Display()
    {
        int iCnt=0;
        for(iCnt=1;iCnt<=5;iCnt++)
        {
            System.out.println("Hello");
        }
    }
}

class program13
{
    public static void main(String arg[])
    {
        Base obj=new Base();
        obj.Display();
    }
}