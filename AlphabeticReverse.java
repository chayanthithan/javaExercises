import java.util.*;
public class AlphabeticReverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter here:");
        System.out.println();
        String word=scan.nextLine();
        
        for(int i=0;i<word.length();i++){
            char letter=word.charAt(i);
            int x=(int)letter;
            if(x>=65 && x<=90){
                int z=x-64;
                char y=(char)(x+(91-x)-z);
                System.out.print(y);
            }else{
                int z=x-97;
                char y=(char)(x+(122-x)-z);
                System.out.print(y);
            }
            
        }
    }
}
