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

    public int SumEven()
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
                iSum = iSum + iDigit;
            }
            iNo = iNo /10;
        }
        return iSum;
        
    }
}


class program52
{
    public static void main(String arg[])
    {
       int iRet =0;
        Base obj = new Base();
        obj.Accept();
        obj.Dispaly();
        iRet = obj.SumEven();  
        System.out.println("Additon of sum factor is:"+iRet);

    }
}