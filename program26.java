/*
0 to 35         Fail
35 to 50        Pass class
50 to 60        Second class
60 to 70        First class
70 to 100       First class with distinction
*/

import java.lang.*;
import java.util.*;
class Base
{
    public void DisplayClass(float Marks)
    {
        if((Marks>0.0)&&(Marks<35.0))
        {
            System.out.println("You are fail");
        }

        else if((Marks>=35.0)&&(Marks<50.0))
        {
            System.out.println("You are Pass Class");
        }

        else if((Marks>=50.0)&&(Marks<60.0))
        {
            System.out.println("second fail");
        }

       else if((Marks>=60.0)&&(Marks<70.0))
        {
            System.out.println("first class");
        }

       else if((Marks>=70.0)&&(Marks<100.0))
        {
            System.out.println("First class with distinction");
        }

        else
        {
            System.out.println("Invalid marks");
        }
    }
}

class program26
{
    public static void main(String arg[])
    {
        float fValue=0.0f;
        float fRet=0.0f;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Percentage");
        fValue=sobj.nextFloat();

        Base obj=new Base();

        obj.DisplayClass(fValue);
    }
}