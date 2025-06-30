import java.util.*;
public class ReversedArray{
    public static void reverse(int n[]){
        int first=0, last=n.length-1;
        while(first < last){
            int temp=n[last];
            n[last]=n[first];
            n[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int n[]={2,3,6,7,3,6};
        reverse(n);
        for(int i=0;i<n.length;i++){
        System.out.print(n[i]+" ");
        }
        System.out.println();
    }
}