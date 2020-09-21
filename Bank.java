import java.util.Scanner;
class Bank
{
    String name,acc_type;
    int balance,acc_no;
    Bank()
    {
        name="";
        acc_type="";
        balance=0;
        acc_no=0;
    }
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the depositorś name:");
        name=sc.next();
        System.out.println("Enter the depositorsś account type:");
        acc_type=sc.next();
        System.out.println("Enter the depositorsś account number:");
        acc_no=sc.nextInt();
        System.out.println("Enter the depositor's balance:");
        balance=sc.nextInt();
    }
    void deposit()
    {
        int deposit1;
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the deposit:");
         deposit1=sc.nextInt();
        balance=balance+deposit1;
    }
    void withraw()
    {
        Scanner sc=new Scanner(System.in);
        int withraw1;
        System.out.println("Enter the withraw:");
        withraw1=sc.nextInt();
         if(withraw1<balance)
        {
            balance=balance-withraw1;
        }
        else
        {
            System.out.println("Error");
        }
    }
    void display()
    {
        System.out.println("name is "+name);
        System.out.println("balance is "+balance);
    }
    public static void main()
    {
        Bank obj=new Bank();
        obj.init();
        obj.withraw();
        obj.display();
    }
}