import java.lang.*;
import java.util.*;
class Base
{
    public int iNo;

    public void Accept()
    {

        System.out.println("Enter the number");
        Scanner sobj = new Scanner(System.in);
        this.iNo=sobj.nextInt();
    }

    public void Dispaly()
    {
        System.out.println(""+iNo);
    }

    public void DisplayEven()
    {
        int iDigit = 0;
        int iSum = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) == 0)
            {
                System.out.println(""+iDigit);
            }
            iNo = iNo /10;
        }
        
    }
}


class program51
{
    public static void main(String arg[])
    {
       
        Base obj = new Base();
        obj.Accept();
        obj.Dispaly();
        obj.DisplayEven();  
       
    }
}