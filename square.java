public class square
{
    double a,ans;
    void init(double s1)
    {
        a=s1;
    }
    void calc()
    {
        ans=Math.pow(a,2);
    }
    void display()
    {
        System.out.println(ans);
    }
    public static void main()
    {
        square obj=new square();
        obj.init(7);
        obj.calc();
        obj.display();
    }
}