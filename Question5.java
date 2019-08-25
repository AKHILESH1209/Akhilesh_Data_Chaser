import java.util.Scanner;
public class Question5
{
    public static void main(String[] args)
    {
        double sal,tax;
        Scanner x=new Scanner(System.in);
        System.out.println("enter salary");
        sal=x.nextDouble();
        if(sal>=0 && sal<=14999.99)
        {tax=(0.00+(sal*0.15));}
        else if(sal>=15000.00 && sal<=29999.99)
        {tax=(2250.00+(sal*0.18));}
        else if(sal>=30000.00 && sal<=49999.99)
        {tax=(5400.00+(sal*0.22));}
        else if(sal>=50000.00 && sal<=79999.99)
        {tax=(11000.00+(sal*0.27));}
        else if(sal>=80000.00 && sal<=150000.00)
        {tax=(21600.00+(sal*0.33));}
        else
        {tax=-1.0;}
        System.out.println(tax);
    }
}