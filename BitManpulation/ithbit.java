import java.util.*;
public class ithbit{
    public static int ith(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;

        } else{
              return 1;
        }
    }

    public static int setith(int n,int i){
        int bitMask= 1<<i;
        return n | bitMask;
    }
     public static int clearith(int n,int i){
        int bitMask= 1<<i;
        return n & bitMask;
    }
    public static void main(String args[]){
        System.out.println(clearith(10,3));
    }
}
