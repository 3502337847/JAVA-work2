package bank;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepositAccount saver = new DepositAccount("1234567890","zhangsan",5000);
		saver.setRate(0.023);//����������
		saver.Deposit(2000);//����2000Ԫ
		saver.queryLeft();//��ѯ���
		System.out.println("����Ϣ��"+saver.calYearRate());

	}

}

