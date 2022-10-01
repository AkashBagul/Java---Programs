import java.lang.*;
import java.util.*;

class Base
{
    public boolean CheckPerfect(int iNo)
    {
        int iCnt= 0;
        int iSum= 0;

        if(iNo < 0)
        {
            iNo = - iNo;
        }

        for(iCnt=1; iCnt<= iNo/2; iCnt++)
        {
            if((iNo % iCnt) ==0)
            {
                iSum = iSum + iCnt;
            }

             if(iSum > iNo)
             {
                break;
             }
            
        }

        if(iNo ==iSum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}

class program35
{
    public static void main(String arg[])
    {

        Scanner sobj = new Scanner(System.in);

        int iValue=0;
        boolean bRet;

        System.out.println("Enter the number");
        iValue=sobj.nextInt();

        Base obj=new Base();

        bRet= obj.CheckPerfect(iValue);
        if(bRet==true)
        {
            System.out.println("It is prime Number :"+iValue);
        }
        else
        {
            System.out.println("It is not prime Number :"+iValue);
        }
    }
}