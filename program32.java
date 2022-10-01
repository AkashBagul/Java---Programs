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
}

class program32
{
    public static void main(String arg[])
    {

        Scanner sobj = new Scanner(System.in);

        int iValue=0;
        int iRet= 0;

        System.out.println("Enter the number");
        iValue=sobj.nextInt();

        Base obj=new Base();

        iRet= obj.SumFactor(iValue);
        System.out.println(""+iRet);
    }
}