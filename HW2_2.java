import java.util.Scanner;

class HW2_2{
	public static void main(String [] args){
		double a, b, result;
		String operator;
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���(ex. 7 + 4): ");
		a = s.nextDouble();
		operator = s.next();
		b = s.nextDouble();
		
		switch(operator){
		case "+":
			result = a+b;
			if(result%1==0) System.out.println((int)result);
			else System.out.println(result);
			break;
		
		case "-":
			result = a-b;
			if(result%1==0) System.out.println((int)result);
			else System.out.println(result);
			break;
			
		case "*":
			result = a*b;
			if(result%1==0) System.out.println((int)result);
			else System.out.println(result);
			break;

		
		case "/":
			if(b==0){
				System.out.println("0���� ���� �� �����ϴ�.");
				return;
			}
			result = a/b;
			if(result%1==0) System.out.println((int)result);
			else System.out.println(result);
			break;	
		
			
		case "%":
			if(b==0){
				System.out.println("0���� ���� �������� ���� �� �����ϴ�.");
				return;
			}
			result = a%b;
			if(result%1==0) System.out.println((int)result);
			else System.out.println(result);
			break;
		
		default: 
			System.out.println("+, -, *, /, % ���길 �����մϴ�. ");
		}
		
	}
}