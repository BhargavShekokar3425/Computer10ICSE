class add_overloading
{
    int n1,n2,add;
    void methods123(int a,int b)
    {
        n1=a;
        n2=b;
    }
    int methods123()
    {
        add= n1+n2;
        return add;
    }
    public static void main()
    {
        add_overloading obj=new add_overloading();
        obj.methods123(4,5);
        int results=obj.methods123();
        System.out.println(results);
    }
}