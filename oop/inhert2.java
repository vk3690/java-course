public class inhert2 {
     public static void main(String[] args)
     {
         one obj=new one();
         obj.i=10;
         obj.mrt();


         //obj.j=9;
         //System.out.println(obj.i);
     }
    
}
class one
{
    int i;
    public one()
    {
       // int j=9;
        //int i;
        //i=j;
        System.out.println("hello");
    }
    public void mrt()
    {
        System.out.println(i);
    }
}