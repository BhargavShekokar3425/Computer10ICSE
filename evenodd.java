class evenodd
{
    int a,temp;
    void init(int n1)
    {
        a=n1;
    }
    void calc()
    {
        if(a%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
    public static void main()
    {
        evenodd obj=new evenodd();
        obj.init(7);
        obj.calc();
    }
}