import java.lang.*;

class Base
{
    public void Display()
    {
        int iCnt=0;
        for(iCnt=0;iCnt<5;iCnt++)
        {
            System.out.println("Hello");
        }
    }
}

class program14
{
    public static void main(String arg[])
    {
        Base obj=new Base();
        obj.Display();
    }
}