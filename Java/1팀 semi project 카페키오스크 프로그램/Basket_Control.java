

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// ��ٱ��� ��� Ŭ����(������)
class Basket_Control
{

    String menu;//menu �θ� �� �� ����
    String hiop;//�� ���̽� �θ� �� �� ����
    String option; //�ɼ� �θ� �� �� ����
   // Cafe_Select Ŭ���� ��ü ����

   public void print()
   {
       System.out.println("===================================================================");
	  System.out.println("                               �� �� �� ��                        |");
	  System.out.println("===================================================================");
	  System.out.println("     ���� �� ����Ʈ     |        HOT/ICE         |      �ɼ�      |");
	  System.out.println("-------------------------------------------------------------------");

      Iterator it = Cafe_Menus.vCafe_Select.iterator(); //    vCafe_Select �� ����Ǿ��ִ� <Cafe_Select> Ÿ�� ��ü  
      Cafe_Menus cafe_menus = new Cafe_Menus();

      Pay_Control pay_control = new Pay_Control();
      pay_control.pay();
      
      Scanner sc = new Scanner(System.in);

      while(it.hasNext())   // ��ü�� ���� ������ �ݺ�   
      {
         Object obj = it.next();   // <Cafe_Select> Ÿ�� ��ü�� �����´�
         Cafe_Select cafe_select = (Cafe_Select)obj;

         //cafe_select.getMain();   // ��ٱ��Ͽ� ��� �޴� �� 
         //cafe_select.getHiop();   // ��ٱ��Ͽ� ��� HOT/ICE �ɼ� ��
         //cafe_select.getOP();   // ��ٱ��Ͽ� ��� �߰� �ɼ� �� 

      
         if(cafe_select.getCategory() == 1) //ī�װ����� 1�϶� �� Ŀ��
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
				   				
               
               }

               switch(cafe_select.getHiop())
               {
                   case 1 : hiop = "          HOT           |";	break;

                   case 2 : hiop = "          ICE           |";break;
					
               }

               switch(cafe_select.getOp())
               {
                 case 1 : option = "      ����      |"; break;
								
                 case 2 : option = "       ��       |"; break;
                       
                 case 3 : option = "   �ٴҶ�÷�   |"; break;
                           
                 case 4 : option = "    ���ڽ÷�    |" ;break;
                           
                 case 5 : option = "  ������ӽ÷�  |"; break;
                           
                 case 6 : option = "   ����ũ��     |"; break;
                           
               }

            }

            else if(cafe_select.getCategory() == 2) //2�� ��Ŀ��
            {
				cafe_select.setHiop(0);
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
				cafe_select.setHiop(0); 

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
       
		
         
      }//while�� end 
        
 
	 Pay_Select pay_select = new  Pay_Select();
	 pay_select.menuDisp();
	

   }
 

}