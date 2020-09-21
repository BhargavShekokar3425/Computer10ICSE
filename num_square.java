class num_square
{
    public void square_print(double a)
    {
        double num=Math.pow(a,2);
        System.out.println(num);
    }
    public static void main()
    {
        num_square obj=new num_square();
        obj.square_print(5);
    }
}