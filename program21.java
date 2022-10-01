import java.lang.*;
import java.util.*;

class Base
{
    public void Display(int iNo)
    {
        int iCnt=0;
        if(iNo<0)
        {
            iNo=-iNo;
        }
        
        iCnt=1;
        
        while(iCnt<=iNo)
        {
            System.out.println(" "+iCnt);

            iCnt++;
        }
    }
}

class program21
{
    public static void main(String arg[])
    {
        int iValue=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number:");
        iValue=sobj.nextInt();
        Base obj=new Base();
        obj.Display(iValue);
    }
}