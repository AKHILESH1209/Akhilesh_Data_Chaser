import java.util.Scanner;
public class Question6
{
    public static void main(String[] args)
    {
        int year;
	String result;
        System.out.print("Enter a Year : ");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        result=((year%100!=0 && year%4==0 || year%400==0)?"Yes,it's a leap Year ":"No,it's not a leap Year");
        System.out.print(result);
    }

}