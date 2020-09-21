class area_rectangle
{
    double l,b,area;
    void init()
    {
        l=10;
        b=20;
    }
    void calc()
    {
        area=l*b;
    }
    void display()
    {
        System.out.println(area);
    }
    public static void main()
    {
        area_rectangle obj=new area_rectangle();
        obj.init();
        obj.calc();
        obj.display();
    }
}