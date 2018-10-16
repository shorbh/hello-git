import java.util.*;
class array<T extends Comparable<T>>{
    public void display(T arr[]){
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
        System.out.println();
    }
}
public class genricPrint{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        array<Integer> a1 = new array<>();
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        Integer arr[]= new Integer[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println("array is");
        a1.display(arr);
        array<Character> a2 = new array<>();
        System.out.println("enter the size of array");
        Character arr1[]= new Character[sc.nextInt()];
        for(int i=0;i<n;i++) arr1[i] = sc.next().charAt(0);
        System.out.println("array is");
        a2.display(arr1);
    }
}