//declartion of multidimensional
import java.util.Scanner;

public class multidimensional {
    public static void main(String args [])
    {
        int n,m;
        System.out.print("Enter the number of rows:");
        Scanner src=new Scanner(System.in);
        n=src.nextInt();
        System.out.print("Enter the number of columns:");
        m=src.nextInt();
        int a[][]=new int[n][m];
        System.out.print("Enter the values of array:");
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=src.nextInt();
            }

        }
        System.out.print("Array is :");
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               System.out.print( a[i][j]+ " ");
            }
            System.out.println();
        }

    }


}
