public class gridwayss{
    public static int gridways(int i,int j,int n,int m){
        //base
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n||j==n){
            return 0;
        }
        `
        return w1+w2;
    }
    public static void  main(String args[]){
        int n=3,m=3;
        System.out.println(gridways(0,0,n,m));
    }
}