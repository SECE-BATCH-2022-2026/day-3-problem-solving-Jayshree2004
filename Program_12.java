import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(UserMainCode.vowelCount(str));
	}
}

class UserMainCode{
	public static int vowelCount(String str){
		int count = 0;
		for(Character ch : str.toCharArray()){
			switch(Character.toLowerCase(ch)){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
					break;
				default : 
					continue;				
			}
		}
		return count;
	}
}