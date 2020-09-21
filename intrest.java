class intrest
{
    double P,r,t,I;
    void init()
    {
        P=2000;
        r=5;
        t=5;
    }
    void calc()
    {
        I=(P*r*t)/100;
    }
    void display()
    {
        System.out.println(I);
    }
    public static void main()
    {
        intrest obj=new intrest();
        obj.init();
        obj.calc();
        obj.display();
    }
}