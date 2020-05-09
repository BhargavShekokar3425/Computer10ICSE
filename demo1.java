class demo1//object called by blue j object
{
    int num1,num2,ans;//instance variable
    void init() // non parameterized,void,called,header,prototype,multiple methods,non interactive,non static
    {
        num1=5;//body
        num2=6;//local variable
    }
    void calc()
    {
        ans=num1+num2;
    }
    void display()
    {
        System.out.println("The answer is "+ans);
    }
}