import java.util.Scanner;

public class SumOfArray {


    public static void main(String args[]) {
        int n,sum=0;
        System.out.print("Enter the number of elements in array: ");
        Scanner src = new Scanner(System.in);
        n = src.nextInt();
        int a[] = new int[n];
        System.out.print("first array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = src.nextInt();
            sum=sum+a[i];

        }
        System.out.print("Sum of Array is : "+" "+sum);


        }
    }

