import java.util.*;
public class SipralMatrix{
    public static void Maatrix(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endrow--;
            endcol--;
        }
        System.out.println();
    }
    
    public static int Diagonal(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum += matrix[i][i];
            if(i!= matrix.length-1-i){
            sum += matrix[i][matrix.length-1-i];
            }
        }

        return sum;
    }

    public static boolean staircase(int mat[][],int key){
        int row=0, col=mat[0].length-1;
        while(row < mat.length && col>=0){
            if(mat[row][col]==key){
                System.out.print("found at index ("+ row +","+col+ ")");
                return true;
            }
            else if( key< mat[row][col]){
                col--;
            }
            else{
                row++;
            }            
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String args[]){
        int key= 14;
        int mat[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        staircase(mat,key);
    }
    
}