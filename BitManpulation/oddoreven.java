import java.util.*;
public class oddoreven{
    public static void oddOrEven(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println("it is even");

        } else{
             System.out.println("it is odd");
        }
    }
    public static void main(String args[]){
        oddOrEven(3);
    }
}
