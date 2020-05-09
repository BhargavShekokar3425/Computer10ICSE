class area_rect
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
        System.out.println(area+"is the area");
    }
}