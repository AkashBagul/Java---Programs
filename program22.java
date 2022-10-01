// Input : 4
// Output : 10  (1+2+3+4)

// Input : 5
// Output : 15  (1+2+3+4+5)

// Input : 7
// Output : 28  (1+2+3+4+5+6+7)

/*
        Algoritham

        START
            Accept number from user as No
            Check whether that number is negative or  not
            If it is negative then convert it to positive

            Create one variable as Sum and set it to 0
            Create one variable as Cnt and set it to 1

            Iterate till Cnt is less than or equal to No
                Add the value of Cnt into the variable Sum
                Inrement the value of Cnt by 1
            Loop

            Display the value of Sum
        END
*/

import java.lang.*;
import java.util.*;

class Base
{
    public int Display(int iNo)
    {
        int iCnt=0;
        int iSum=0;

        if(iNo<0)
        {
            iNo=-iNo;
        }
        
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            iSum=iSum+iCnt;
        }
        return iSum;
    }
}

class program22
{
    public static void main(String arg[])
    {
        int iValue=0;
        int iRet=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number:");
        iValue=sobj.nextInt();

        Base obj=new Base();
        iRet=obj.Display(iValue);
        System.out.println(""+iRet);

    }
}