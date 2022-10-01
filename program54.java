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

    public boolean CheckPallindrome()
    {
        int iDigit = 0;
        int iRev = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iTemp = iNo;
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iRev = iRev *10 + iDigit;
            iNo = iNo /10;
        }

        if(iRev == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}


class program54
{
    public static void main(String arg[])
    {
       boolean bRet;
        Base obj = new Base();
        obj.Accept();
        obj.Dispaly();
        bRet = obj.CheckPallindrome();  
        if(bRet == true)
        {
            System.out.println("Number is Pallindrme ");
        }
        else
        {
            System.out.println("Number is not Pallindrme ");
        }

    }
}