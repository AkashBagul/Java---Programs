import java.lang.*;

class Base
{
    public void Display()
    {
        int iCnt=0;
        for(iCnt=1;iCnt<=5;iCnt++)
        {
           System. out. print(""+iCnt);
        
        }
    }
}

class program19
{
    public static void main(String arg[])
    {
        Base obj=new Base();
        obj.Display();
    }
}