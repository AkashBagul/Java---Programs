import java.lang.*;
import java.util.*;
class Base
{
    public int iNo;

    public void Accept()
    {
        Scanner sobj = new Scanner (System.in);
        System.out.println("Enter the Number ");
        this.iNo=sobj.nextInt();
    }

    public void Dispaly()
    {
        System.out.println(""+iNo);
    }

    public void DisplayDigit()
    {
        int iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo > 0)
        {
            iDigit = iNo % 10;
           System.out.println(""+iDigit);
            iNo = iNo /10;
        }
    }
}

class program47
{
    public static void main(String arg[])
    {
        Base obj = new Base();
        obj.Accept();
        obj.Dispaly();
        obj.DisplayDigit();
    }
}