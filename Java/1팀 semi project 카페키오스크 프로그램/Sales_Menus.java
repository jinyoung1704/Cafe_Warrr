
import java.util.Scanner;

// �Ǹŷ� �� ���� �޴� ���� Ŭ����(��ȣ��)
class Sales_Menus
{

   public static final int S_DAY =1;		// �Ϻ� ���� ��ȸ
   public static final int S_MONTH =2;		// ���� ���� ��ȸ
   public static final int S_BACK =3;		// ���ư���

   private static Integer sel;


	//�޴� �����ֱ�
   public void menuDisp()
   { 
	  System.out.println();
      System.out.println(" [���� ��ȸ �޴� ����]");
      System.out.println(" 1.�Ϻ� ���� ��ȸ");
      System.out.println(" 2.�Ѹ��� ��ȸ");
      System.out.println(" 3.���ư���");
      
   }

   //�޴� ����
   public void menuSelect()
   {

	   Scanner sc = new Scanner(System.in);
      do 
      {   
         System.out.print(" >> ���� ��ȸ �޴� ����(1~3) : ");
         sel =sc.nextInt();
         
      }while(sel<1 || sel>3);
   }

   //��� �޼ҵ� ȣ��
   public void menuRun()
   {

	  Sales_Control sales_Control = new Sales_Control();

      switch(sel)
      {
		  case Sales_Menus.S_DAY : sales_Control.sales_day_Lookup();break;
		  case Sales_Menus.S_MONTH : sales_Control.sales_month_Lookup();break;
		  case Sales_Menus.S_BACK : sales_Control.sales_Inventory();break;
      }
   }
}