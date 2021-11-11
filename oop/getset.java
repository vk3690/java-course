
class phone5
{
    int a;
    public void setA(int ar)
    {
        a=ar;
    }
    public int getA()
    {
        return a;
    }

}
public class getset {
    
    public static void main(String[] args)
    {
        phone5 obj1=new phone5();
        obj1.setA(10);
        System.out.println(obj1.getA());
        //obj1.camera();
        
    }
}
