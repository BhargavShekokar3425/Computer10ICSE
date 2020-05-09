class Intrest
{
    double P,t,r,SI;
    void init()
    {
        P=2000;
        r=2.5;
        t=5;
    }
    void calc()
    {
        SI=(P*r*t)/100;
    }
    void display()
    {
        System.out.println(SI+"is the intrest");
    }
}