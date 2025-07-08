package Backtracking;

public class FindPermutations {
    public static void Fp(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){ //abc
            char curr=str.charAt(i);
            String newstr= str.substring(0,i)+str.substring(i+1);
            Fp(newstr,ans+curr);//backtrack
        }
    }
    public static void main(String args[]){
        String str="abc";
        Fp(str, " ");
    }
}
