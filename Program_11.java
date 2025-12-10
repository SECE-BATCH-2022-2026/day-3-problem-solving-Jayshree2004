import java.util.*;
import java.io.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        String op[] = UserMainCode.splitString(str,ch);
        Arrays.stream(op).forEach(x->System.out.println(x));
    }
}

class UserMainCode{
    public static String[] splitString(String str,char ch){
        String input[] = str.split(""+ch);
        String op[] = new String[input.length];
        int i = 0;
        for(String s : input){
            op[i++] = new StringBuilder(s).reverse().toString().toLowerCase();
        }
        return op;
    }
}