import java.util.ArrayList;
import java.util.Iterator;

import java.util.Scanner;

// �����ݾ� ���� ���� Ŭ����(��ä��,������,���Ѻ�,��ȣ��) 
class Pay_Control
{	

	private static int totalPay;	//-- �ܼ� ���� ���� �ݾ� ���� �Ӽ�
	private int gap=0;	// �ܼ��� �ݾ��� �����ϱ� ���� ���� 
	public static int allPay;		//-- �� ���� �ݾ�  
	
	private static int mainPay;		//-- ���� �޴� �ݾ�
	private static int hiopPay;		//-- ICE ���ý� 500�� �߰���
	private static int opPay;		//-- �߰��ɼ� �ݾ�
	
	private static int customer;	// �湮 �մ� �� �� ������ ��÷ ���� �̺�Ʈ ������ ���� �������
	
	public void setCustomer(int costomer)
	{
		this.customer = costomer;
	}
	public int getCustomer()
	{
		return customer;
	}
	
	// ������ �ν��Ͻ� ����.
	Stamp stamp = new Stamp();
	
	////////////////////////////////////////////////////////////////////////////////////

	
	public void setTotalPay(int totalPay)
	{
		this.totalPay = (mainPay+hiopPay+opPay);
	}

	public int getTotalPay()
	{
		return totalPay;
	}

	public void setAllPay(int allPay)
	{
		this.allPay = allPay;
	}

	public int getAllPay()
	{
		return allPay;
	}

	public void setMainPay(int mainPay)
	{
		this.mainPay = mainPay;
	}

	public int getMainPay()
	{
		return mainPay;
	}

	public void setHiopPay(int hiopPay)
	{
		this.hiopPay = hiopPay;
	}

	public int getHiopPay()
	{
		return hiopPay;
	}

	public void setOpPay(int opPay)
	{
		this.opPay = opPay;
	}

	public int getOpPay()
	{
		return opPay;
	}


  // ����� ���� ���� ���� ���� �ݾ� ���� �޼ҵ�(��ä��)
   public void pay()
   {   

	  //Cafe_Menus.vCafe_Select -- ����� ���ð� ���� �ڷᱸ��
      //Cafe_Menus.vCafe_Select.get(0); �̷� ������� static �ڷᱸ�� ȣ��

      Iterator it = Cafe_Menus.vCafe_Select.iterator(); //    vCafe_Select �� ����Ǿ��ִ� <Cafe_Select> Ÿ�� ��ü  
      
      Menus_Price menus_price = new Menus_Price(); // ����� ���� ���� Ŭ���� ��ü ����
      Pay_Control pay_control = new Pay_Control(); // TotalPay ���� Ŭ���� ��ü ���� 
	  Cafe_Control cc = new Cafe_Control(); //������ Ŀ�� �޴��� �����ߴ��� �˾ƺ��� ���� ��ü ����

      while(it.hasNext())   // ��ü�� ���� ������ �ݺ�       
      {	
		 cc.today_coffee();
         Object obj = it.next();   // <Cafe_Select> Ÿ�� ��ü�� �����´�
         Cafe_Select cafe_select = (Cafe_Select)obj;

         //cafe_select.getMain();   // ����� ���ð��� ���� �޴� ���� 
         //cafe_select.getHiop();   // ����� ���ð��� ���� �ɼ� ����
         //cafe_select.getOP();      // ����� ���ð��� ���� �߰� �ɼ� ����  
      
         //�׽�Ʈ - ���� ��ŭ �ҷ����°� Ȯ����
         //System.out.println(" �޴� �� " + cafe_select.getMain() + " HOT/ICE �ɼǰ� " + cafe_select.getHiop() + "�߰� �ɼ� �� " +  cafe_select.getOp());
      
         //����� ���ð��� ���� �޴��� ���� �޼ҵ� selectPay() ȣ�� 
            
         if (cafe_select.getCategory() == 1)	 // ī�װ� ���ð��� Ŀ��  
         { 
			  switch (cafe_select.getMain())      // �޴� ���� �� 
				{    
				   // ���� Ŀ�� ������ ���� ����(������)
				   case 1 : if(cc.todaynum[0]==cafe_select.getMain()) //todaynum�� Ŀ���� ������ȣ 
							pay_control.setMainPay(menus_price.getPespresso()-500); //todaynum[0] ��ȣ�� ����ڰ� �Է��� ���ἱ�� ��ȣ�� ��ġ�ϸ�
					  else															//500�� ����
						    pay_control.setMainPay(menus_price.getPespresso()); break;
				
				   case 2 : if(cc.todaynum[0]==cafe_select.getMain())
							pay_control.setMainPay(menus_price.getPamericano()-500);
						else
							pay_control.setMainPay(menus_price.getPamericano()); break;

				   case 3 :if(cc.todaynum[0]==cafe_select.getMain())
							 pay_control.setMainPay(menus_price.getPlatte()-500); 
						else
						 pay_control.setMainPay(menus_price.getPlatte()); break;

				   case 4 :if(cc.todaynum[0]==cafe_select.getMain())
						 pay_control.setMainPay(menus_price.getPcafeMoca()-500); 
						 else
						 pay_control.setMainPay(menus_price.getPcafeMoca()); break;

				   case 5 :if(cc.todaynum[0]==cafe_select.getMain()) 
							pay_control.setMainPay(menus_price.getPcappuccino()-500);
						 else
						 pay_control.setMainPay(menus_price.getPcappuccino()); break;

				   case 6 :if(cc.todaynum[0]==cafe_select.getMain())  
						 pay_control.setMainPay(menus_price.getPvanillaLatte()-500);
						 else
						 pay_control.setMainPay(menus_price.getPvanillaLatte()); break;
				   case 7 :if(cc.todaynum[0]==cafe_select.getMain())               
						  pay_control.setMainPay(menus_price.getPcaramelM()-500);
						 else
						 pay_control.setMainPay(menus_price.getPcaramelM()); break;
					  
				}

            switch (cafe_select.getOp())   // �ɼ� ���� �� 
            {
               case 1 : pay_control.setOpPay(0); break;
               case 2 : pay_control.setOpPay(menus_price.getPshot()); break;
               case 3 : pay_control.setOpPay(menus_price.getPvanilla()); break;
               case 4 : pay_control.setOpPay(menus_price.getPchoco());  break; 
               case 5 : pay_control.setOpPay(menus_price.getPhazel());  break;
               case 6 : pay_control.setOpPay(menus_price.getPcaramel());  break;
               case 7 : pay_control.setOpPay(menus_price.getPwhipcream());  break;
            }

            
            if (cafe_select.getHiop() == 2)   // HOT/ICE �ɼ� ���� ���� ICE �̸� 
            {
               pay_control.setHiopPay(500); 
            }
         
         }
         
         else if(cafe_select.getCategory() == 2)// ��Ŀ�� ī�װ����� 
         {

			 pay_control.setHiopPay(0);	// HOT/ICE �ɼ� ���ݰ� �߰� �ɼ� �ݾ� 0���� �ʱ�ȭ 
			 pay_control.setOpPay(0);

            switch (cafe_select.getMain())   // �޴� ���� �� 
            {   
               case 1 : pay_control.setMainPay(menus_price.getPjamongAde());  break;
               case 2 : pay_control.setMainPay(menus_price.getPyogurt()); break;
               case 3 : pay_control.setMainPay(menus_price.getPtea()); break;
               case 4 : pay_control.setMainPay(menus_price.getPorangeJuice());  break;
               case 5 : pay_control.setMainPay(menus_price.getPgogumaLatte());  break;
            } 

         }


         else if(cafe_select.getCategory() == 3)// ����Ʈ ī�װ����� 
         {      
			 pay_control.setHiopPay(0);	// HOT/ICE �ɼǰ� 0���� �ʱ�ȭ 

            switch (cafe_select.getMain())   // �޴� ���� �� 
            {
               case 1 : pay_control.setMainPay(menus_price.getPcake());   break;
               case 2 : pay_control.setMainPay(menus_price.getPbagel());  break;
               case 3 : pay_control.setMainPay(menus_price.getPscone());  break;
               case 4 : pay_control.setMainPay(menus_price.getPmacaron()); break;
               case 5 : pay_control.setMainPay(menus_price.getPcookie()); break;

            }
            switch (cafe_select.getOp()) // �ɼ� ���� �� 
            {
               case 1 : pay_control.setOpPay(0); break;
               case 2 : pay_control.setOpPay(menus_price.getPcreamcheese()); break;
               case 3 : pay_control.setOpPay(menus_price.getPstroberryjam()); break;
            
            }

            
         }
         
         pay_control.setTotalPay(getTotalPay()); //-- ���� ���� ��� ����
         
         gap += getTotalPay();
         
         allPay = gap;	// �� �ֹ��� �� ���� �ݾ�   
         
         //�׽�Ʈ 
         //System.out.println("���� ���� �ݾ�: " + pay_control.getMainPay() + " ICE �߰� �ݾ� : " +  pay_control.getHiopPay() + " �ɼ� �߰� �ݾ� : " + pay_control.getOpPay()); 

         //System.out.println("�ܴ� ���� �ݾ�: " + pay_control.getTotalPay()); // --> �� �ܺ��� ���´� 
         //System.out.println("�� ���� �ݾ�: " + allPay);//�ӽ� ��ġ

      }// while �� end

   }

	// ī�� ������ ������ static ����
	public static int cardSum;
	
	// Pay_Select Ŭ������ �޼ҵ� ȣ��
	Pay_Select pc = new Pay_Select();

	// ī����� �޼ҵ� (���Ѻ�)
	public void cardPay()
	{
		// ��ĳ�� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		// ī�� ���� 
		System.out.println();
		System.out.print(" ī�带 �������ּ���(Y/N): ");
		String yon=sc.next();	// ����ڰ� �Է��� Y/N�� ���� ���� yon

		if(yon.equals("Y")||yon.equals("y"))
		{
			// ī������� ���� ������ �ѹ��� �ȴ�.
			
			// ī�� ������� �����ϱ� ���� �ڵ�
			Money_Control money_control = new Money_Control();
			money_control.card_Sales();
			
			System.out.println();
			System.out.println("========================= ���� ������ ===========================>> ");
			System.out.println();
			System.out.println(" ī�� ������ �Ϸ�Ǿ����ϴ�.");
			System.out.println();
			
			
			
			// ���� ���� �޼ҵ��� Stamp Ŭ������ saveSelect() �޼ҵ� ȣ��
			stamp.saveSelect();
			
			
			// costomer �� 1 ����
			// ���� costomerP�� ������ �Ϸ��� ��, 1�� ������ ���ο� costomer ����.
			int customerP = getCustomer()+1;
			// ���ο� costomer ���� setCostomer() �޼ҵ带 ����
			// static costomer�� �����Ѵ�.
			setCustomer(customerP);
		}
		//(N�� ������ ���)
		else
		{
			// Pay_Select ȭ������ �̵��Ѵ�.
			pc.menuDisp();
		}
		

	

	}
   
	// int��ȯ���� ����� ���� �Է� �޼ҵ�(��ȣ��) 
	public int inputBill() 
	{
		// ������� ���� �Է� �޼ҵ忩�� �̰����� �Ϻ� ������� ���̸� �ȵȴ�. 
		// �ֳ��ϸ� ����� ���� �Է��� �޾� 
		// ����� ���ݰ� ������ �ݾ�(allPay)�� ���־�
		// ����ڰ� �Ž��� �޾ƾ��� ��(user_money)�� �������ְ� 
		// int��(user_money)�� ��ȯ���ִ� �޼ҵ��̱� �����̴�.
		
		
		// ���� ���� ���� �޼ҵ� ȣ��(�Ϻ� ����װ� ���� ����׿� ���δ�.)
		// Money_Control money_control = new Money_Control();
		// money_control.money_Sales();
		// 20-03-14 01:45 395, 396��°�� �ּ�ó��.(��ȣ��)
		// 20-03-14 01:50 454,455,456��°�ٿ� �ٽ� �ٿ�����.
		 
		  Scanner sc = new Scanner(System.in);// ��ĳ�� �ν��Ͻ� ����.

		  int money=0; // ����� ���� �Է��� �޴� ����.
		
		  System.out.println();
		  System.out.print(" ������ �������ּ��� : ");
		  
		  //���� ó���� ������� ���ϰھ ������ ó������� �ϳ� ��������. 20-03-14 09:43 ��ȣ�� �߰�
		  while (!sc.hasNextInt()) //���� �������� �Ǻ�
		  {
				sc.next();	//���� ���ڰ� �ƴϸ� ������.
				System.err.print(" ����! ���ݸ��� �������ּ��� :");
				System.out.println();
		  }

		  money = sc.nextInt();	// ����� ���� ��ĳ�ʷ� �Է� �ޱ�.

		  if(money < allPay)	// ������� ���ݱݾ��� ���� �ݾ׺��� ���� ���
		  {
				System.out.println(" �ܾ��� �����մϴ�. �ٽ� �������ּ���.");
				System.out.println();
				pc.menuDisp();	// �ٽ� ���� ����â���� �Ѿ�Բ� �س���.
		  }
		  
		  int user_money = money - allPay;	// ����ڰ� �Ž��� �޾ƾ��� �� = ������� ���ݱݾ� - �� �����ݾ�

		  return user_money;				// ����ڰ� �Ž��� �޾ƾ��� ���� int�������� ��ȯ�Ѵ�.
											// �ֳ��ϸ� �Ʒ��� �Ž�����üũ�޼ҵ��(checkbillPay(int user_money))
											// ���ݰ����޼ҵ�(billPay(int user_money)�� ���Ǳ� �����̴�.
	 }



		   Change c = new Change();				// �Ž�����(Change) Ŭ���� �ν��Ͻ� ����

		   int[] coinSet = {c.getOhmanwon(), c.getManwon(), c.getOhchonwon(), c.getChonwon(), c.getOhbackwon()};
		   // �Ž����� ���� �迭 ���� �� �ʱ�ȭ.
		   // Change Ŭ�������� ������ ���ؼ�
		   // {�������� ����, ������ ����, ��õ���� ����, õ���� ����, ������� ����};�� �ʱ�ȭ���ѳ��Ҵ�.

		   int coinName[] = { 50000, 10000, 5000, 1000, 500};
		   // �Ž����� ���� �迭 ���� �� �ʱ�ȭ.
		   // �ܵ��� �Ž����ֱ� ���ؼ�
		   // {������, ����, ��õ��, õ��, �����};���� �ʱ�ȭ���ѳ��Ҵ�.



	 // boolean ��ȯ���� �����ȯ���� Ȯ�� �޼ҵ�(�Ž������� �ִ��� ������)(��ȣ��)
	 public boolean checkbillPay(int user_money)    
	 { 
		 for (int i = 0; i < coinName.length; i++)	// 0���� �����̸��� �迭ũ��(5)��ŭ ����. �� 6�� ����.
		 {
			if (user_money < coinName[i])			// ����ڰ� �Ž��� �޾ƾ��� ���� �����̸����� ���� ��� ex) 1000 < coinName[0]=50000
				continue;							//(+ �� �κ� �����ϰ�...) ����ض�. �޹��� �̾����� �ʰ�, �ٽ� for���� ����.
													
													// user_money(����ڰ� �Ž��� �޾ƾ��� ��)�� 2500���̶� ��������.
			int temp = user_money / coinName[i];	// int���� temp���� ���� �� temp�� (����ڰ� �Ž��� �޾ƾ��� �� ������ ������ �̸�) ��´�.
													// ex) temp = user_money(2500) / 1000 ,  temp = 2;

			if (temp > coinSet[i])					// temp�� 2�� ��� õ���� ������ ���Ͽ� temp�� õ���� �������� ũ�ٸ�
			   temp = coinSet[i];					// temp���� õ���� ������ŭ �ʱ�ȭ��Ų��. õ���� ������ 1����� temp�� 1�� �ʱ�ȭ�ȴ�.
			user_money -= temp * coinName[i];		// ����ڰ� �Ž��� �޾ƾ��� ��(2500) -= 2 * 1000, 500���� �ǰ�, 0���� �ɶ�����
													// ����ڰ� �Ž��� �޾ƾ��� ���� 0�� �Ǹ� for���� ����ȴ�.
		 }


		 if(user_money == 0)						// ����ڰ� �Ž��� �޾ƾ��� ���� 0�� �Ǹ� 
			return true;							// �Ž����ټ� �ִ� ������ ������ �ִٴ� �ǹ��̹Ƿ� true���� ��ȯ�ϰ�
		 else										// ����ڰ� �Ž��� �޾ƾ��� ���� 0�� ���� ������
			return false;							// �Ž����ټ� �ִ� ������ ������ ���ٴ� �ǹ��̹Ƿ� false���� ��ȯ�Ѵ�.
	 }
	   



	//���� ���� �޼ҵ� (��ȣ��)
	 public void billPay(int user_money)			// ���� �ܵ� ��ȯ �޼ҵ�(���� �����ȯ���� Ȯ�� �޼ҵ�� �����ǰԲ� �س��Ҵ�.
	 {												// �ڼ��� ������ Pay_Select 74~92��°�� ����.
		 
		 if(user_money==0)												// ����ڰ� �Ž��� �޾ƾ��� ���� 0���̸�
			 System.out.println();
			 System.out.println("========================= ���� ������ ============================>> ");
			 System.out.println();
			 System.out.println(" ���ݰ����� �Ϸ�Ǿ����ϴ�.");			// ���ݰ��� �Ϸ� ����Ʈ�� ���ش�.
			 System.out.println();

		 if(user_money>0)												// ����ڰ� �Ž��� �޾ƾ��� ���� 0���� ũ��
		 {	
			 System.out.println(" �ܵ��� �޾��ּ��� : " + user_money+"��");	// ����ڰ� �Ž��� �޾ƾ��� ���� ����Ʈ���ش�.
			 System.out.println();
		 }
		
		 // ���� ������ �Ϸ� ����Ʈ�� �۵��Ǹ�
		 // ���� ���� ���� �޼ҵ� ȣ��(�Ϻ� ����װ� ���� ����׿� ���δ�.)
		 Money_Control money_control = new Money_Control();
		 money_control.money_Sales();

		 for (int i = 0; i < coinName.length; i++)	// 0���� �����̸��� �迭ũ��(5)��ŭ ����. �� 6�� ����.
		 {											// ����ڰ� �Ž��� �޾ƾ��� ���� 2500���̶� ��������.
			if (user_money < coinName[i])			// 2500(user_money) < 50000 ,10000, 5000��(coinName[0], coinName[1], coinName[2]) ������
													// �޹��� ������ϰ� for������ �ٽ� ���ư���.
			   continue;	
													// 2500(user_money) < 1000, 500 (coinName[3],coinName[4]) �϶� if���� ������� ������
			int temp = user_money / coinName[i];	// temp = 2500/1000(coinName[3]), temp = 2 , for���� ���������� ���� temp = 2500/ 500(coinName[4]), temp =1
			if (temp > coinSet[i])					// ���� coinSet[4]�� 10�� �̸� temp�� 0���� ũ�Ƿ� if���� ����Ǹ鼭
			   temp = coinSet[i];					// temp�� 4�� �ʱ�ȭ�ȴ�.
			user_money -= temp * coinName[i];		// ����ڰ� �Ž��� �޾ƾ��� ��(user_money)�� ����ڰ� �Ž��� �޾ƾ��� ��(2500) - (5 * 500)���� ����ڰ� �Ž��� �޾ƾ��� ���� 0�̵�.
			coinSet[i] -= temp;						// coinSet[4] = coinSet[4] - 4; ���� �ʱ�ȭ�ȴ�.
		 }


		  c.setOhmanwon(coinSet[0]);	// �Ž����� Ŭ������ �Ӽ��� �������� ���͸� �̿��� ������ �������� ������ �������ش�.
		  c.setManwon(coinSet[1]);		// �Ž����� Ŭ������ �Ӽ���   ������ ���͸� �̿��� ������ �������� ������ �������ش�.
		  c.setOhchonwon(coinSet[2]);	// �Ž����� Ŭ������ �Ӽ��� ��õ���� ���͸� �̿��� ������ �������� ������ �������ش�.
		  c.setChonwon(coinSet[3]);		// �Ž����� Ŭ������ �Ӽ���   õ���� ���͸� �̿��� ������ �������� ������ �������ش�.
		  c.setOhbackwon(coinSet[4]);	// �Ž����� Ŭ������ �Ӽ��� ������� ���͸� �̿��� ������ �������� ������ �������ش�.

		  
		  // ������ ����â���� ���� �޼ҵ� ȣ��.
		  stamp.saveSelect();					
		  
		  // 20-03-14 01:50 ��Ŭ���� �������� ������ ����â���� ���� �޼ҵ� ȣ��� �ٽ� ���ƿ��� ���� Ȯ��.
		  // 504~510��°�� �ִ� customer �� ���� �޼ҵ尡 ������ ����â���� ���� �޼ҵ� ȣ�� �տ� �־ ������ ����â��
		  // billPay �޼ҵ�� �ٽ� ���ƿ� ��
		  // �� ������ ���� �����鼭 null���� ��ȯ�ϴ� �ͼ��� ������ �߻��Ͽ� 498�� 504~510��°�� �� �޼ҵ� �ڸ��� �ٲٴ� �������� �۵���.

	 }

			// ��ȣ�� 20-03-14 03:31 billPay�޼ҵ� �ּ��ޱ� ����. �����Ǵ� Pay_Select�� 74~83��°�� �ּ� �ޱ� ����.
	
	// ���������� �޼ҵ�(������ Ŭ���� ����)
	// ������ ���� �� ���Ḧ ������ �� ������ 10 ����, 3000�� ����
	// �޴�����ȣ�� ������ �ڷᱸ���� �����ؾ��Ѵ�.
	
	// ������ ���� �޼ҵ�(���Ѻ�)
	public void stampPay()	
	{
		stamp.hashMap.put("01030026023",10);	// Test �� ���� ä���� ��ȣ
		
		// ��ĳ�� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		
		// �Է¹��� �޴�����ȣ�� �����ϱ� ���� ����
		String phone;
		
		do
		{
			//stamp.stamp_add();
			System.out.println();
			System.out.println(" ������ ������ ���� ��ϵ� �޴��� ��ȣ�� �Է����ּ���('-' ����) ");
			System.out.print(" : ");
			// ����ڰ� �Է��� ���� phone ������ ��´�.
			phone=sc.next();
		}
		// �޴�����ȣ�� 11�ڸ��� �ƴϸ� do-while�� �ݺ����� ���Է¹޴´�.
		while(phone.length()!=11);
		
		// �޴�����ȣ-�������� ���� HashMap �ڷᱸ���� �̿��Ѵ�.
		// phone�� HashMap �ڷᱸ���� ���ٸ�?
		if(Stamp.hashMap.containsKey(phone)==true)
		{	
			System.out.println();
			System.out.println(" " +phone+" ���� ������ 10���� �����˴ϴ�.");
			Stamp.hashMap.put(phone,Stamp.hashMap.get(phone)-10);
			// Test ������ ������ ���� �������� �����Ǿ����� Ȯ��
			//System.out.println(Stamp.hashMap.get(phone)); �� OK!
			
			// ��ü �ݾ׿��� ���� �ݾ� 3,000���� ���� 0���� ���
			if(allPay-3000<=0)
			{	
				System.out.println();
				System.out.println(" ������ ������ �Ϸ�Ǿ����ϴ�.");
				System.out.println(" ���� ������ ���� : "+Stamp.hashMap.get(phone));
				
				// ������ �Ϸ�Ǿ����Ƿ� allPay�� ���� ���� '0'���� �ʱ�ȭ�Ѵ�.
				this.allPay=0;
				
				// costomer �� 1 ����
				// ���� costomerP�� ������ �Ϸ��� ��, 1�� ������ ���ο� costomer ����.
				int customerP = getCustomer()+1;
				// ���ο� costomer ���� setCostomer() �޼ҵ带 ����
				// static costomer�� �����Ѵ�.
				setCustomer(customerP);
				
				// ���� ���� �޼ҵ��� Stamp Ŭ������ saveSelect() �޼ҵ� ȣ��
				stamp.saveSelect();
				
			}
			
			// ��ü�ݾ׿��� ���� �ݾ� 3,000 �� ���� ���� �ݾ��� �߰������ؾ� �ϴ� ���
			else
			{
				this.allPay = allPay-3000;

				System.out.println();
				System.out.println(" ������ ������ 3,000�� ���εǾ����ϴ�.");
				System.out.println(" ���� ���� �ݾ� : "+allPay+"��");
				System.out.println();
				System.out.println(" ���� ������ ���� : " + Stamp.hashMap.get(phone));
			
				
				System.out.println();
				System.out.println(" ������ �ݾ��� ���� ������ �������ּ���.");

				// �ٽ� �������� ȭ������ �̵��Ѵ�.
				pc.menuDisp();	

				
			}
		
		
		}
		else
		{
			System.out.println();
			System.out.println(" �Է��� �޴��� ��ȣ�� ��ϵǾ� ���� �ʽ��ϴ�. ���� ���� ȭ������ ���ư��ϴ�.");

			// �ٽ� �������� ȭ������ �̵��Ѵ�.
			pc.menuDisp();

			
		}
		

			
		

	}


}



