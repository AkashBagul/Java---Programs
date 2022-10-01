import java.lang.*;
import java.util.*;

class Base
{
    boolean CheckPrime(int iNo)
    {
        int iCnt = 0;

        //          1           2                       3
        for (iCnt = 2; iCnt <= (iNo / 2); iCnt++)
        {
            if (iNo % iCnt == 0) // 4
            {
                break;
            }
        }

        if (iCnt == (iNo / 2) + 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
}

class program44
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