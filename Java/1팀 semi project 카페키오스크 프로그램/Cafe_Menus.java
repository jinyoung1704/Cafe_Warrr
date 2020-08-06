import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Calendar;

// ����� ���ð��� �ڷᱸ���� ��� Ŭ����(��ä��)
class Cafe_Menus
{	
	//ArrayList �ڷᱸ�� �����ؼ� Cafe_Select(�Ӽ� Ŭ����) Ÿ���� ��ü�� ������ ���̴�.
	static ArrayList<Cafe_Select> vCafe_Select = new ArrayList<Cafe_Select>();	

	private static int sel;	//-- ���� ī�װ� ���ð�
	private static int sel2;	//-- 1.��ٱ��� �̵�, 2.�ٸ� �޴� �߰� ���ð�
	private int category;	//-- ��ٱ��� ����� ���� sel�� ���� ����(static�� ��������� ����� ����� �ȵȴ�.) 
	
	private int main;	//-- �������� ���ð� ��� ����(���ð� �˻縦 ����)
	private int hiop;	//-- HOT/ICE ���ð� ��� ����
	private int op;		//-- OPTION ���ð� ��� ���� 
	
	//sel ���� ���Ǵ� ����
	private static final int COFFEE = 1;			//  1.Coffee ���� �޴�	
	private static final int NONCOFFEE = 2;			//  2.Non-Coffee ���� �޴�
	private static final int DESSERT = 3;			//  3.Dessert ���� �޴�
	private static final int PASSWORD = 9999;		//  �����ڸ޴��� ��ȯ�ϱ� ���� ��	 

	// sel2 ���� ���Ǵ� ���� 
	private static final int BASKET = 1;			// 1. ��ٱ��Ϸ� �̵�  
	private static final int GOPLUS = 2;			// 2. �ٸ� �޴�  �߰� 
	
	public int getSel()
	{
		return sel;
	}

	public int getSel2()
	{
		return sel2;
	}

	public int getCategory()
	{
		return category;
	}
	
	//��ü �޴� ��� �޼ҵ�
	public void firPrint()
	{
		
		Scanner sc = new Scanner(System.in);
		
		Cafe_Control cafe_control = new Cafe_Control();
		
		//��¥ �׽�Ʈ 
		//TestCalendar tc = new TestCalendar();
		Calendar calendar = Calendar.getInstance();

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int date = calendar.get(Calendar.DATE);
		

		System.out.println("===================================================================");
		System.out.println("                            Wa_rrr CAFE                            ");
		System.out.println("-------------------------------------------------------------------");
		//System.out.printf("%61d-%d-%d\n",year,month,date);
		System.out.printf("%61d-%d-%d\n",year,month,date +TestCalendar.datePlus);						// ���� ��¥ ��� �޼ҵ�
		cafe_control.today_coffee();		// ���� Ŀ�� ���� �޴� ���� �޼ҵ�
		cafe_control.today_coffee_print();	// ���� Ŀ�� �޴� ��� �޼ҵ�
		System.out.println("-------------------------------------------------------------------");
		System.out.println("                               �޴� ����	                       ");
		System.out.println("===================================================================");
		System.out.println("|     1.Coffee	       |     2.Non-Coffee    |     3.Dessert      |");
		System.out.println("|-----------------------------------------------------------------|");
		System.out.println("|    ������������      |    ���ڸ����̵�     |    ������ũ        |");
		System.out.println("|    ���Ƹ޸�ī��      |    �����Ʈ������   |    �����̱�        |");
		System.out.println("|    ��ī���        |    ������Ŀ��Ƽ   |    ������          |");
		System.out.println("|    ��ī���ī        |    ���������꽺     |    ����ī��        |");
		System.out.println("|    ��īǪġ��        |    ��������     |    ����Ű          |");
		System.out.println("|    ���ٴҶ��      |                     |	                  |");
		System.out.println("|    ��ī��Ḷ���ƶ�  |                     |                    |");
		System.out.println("===================================================================");
		cafe_control.so_print();
		System.out.print(" ī�װ��� �������ּ��� : ");
		sel = sc.nextInt();	// ����ڰ� �Է��� ������ sel ���� �ʱ�ȭ
		category = sel;		// sel������ category ���� �ʱ�ȭ 

		menuSelect();
	}

	// 1. Coffee  ī�װ� ��� �޼ҵ�
	public void coffeePrint()
	{
		System.out.println("===================================================================");
		System.out.println("                        COFFEE (HOT/ICE)                           ");
		System.out.println("===================================================================");
		System.out.println("| 1)����������          (2500��)                                  |");
		System.out.println("| 2)�Ƹ޸�ī��          (3000��/3500��)                           |");
		System.out.println("| 3)ī���            (3500��/4000��)                           |");
		System.out.println("| 4)ī���ī            (4000��/4500��)                           |");
		System.out.println("| 5)īǪġ��            (4000��/4500��)                           |");
		System.out.println("| 6)�ٴҶ��          (4500��/5000��)                           |");
		System.out.println("| 7)ī��Ḷ���ƶ�      (4000��/4500��)                           |");

	}
	
	// HOT/ICE �ɼ� ���� ��� �޼ҵ�()  
	public void HOT()
	{	
		System.out.println("===================================================================");
		System.out.println("                        HOT/ICE                                    ");
		System.out.println("===================================================================");
		System.out.println("| 1) HOT                (�߰���� ����)                           |");
		System.out.println("| 2) ICE                (500��)                                   |");
		System.out.println("===================================================================");

	}

	 //Ŀ�� �ɼ� ���� �޼ҵ� 
	public void coffeeOp()
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("                        COFFEE OPTION                              ");
		System.out.println("===================================================================");
		System.out.println("| 1)���þ���                                                      |");
		System.out.println("| 2)��                  (500��)                                   |");
		System.out.println("| 3)�ٴҶ�÷�          (500��)                                   |");
		System.out.println("| 4)���ڽ÷�            (500��)                                   |");
		System.out.println("| 5)������ӽ÷�        (500��)                                   |");
		System.out.println("| 6)ī��� �÷�         (500��)                                   |");
		System.out.println("| 7)����ũ��            (500��)                                   |");
		System.out.println("===================================================================");
		System.out.print(" �޴��� �������ּ���(COFFEE, HOT/ICE, OPTION ���� ����) : "           );
			
		main = sc.nextInt();	// ����� ���ð��� ��� ������ 
		hiop = sc.nextInt();
		op = sc.nextInt();
		
		// Ŀ�� ���ð�(main,hiop,op) �˻�
		boolean check = true;
		do{
			 if((0<main&&main<8)&&(0<op&&op<8)&&(0<hiop&&hiop<3)){	
				check = false;
			 }else{
				
				 // ���� ���� ���� �Է��ϸ� �ٽ� ó�� ȭ������ ���ư���.
				 System.out.println();
				 System.out.println(" �˸°� �ٽ� �������ּ���.");
				 System.out.println();
				 firPrint();
				
			 }
		  }while(check);
		
		vCafe_Select.add(new Cafe_Select(sel,main,hiop,op));	
		// Ŀ�Ƿ��� (ī�װ�,���θ޴�,HOT/ICE �ɼ�/�߰��ɼ�) �Ӽ��� ���� ��ü�� �ڷᱸ���� �߰��ȴ�.
	}

	// 2. Non-Coffee ī�װ� ��� �޼ҵ�
	public void noncoffeePrint()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("===================================================================");
		System.out.println("                        NON-COFFEE                                 ");
		System.out.println("===================================================================");
		System.out.println("| 1)�ڸ����̵�          (4000��)  ICE                             |");
		System.out.println("| 2)���Ʈ������        (4500��)  ICE                             |");
		System.out.println("| 3)����Ŀ��Ƽ        (3500��)  HOT                             |");
		System.out.println("| 4)�������꽺          (4000��)  ICE                             |");
		System.out.println("| 5)������          (4000��)  HOT                             |");
		System.out.println("===================================================================");
		System.out.print(" �޴��� �������ּ���(NON-COFFEE) : "           );
		
		main = sc.nextInt();	// ����� �Է� ���� ��� ���� 
		
		boolean check = true;
		do{
			 if(0<main&&main<6){	
				check = false;
			 }else{
				 System.out.println(" �˸°� �ٽ� �������ּ���.");
				 firPrint();
				
			 }
		  }while(check);

		  vCafe_Select.add(new Cafe_Select(sel,main));
		  // ��Ŀ�Ƿ��� (ī�װ�, ���θ޴�) �Ӽ��� ���� ��ü�� �ڷᱸ���� �߰��ȴ�. 
	}

	// 3. Dessert ī�װ� ��� �޼ҵ�
	public void dessert()
	{	
		

		System.out.println("===================================================================");
		System.out.println("                        DISSERT                                    ");
		System.out.println("===================================================================");
		System.out.println("| 1)����ũ              (4000��)                                  |");
		System.out.println("| 2)���̱�              (3500��)                                  |");
		System.out.println("| 3)����                (3500��)                                  |");
		System.out.println("| 4)��ī��              (2500��)                                  |");
		System.out.println("| 5)��Ű                (1000��)                                  |");
	}

	//����Ʈ �ɼ� ���� �޼ҵ�
	public void dessertOp()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("===================================================================");
		System.out.println("                      DISSERT OPTION                               ");
		System.out.println("===================================================================");
		System.out.println("| 1)���þ���                                                      |");
		System.out.println("| 2)ũ��ġ��            (1000��)                                  |");
		System.out.println("| 3)������              (500)                                     |");
		System.out.println("===================================================================");
		System.out.print(" �޴��� �������ּ���(DISSERT, OPTION ���� ����) : ");
		
		main = sc.nextInt();
		op = sc.nextInt();
		
		boolean check = true;
		do{
			 if((0<main&&main<6)&&(0<op&&op<4)){	
				check = false;
			 }else{
				 System.out.println();
				 System.out.println(" �˸°� �ٽ� �������ּ���.");
				 System.out.println();
				 firPrint();
				
			 }
		  }while(check);

		vCafe_Select.add(new Cafe_Select(sel,main,op));
		// ����Ʈ���� (ī�װ�,���θ޴�,�߰��ɼ�) �Ӽ��� ���� ��ü�� �ڷᱸ���� �߰��ȴ�.
	
	}
	
	// 1. ��ٱ��Ϸ� 2. �ٸ� �޴� �߰� �����ϵ��� �ϴ� �޼ҵ�
	public void go()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println(" 1. ��ٱ��Ϸ� �̵�   2. �ٸ� �޴� �߰� ");
		System.out.println();
		System.out.print(" �������ּ���: ");
		sel2 = sc.nextInt();
		
		// 1. ��ٱ��� �̵� 2. �ٸ� �޴� �߰� ���ð� �˻� 
		boolean check = true;
		do{
         if(sel2<1||sel2>2){
            System.out.println(" 1~2�߿� �������ּ���.");
            go();
         }else{
			menuGo();
            check = false;
         }
      }while(check);
	    System.out.println();
		

	}//go() end


	//ī�װ� ���ð� �˻��ϴ� �޼ҵ� 
   public void menuSelect(){
	   
	  boolean check ;
	  check = true;  //-- ī�װ� ���ð� �˻�

    do{

			if(sel<1||sel>9999){
            System.out.println(" 1~3�߿� �������ּ���.");
            firPrint();
			}else{			
					check = false;
			}
      }while(check);

	menuRun();

   } //menuSelect() end

   //���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
   public void menuRun(){

	   Cafe_Menus cafe_menus = new Cafe_Menus();	// Cafe_Menus Ŭ���� �ν��Ͻ� ����
	   I_minus i_minus = new I_minus();
	   Pay_Control pay_control = new Pay_Control();
	   
		 switch(sel){
         
         case Cafe_Menus.COFFEE: cafe_menus.coffeePrint();	//1.COFFEE ��� �޼ҵ�
		 						 cafe_menus.HOT();			// �־��̽� �ɼ� ���� �޼ҵ�
								 cafe_menus.coffeeOp();     // Ŀ�� �ɼ� ���� �޼ҵ� 
								 cafe_menus.go();			// 1.��ٱ��� �̵� 2. �ٸ� �޴� �߰� 

									break;

         case Cafe_Menus.NONCOFFEE: cafe_menus.noncoffeePrint(); //2.NONCOFFEE ��� �޼ҵ�
									cafe_menus.go();			 // 1.��ٱ��� �̵� 2. �ٸ� �޴� �߰� 
						
									break;

         case Cafe_Menus.DESSERT: cafe_menus.dessert();		// 3. Dessert ī�װ� ��� �޼ҵ�
		 						  cafe_menus.dessertOp();	// ����Ʈ �ɼ� ���� �޼ҵ�
								  cafe_menus.go();			 // 1.��ٱ��� �̵� 2. �ٸ� �޴� �߰�

									break;
		// ������
		 case Cafe_Menus.PASSWORD :   Scanner sc = new Scanner(System.in);
									  // 9999 �Է� �� ��й�ȣ�� �Է��ϸ� ������ ���� ����
									  System.out.print(" ������ ��й�ȣ�� �Է����ּ��� :");
									  String password=sc.next();
									  System.out.println();
											
									Password_Control pc = new Password_Control();
									Cafe_Menus c = new Cafe_Menus();
									ManagerMenu m = new ManagerMenu();

									// password�� Password_Control�� ��ϵ� password�� ������ �����ڸ�� ����
									if(password.equals(pc.getPassword()))	
									{
										  
										 while (true)
										 {
											 m.menuDisp();
											 m.menuSelect();
											 m.menuRun();
										 }
									}
									//��й�ȣ �߸� �Է��ϸ� ���� �޴���
									else
									{
										System.out.println(" ��й�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
								          c.firPrint();
									}
	
									break;
														
		}//switch�� end
	
	 }

	// 1. ��ٱ��� ���� 2. �ٸ� �޴� �߰� �����ϵ��� �ϴ� �޼ҵ� 
	public void menuGo()
		{
			Cafe_Menus cafe_menus = new Cafe_Menus();	// Cafe_Menus Ŭ���� �ν��Ͻ� ����
			Pay_Control pay_control2 = new Pay_Control();
			Basket_Control basket_control = new Basket_Control();
			
			// ���� �ݾ� ���� �޼ҵ� 
			pay_control2.pay();		//-- �����ݾ� ����� ������ ���� ��ġ!!! Ȯ��@@@ 
			
			switch(sel2){
				
				case Cafe_Menus.BASKET : basket_control.print();	 //1.��ٱ��� ���� �����ϸ� ����â ����Ʈ���ְ�
										 break;					// main() ���� 1�� �ƴϸ� ��� �ݺ��ϵ��� �����ص״�.
				
				case Cafe_Menus.GOPLUS :cafe_menus.firPrint();
										cafe_menus.menuRun(); // 2.�ٸ� �޴� �߰� �����ϸ� �ٽ�  
									
			}

		}	// menuGo() end 

} //Class Cafe_Menus end 

