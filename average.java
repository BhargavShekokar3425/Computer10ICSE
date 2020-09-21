class average
{
  int eng,sci,math,avg;
 void init()
 {
    eng=56;
    sci=78;
    math=98;
 }
 void calc()
 {
     avg=(sci+eng+math)/3;
 }
 void display()
 {
    System.out.println(avg);
    }
 public static void main()
 {
     average obj=new average();
     obj.init();
     obj.calc();
     obj.display();
    }
}