import java.util.*;
public class BinarySearch{
    public static int binarySearch(int n[],int key){
        int start=0, end=n.length-1;
        while(start<=end){
            int mid=(start+end)/2;
        if(mid==key){
            return mid;
        }
        if(mid<key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    return -1;
}
public static void main(String args[]){
    int n[]={2,3,4,5,6,7,8,9,10};
    int key=6;
    System.out.println("index of key is:" +binarySearch(n,key));
}
}