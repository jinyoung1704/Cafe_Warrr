

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

// ������ ��� Ŭ����(��ä��, ���Ѻ�)
class Receipt extends Stamp	// Stamp Ŭ������ ��ӹ޴´�
{
	// �湮�� �մ� �� �� �մ��� ������ ������ 1�� �����ϴ� ���� ��� ����
	// �մ��� ������ �����̹Ƿ� ���� class���� �մԼ��� count �ؾ��� �� ����
	// payControl.getCostomer() �� Pay_Control Ŭ������ costomer ī��Ʈ���� ��Ƶ״�. �����ͼ� ��.
	
	private static int customer;	// �Ϸ� �湮 �մ� ���� �����ϴ� ���� 
	public void setCustomer(int costomer)
	{
	this.customer = costomer;
	}
	public int getCustomer()
	{
	return customer;
	}
	
	 String menu;//menu �θ� �� �� ����
	 String hiop;//�� ���̽� �θ� �� �� ����
	 String option; //�ɼ� �θ� �� �� ����
	
	
	// �̺�Ʈ ��÷ ���θ� Ȯ�����ִ� ���.
	boolean flagDang = false;
	
	// �����̺�Ʈ �޼ҵ� �� Random Ŭ������ import�ؼ� ������ �߻���Ų��.
	// Random Ŭ���� �ν��Ͻ� ����
	Random random = new Random();
	
	// dang�� �����߻��ϴ� ��÷��ȣ
	// dang�� 0���� 99 �� ����
	int dang=random.nextInt(100);
	// ���� ���� Ȯ�� Test
	//System.out.println(dang);
	
	
	// �� �ϼ��� �޼ҵ�
	void random()	// ���� �̺�Ʈ ��� �޼ҵ�
	{

		
		// Test�� ���� ù �մ��� ������ ��÷�Ǵ� ����(getCostomer()==0)���� ����
		// ������... if(getCostomer()==dang)
		if (getCustomer()==1)
		{	
			System.out.println("===================================================================");
			System.out.println("            �ءء� �̺�Ʈ�� ��÷�Ǽ̽��ϴ١ءء�                   ");
			System.out.println();
			System.out.println("                �̺�Ʈ ������ 10���� �����մϴ�                    ");
			flagDang = true;
			System.out.println("===================================================================");

			// ����ڰ� �Է��� ����ȣ�� hashMap �ڷᱸ���� ����ִ��� Ȯ��
			System.out.println();
			System.out.print("�޴��� ��ȣ�� �Է����ּ��� ('-' ����) : ");
			// ��ĳ�� �ν��Ͻ� ����
			Scanner sc = new Scanner(System.in);
			// phone ������ ����� �Է� �޴�����ȣ ���
			phone = sc.next();
			System.out.println();
			//System.out.println("===================================================================");
			
			// Test�� ���� �̸� ��ȣ�� ���
			hashMap.put("01030026023", 10);
			hashMap.put(phone, stamp);	

				
				if(hashMap.containsKey(phone)==true)
				{
					// ������ �߰�....
					stamp = hashMap.get(phone)+10;	// ���� �������� 10�� �߰�!
					hashMap.put(phone, stamp);			// ���ο� ������ ���� hashMap�� �ٽ� ������ش�.
					// ��ϵǾ��ִ� ��ȣ ������ �߰��ƴ��� Test ��Ȯ��! 
					//System.out.println(hashMap.get(phone));
					
					System.out.println();
					System.out.println("========================= ���� ������ ===========================>> ");
					System.out.println();
					//System.out.println("                 ��÷ ������ 10���� �����Ǿ����ϴ�                  ");
					//System.out.println();
					//System.out.println(" " + phone+"�� ������ ������ : "+hashMap.get(phone)+"��");
					System.out.println();
					
					// ������ ��� �޼ҵ� ȣ��
					print();
				}
				
				else
				{	
					System.out.println("========================= ���� ������ ===========================>> ");
					System.out.println();
					System.out.println(" �޴��� ��ȣ�� ��ϵǾ� ���� �ʽ��ϴ�.");
					System.out.println();
					System.out.print(" �޴��� ��ȣ�� ����Ͻðڽ��ϱ�? (Y/N) : ");
					String yon=sc.next();
					
					if(yon.equals("Y")||yon.equals("y"))
					{
						do
						{	
							System.out.println();
							System.out.print(" �������� ������ �޴�����ȣ�� �Է����ּ���('-' ����) : ");
							phone = sc.next();
							
						}
						while(phone.length()!=11);
						// ���Ӱ� ����� �޴��� ��ȣ�� 10���� �������� �����Ѵ�.
						// ������ �߰�....
						// ���ο� ��� ��ȣ�� ������, static ������ �ƴ� �ν��Ͻ� ���� 'stamp'�� ��´�.
						int stamp = 10;	// ���� �������� 10�� �߰�
						
						hashMap.put(phone, stamp);			// ���ο� ������ ���� hashMap�� �ٽ� ������ش�.
						
						// �� ��ȣ�� ������ 10���� �� �����ƴ��� Test �� OK!
						//System.out.println(hashMap.get(phone));	

						System.out.println();
						System.out.println();
						
						// ������ ��� �޼ҵ� ȣ��
						print();
					}
					else
					{
						System.out.println();
						print();
					}
				
				
				
				 

				}

		}
		else
		{
			print();
		}
		

		
	} // random() ��
	
	// ������ ��� �޼ҵ�(��ä��)
	void print()
	{
		// �ʿ��� ���
		// ���� ��¥, ������ ���θ޴�, �ɼ�, �ܼ�, ����, �������� ��� �޴�����ȣ		
		// �� ��ٱ��� ��� �޼ҵ带 ������ ����.
		
		// �մԼ� �����ϴ� �ڵ�
		// costomer �� 1 ����
		// ���� costomerP�� ������ �Ϸ��� ��, 1�� ������ ���ο� costomer ����.
		int customerP = getCustomer()+1;
		// ���ο� costomer ���� setCostomer() �޼ҵ带 ����
		// static costomer�� �����Ѵ�.
		setCustomer(customerP);

	 String menu = null;//menu �θ� �� �� ����
	 String hiop=null ;//�� ���̽� �θ� �� �� ����
	 String option=null ; //�ɼ� �θ� �� �� ����

	  System.out.println("===================================================================");
	  System.out.printf(" \t                          00%d                       \n",getCustomer());
	  System.out.println("-------------------------------------------------------------------");
	  System.out.println("                                 ������                            ");
	  System.out.println("===================================================================");
	  System.out.println("     ���� �� ����Ʈ     |        HOT/ICE         |      �ɼ�      |");
	  System.out.println("-------------------------------------------------------------------");

      Iterator it = Cafe_Menus.vCafe_Select.iterator(); //    vCafe_Select �� ����Ǿ��ִ� <Cafe_Select> Ÿ�� ��ü  
      Cafe_Menus cafe_menus = new Cafe_Menus();

      Pay_Control pay_control = new Pay_Control();
      pay_control.pay();
	 
      
      Scanner sc = new Scanner(System.in);

      while(it.hasNext())   // ��ü�� ���� ������ �ݺ�    it.hasNext()      
      {
         Object obj = it.next();   // <Cafe_Select> Ÿ�� ��ü�� �����´�
         Cafe_Select cafe_select = (Cafe_Select)obj;

         //cafe_select.getMain();   // ��ٱ��Ͽ� ��� �޴� �� 
         //cafe_select.getHiop();   // ��ٱ��Ͽ� ��� HOT/ICE �ɼ� ��
         //cafe_select.getOP();   // ��ٱ��Ͽ� ��� �߰� �ɼ� �� 

      
         if(cafe_select.getCategory() == 1) //ī�װ����� 1�̶��...Ŀ��
            {
	
               switch(cafe_select.getMain()) 
               {
                   case 1 : menu = "     ����������         |"; break;
                         
                   case 2 : menu = "     �Ƹ޸�ī��         |"; break;
                                            
                   case 3 : menu = "     ī���           |"; break;
                            
                   case 4 : menu = "     ī���ī           |"; break;       
                        
                   case 5 : menu = "     īǪġ��           |"; break;
                         
                   case 6 : menu = "     �ٴҶ��         |"; break;
      
                   case 7 : menu = "     ī��Ḷ���ƶ�     |"; break;
				   				 //|    ���� �� ����Ʈ      |
               
               }

               switch(cafe_select.getHiop())
               {
                   case 1 : hiop = "          HOT           |";	break;

                   case 2 : hiop = "          ICE           |";break;
								  //|        HOT/ICE        |
               }

               switch(cafe_select.getOp())
               {
                 case 1 : option = "      ����      |"; break;
								 //|      �ɼ�      |
                 case 2 : option = "       ��       |"; break;
                       
                 case 3 : option = "   �ٴҶ�÷�   |"; break;
                           
                 case 4 : option = "    ���ڽ÷�    |" ;break;
                           
                 case 5 : option = "  ������ӽ÷�  |"; break;
                           
                 case 6 : option = "   ����ũ��     |"; break;
                           
               }

            }

            else if(cafe_select.getCategory() == 2) //2�� ��Ŀ��
            {
				cafe_select.setHiop(0);//�׽�Ʈ
				cafe_select.setOp(0);

               switch(cafe_select.getMain())
               {
                  case 1 : menu = "     �ڸ����̵�         |"; 
				  	if(cafe_select.getHiop() == 0) 
						hiop = "          ICE           |";	break;
                            
                     
                  case 2 :menu = "     ���Ʈ������       |";
					 if(cafe_select.getHiop() == 0) 
						hiop = "          ICE           |";	break;
                                
                               
                  case 3 :menu = "     ����Ŀ��Ƽ       |";
                      if(cafe_select.getHiop() == 0) 
						hiop = "          HOT           |";	 break;
                       
                   case 4 :menu = "     �������꽺         |"; 
					   if(cafe_select.getHiop() == 0) 
							hiop = "          ICE           |";	break;
                         
                           
                   case 5 :menu = "     ������         |";
					   if(cafe_select.getHiop() == 0) 
							hiop = "          HOT           |";	break;
					
               }

			 

			    switch(cafe_select.getOp())
               {
				 
                  case 0 : option ="                |";break;
                  
               }
               
            }

            else if(cafe_select.getCategory() == 3)//3�� ����Ʈ
            {
				cafe_select.setHiop(0); //�׽�Ʈ
               switch(cafe_select.getMain())
               {
                  
                  case 1 : menu ="     ����ũ             |" ; break;
                        
                   case 2 : menu ="     ���̱�             |"; break;
                                
                   case 3 : menu ="     ����               |"; break;
                                   
                   case 4 : menu ="     ��ī��             |"; break;
                              
                   case 5 : menu ="     ��Ű               |"; break;
                        
               }

			    switch(cafe_select.getHiop())
               {
                  case 0 : hiop = "                        |";	break;
					
               }
               
                  
               switch(cafe_select.getOp())
               {
				 
                  case 1 : option = "    ���þ���    |";break;

                  case 2 : option = "    ũ��ġ��    |";break;
               
                  case 3 : option = "     ������     |";break;
                  
               }
                
            }

         if(hiop==null)
            hiop = "                        |";

         if(option==null)
            option = "                |";
         
		//cafe_select.setOp(0);
		//cafe_select.setHiop(0);

         System.out.printf("%s%s%s%n",menu,hiop,option); 
       
	   // �׽�Ʈ�� ���� �־ ���� - �־�� �� 
		
         
      }//while�� end 
		     
		 System.out.println("-------------------------------------------------------------------");
	     System.out.printf (" ���� �ݾ� : %d��                      \n", Pay_Control.allPay);
	     

		// �̺�Ʈ ��÷ ����(flagDang ������ ���� if�� ����)
		//���� ������ ����(��ϵ� �մ��� ��쿡�� ���)
		if(hashMap.containsKey(phone)==true)
		{
			if(flagDang==true)
			{
				System.out.println("=================================================================== ");
				System.out.println("           �ءء� ��÷ ������ 10���� �����Ǿ����ϴ� �ءء�          ");  
				
			}
			
			System.out.println("������ ������ �޴��� ��ȣ : " + phone);
			System.out.println("������ ������ ���� : "+hashMap.get(phone));
		}
		// ����ũ�ƿ� ����
		if(Takeout.sel==2)
		{	
			System.out.println("--------------------------------------------------------------------");
			System.out.println(" ����ũ�ƿ��� �����ϼ̽��ϴ�.                            ");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("                 �����մϴ�. ���� �Ϸ� ��������.                    ");
			System.out.println("=================================================================== ");
			System.out.println("                             - end -                                ");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		
		}
		else

		{	
			System.out.println("--------------------------------------------------------------------");
			System.out.println(" ���� �Ļ縦 �����ϼ̽��ϴ�.                           ");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("                  �����մϴ�. ���� �Ϸ� ��������.                   ");
			System.out.println("=================================================================== ");
			System.out.println("                             - end -                                ");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();

		
		}
		
		//�������� ��� �޴�����ȣ
		
		//////////��ġ Ȯ��///////////
		I_minus i_minus = new I_minus();
		Inven_Control inven_control = new Inven_Control();
		Sales_Control sales_control = new Sales_Control();

		
		 // �Ϻ� �Ǹŷ� ������Ű�� �޼ҵ� - ������ ����  
	      sales_control.sales_Cal();  

		 //  �Ϻ� �Ǹŷ� �ʱ�ȭ 
		 TestCalendar tc =new TestCalendar();
		// tc.resetSales();// �Ϻ� �Ǹŷ� �ʱ�ȭ - ���� �ƴ�
		
		
		// ��� ���̳ʽ� ��Ű�� �޼ҵ�
		i_minus.invenMinus();					// ���� ��ġ Ȯ��@@ �ǵ帮�� �ȵȴ�  
		//inven_control.totalInventory();		// Ȯ���ϱ� ���� �׽�Ʈ ��ġ
		

		// ���� �ݾװ� �ڷᱸ�� �ʱ�ȭ��Ű�� �޼ҵ�
		Pay_Control.allPay = 0; 
		Cafe_Menus.vCafe_Select.clear();

		// �մ� �� ������Ű�� �޼ҵ�(2���� �Ǹ� ��¥ �ٲٰ� 0���� �ʱ�ȭ)
		tc.calendar();

		// �ٽ� ó���� �޴��� ���ư���
		Cafe_Menus start = new Cafe_Menus();
		start.firPrint();
		
	}
	
	// Test���� main �޼ҵ�
	/*
	public static void main(String[] args)
	{
		Receipt test = new Receipt();
		test.random();
	}
	*/
	
	
}