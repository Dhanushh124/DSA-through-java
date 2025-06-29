import java.util.*;
public class LargestNumber{
    public static int getLargest(int n[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            if(largest<n[i]){
                largest=n[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int n[]={1,4,3,25,6};
        System.out.println("largest:"+ getLargest(n));
    }
}   