//-10�̻� 10������ ������ ������ ������ �����ϰ�, ����ڰ� �Է��� ���� ������ ��ġ�Ѵٸ� A, ������ ������ ������ ��ȣ�� �ٸ��ٸ� B, �� ���� ���� C�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//��, ����ڴ� command line�� ������ �Է��Ѵ�. 
//����ڰ� command line�� �ϳ��� ������ �Է����� ���� ��� ������ �˷��ְ�, ���α׷��� �����ų ��. 


class HW2_1{
	public static void main(String [] args){
		if(args.length != 1){
			System.out.println("����: java HW2_1 -10�̻� 10������ ������ ����");
			return;
		}
		int usr = Integer.parseInt(args[0]);//����ڰ� �Է��� �� ������ ��ȯ
		int r = (int)(Math.random()*21-10);//-10�̻� 10������ ������ ������ ������ ����
		
		if(r==usr)	System.out.println("������ ��ġ!");
		else if(r==-1*usr)	System.out.println("������ ��ȣ�� �ٸ���, ������ ����!");
		else System.out.println("������ ����ġ!");
				
	}
}
