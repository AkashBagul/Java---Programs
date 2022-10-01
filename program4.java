import java.lang.*;
import java.util.*;

class program4
{
    public static void main(String arg[])
    {
        int iNo1=0;
        int iNo2=0;
        int iNo3=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the first number");
        iNo1=sobj.nextInt();

        System.out.println("Enter the first number");
        iNo2=sobj.nextInt();

        iNo3=iNo1+iNo2;

        System.out.println("Addition is:"+iNo3);
        


    }
}