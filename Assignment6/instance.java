class abc{
    public static void show(){
        System.out.println("invoking the show which is the instance of parent class abc");
    }
}
public class instance {
    public static void main(String args[]){
        abc.show();
    }
}