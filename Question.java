import java.util.*;
public class Question{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the text here");
        String str=scan.nextLine();

        int x=0;//this for store the space
        String reverse="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                x=i;
            }
        }
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                continue;
            }else{
                if(i==str.length()-(x+1)){
                    reverse=reverse+" ";
                    reverse+=str.charAt(i);
                }else{
                    reverse+=str.charAt(i);
                }
            }
        }
        System.out.println("reverse "+reverse);
    }
}