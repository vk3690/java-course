public class Abdemo 
{
        public static void main(String[] args)
        {
            phone1 obj1=new phone3();
            obj1.wifi();
            obj1.camera();
            obj1.move();
        }
}
abstract class phone1
{
    public void camera()
    {
        System.out.println("camera...");
    }
    public abstract void move();
    public abstract void wifi();

}
 
 abstract class phone2 extends phone1
{
    public void wifi()
    {
        System.out.println("wifi.....");
    }
}

class phone3 extends phone2
{
    public void move()
    {
        System.out.println("moving.....");
    }

}