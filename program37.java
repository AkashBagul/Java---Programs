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

        for(iCnt = (iNo/2); ((iCnt >= 1) && (iSum <= iNo)); iCnt--)
        {
            if((iNo % iCnt) ==0)
            {
                iSum = iSum + iCnt;
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

class program37
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