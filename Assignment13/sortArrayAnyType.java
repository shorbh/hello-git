import java.util.*;
class array<T extends Comparable<T>>{
    public T[] sort(T arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    T tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
    public void display(T arr[]){
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
        System.out.println();
    }
}
public class sortArrayAnyType{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        array<Integer> a1 = new array<>();
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        Integer arr[]= new Integer[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        arr = a1.sort(arr);
        System.out.println("sorted arry is");
        a1.display(arr);
        array<Character> a2 = new array<>();
        System.out.println("enter the size of array");
        Character arr1[]= new Character[sc.nextInt()];
        for(int i=0;i<n;i++) arr1[i] = sc.next().charAt(0);
        arr1 = a2.sort(arr1);
        System.out.println("sorted arry is");
        a2.display(arr1);
    }
}