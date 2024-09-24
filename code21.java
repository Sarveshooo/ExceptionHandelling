class demo
{
    void fun()
    {
        System.out.println("IN FUN");
    }
    void run()
    {
        System.out.println("IN RUN");
    }
}
class client
{
    public static void main(String[] args) {
        demo obj=new demo();
        obj.fun();
        obj.run();
    }
}