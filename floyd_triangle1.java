public class floyd_triangle1
{
    int count =0,i;
 void init(int n)
 {
     i=n;
    }
 void floyd()
    { 
        int a,b, value = 1; 
        for (a = 1; a <= i; a++) 
        { 
            for (b = 1; b <= a; b++) 
            { 
                count++;//increment operator
                System.out.print(count + " "); 
                 
            } 
            System.out.println(); //This is to bring the cursor on the next line
                  
        } 
    } 
 public static void main(String[] args) 
   { 
        floyd_triangle1 obj = new floyd_triangle1();
        obj.init(4);//actual parameter
        obj.floyd();
        
        
  } 
} 