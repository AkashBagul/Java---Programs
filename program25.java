import java.lang.*;
import java.util.*;

class Base
{
    public int Display(int iNo)
    {
        int iCnt=0;

        if(iNo%2==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }   
    }
}

class program25
{
    public static void main(String arg[])
    {
        int iValue=0;
        int iRet;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number:");
        iValue=sobj.nextInt();

        Base obj=new Base();
        iRet=obj.Display(iValue);
        if(iRet==1)
        {
            System.out.println("It is Even number : "+iValue);
        }
        else
        {
            System.out.println("It is odd number : "+iValue);
        }
    }
}