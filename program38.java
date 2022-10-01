import java.lang.*;
import java.util.*;

class Base
{
    public void DispalyF(int iNo)
    {
       int iCnt=0;
       for(iCnt=1;iCnt<=iNo;iCnt++)
       {
       System.out.println(""+iCnt);
       }
    }

    public void DispalyB(int iNo)
    {
       int iCnt=0;
       for(iCnt=iNo;iCnt>=1;iCnt--)
       {
       System.out.println(""+iCnt);
       }
    }
    
    
}

class program38
{
    public static void main(String arg[])
    {

        Scanner sobj = new Scanner(System.in);

        int iValue=0;
        

        System.out.println("Enter the number");
        iValue=sobj.nextInt();

        Base obj=new Base();

        obj.DispalyF(iValue);
        obj.DispalyB(iValue);

        
    }
}