import java.util.*;

class UserMainCode{
	public static int countOccurances(String s1, String s2){
	int n = s2.length();
	int count=0;
	for(int i=0;i<=s1.length()-n;i++){
		String sub = s1.substring(i,i+n);
		
		if(sub.equals(s2)){
			count++;
		}
	}
	return count;
	}
	
}

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int count = UserMainCode.countOccurances(s1,s2);
		System.out.print(count);
		
	}
}