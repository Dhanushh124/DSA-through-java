import java.util.*;
public class LinearSearch{
public static int LinearSearch(int num[],int key){
    for(int i=0;i<num.length;i++){
        if(num[i]==key){
            return i;
        }
        
    }
    return -1;
}
public static void main(String args[]){
    int numbers[]={2,6,5,8,9,22,65};
    int key=8;
    int index=LinearSearch(numbers,key);
    if(index==-1){
        System.out.println("Not Found");
    }
    else{
        System.out.println("found at"+index);
    }
}
}
