import java.lang.*;
import java.util.*;

class Base
{
    public void Display(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        int iCnt=0;
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            System.out.println("Hello");
        }
    }
}

class program17
{
    public static void main(String arg[])
    {
        int iValue=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number:");
        iValue=sobj.nextInt();
        Base obj=new Base();
        obj.Display(iValue);
    }
}