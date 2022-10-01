import java.lang.*;
import java.util.*;

class Base
{
    public boolean Display(int iNo)
    {
        int iCnt=0;
        int iSum=0;

        if(iNo%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
    }
}

class program23
{
    public static void main(String arg[])
    {
        int iValue=0;
        boolean bRet;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number:");
        iValue=sobj.nextInt();

        Base obj=new Base();
        bRet=obj.Display(iValue);
        if(bRet==true)
        {
            System.out.println("It is Even number : "+iValue);
        }
        else
        {
            System.out.println("It is odd number : "+iValue);
        }
        

    }
}