class demo
{
    static void fun(int x,int y)
    {
        System.out.println("START CODE IN FUN");
        System.out.println(x/y);
        System.out.println("END FUN CODE ");
    }
    public static void main(String[] args) {
        int x=10;
        int y=0;
        System.out.println("START MAIN CODE");
        fun(x,y);
        System.out.println("END MAIN CODE ");
    }

}