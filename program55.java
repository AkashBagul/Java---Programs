import java.lang.*;
import java.util.*;
class Base
{
    private int iNo1;
    private int iNo2;

    public void Accept()
    {

        System.out.println("Enter the first number");
        Scanner sobj = new Scanner(System.in);
        this.iNo1=sobj.nextInt();

        System.out.println("Enter the Second number");
        this.iNo2 = sobj.nextInt();

    }

    public void Dispaly()
    {
        System.out.println(""+iNo1);
    }

     public int Power()
    {
        int iDigit = 0;
        int iMult = 1;
        int iCnt = 0;
        if(iNo1 < 0)
        {
            iNo1 = -iNo1;
        }
            for(iCnt = 1;iCnt<=iNo2;iCnt++)
            {
                iMult = iMult *iNo1;
            }
        return iMult;
    }
}


class program55
{
    public static void main(String arg[])
    {
        int iRet =0;
        Base obj = new Base();
        obj.Accept();
        obj.Dispaly();
        iRet = obj.Power();  
        System.out.println("Reverse number is:"+iRet);

    }
}