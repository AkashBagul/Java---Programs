import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////
//
//  Function Name:  Addition
//  Description :      Used to perform addition of 2 numbers
//  Input :              Integer, Integer
//  Output :            Integer
//  Date :               22/09/2022
//  Author :            Akash Pramod Bagul.
//
/////////////////////////////////////////////////////////////////////

class Base
{
    public int Value1;
    public int Value2;

    public Base(int a,int b)
    {
        Value1=a;
        Value2=b;
    }

    public int Addition()
    {
        int Ans=0;

        Ans=Value1+Value2;

        return Ans;
    }
    


}

/////////////////////////////////////////////////////////////////////
// Write a program to perform addition of 2 numbers
/////////////////////////////////////////////////////////////////////


class program6
{
    public static void main(String arg[])
    {
        int iNo1=0;
        int iNo2=0;
        int iNo3=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the first number:");
        iNo1=sobj.nextInt();

        
        System.out.println("Enter the Secnod number:");
        iNo2=sobj.nextInt();

        Base obj=new Base(iNo1,iNo2);

        iNo3=obj.Addition();
       System.out.println("Addition is:"+iNo3);


    }
}