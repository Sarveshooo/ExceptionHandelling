class demo
{
    public static void main(String[] args)
     {
        System.out.println("START CODE");
        int arr[]=new int[]{10,20,30,40,50};
        int i=0;
        for(;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        try
        {

        System.out.println(arr[i]);
        ///////exception is solved by try and catch block
        }
        
        catch(Exception e)
        {

            System.out.println("Array index out of bound");

        } 
        System.out.println("END CODE");   
}
}


