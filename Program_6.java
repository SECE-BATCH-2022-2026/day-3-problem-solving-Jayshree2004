import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(UserMainCode.matchPattern(str));
	}
}

class UserMainCode{
	public static boolean matchPattern(String str){
		return str.matches("CPT-\\d(6)");
	}
}