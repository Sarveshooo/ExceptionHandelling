class demo
{
    static void gun(int x,int y)
    {
        System.out.println("IN START CODE GUN");
        System.out.println(x/y);
        System.out.println("IN END CODE GUN");
    }
    static void fun(int x,int y)
    {
        System.out.println("IN FUN START CODE");
        gun(x,y);
        System.out.println("IN FUN END CODE");
    }
    public static void main(String[] args) {
        int x=10;
        int y=0;
        System.out.println("START MAIN CODE");
        gun(x, y);
        System.out.println("END MAIN CODE");
    }

}