class overloading//method overloading
{
    void prtsqr(int i)//prtsqr method is being overloaded 4 times for int,char,float,double
    {
        System.out.println("square of integer"+i+"is"+Math.pow(i,2));
    }
    void prtsqr(char c)
    {
        System.out.println("square of character is not possible");
    }
    void prtsqr(float f)
    {
        System.out.println("square of float"+f+"is"+Math.pow(f,2));
    }
    void prtsqr(double d)
    {
        System.out.println("square of double"+d+"is"+Math.pow(d,2));
    }
    public static void main()
    {
        overloading obj=new overloading();
        obj.prtsqr(4);
        obj.prtsqr(3.6);
        obj.prtsqr(6.5f);
        obj.prtsqr('a');
    }
}