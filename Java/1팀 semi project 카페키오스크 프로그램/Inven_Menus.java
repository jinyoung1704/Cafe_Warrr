
import java.util.Scanner;

// ��� ���� ���� Ŭ����(������)
class Inven_Menus
{
   public static final int I_TOTAL =1;//��ü ���
   public static final int I_COUNT =2;//���� �ӹ� ���
   public static final int I_BACK =3; //���ư���

   private static Integer sel;


	//�޴� �����ֱ�
   public void menuDisp()
   {
	  System.out.println();
      System.out.println(" [��� ���� �޴� ����]");
      System.out.println("1. ��ü ��� ��ȸ");
      System.out.println("2. ���� �ӹ� ��� ��ȸ");
      System.out.println("3. ���ư���");
      
   }

   //�޴� ����
   public void menuSelect()
   {

	   Scanner sc = new Scanner(System.in);
      do 
      {   
         System.out.print(" >> ��� ���� �޴� ����(1~3) : ");
         sel =sc.nextInt();
         
      }while(sel<1 || sel>3);
   }

   //��� �޼ҵ� ȣ��
   public void menuRun()
   {

	   Inven_Control inven_control = new Inven_Control();
      switch(sel)
      {
      case Inven_Menus.I_TOTAL : inven_control.totalInventory();break;
      case Inven_Menus.I_COUNT : inven_control.imbakInventory();break;
      case Inven_Menus.I_BACK : inven_control.backInventory();break;
      }
   }
}