import java.lang.*;
import java.util.*;

class Base
{
    public void DisplayFactor(int iNo)
    {
        int iCnt= 0;

        if(iNo < 0)
        {
            iNo = - iNo;
        }

        for(iCnt=1; iCnt<= iNo/2; iCnt++)
        {
            if((iNo % iCnt) ==0)
            {
                System.out.println(""+iCnt);
            }
        }
    }
}

class program30
{
    public static void main(String arg[])
    {

        Scanner sobj = new Scanner(System.in);

        int iValue=0;

        System.out.println("Enter the number");
        iValue=sobj.nextInt();

        Base obj=new Base();

        obj.DisplayFactor(iValue);
        
    }
}