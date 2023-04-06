import java.util.Scanner;
public class ReverseOfArray {
    public static void main(String args[])
    {
        int n;
        System.out.print("Enter the number of elements in array: ");
        Scanner src=new Scanner(System.in);
        n=src.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the elements in array: ");
        for(int i =0;i<n;i++)
        {
            a[i]=src.nextInt();

        }
        System.out.println("Array is : ");
        for(int i =0;i<n;i++)
        {
            System.out.print(a[i]+" ") ;

        }
        System.out.print(" Reverse of Array is : ");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(a[i]+" ") ;

        }

    }

}