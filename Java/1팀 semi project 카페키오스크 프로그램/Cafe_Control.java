//�� time_sales() �� Time Ŭ���� ����, today_coffee() �޼ҵ�� �Ǹŷ� class�� �����Ǿ���Ѵ�.
//sold_out() �޼ҵ��� ���, Cafe_Menus Ŭ������ inventory Ŭ������ �����Ѵ�.
//sold_out() �޼ҵ�� ����ڿ��� SOLD OUT�� �˸��� ��ɱ��� ������.(��� ǰ�� �� �߰��ؾ���)
//sold_out() �޼ҵ尡 ���� Cafe_Control Ŭ�������� SOLD OUT �޴� �ֹ��� ���� �ϴ� ����� ����ؾ���...

import java.util.TreeSet;
import java.util.Iterator;

// �޴� ���ÿ��� ���Ǵ� ��� Ŭ����
class Cafe_Control	
{
	String todayMenu;
	public int[] todaynum = {1,2,3,4,5,6,7}; //� Ŀ�Ǹ� ���״��� Ȯ���ϱ� ���� Ŀ���� ������ȣ�� ����
											//���������� 1�� �Ƹ޸�ī�� 2��...��� Ŭ���������� ������ ��ȣ
   
   // ���� Ŀ�� ���� �޼ҵ�(������)
   public void today_coffee()
   {
      Sales s = new Sales();//�Ǹŷ� Ŭ���� �ν��Ͻ� ����
      
      int[] num = {s.getSespresso(),s.getSamericano(),s.getSlatte(),s.getScafeMoca(),s.getScappuccino(),s.getSvanillaLatte(),s.getScaramelM()};
      //�迭 num�� �� Ŀ���� �Ǹŷ����� ����
      //���� ��� {7,6,5,4,3,2,1} �̷��� ���

      String menu[] = {"����������","�Ƹ޸�ī��","ī���","ī���ī","īǪġ��","�ٴҶ��","ī����"};
      //�Ǹŷ� ���� num�� ���Ŷ� menu �̸��� ����
      //num0������ menu[0],num[1] =menu[1] ...

      //���ڹ迭�� ���� ���� 
      String temp;

      //�Ǹŷ��� �ڸ��� �ٲ�ٸ� �޴��� �ڸ��� �ٲ��� ��
      for(int i=0;i<num.length-1;i++) //0 1 2 3 ...���� 
      {

         for(int j=i+1;j<num.length;j++) //�񱳴�� 1234567 234567 34567 4567
         {
            if(num[i]>num[j])
            {
               num[i] = num[i] ^ num[j];
               num[j] = num[j] ^ num[i];
               num[i] = num[i] ^ num[j];

               
               temp = menu[i];
               menu[i] = menu[j];
               menu[j] = temp;  

			   todaynum[i] = todaynum[i] ^ todaynum[j];
               todaynum[j] = todaynum[j] ^ todaynum[i];
               todaynum[i] = todaynum[i] ^ todaynum[j];
            }      
               
         }
      }
      
      //���� Ŀ�� ���� �޴� ��������
       todayMenu = menu[0]; //�޴� 0����(�Ǹŷ��� ���� ���� ��)�� ���� Ŀ�� ���� �޴� ������ ����
	
 }

	public void today_coffee_print()
   {	
	  today_coffee();
      //���� �Ǹŷ��� �Ȱ��ٸ� �׳� �޴� ���� �� ù��°�� �ִ°� ���� Ŀ�� ���� �޴���
	  System.out.println("-------------------------------------------------------------------");
      System.out.println("                     ���� Ŀ�� ���� : " + todayMenu+"                 ");
	 
    }
	

	// Sold Out  �޼ҵ� - ��� ����
	// Inventory Ŭ����, Cafe_Menus Ŭ������ �����Ǿ� ���ȴ�.
	// �� ���� ��ᰡ SOLD OUT�� �Ǿ��� ��, �ߺ��Ǵ� SOLD OUT �޴��� �־� ����� �ߺ��ȴ�.
	// �� �ߺ��� ������� �ʴ� TreeSet �ڷᱸ���� ����غ��ϴ�
	////////////////////////////////////////////////////////////////////
	// �ڷᱸ�� TreeSet ���� (�������� so_out �� Sold Out Menus ��� ��)
	static TreeSet<String> so_menus = new TreeSet<String>();
	
	// sold out ���� �޼ҵ�(���: ���Ѻ�, ����: ��ä��)
	void sold_out()
	{
		// Inventory �ν��Ͻ� ����
		Inventory inventory = new Inventory();
		
		// �κ��丮�� bean ������ ���� 0�϶�
		if(inventory.getNbean()==0)
		{
			// sold out ǥ��
			// ���ΰ� �� ��� ����
			// Sold out bean �� ���ΰ� ���� �� SOLD OUT ó���Ǵ� �����
			String[] so_bean = {" ����������        ", 
								" �Ƹ޸�ī��        ", 
								" ī���          ", 
								" ī���ī          ", 
								" īǪġ��          ", 
								" �ٴҶ��        ", 
								" ī��Ḷ���ƶ�    "};
			
			// �迭�� �ݺ����� �̿��� so_menus TreeSet �ڷᱸ���� ���ϱ�
			for (String i:so_bean)
			{
				so_menus.add(i);
			}

			//Test�� ��� TreeSet�� ����غ��� �� Ȯ�� �Ϸ�!
			/*
			for (String Test: so_menus)
			{
				System.out.println(Test);
			}
			*/
			
		}
		
		
		// �κ��丮�� milk ������ ���� 0�϶� 
		if(inventory.getNmilk() == 0)
		{
			// sold out ǥ��
			// ������ �� ��� ����
			String[] so_milk = {" ī���          ", 
								" ī���ī          ",
								" īǪġ��          ", 
								" �ٴҶ��        ", 
								" ī��Ḷ���ƶ�    ",
								" ������        "};
								
			// �迭�� �ݺ����� �̿��� so_menus TreeSet �ڷᱸ���� ���ϱ�
			for (String i:so_milk)
			{
				so_menus.add(i);
			}
			
		}
		
			

		// �κ��丮�� choco ������ ���� 0�϶� 
		if(inventory.getNchoco()==0)
		{
			
			String[] so_choco =  {" ī���ī          "};
								//" ī��Ḷ���ƶ�    "
			// �迭�� �ݺ����� �̿��� so_menus �ڷᱸ���� ���ϱ�
			for (String i:so_choco)
			{
				so_menus.add(i);
			}
		}
		

		if(inventory.getNvanilla()==0)
		{
			String[] so_vanilla =  {" �ٴҶ�÷� �߰�   "};
								  //" ī��Ḷ���ƶ�    "
			// �迭�� �ݺ����� �̿��� so_menus �ڷᱸ���� ���ϱ�
			for (String i:so_vanilla)
			{
				so_menus.add(i);
			}
		}

	

		if(inventory.getNhazel()==0)
		{
			String[] so_hazel =  {" ������� �÷� �߰�"};
								//" ī��Ḷ���ƶ�    "
			// �迭�� �ݺ����� �̿��� so_menus �ڷᱸ���� ���ϱ�
			for (String i:so_hazel)
			{
				so_menus.add(i);
			}
		}
		
		

		if(inventory.getNcaramel()==0)
		{
			String[] so_caramel =  {" ī��Ḷ���ƶ�    "
								   ," ī��� �÷� �߰�  "};
								  //" ī��Ḷ���ƶ�    "
			// �迭�� �ݺ����� �̿��� so_menus �ڷᱸ���� ���ϱ�
			for (String i:so_caramel)
			{
				so_menus.add(i);
			}
		}
		
		

		if(inventory.getNgrapefruit()==0||inventory.getNspawater()==0)
		{
			String[] so_grapefruit =  {" �ڸ����̵�        "};
									 //" ī��Ḷ���ƶ�    "
			// �迭�� �ݺ����� �̿��� so_menus �ڷᱸ���� ���ϱ�
			for (String i:so_grapefruit)
			{
				so_menus.add(i);
			}
		}
		
		

		if(inventory.getNyogurtpowder()==0)
		{
			String[] so_yogurtpowder =  {" ���Ʈ������      "};
									   //" ī��Ḷ���ƶ�    "
			// �迭�� �ݺ����� �̿��� so_menus �ڷᱸ���� ���ϱ�
			for (String i:so_yogurtpowder)
			{
				so_menus.add(i);
			}
		}
		

		
		if(inventory.getNteabag()==0)
		{
			String[] so_teabag =  {" ����Ŀ��Ƽ      "};
								// " ī��Ḷ���ƶ�    "
			// �迭�� �ݺ����� �̿��� so_menus �ڷᱸ���� ���ϱ�
			for (String i:so_teabag)
			{
				so_menus.add(i);
			}
		}
		

		if(inventory.getNgoguma()==0)
		{
			String[] so_goguma =  {" ������        "};
								 //" ī��Ḷ���ƶ�    "
			// �迭�� �ݺ����� �̿��� so_menus �ڷᱸ���� ���ϱ�
			for (String i:so_goguma)
			{
				so_menus.add(i);
			}
		}
		

		if(inventory.getNorange()==0)
		{
			String[] so_orange =  {" �������ֽ�        "};
								 //" ī��Ḷ���ƶ�    "
			// �迭�� �ݺ����� �̿��� so_menus �ڷᱸ���� ���ϱ�
			for (String i:so_orange)
			{
				so_menus.add(i);
			}
		}
		

		if(inventory.getNcake()==0)
		{
			String[] so_cake =  {" ����ũ            "};
							   //" ī��Ḷ���ƶ�    "
			// �迭�� �ݺ����� �̿��� so_menus �ڷᱸ���� ���ϱ�
			for (String i:so_cake)
			{
				so_menus.add(i);
			}
		}
		
		if(inventory.getNbagel()==0)
		{
			String[] so_bagel =  {" ���̱�            "};
							    //" ī��Ḷ���ƶ�    "
			// �迭�� �ݺ����� �̿��� so_menus �ڷᱸ���� ���ϱ�
			for (String i:so_bagel)
			{
				so_menus.add(i);
			}
		}
		

		if(inventory.getNscone()==0)
		{
			String[] so_scone =  {" ����              "};
								//" ī��Ḷ���ƶ�    "
			// �迭�� �ݺ����� �̿��� so_menus �ڷᱸ���� ���ϱ�
			for (String i:so_scone)
			{
				so_menus.add(i);
			}
		}


		if(inventory.getNmacaron()==0)
		{
		
			String[] so_macaron =  {" ��ī��            "};
								  //" ī��Ḷ���ƶ�    "
			// �迭�� �ݺ����� �̿��� so_menus �ڷᱸ���� ���ϱ�
			for (String i:so_macaron)
			{
				so_menus.add(i);
			}
		}
		

		if(inventory.getNstroberryjam()==0)
		{
			String[] so_stroberryjam =   {" ������            "};
									    //" ī��Ḷ���ƶ�    "
			// �迭�� �ݺ����� �̿��� so_menus �ڷᱸ���� ���ϱ�
			for (String i:so_stroberryjam)
			{
				so_menus.add(i);
			}
		}
	

		if(inventory.getNcreamcheese()==0)
		{
			String[] so_creamcheese =  {" ũ��ġ��          "};
									  //" ī��Ḷ���ƶ�    "
			// �迭�� �ݺ����� �̿��� so_menus �ڷᱸ���� ���ϱ�
			for (String i:so_creamcheese)
			{
				so_menus.add(i);
			}
		}
		

		if(inventory.getNwhipcream()==0)
		{
			String[] so_whipcream =  {" ����ũ�� �߰�     "};
									//" ī��Ḷ���ƶ�    "
			// �迭�� �ݺ����� �̿��� so_menus �ڷᱸ���� ���ϱ�
			for (String i:so_whipcream)
			{
				so_menus.add(i);
			}
		}
	
	
			
	}// sold_out() ����
	
	
	// SOLD OUT ����� ���� �޼ҵ�(���Ѻ�)
	void so_print()	
	{
		Cafe_Control c = new Cafe_Control();
		c.sold_out();
		
		// Iterator�� ���� ����غ���
		Iterator<String> it = so_menus.iterator();
		
		// �ش� ��¹��� SOLD OUT ���ᰡ ���� ��츸 ��µȴ�.
		// ��, so_menus TreeSet �ڷᱸ���� ������� ��쿡�� ��µȴ�.
		if(so_menus.isEmpty()!=true)	// isEmpty()�� �ڷᱸ���� ����ִ��� �ƴ��� boolean���� ��ȯ�Ѵ�.
		{
			System.out.println("                          SOLD OUT (�ֹ� �Ұ�)       ");
			System.out.println("-------------------------------------------------------------------");
		
		
			int i=1;
			// Iterator�� ����ϱ� ���� while �ݺ���
			while(it.hasNext())
			{
				System.out.print("    " + it.next());
				if(i%3==0)
				{	System.out.println();
					System.out.println();
				}
					
				i++;
			}
			System.out.println();
			System.out.println("===================================================================");
		
			so_menus.clear(); // �ڷᱸ�� �ʱ�ȭ 

		}
		
	} 	//so_print() ����	

}