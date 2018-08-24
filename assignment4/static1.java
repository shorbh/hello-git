public class static1{
    static
        {
            System.out.println("entered in static block1");
        }
        static
        {
            System.out.println("entered in static block2");
        }
    public static void main(String args[]){
        System.out.println("execute after static block");
    }
}