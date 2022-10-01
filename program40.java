import java.lang.*;
import java.util.*;

class Base
{
    public int CheckPrime(int iNo)
    {
        int iCnt=0;
        int iFact=0;

        for(iCnt=1;iCnt<=iNo/2;iCnt++)
        {
            if( iNo % iCnt==0)
            {
               iFact++;
            }
        }
        return iFact;
    }
    
    
}

class program40
{
    public static void main(String arg[])
    {

        Scanner sobj = new Scanner(System.in);

        int iValue=0;
        int iRet=0;
        
        System.out.println("Enter the number");
        iValue=sobj.nextInt();

        Base obj=new Base();

        iRet= obj.CheckPrime(iValue);
        
        {
            System.out.println("Factor count is:"+iRet);
        }
        
    }
}