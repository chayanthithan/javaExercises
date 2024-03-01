import java.util.*;
public class ValidString {
    public static void main(String[] args) {
        String str="abbcdefghhgfedecba";
        TreeSet<Character> set=new TreeSet<>();
        ArrayList<Integer> al=new ArrayList<>();
        Hashtable<Character,Integer> ht=new Hashtable<>();
        for(int i=0;i<str.length();i++){

            set.add(str.charAt(i));
        }
        System.out.println(set.size());
        System.out.println(set);

        System.out.println("------------------------");
        //iterator
        Iterator<Character> it=set.iterator();
        while(it.hasNext()){
            char lr=it.next();
            int count=0;
            for(int i=0;i<str.length();i++){
                if(lr==str.charAt(i)){
                    count++;
                }
            }
            al.add(count);
            ht.put(lr, count);
        }
        System.out.println("set is    :"+set);
        System.out.println("array list:"+al);
        System.out.println(ht);
        Iterator it1=al.iterator();
        boolean flag=false;
        for(int i=0;i<al.size();i++){
            int j=al.get(i);
            int count=0; 
            
            System.out.println("-------------------------");
            for(int k=0;k<al.size();k++){
                int l=al.get(k);
                if(j==l){
                    System.out.println("j==l");
                    continue;
                }else if(((l-j)==1||(l-j)==-1)){
                    char word=
                    if(count==0){

                    }
                    System.out.println("count:"+count);
                    count++;
                    continue;
                }else{
                    flag=true;
                    System.out.println("bye");
                    break;
                }
              
            }

        }
        if(flag){
            System.out.println("yes it is not valid");
        }else{
            System.out.println("no it is valid");
        }
    }
}
