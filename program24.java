import java.lang.*;
import java.util.*;

class Base
{
    public boolean Check(int iNo)
    {
        int iCnt=0;

        if((iNo%3==0)&&(iNo%5==0))
        
        {
            return true;
        }
        else
        {
            return false;
        }   
    }
}

class program24
{
    public static void main(String arg[])
    {
        int iValue=0;
        boolean bRet;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number:");
        iValue=sobj.nextInt();

        Base obj=new Base();
        bRet=obj.Check(iValue);
        if(bRet==true)
        {
            System.out.println("Number is Disvible 3&5 : "+iValue);
        }
        else
        {
            System.out.println("Number is not Disvible 3&5 : "+iValue);
        }
    }
}