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

    public int DigitSum()
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
            iSum = iSum + iDigit;
            iNo = iNo /10;
        }
        return iSum;
    }
}


class program50
{
    public static void main(String arg[])
    {
        int iRet = 0;
        Base obj = new Base();
        obj.Accept();
        obj.Dispaly();
        iRet = obj.DigitSum();  
        System.out.println("Number of Addition is:"+iRet);
    }
}