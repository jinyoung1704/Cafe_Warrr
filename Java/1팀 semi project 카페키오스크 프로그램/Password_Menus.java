import java.util.Scanner;

// ��й�ȣ ���� �޴� ���� �޼ҵ�(������) 
class  Password_Menus
{
	
   public static final int P_CHANGE =1;		// ��й�ȣ ����
   public static final int P_RESET =2;		// ��й�ȣ �ʱ�ȭ
   public static final int P_BACK =3;		// ���ư���

   private static Integer sel;


	//�޴� �޼ҵ�
   public void menuDisp()
   {
	  System.out.println();
      System.out.println(" [��й�ȣ ���� �޴� ����]");
      System.out.println(" 1.��й�ȣ ����");
	  System.out.println(" 2.��й�ȣ �ʱ�ȭ");
	  System.out.println(" 3.�����ڸ޴��� ���ư���");
   }

   //�޴� ���� �޼ҵ�
   public void menuSelect()
   {

	   Scanner sc = new Scanner(System.in);
	   
       do
       {
		    System.out.print(" >>��й�ȣ ���� �޴� ����(1~3) : ");
			sel =sc.nextInt();
         
       }
       while (sel<1 || sel>3);
      
   }

   //��� �޼ҵ� ȣ��
   public void menuRun()
   {

	   Password_Control password_control = new Password_Control();


		switch(sel)
		{
		  case 1: password_control.changePW();break; //��й�ȣ �ٲٱ�
		  case 2: password_control.resetPW();break;  //��й�ȣ �ʱ�ȭ
		  case 3: password_control.backManagermenu();break; //�����ڸ޴��� ����
		}
   }



}