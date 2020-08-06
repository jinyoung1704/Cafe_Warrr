

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// 장바구니 출력 클래스(전진영)
class Basket_Control
{

    String menu;//menu 부를 때 쓸 변수
    String hiop;//핫 아이스 부를 때 쓸 변수
    String option; //옵션 부를 때 쓸 변수
   // Cafe_Select 클래스 객체 생성

   public void print()
   {
       System.out.println("===================================================================");
	  System.out.println("                               장 바 구 니                        |");
	  System.out.println("===================================================================");
	  System.out.println("     음료 및 디저트     |        HOT/ICE         |      옵션      |");
	  System.out.println("-------------------------------------------------------------------");

      Iterator it = Cafe_Menus.vCafe_Select.iterator(); //    vCafe_Select 에 저장되어있는 <Cafe_Select> 타입 객체  
      Cafe_Menus cafe_menus = new Cafe_Menus();

      Pay_Control pay_control = new Pay_Control();
      pay_control.pay();
      
      Scanner sc = new Scanner(System.in);

      while(it.hasNext())   // 객체가 없을 때까지 반복   
      {
         Object obj = it.next();   // <Cafe_Select> 타입 객체를 가져온다
         Cafe_Select cafe_select = (Cafe_Select)obj;

         //cafe_select.getMain();   // 장바구니에 담긴 메뉴 값 
         //cafe_select.getHiop();   // 장바구니에 담긴 HOT/ICE 옵션 값
         //cafe_select.getOP();   // 장바구니에 담긴 추가 옵션 값 

      
         if(cafe_select.getCategory() == 1) //카테고리값이 1일때 → 커피
            {
	
               switch(cafe_select.getMain()) 
               {
                   case 1 : menu = "     에스프레소         |"; break;
                         
                   case 2 : menu = "     아메리카노         |"; break;
                                            
                   case 3 : menu = "     카페라떼           |"; break;
                            
                   case 4 : menu = "     카페모카           |"; break;       
                        
                   case 5 : menu = "     카푸치노           |"; break;
                         
                   case 6 : menu = "     바닐라라떼         |"; break;
      
                   case 7 : menu = "     카라멜마끼아또     |"; break;
				   				
               
               }

               switch(cafe_select.getHiop())
               {
                   case 1 : hiop = "          HOT           |";	break;

                   case 2 : hiop = "          ICE           |";break;
					
               }

               switch(cafe_select.getOp())
               {
                 case 1 : option = "      없음      |"; break;
								
                 case 2 : option = "       샷       |"; break;
                       
                 case 3 : option = "   바닐라시럽   |"; break;
                           
                 case 4 : option = "    초코시럽    |" ;break;
                           
                 case 5 : option = "  헤이즐넛시럽  |"; break;
                           
                 case 6 : option = "   휘핑크림     |"; break;
                           
               }

            }

            else if(cafe_select.getCategory() == 2) //2번 논커피
            {
				cafe_select.setHiop(0);
				cafe_select.setOp(0);

               switch(cafe_select.getMain())
               {
                  case 1 : menu = "     자몽에이드         |"; 
				  	if(cafe_select.getHiop() == 0) 
						hiop = "          ICE           |";	break;
                            
                     
                  case 2 :menu = "     요거트스무디       |";
					 if(cafe_select.getHiop() == 0) 
						hiop = "          ICE           |";	break;
                                
                               
                  case 3 :menu = "     히비스커스티       |";
                      if(cafe_select.getHiop() == 0) 
						hiop = "          HOT           |";	 break;
                       
                   case 4 :menu = "     오렌지쥬스         |"; 
					   if(cafe_select.getHiop() == 0) 
							hiop = "          ICE           |";	break;
                         
                           
                   case 5 :menu = "     고구마라떼         |";
					   if(cafe_select.getHiop() == 0) 
							hiop = "          HOT           |";	break;
					
               }

			 

			    switch(cafe_select.getOp())
               {
				 
                  case 0 : option ="                |";break;
                  
               }
               
            }

            else if(cafe_select.getCategory() == 3)//3번 디저트
            {
				cafe_select.setHiop(0); 

               switch(cafe_select.getMain())
               {
                  
                  case 1 : menu ="     케이크             |" ; break;
                        
                   case 2 : menu ="     베이글             |"; break;
                                
                   case 3 : menu ="     스콘               |"; break;
                                   
                   case 4 : menu ="     마카롱             |"; break;
                              
                   case 5 : menu ="     쿠키               |"; break;
                        
               }

			    switch(cafe_select.getHiop())
               {
                  case 0 : hiop = "                        |";	break;
					
               }
               
                  
               switch(cafe_select.getOp())
               {
				 
                  case 1 : option = "    선택안함    |";break;

                  case 2 : option = "    크림치즈    |";break;
               
                  case 3 : option = "     딸기잼     |";break;
                  
               }
                
            }

         if(hiop==null)
            hiop = "                        |";

         if(option==null)
            option = "                |";
         
		//cafe_select.setOp(0);
		//cafe_select.setHiop(0);

         System.out.printf("%s%s%s%n",menu,hiop,option); 
       
		
         
      }//while문 end 
        
 
	 Pay_Select pay_select = new  Pay_Select();
	 pay_select.menuDisp();
	

   }
 

}