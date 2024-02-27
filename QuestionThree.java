import java.util.*;
public class QuestionThree {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=0;
        //int array[][]={{1,0,0,0},{0,1,0,0},{0,1,1,0}};
        System.out.print("Enter that how many column do you want:");
        int column=scan.nextInt();
        System.out.print("Enter that how many row do you want:");
        int row=scan.nextInt();
        int array[][]=new int[row][column];
        //array input
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[1].length;j++){
                System.out.print("Enter array :["+i+"]["+j+"]:");
                array[i][j]=scan.nextInt();
            }
        }

        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[1].length;j++){
                int k=0,l=0,m=0;
                k=array[i][j];
                if(k==1){
                    al.removeAll(al);
                    while(l<3){
                        if(j==l){
                            l++;
                            continue;
                        }else{
                            al.add(array[i][l]);
                        }
                        l++;
                    }
                    while(m<3){
                        if(i==m){
                            m++;
                            continue;
                        }else{
                            al.add(array[m][j]);
                        }
                        m++;
                    }
                    if(!al.contains(1)){
                        count++;
                    }
                    System.out.println("----------------");
                    System.out.println(al);
                    System.out.println("---------------");
                   
                }
            }
            
        }
        System.out.println("count:"+count);
    }
}
