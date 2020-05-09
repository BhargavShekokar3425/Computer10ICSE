public class demo4
{
    int n1,n2;
    double ans;
    void init(int l,int b)
    {
        n1=l;
        n2=b;
    }
    double calc()
    {
        ans=n1*n2;
        return ans;
    }
    public static void main()
    {
        demo4 obj=new demo4();
        obj.init(2,6);
        double result= obj.calc();
        System.out.println(result);
    }
}