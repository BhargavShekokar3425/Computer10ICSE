class ascii
{
    public void dispascii()
    {
        char A='A';
        char Z='Z';
        char a='a';
        char z='z';
        int aiiA;
        int aiiZ;
        int aiia;
        int aiiz;
        aiiA=(int) A;
        aiiZ=(int) Z;
        aiia=(int) a;
        aiiz=(int) z;
        System.out.println(aiiA);
        System.out.println(aiiz);
        System.out.println(aiia);
        System.out.println(aiiz);
    }
}
public  class asciii
{
    public static void main(String args[])
    {
        ascii object1;
        object1=new ascii();
        object1.dispascii();
    }
}