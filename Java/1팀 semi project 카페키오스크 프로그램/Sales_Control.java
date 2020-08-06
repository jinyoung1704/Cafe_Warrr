
import java.util.Scanner;

import java.util.*;

//�Ǹŷ� �� ����� ��� Ŭ����(��ä��, ���Ѻ�, ��ȣ��)
class Sales_Control 
{

	Calendar cal = Calendar.getInstance();

	   int year =  cal.get(Calendar.YEAR);
	   int month = cal.get(Calendar.MONTH) + 1;
	   int date =  cal.get(Calendar.DATE);
	

	   Money m = new Money();
	   Money_Control mc = new Money_Control();
	   Change c = new Change();
	   Sales s = new Sales(); //�Ǹŷ� �ν��Ͻ� ����
	   
	//�Ϻ� ���� ��� �޼ҵ�(��ȣ��)
	  public void sales_day_Lookup() 
      {

       System.out.println();
        System.out.println("===================================================================");
       //System.out.printf("\t\t\t    %d�� %d�� %d��%n",today[0],today[1],today[2]);


       System.out.println("===================================================================");
        System.out.println("\t\t\t   ���޴��� �Ǹŷ���");
        System.out.println("===================================================================");
		System.out.printf("%61d-%d-%d\n",year,month, date  + TestCalendar.datePlus);
       System.out.println("-------------------------------------------------------------------");
       System.out.println("   Coffee��\t       �Ǹŷ�");
        System.out.printf("��  ����������\t\t  %d��\n",s.getSespresso());
        System.out.printf("��  �Ƹ޸�ī��\t\t  %d��\n",s.getSamericano());
        System.out.printf("��  ī���\t\t  %d��\n",s.getSlatte());
        System.out.printf("��  īǪġ��\t\t  %d��\n",s.getScappuccino());
        System.out.printf("��  ī���ī\t\t  %d��\n",s.getScafeMoca());
        System.out.printf("��  �ٴҶ��\t\t  %d��\n",s.getSvanillaLatte());
        System.out.printf("��  ī��Ḷ���ƶ�\t  %d��\n",s.getScaramelM());
       System.out.println();
       System.out.println("   NonCoffee��");
        System.out.printf("��  �ڸ����̵�\t\t  %d��\n",s.getSjamongAde());
        System.out.printf("��  ���Ʈ������\t  %d��\n",s.getSyogurt());
        System.out.printf("��  ����Ŀ��Ƽ\t  %d��\n",s.getStea());
        System.out.printf("��  ������\t\t  %d��\n",s.getSgogumaLatte());
        System.out.printf("��  �������꽺\t\t  %d��\n",s.getSorangeJuice());
       System.out.println();
       System.out.println("   Dessert��");
        System.out.printf("��  ����ũ\t\t  %d��\n",s.getScake());
        System.out.printf("��  ��ī��\t\t  %d��\n",s.getSmacaron());
        System.out.printf("��  ����\t\t  %d��\n",s.getSscone());
        System.out.printf("��  ���̱�\t\t  %d��\n",s.getSbagel());
        System.out.printf("��  ��Ű\t\t  %d��\n",s.getScookie());
       System.out.println("-------------------------------------------------------------------");
        System.out.println("===================================================================");
       System.out.println("\t\t\t   ���� �� �� Ȳ��");
       System.out.println("===================================================================");
        System.out.printf("�� ��  ��  ��  ��\t  %d��%n",c.getChange());         //�Ž������� �󸶳� �ִ��� Ȯ���ϱ� ���� ��¹� 
        System.out.printf("�� ��  ��  ��  ��\t  %d��%n",m.getBill_SalesD());         // �� ���ݸ��� ���� ��¹�
        System.out.printf("�� ī  ��  ��  ��\t  %d��%n",m.getCard_SalesD());         // �� ī����� ���� ��¹�
        System.out.printf("��   ��    ��  ��\t  %d��%n",m.getBill_SalesD() + m.getCard_SalesD() - c.getChange()); // �Ѽ��� ��¹�
        System.out.printf("�� ��  ��  ��  ��\t  %d��%n",m.getBalju_moneyD());         // �� ���ֱݾ��� ��¹�
        System.out.printf("�� ������  ��  ��\t  %d��%n",mc.money_Profit());   // �� ������ �ݾ� Ȯ�� ��¹�
        System.out.println("===================================================================");
       System.out.println();
      }

	  // ������� �Ѹ��� ��� �޼ҵ�(��ȣ��)
            public void sales_month_Lookup() // ������� �Ѹ��� ���
      {
        Money m = new Money();
        Sales s = new Sales();

        Money_Control mc = new Money_Control();
        // ���� ī�� ����� ȣ�� (����~ ���ݱ����� ����)
         
         System.out.println();
        System.out.println("===================================================================");
		
        System.out.println("===================================================================");
        System.out.println("\t\t\t   ���޴��� �Ǹŷ���");
        System.out.println("===================================================================");
		System.out.printf(" %39d-%d-%d ���� ~ %d-%d-%d ����\n",year,month,date,year,month,date+TestCalendar.datePlus);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("   Coffee��\t       �Ǹŷ�");
        System.out.printf("��  ����������\t\t  %d��\n",s.saveEspresso);
        System.out.printf("��  �Ƹ޸�ī��\t\t  %d��\n",s.saveAmericano);
        System.out.printf("��  ī���\t\t  %d��\n",s.saveLatte);
        System.out.printf("��  īǪġ��\t\t  %d��\n",s.saveCappuccino);
        System.out.printf("��  ī���ī\t\t  %d��\n",s.saveCafeMoca);
        System.out.printf("��  �ٴҶ��\t\t  %d��\n",s.saveVanillaLatte);
        System.out.printf("��  ī��Ḷ���ƶ�\t  %d��\n",s.saveCaramelM);
       System.out.println();
       System.out.println("   NonCoffee��");
        System.out.printf("��  �ڸ����̵�\t\t  %d��\n",s.saveJamongAde);
        System.out.printf("��  ���Ʈ������\t  %d��\n",s.saveYogurt);
        System.out.printf("��  ����Ŀ��Ƽ\t  %d��\n",s.saveTea);
        System.out.printf("��  ������\t\t  %d��\n",s.saveGogumaLatte);
        System.out.printf("��  �������꽺\t\t  %d��\n",s.saveOrangeJuice);
       System.out.println();
       System.out.println("   Dessert��");
        System.out.printf("��  ����ũ\t\t  %d��\n",s.saveCake);
        System.out.printf("��  ��ī��\t\t  %d��\n",s.saveMacaron);
        System.out.printf("��  ����\t\t  %d��\n",s.saveScone);
        System.out.printf("��  ���̱�\t\t  %d��\n",s.saveBagel);
        System.out.printf("��  ��Ű\t\t  %d��\n",s.saveCookie);
       System.out.println("-------------------------------------------------------------------");
        System.out.println("===================================================================");
       System.out.println("\t\t\t   ���� �� �� Ȳ��");
       System.out.println("===================================================================");
        //System.out.printf("�� ��  ��  ��  ��\t  %d��%n",c.getChange());         //�Ž������� �󸶳� �ִ��� Ȯ���ϱ� ���� ��¹� 
        System.out.printf("�� ��  ��  ��  ��\t  %d��%n",m.getBill_SalesM());         // �� ���ݸ��� ���� ��¹�
        System.out.printf("�� ī  ��  ��  ��\t  %d��%n",m.getCard_SalesM());         // �� ī����� ���� ��¹�
        System.out.printf("��   ��    ��  ��\t  %d��%n",m.getBill_SalesM() + m.getCard_SalesM()); // �Ѽ��� ��¹�
        System.out.printf("�� ��  ��  ��  ��\t  %d��%n",m.getBalju_moneyM());         // �� ���ֱݾ��� ��¹�
        System.out.printf("�� ������  ��  ��\t  %d��%n",m.getBill_SalesM() + m.getCard_SalesM()-m.getBalju_moneyM());   // �� ������ �ݾ� Ȯ�� ��¹�
        System.out.println("===================================================================");
       System.out.println();
        
      }
	 
	// ������ ���� ���ư��� �޼ҵ� 
	public void sales_Inventory()	
	{
		ManagerMenu m = new ManagerMenu();

		 while (true)
		 {
			 m.menuDisp();
			 m.menuSelect();
			 m.menuRun();
		 }
	}

	// �Ǹŷ� ���� �޼ҵ�(��ä��) - �ڷᱸ�� �ʱ�ȭ �Ǳ����� ������ Ŭ�������� ȣ�� (������ ���� �Ǹŷ� ����) 
	public void sales_Cal()
	{
		Iterator it = Cafe_Menus.vCafe_Select.iterator(); //    vCafe_Select �� ����Ǿ��ִ� <Cafe_Select> Ÿ�� ��ü  
		Cafe_Menus cafe_menus =new Cafe_Menus();
		int all = 0; 
		
		while(it.hasNext())   // ��ü�� ���� ������ �ݺ�       
		{
			Object obj = it.next();   // <Cafe_Select> Ÿ�� ��ü�� �����´�
			 Cafe_Select cafe_select = (Cafe_Select)obj;
			 Sales sales = new Sales();
				 
				if(cafe_select.getCategory() == 1) //ī�װ����� 1�̶��...Ŀ��
				{

					switch(cafe_select.getMain()) 
					{
						 case 1 : sales.setSespresso(sales.getSespresso()+1); break;
								 
						 case 2 : sales.setSamericano(sales.getSamericano()+1); break;
											  
						 case 3 : sales.setSlatte(sales.getSlatte()+1); break;
							
						 case 4 : sales.setScafeMoca(sales.getScafeMoca()+1);break;
								
						 case 5 : sales.setScappuccino(sales.getScappuccino()+1);break;

						 case 6 : sales.setSvanillaLatte(sales.getSvanillaLatte()+1);break; 

						 case 7 : sales.setScaramelM(sales.getScaramelM()+1);break;
					}
					
				}else if(cafe_select.getCategory() == 2) //2������ ��Ŀ��
				{
					switch(cafe_select.getMain())
					{
						case 1 : sales.setSjamongAde(sales.getSjamongAde()+1);break; 
									
						case 2 : sales.setSyogurt(sales.getSyogurt()+1);break; 
			 
						case 3 : sales.setStea(sales.getStea()+1);break;  
 
					    case 4 : sales.setSorangeJuice(sales.getSorangeJuice()+1); break;
					
					    case 5 : sales.setSgogumaLatte(sales.getSgogumaLatte()+1); break;
					}
				}else if(cafe_select.getCategory() == 3)//3������ ����Ʈ
				{
					switch(cafe_select.getMain())
					{
						
						case 1 : sales.setScake(sales.getScake()+1); break;
								
					    case 2 : sales.setSbagel(sales.getSbagel()+1); break;
										  
					    case 3 : sales.setSscone(sales.getSscone()+1); break;
											  
					    case 4 : sales.setSmacaron(sales.getSmacaron()+1); break;
										
					    case 5 : sales.setScookie(sales.getScookie()+1); break;
								
					}
				
				}

		}// while �� end

		// ���� �Ǹŷ� ���̵��� �ؾ��� 

	}

	static int sEspresso, sAmericano, sLatte, sCafeMoca, sCappuccino, sVanillaLatte, sCaramelM;
	static int sJamongAde, sYogurt, sTea, sOrangeJuice, sGogumaLatte;
	static int sCake, sBagel, sScone, sMacaron, sCookie;

	int all;
	
	// �� �Ǹŷ� ���� ���� �޼ҵ�(���Ѻ�)	
	public void saveSales()
	{

		Sales sales = new Sales();
		Cafe_Menus.vCafe_Select.clear();


		  // �� Ŀ�Ƿ�
		all = sales.getSespresso();		// �ӽú��� = �Ϻ� �Ǹŷ� 										
		sEspresso += all;				// ���� ���� += �Ϻ� �Ǹŷ� 
		sales.saveEspresso = sEspresso;
		
		all = sales.getSamericano();   
		sAmericano += all;
		sales.saveAmericano = sAmericano;
		
		all = sales.getSlatte();
		sLatte += all;
		sales.saveLatte = sLatte;
		
		all = sales.getScafeMoca();
		sCafeMoca += all;
		sales.saveCafeMoca = sCafeMoca;
		
		all = sales.getScappuccino();
		sCappuccino += all;
		sales.saveCappuccino =sCappuccino;
		
		all = sales.getSvanillaLatte();
		sVanillaLatte += all;
		sales.saveVanillaLatte = sVanillaLatte;
		
		all = sales.getScaramelM();
		sCaramelM += all; 
		sales.saveCaramelM+=sCaramelM;
		   
		   // �� ��Ŀ�Ƿ�
		sJamongAde=sales.getSjamongAde();
		sales.saveJamongAde += sJamongAde;
		
		sYogurt=sales.getSyogurt();
		sales.saveTea+=sYogurt;
		
		sOrangeJuice=sales.getSorangeJuice();
		sales.saveOrangeJuice+=sOrangeJuice;
		
		sGogumaLatte=sales.getSgogumaLatte();
		sales.saveGogumaLatte+=sGogumaLatte;
		   
		   // �� ����Ʈ��
		sCake =sales.getScake();
		sales.saveCake+=sCake;
		
		sBagel=sales.getSbagel();
		sales.saveScone+=sScone;
		
		sMacaron=sales.getSmacaron();
		sales.saveCookie+=sMacaron;
		
	}

}


