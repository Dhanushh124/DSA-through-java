public class mergesort{
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergesort(arr, si, mid); //left
        mergesort(arr,mid+1,ei); //right
        merge(arr,si,mid,ei);//merging
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]= new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        //checking if ith number is greater or jth number is greater
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;             
            }
            k++;           
        }
        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copying temp to original array
        for(k=0,i=si;k<temp.length;i++,k++){
        arr[i]=temp[k];
        }
    }
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        mergesort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}