class caladd
{

    public int add(int x,int y)
    {
        return x+y;
    }

}   
class calsub extends caladd
{
    public int sub(int x,int y)
    {
        return x-y;
    }
}
public class inher
{
    public static void main(String[] args)
    {
        calsub ob1=new calsub();
        int z=ob1.add(10,7);
        int s=ob1.sub(4,9);
        System.out.println(z+" "+s);
    } 

}