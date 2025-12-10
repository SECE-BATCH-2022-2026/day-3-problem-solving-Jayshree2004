import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = UserMainCode.calculateSum(a,b,c);
		System.out.print(result);
	}
}

class UserMainCode{
	public static int calculateSum(int a,int b,int c){
		if(a!=13 && b!=13 &&c!=13){
			return a+b+c;
		}
		else if(a==13){
			if(c==13){
				return 0;
			}else{
				return c;
			}
		}
		else if(b==13){
			return a;
		}
		else if(c==13){
			return a+b;
		}
		return 0;
	}

	
}