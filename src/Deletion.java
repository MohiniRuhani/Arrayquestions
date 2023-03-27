// insertion of new element in the array
import java.util.Scanner;
public class Deletion {
    public static void main(String args[])
    {
        int n,m,p;
        System.out.print("Enter the number of elements in array: ");
        Scanner src=new Scanner(System.in);
        n=src.nextInt();//5
        int a[]=new int[n];
        int b[]=new int[n-1];
        System.out.print("Enter the elements in array: ");
        for(int i =0;i<n;i++) {
            a[i] = src.nextInt();//a0,a1,a2,a3,a4
            // b0 b1  b3 b4


        }
        System.out.print("Enter the new index where you want to delete the element :");
        m=src.nextInt(); //3

        for(int i=0;i<n-1;i++)
            if(i<m)
            {
                b[i]=a[i];
            }
            else if(i==m)
            {
                continue;
            }

            else
            {
                b[i-1]= a[i];
            }
        System.out.print("New updated Array is : ");
        for(int i =0;i<n-1;i++)
        {
            System.out.print(b[i]+" ") ;

        }
    }

}
