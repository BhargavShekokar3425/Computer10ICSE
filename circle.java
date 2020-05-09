class circle
{
    double r,area,pi=3.14;
    void init(double radius)//formal parameter
    {
        r=radius;
    }
    double calc()
    {
        area=Math.pow(r,2)*pi;
        return area;
    }
    public static void main()
    {
        circle obj=new circle();
        obj.init(10.5);//actual parameter
        double result=obj.calc();
        System.out.println(result);
    }
}