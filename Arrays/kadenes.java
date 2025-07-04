import java.util.*;
public class kadenes{
    public static void kadenes(int n[]){
        int ms=Integer.MIN_VALUE; //maxsum
        int cs=0;                 //cuursum 
        for(int i=0;i<n.length;i++){
            cs= cs+n[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);

        }
        System.out.println("max Subarray sum is:"+ms);
    }

    public static void main(String args[]){
        int num[]={-4,-2,1,3,-1,5,-2};
        kadenes(num);   //7
    }

}