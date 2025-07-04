public class fact{
    public static int fact(int n){ // factorial of n
        if(n==0){
            return 1;
        }
        int fnm1= fact(n-1);
        int fn= n*fnm1;
        return fn;
    }
    public static int sum(int n){ // sum n numbers
        if(n==1){
            return 1;
        }
        int snm1= sum(n-1);
        int sn= n+snm1;
        return sn;

    }
    public static int sum1(int n){
        if(n==1){
            return 1;
        }
        int snm1= sum(n-1);
        int sn= n+snm1;
        return sn;
    }
    public static int fib(int n){ // fibonacci
        if(n==0||n==1){
            return n;
        }      
        int fibn= fib(n-1)+fib(n-2);
        return fibn;
    }
    public static boolean isorted(int arr[], int i){  // sorted or not
        if(arr[i]== arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isorted(arr,i+1);
    }

    public static int Fo(int arr[], int key, int i){  // first occurance
        if(i==arr.length){
            return -1;
        }
        if( arr[i]==key){
            return i;
        }
        return Fo(arr, key, i+1);
    }

    public static int Lo(int arr[],int key, int i){ // Last occurance
        if(i==arr.length){
            return -1;
        }
        int isfound=Lo(arr,key,i+1);
            if(isfound==-1 && arr[i]==key){
                return i;
            }
            return isfound;
    }

    public static int pow(int x, int n){  //power x^n
        if(n==0){
            return 1;
        }
        return x*pow(x,n-1);
    }
     public static int OP(int x, int n){  // optimized power x^n
        if(n==0){
            return 1;
        }
        int halfpower= OP(x,n/2);
        int power= halfpower * halfpower;

        //odd
        if(n%2!=0){
            power= x * power;
        }
        return power;
    }

    public static int ways(int n){ //tiling marbles
        if(n==0||n==1){
            return 1;
        }
        //vertical
        int fnm1= ways(n-1);
        //horizontal
        int fnm2=ways(n-2);

        return fnm1+fnm2;
    }

    public static void RD(String str, int i, StringBuilder newstr, boolean map[]){ //Duplicate in string
        if(i==str.length()){
            System.out.print(newstr);
            return;
        }
        char ch=str.charAt(i);
        if(map[ch-'a']==true){
            RD(str, i+1, newstr, map);
        }
        else{
            map[ch-'a']=true;
            RD(str, i+1, newstr.append(ch), map);
        }
    }
    public static int FriendPairing(int n){ //Friend pairning
        if(n==1||n==2){
            return n;
        }
        //single
        int fnm1=FriendPairing(n-1);
        //pair
        int fnm2=FriendPairing(n-2);
        int paiways= (n-1)*fnm2;
        int totalways=fnm1+paiways;
        return totalways;
    }
    public static void BinaryString(int n, int lp, String str){  //print binary string
        if(n==0){
            System.out.println(str);
            return;
        }
        BinaryString(n-1, 0, str+"0");
        if(lp==0){
            BinaryString(n-1, 1, str+"1");
        }
    }

    public static void hanoi(int n, String s,String h,String d){
        if(n==1){
            System.out.println("move disk "+n+" from "+s+" to "+d);
            return;
        }

        hanoi(n-1, s, d, h);
        System.out.println("move disk "+n+" from "+s+" to "+d);
        hanoi(n-1, h, s, d);

    }
    public static void main(String args[]){
      hanoi(3,"a","b","c");
    }
}