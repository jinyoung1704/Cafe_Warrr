

import java.util.Scanner;

// ������ �޴� ���� Ŭ����(������)
class Manager_Menus  
{   
   public static final int Balju_Menus = 1;         // ���� �޴�����
   public static final int Inven_Menus = 2;         // ��� ���� �޴�����
   public static final int Sales_Menus = 3;		    // �Ǹŷ��� ����� ��ȸ �޴� ����
   public static final int Money_Management = 4;    // �ܰ���� �޴� ����
   public static final int Password_Menus = 5;	    // ��й�ȣ �޴� ���� 
   public static final int MANAGE_EXIT = 6;			// �����ڸ�� ����
   public static final int PROGRAM_END = 7;			// ���α׷� ����


}

//������ �޴�()
public class ManagerMenu 
{
	//�ֿ� �Ӽ� ����  
   public static Integer sel;            //-- ���� ��
   private static String con;            //-- ��� ����
   public static boolean flag ;          //-- switch�� ������ ����


   //static �ʱ�ȭ ��
   static
	{
     
      //Scanner Ŭ���� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
      
      //����� �Է°� �ʱ�ȭ
	    sel=1;
	    con = "Y";
		flag = true;
     
   }

    //�޴� ��� �޼ҵ�
   public void menuDisp()
	{	
	     System.out.println();
         System.out.println(" [������ �޴� ����]");
         System.out.println(" 1. ���� ");
		 System.out.println(" 2. ��� ���� ");
         System.out.println(" 3. �Ǹŷ� �� ����� ��ȸ ");
         System.out.println(" 4. �ܰ���� ");
         System.out.println(" 5. ��й�ȣ ���� ");
         System.out.println(" 6. �����ڸ�� ����");
         System.out.println(" 7. ���α׷� ����");
         System.out.print(" >> �޴� ����(1~7) : ");
   }

   //�޴� ���� �޼ҵ�
   public void menuSelect()
	{

		Scanner sc = new Scanner(System.in);
		 boolean check = true; //����� �� 1~7�� ����� �ٽ� ������ ���� check

      do
      {
		  sel = sc.nextInt();
		  if(sel<1||sel>7){
          System.out.println(" 1~7�߿� �������ּ���.");
          System.out.print(" >> �޴� ����(1~7) : ");
		 
		  }else
		  {
			  check = false;
		  }
      }
      while (check);          

   }

   //���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
   public void menuRun() 
	{
		
	   Inven_Menus inven_menus = new Inven_Menus();  //������ 
	   Balju_Menus balju_menus = new Balju_Menus();	 //����
	   Sales_Menus sales_menus = new Sales_Menus();  //�Ǹŷ� �� ����� ��ȸ
	   Money_Management money_management = new Money_Management(); //�ܰ� ����
	   Password_Menus password_menus = new Password_Menus(); //��й�ȣ ����

		Cafe_Menus c = new Cafe_Menus();
	
		do
		{
			switch(sel)
			{
			   case 1 : 
				        balju_menus.menuDisp();
						balju_menus.menuSelect();
						balju_menus.menuRun();   
			   break;

			   case 2 :
						inven_menus.menuDisp();
						inven_menus.menuSelect();
						inven_menus.menuRun();   
			   break;

			  
			   case 3 :  sales_menus.menuDisp();
						 sales_menus.menuSelect();
						 sales_menus.menuRun();   
			   break;
			   
			   case 4 : money_management.menuDisp();
			   			money_management.menuSelect();
						money_management.menuRun(); 
			   break;
				
			   case 5 : password_menus.menuDisp();
						password_menus.menuSelect();
						password_menus.menuRun();   
			   break;
			   
		   
		   	
			   case 6 : System.out.println(" ������ ��带 �����մϴ�.");
			   			
						c.firPrint();
						c.menuSelect();
						c.menuRun();
						c.menuGo();
			   break;
			   
			   case 7 : System.out.println(" ���α׷��� �����մϴ�. ");
			   			System.exit(-1);
			  
			   
	
			}
		}
		while (flag);
	   
	}

}