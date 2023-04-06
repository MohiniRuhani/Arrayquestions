import java.util.Scanner;

public class CopyOfElement {

    public static void main(String args[])
    {
        int n;
        System.out.print("Enter the number of elements in array: ");
        Scanner src=new Scanner(System.in);
        n=src.nextInt();
        int a[]=new int[n];
        System.out.print("first array elements: ");
        for(int i =0;i<n;i++)
        {
            a[i]=src.nextInt();

        }
        System.out.print("Array is : ");
        for(int i =0;i<n;i++)
        {
            System.out.println(a[i]+" ") ;

        }
        System.out.println(" second array elements:");
        for(int b:a)
        {
            System.out.print(b+" ");
        }

        }
        }

