import java.lang.*;
import java.util.*;

class Base
{
    int CountFactor(int iNo)
    {
        int iCnt = 0;
        int iFactCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for (iCnt = 2; iCnt <= iNo / 2; iCnt++)
        {
            if (iNo % iCnt == 0)
            {
                iFactCnt++;
            }
        }
        return iFactCnt;
    }

boolean CheckPrime(int iNo)
    {
        int iRet = 0;
        iRet = CountFactor(iNo);
        if (iRet == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
}

class program43
{
    public static void main(String arg[])
    {

        Scanner sobj = new Scanner(System.in);

        int iValue=0;
        boolean bRet;
        
        System.out.println("Enter the number");
        iValue=sobj.nextInt();

        Base obj=new Base();

        bRet= obj.CheckPrime(iValue);
        if(bRet==true)
        {
            System.out.println("It is prime number"+iValue);
        }
        else
        {
            
            System.out.println("It is Not prime number"+iValue);
        }
        
      

        
    }
}