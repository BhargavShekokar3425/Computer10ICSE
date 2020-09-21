class Area_Of_Cylinder
{
    double r;
    int h;
    double ans;
    final double pi = 3.14;
    Area_Of_Cylinder()
    {
        r=0;
        h=0;
    }
    void init()
    {
        r=2.5;
        h=4;
    }
    void ans()
    {
        ans = pi*r*r*h;
    }
    public static void main()
    {
        Area_Of_Cylinder obj = new Area_Of_Cylinder();
        obj.init();
        System.out.println(obj.ans);
    }
}