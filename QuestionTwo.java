import java.util.*;
public class QuestionTwo {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int array[][]={{1,0,0},{0,1,0},{1,0,0}}; 
     //  int array[][]=new int[3][3]; 
    //    for(int i=0;i<3;i++){
    //         for(int j=0;j<3;j++){
    //             System.out.print("Enter array :"+i+" "+j+":");
    //             array[i][j]=scan.nextInt();
    //         }
    //     }
        int count=0;
        boolean flag=false;
        int q=-1,x=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               int k=array[i][j];
               int m=i;
               int p=j;


               if(k==1){
                
               }
        //        if(k==1){
        //         System.out.println("-----------------------------------");
        //         System.out.println("array["+i+"]["+j+"]="+array[i][j]);

        //         System.out.println("---------------------------------");
        //             int l=0;
        //                 while(l<3){
        //                     if(array[m][p]==array[i][l]||array[m][p]==array[l][i]){
        //                         l++;
        //                         continue;
        //                     }
        //                     else if(array[m][l]!=1&&array[l][p]!=1){
        //                         System.out.println("array["+i+"]["+l+"]="+array[i][l]);
        //                         System.out.println("array["+l+"]["+i+"]="+array[l][i]);
        //                         q++;
        //                         System.out.println("q--------------------"+q);
        //                         l++;
        //                         flag=true;
    
        //                     }else{
        //                         flag=false;
        //                         break;
        //                     }
                            
                            
        //                 }
        //                 if(flag=true){
        //                     count++;
        //                 }
                    
        //        }
               
             }
         }
        System.out.println("sum:"+q);
    }
}
