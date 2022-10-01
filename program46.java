import java.lang.*;
import java.util.*;

class Base
{
    public int iNo;            //Charchtristic 

    public Base(int A)         //parametrised constructor
    {
        iNo = A;

        
    }

    public void DispalyDigit()
    {
        System.out.println(+iNo);
        int iDigit = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(""+iDigit);
            iNo = iNo/10;
        }
    }
}

class program46
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
         

        int iValue =0;
        System.out.println("Enter the number");
        iValue=sobj.nextInt();

        Base obj = new Base(iValue);
        obj.DispalyDigit();

    }
}