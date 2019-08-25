import java.util.Scanner;
public class Question7
{
    public static void main(String[] args)
    {
        int a,b,ch,r;
        Scanner x=new Scanner(System.in);
        System.out.println("enter 1st value");
        a=x.nextInt();
        System.out.println("enter 2nd value");
        b=x.nextInt();
        System.out.println("press 1 for add \n 2 for sub \n 3 for multi \n 4 for div");
        ch=x.nextInt();
        switch(ch)
        {
            case 1: r=a+b;
                    System.out.println(r);
                    break;
            case 2: r=a-b;
                    System.out.println(r);
                    break;
            case 3: r=a*b;
                    System.out.println(r);
                    break;
            case 4: r=a/b;
                    System.out.println(r);
                    break;
            default:System.out.println("wrong input");
        }
    }
}