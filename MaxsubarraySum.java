import java.util.*;
public class MaxsubarraySum{
    public static void sum(int n[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            for(int j=i;j<n.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum += n[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("max sum="+maxsum);
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10};
        sum(num);
    }
}