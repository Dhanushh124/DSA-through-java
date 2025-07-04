import java.util.*;
public class BuyandSell{
    public static int buyandsell(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;  //selling price - buying price
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main (String args[]){
        int price[]={7,1,5,6,4,3};
        System.out.println(buyandsell(price));
    }
}