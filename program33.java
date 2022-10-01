import java.lang.*;
import java.util.*;

class Base
{
    public int SumFactor(int iNo)
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
        }
        return iSum;
    }

    public boolean CheckPerfect(int iNo)
    {
        int iAns=0;
        iAns=SumFactor(iNo);

        if(iNo==iAns)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}

class program33
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