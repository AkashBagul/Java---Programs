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

    public int CountDigit()
    {
        int iDigit = 0;
        int iCnt = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iCnt++;
            iNo = iNo /10;
        }
        return iCnt;
    }
}


class program48
{
    public static void main(String arg[])
    {
        int iRet = 0;
        Base obj = new Base();
        obj.Accept();
        obj.Dispaly();
        iRet = obj.CountDigit();  
        System.out.println("Number of count is:"+iRet);
    }
}