
import java.util.Scanner;

// �ܰ���� �޴� ����(��ȣ��)
class Money_Management 
{
 	//1. �ܵ� �Ա�
 	//2. �ʱ�ȭ
	//3. ���ư���

   public static final int C_IUPUT =1;		// �ܵ��Ա�
   public static final int C_RESET =2;		// �ʱ�ȭ
   public static final int C_HAKIN =3;		// �Ž����� Ȯ��
   public static final int C_BACK =4;		// ���ư���

   private static Integer sel;

	//�޴� �����ֱ�
   public void menuDisp()
   {
	  // ���⿡�� 3���� ����Ǵ� removeInventory() �޼ҵ� ����ǵ���
	  System.out.println();
      System.out.println(" [�ܰ� ���� �޴� ����]");
      System.out.println(" 1.�ܵ� �Ա�");
      System.out.println(" 2.�ʱ�ȭ");
	  System.out.println(" 3.�Ž����� Ȯ��");
      System.out.println(" 4.���ư���");
      
   }

   //�޴� ����
   public void menuSelect()
   {

	   Scanner sc = new Scanner(System.in);
      do 
      {  System.out.println();
         System.out.print(" �ܰ� ���� �޴� ����(1~4) : ");
         sel =sc.nextInt();
         
      }while(sel<1 || sel>4);
   }

   //��� �޼ҵ� ȣ��
   public void menuRun()
   {

	  Money_Control money_control = new Money_Control();

      switch(sel)
      {
		  case Money_Management.C_IUPUT : money_control.changeInput();break;	//�ܵ��Ա� �޼ҵ� ȣ��
		  case Money_Management.C_RESET : money_control.change_Reset();break;	//�ܵ��ʱ�ȭ �޼ҵ� ȣ��
		  case Money_Management.C_HAKIN : money_control.hakin();break;			//�ܵ� Ȯ�� �޼ҵ� ȣ��
		  case Money_Management.C_BACK : money_control.change_Inventory();break;// ���ư��� �޼ҵ� ȣ��
      }
   }
}

