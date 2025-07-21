import java.util.*;
public class reverseStack{
    public static void pushAtButtom( Stack<Integer>s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top= s.pop();
        pushAtButtom(s, data);
        s.push(top);
    }
    public static void reverseStk(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStk(s);
        pushAtButtom(s, top);
    }
    public static void PrintStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer>s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStk(s);
        PrintStack(s);
    }
}
