import java.util.*;
public class shortestpath{
    public static float path(String path){
        int x=0, y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='s'){
                y--;
            }
            else if(dir=='n'){
                y++;
            }
            else if(dir=='e'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2= x*x;
        int y2= y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        String fruits[]={"apple","mango","banana"};
        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])< 0){
                largest= fruits[i];
            }
        }
        System.out.println(largest);
    }

}