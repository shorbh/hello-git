public class constructor {
    constructor(){
        System.out.println("calling default constructor from parameterised constructor but because we defined parameterised constructor so we have to define default constructor");
    }
    constructor(int x){
        this();
    }
    public static void main(String args[]){
        constructor obj = new constructor(5);
    }
}