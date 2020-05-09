class areashapes
{
    double pi=3.14;
    int area(int a)
    {
        int areasquare=a*a;
        return areasquare;
    }
    float area(float l,float b)
    {
        float arearectangle=l*b;
        return arearectangle;
    }
    double area(double r)
    {
        double areacircle=pi*r*r;
        return areacircle;
    }
    public static void main()
    {
        areashapes obj=new areashapes();
        int square=obj.area(5);
        float rectangle= obj.area(6.7f,7.212f);
        double circle=obj.area(31.4);
        System.out.println("area of square is"+square);
        System.out.println("area of rectangle is"+rectangle);
        System.out.println("area of circle is"+circle);
    }
}