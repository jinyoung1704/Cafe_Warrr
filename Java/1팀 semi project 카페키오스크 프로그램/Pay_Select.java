
import java.util.Scanner;

// ���� ���� ���� Ŭ����(��ä��,��ȣ��)
class Pay_Select
{
	public static Integer sel;	//-- �������� ���ð�

	private static final int CARDPAY = 1;			//  1.ī�����
	private static final int BILLPAY = 2;			//  2.���ݰ���
	private static final int STAMPPAY = 3;			//  3.����������
	
	public void menuDisp()
	{
		
		// ��ĳ�� �ν��Ͻ� ����
		 Scanner sc = new Scanner(System.in);
		 
	     System.out.println("===================================================================");
	     System.out.printf (" ���� �ݾ� : %d��                      \n", Pay_Control.allPay);
	     System.out.println("===================================================================");
	     System.out.println(" 1.ī�� ����                                      ");
	     System.out.println(" 2.���� ����                                      ");
	     System.out.println(" 3.������ ����                                    ");
	     System.out.println("===================================================================");
		 System.out.print(" ���� ������ �������ּ��� : ");
	     Pay_Select.sel = sc.nextInt();
		
		
	     // ������ ������ ���� ���� �޼ҵ� ȣ��
		menuSelect();
	}
 

	//�޴� ���� �޼ҵ� 
	 public void menuSelect(){
		   
		  Pay_Select pay_select = new Pay_Select();

		  boolean check ;
		  check = true;  //-- �޴����ð� �˻�

	  do{
				if(sel<1||sel>3){
				 System.out.println("1~3�߿� �������ּ���.");
				 menuDisp(); //0315 �̰� �߰���
				}else{
						pay_select.menuRun();
						check = false;

				}
		}while(check);
			  System.out.println();
			  
			// ������ ������ ���� ���� �޼ҵ� ȣ��
				menuRun();

	 } 

	 public void menuRun(){
		 
		 Pay_Control pay_control = new Pay_Control ();   // Pay_Control  Ŭ���� �ν��Ͻ� ����
		  
		 //pay_control.pay();   // ���⼭ �����ݾ� �����ϴ� pay() �޼ҵ� �������Ѿ� �� 
		 //pay_control.print();   // ��ٱ��� â �����ֱ�
		 
		 
		 switch(sel){
		 
		 
		 case Pay_Select.CARDPAY:   pay_control.cardPay();   // 1.ī�� ���� �޼ҵ�
		 
						   break;
	  
		case Pay_Select.BILLPAY:   //2. ���� ���� �޼ҵ� (��ȣ��)
							 int money = pay_control.inputBill();   // ����� ���� �Է� �޼ҵ�� �Է� ���� �� 
														 // ����ڰ� �Ž��� �޾ƾ��� ���� ��ȯ������ �޾� int money ������ �־��ش�.

						   if (pay_control.checkbillPay(money))   // �����ȯ���� Ȯ�� �޼ҵ�(�Ű����� ����ڰ� �Ž��� �޾ƾ��� ��) ��          
						   {                              // ���̶��(�Ž������� �ִٸ�) true�� ��ȯ�Ͽ� if���� �ȿ� ������ �����Ѵ�.
							  
							  pay_control.billPay(money);         // ���� �ܵ� ��ȯ �޼ҵ�� ����ڰ� �Ž��� �޾ƾ� �� ���� ����ϰ� 
														 // �Ž������� �ܰ��� ���������ش�.(����� ������ ������ ������ ������ �ܰ�Ȯ���ϸ� �����ȴ�.)
						   }

						   else                           // �����ȯ���� Ȯ�� �޼ҵ�(�Ž������� �ִ��� ������)��
						   {                              // �����̶��(�Ž������� �ִٸ�) false�� ��ȯ�Ͽ� else���� �ȿ� ������ �����Ѵ�.
							  System.out.println();
							  System.out.println(" �˼��մϴ�. �Ž������� ���ڶ��ϴ�. �ٽ� �������ֽñ� �ٶ��ϴ�.");
							  menuDisp();                     // ���� ���� �޴� ȣ��.
							  
						   }
						   break;
	  

		 case Pay_Select.STAMPPAY: pay_control.stampPay();   // 3. ������ ���� �޼ҵ�     

							  break;            
		 
		 }//switch�� end
	 }
}