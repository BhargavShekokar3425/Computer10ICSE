import java.util.Scanner;
public class Armstrong_No
{
    int num;
    void getNumber ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number: ");
        num = sc.nextInt ();
    }
    
    void calculate ()
    {
        double sum = 0;
        int n = num;
        while (n!=0)
        {
            int r = n%10;
            n = n/10;
            sum = sum + (r*r*r);
        }
        
        if (sum == num)
            System.out.println ("The number entered is an armstrong number");
        else
            System.out.println ("The number entered is not an armstrong number");
    }
    
    public static void m ()
    {
        Armstrong_No obj = new Armstrong_No();
        obj.getNumber();
        obj.calculate ();
    }
}