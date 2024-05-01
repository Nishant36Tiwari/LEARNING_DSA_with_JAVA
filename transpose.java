//Question 3 :Write a program to FindTransposeofa Matrix.
//What is Transpose?
//Transpose of a matrix is the process ofswapping therows to columns.
//For a 2x3 matrix,
//Matrix  a11    a12    a13
//        a21    a22    a23
//        
//Transposed Matrix
//a11    a21
//a12    a22
//a13    a23

import java.util.*; 
public class transpose{
    public static void main(String args[]){
        int row =2 , columns = 3;
        int [][] nums = {{11,12,13}, {21,22,23}};

        int[][] trans = new int[columns][row];
        for (int i=0; i< nums.length ; i++){
            for (int j=0 ; j< nums[0].length ; j++){
                trans[j][i] = nums[i][j]; 
            }
        }
        printmatrix(nums);
        System.out.println("transpose of it is :- ");
        printmatrix(trans);
    }

    //printing transpose
    public static void printmatrix(int [][] nums){
        for (int i=0; i< nums.length ; i++){
            for (int j=0 ; j< nums[0].length ; j++){
                System.out.print(nums[i][j]+" ");                 
            }System.out.println();
        }           
        System.out.println();
    }
}

