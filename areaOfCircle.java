class areaOfCircle//
{
    double r,ans;//instance variables
    final double pi=3.14;
    void init()
    {
        r=10.5;
    }
    void calc()
    {
        ans = pi*r*r;
    }
    void display()
    {
        System.out.println("The area of a circle is "+ans);
    }
    public static void main()
    {
        areaOfCircle obj=new areaOfCircle();
        obj.init();
        obj.calc();
        obj.display();
    }
}