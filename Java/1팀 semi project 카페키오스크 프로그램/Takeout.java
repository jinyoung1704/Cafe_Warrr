
import java.util.Scanner;

// ����ũ�ƿ� ���� ���� Ŭ����(��ȣ��)
public class Takeout
{
	 public static final int T_STORE =1;		// ����Ļ�
	 public static final int T_TAKEOUT =2;		// ����ũ�ƿ�

	 public static Integer sel;

		//�޴� ��� �޼ҵ�
		public void menuDisp()
		 {    
			 System.out.println("===================================================================");
			 System.out.println("                           ����ũ�ƿ� ����                         ");
			 System.out.println("===================================================================");
			 System.out.println(" 1.����");
			 System.out.println(" 2.����ũ�ƿ�");
			 System.out.println("===================================================================");

			 // �޴� ���� �޼ҵ� ȣ��
			 menuSelect();
		 }

	 //�޴� ���� �޼ҵ�
	 public void menuSelect()
	 {

		   Scanner sc = new Scanner(System.in);
		   
		 do
		 {		
				System.out.print(" 1.���� 2.����ũ�ƿ� ����(1~2) : ");
				sel =sc.nextInt();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();

		   
		 }
		 while (sel<1 || sel>2);
		
		 // ��ɸ޼ҵ� ȣ��
		 menuRun();
	 }

	 //��� �޼ҵ� ȣ��
	 public void menuRun()
	 {
			switch(sel)
			{
			  case 1: System.out.println();
		
											//������ ��� �޼ҵ� ȣ��
					  break;

			  case 2: System.out.println();
											 //������ ��� �޼ҵ� ȣ��
					  break;
			}
			
			// Receipt Ŭ������ ù��° Ŭ���� random() �޼ҵ� ȣ��
			Receipt receipt = new Receipt();
			receipt.random();
	  }

}