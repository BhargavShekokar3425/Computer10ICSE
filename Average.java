public class Average
{
    int S1,S2,S3,Avg;
    void init()
    {
        S1=67;
        S2=73;
        S3=68;
    }
    void calc()
    {
        Avg=(S1+S2+S3)/3;
    }
    void display()
    {
        System.out.println(Avg);
    }
}