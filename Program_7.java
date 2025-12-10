import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];
		for(int i=0;i<n;i++){
			str[i] = br.readLine();
		}
		int index = Integer.parseInt(br.readLine());
		
		System.out.print(UserMainCode.playString(str,index));
		
		br.close();
	}
}

class UserMainCode{
	public static String playString(String str[],int index){
		String res = "";
		char c = '\0';
		for(String s : str){
			try{
				c = s.charAt(index-1);
			}catch(Exception e){
				c = '$';
			}
			res = res+c;
		}
		
		return res;
	
	}

	
}