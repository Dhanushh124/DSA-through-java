public class patterns{
    
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5-i+1;j++){     *****/****/***/**/*/
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // int n=4;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){              1/12/123/1234
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        //  int n=4;
        //  char ch='A';
        //  for(int i=1;i<=n;i++){
        //     for(int chars=1;chars<=i;chars++){      A/BC/DEF/GHIF
        //         System.out.print(ch);
        //         ch++;
        //     }
        //      System.out.println();
        //  }


        // public static void hollow_rectagle(int r,int c ){
        //     for(int i=1;i<=r;i++){
        //         for(int j=1;j<=c;j++){
        //             if(i==1||i==r||j==1||j==c){
        //             System.out.print("*");
        //             }
        //             else{
        //         System.out.print(" ");
        //     }
            
        //     }
        //         System.out.println();}
        // }

        // public static void Rtriangle(int n){
        //     for(int i=1;i<=n;i++){

        //         for(int j=1;j<=n-i;j++){
        //             System.out.print(" ");
        //         }
        //             for( int j=1;j<=i;j++){
        //                 System.out.print("*");
        //             }
        //         System.out.println();
        //     }
        // }
        // public static void RNumber(int n){
        //     for(int i=1;i<=n;i++){
        //         for(int j=1;j<n-i+1;j++){
        //             System.out.print(j);
        //         }
        //         System.out.println();
        //     }
            
        // }

        // public static void Floyd(int n){
        //     int count=1;
        //     for(int i=1;i<=n;i++){
        //         for(int j=1;j<=i;j++){
        //             System.out.print(count+" ");
        //             count++;
        //         }
        //         System.out.println();
        //     }
        // }
        // public static void ZeroneTrinagle(int n){
        //     for(int i=1;i<=n;i++){
        //         for(int j=1;j<=i;j++){
        //             if((i+j)%2==0){
        //                 System.out.print("1");
        //             }
        //             else{
        //                System.out.print("0"); 
        //             }
        //         }
        //         System.out.println();
        //     }
        // }
        
//        public static void butterfly( int n){
//         for(int i=1;i<=n;i++){
//             //stars
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             //spaces
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
        
// System.out.println();
//         }
//         for(int i=n;i>=1;i--){
//             //stars
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             //spaces
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        // public static void Rhombus(int n){
        //     for(int i=1;i<=n;i++){
        //         // spaces
        //         for(int j=1;j<=n-i;j++){
        //             System.out.print(" ");
        //         }
        //         // stars
        //         for(int j=1;j<=n;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }
            
        // }

       
       public static void main(String args[]){ 
         Rhombus(5);
    }
}
