// declartion of 2-D array when it is already known

import java.util.Scanner;
public class multidimensionalDeclartion {
    public static void main(String args []){
    int a[][]={{3,5},{9,2},{4,2},{1,6},{7,3},{9,1}};
    for(int i =0;i<6;i++)
    {
        for(int j=0;j<2;j++)
        {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
}
}

