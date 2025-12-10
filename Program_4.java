import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		String str = sc.nextLine();
		int n = sc.nextInt();
		
		
		String res = UserMainCode.repeatFront(str,n);
		System.out.print(res);
	}
}

class UserMainCode{
	public static String repeatFront(String str, int n){
		String ans = "";
		if(str.length() ==0){
			return ans;
		}
		
		if(str.length() <= 3){
			while(n!=0){
				ans+= str;
				n--;
			}
		}
		return ans;
	
	}

	
}