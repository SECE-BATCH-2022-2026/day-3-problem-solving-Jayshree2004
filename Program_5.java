import java.io.*;
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
		
		
		String [] op = UserMainCode.removeDuplicates(str);
		for(String s: op){
			System.out.print(s);
		}
		br.close();
	}
}

class UserMainCode{
	public static String[] removeDuplicates(String str[]){
		Set<String> ts = new TreeSet<String>();
		for(String a : str){
			ts.add(a);
		}
		String res[] = new String[ts.size()];
		int i =0 ;
		for(String s : ts){
			res[i++]=s;
		}
		return res;
	
	}

	
}
