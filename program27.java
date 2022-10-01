
// 1    4000
// 2    8000
// 5    20000
// 10   40000

import java.lang.*;
import java.util.*;
class Base
{
    public void JwelersPortal(int iWeight)
    {
        switch(iWeight)
        {
            
            case 1:
                System.out.println("Your bill amount is 4000");
                break;
            
            

            case 2:
                System.out.println("Your bill amount is 8000");
                break;
     
            case 5:
                System.out.println("Your bill amount is 20000");
                break;

            case 10:
                System.out.println("Your bill amount is 40000");
                break;

            default:
                System.out.println("Invalid Weight");
        }
        
    }
}

class program27
{
    public static void main(String arg[])
    {
        int iSize=0;
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter the gold coin size that you want to purchase");
        iSize=sobj.nextInt();

        Base obj=new Base();

        obj.JwelersPortal(iSize);
    }
}