

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

// 영수증 출력 클래스(이채빈, 주한별)
class Receipt extends Stamp	// Stamp 클래스를 상속받는다
{
	// 방문한 손님 수 → 손님이 결제할 때마다 1씩 증가하는 값을 담는 변수
	// 손님의 기준은 결제이므로 결제 class에서 손님수를 count 해야할 것 같다
	// payControl.getCostomer() → Pay_Control 클래스에 costomer 카운트값을 담아뒀다. 가져와서 씀.
	
	private static int customer;	// 하루 방문 손님 수를 저장하는 변수 
	public void setCustomer(int costomer)
	{
	this.customer = costomer;
	}
	public int getCustomer()
	{
	return customer;
	}
	
	 String menu;//menu 부를 때 쓸 변수
	 String hiop;//핫 아이스 부를 때 쓸 변수
	 String option; //옵션 부를 때 쓸 변수
	
	
	// 이벤트 당첨 여부를 확인해주는 깃발.
	boolean flagDang = false;
	
	// 랜덤이벤트 메소드 → Random 클래스를 import해서 난수를 발생시킨다.
	// Random 클래스 인스턴스 생성
	Random random = new Random();
	
	// dang은 랜덤발생하는 당첨번호
	// dang은 0부터 99 중 랜덤
	int dang=random.nextInt(100);
	// 난수 생성 확인 Test
	//System.out.println(dang);
	
	
	// ※ 완성된 메소드
	void random()	// 랜덤 이벤트 기능 메소드
	{

		
		// Test를 위해 첫 손님은 무조건 당첨되는 조건(getCostomer()==0)으로 설정
		// 원래는... if(getCostomer()==dang)
		if (getCustomer()==1)
		{	
			System.out.println("===================================================================");
			System.out.println("            ※※※ 이벤트에 당첨되셨습니다※※※                   ");
			System.out.println();
			System.out.println("                이벤트 스탬프 10개를 적립합니다                    ");
			flagDang = true;
			System.out.println("===================================================================");

			// 사용자가 입력한 폰번호가 hashMap 자료구조에 담겨있는지 확인
			System.out.println();
			System.out.print("휴대폰 번호를 입력해주세요 ('-' 생략) : ");
			// 스캐너 인스턴스 생성
			Scanner sc = new Scanner(System.in);
			// phone 변수에 사용자 입력 휴대폰번호 담기
			phone = sc.next();
			System.out.println();
			//System.out.println("===================================================================");
			
			// Test를 위해 미리 번호를 등록
			hashMap.put("01030026023", 10);
			hashMap.put(phone, stamp);	

				
				if(hashMap.containsKey(phone)==true)
				{
					// 스탬프 추가....
					stamp = hashMap.get(phone)+10;	// 기존 스탬프에 10개 추가!
					hashMap.put(phone, stamp);			// 새로운 스탬프 값을 hashMap에 다시 등록해준다.
					// 등록되어있는 번호 스탬프 추가됐는지 Test →확인! 
					//System.out.println(hashMap.get(phone));
					
					System.out.println();
					System.out.println("========================= 적립 진행중 ===========================>> ");
					System.out.println();
					//System.out.println("                 당첨 스탬프 10개가 적립되었습니다                  ");
					//System.out.println();
					//System.out.println(" " + phone+"가 소유한 스탬프 : "+hashMap.get(phone)+"개");
					System.out.println();
					
					// 영수증 출력 메소드 호출
					print();
				}
				
				else
				{	
					System.out.println("========================= 적립 진행중 ===========================>> ");
					System.out.println();
					System.out.println(" 휴대폰 번호가 등록되어 있지 않습니다.");
					System.out.println();
					System.out.print(" 휴대폰 번호를 등록하시겠습니까? (Y/N) : ");
					String yon=sc.next();
					
					if(yon.equals("Y")||yon.equals("y"))
					{
						do
						{	
							System.out.println();
							System.out.print(" 스탬프를 적립할 휴대폰번호를 입력해주세요('-' 생략) : ");
							phone = sc.next();
							
						}
						while(phone.length()!=11);
						// 새롭게 등록한 휴대폰 번호에 10개의 스탬프를 적립한다.
						// 스탬프 추가....
						// 새로운 등록 번호기 때문에, static 변수가 아닌 인스턴스 변수 'stamp'에 담는다.
						int stamp = 10;	// 기존 스탬프에 10개 추가
						
						hashMap.put(phone, stamp);			// 새로운 스탬프 값을 hashMap에 다시 등록해준다.
						
						// 새 번호에 스탬프 10개가 잘 적립됐는지 Test → OK!
						//System.out.println(hashMap.get(phone));	

						System.out.println();
						System.out.println();
						
						// 영수증 출력 메소드 호출
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
		

		
	} // random() 끝
	
	// 영수증 출력 메소드(이채빈)
	void print()
	{
		// 필요한 출력
		// 오늘 날짜, 구매한 메인메뉴, 옵션, 잔수, 가격, 적립했을 경우 휴대폰번호		
		// → 장바구니 출력 메소드를 가져와 쓰자.
		
		// 손님수 누적하는 코드
		// costomer 수 1 증가
		// 변수 costomerP는 결제를 완료한 후, 1이 더해진 새로운 costomer 수다.
		int customerP = getCustomer()+1;
		// 새로운 costomer 수를 setCostomer() 메소드를 통해
		// static costomer에 저장한다.
		setCustomer(customerP);

	 String menu = null;//menu 부를 때 쓸 변수
	 String hiop=null ;//핫 아이스 부를 때 쓸 변수
	 String option=null ; //옵션 부를 때 쓸 변수

	  System.out.println("===================================================================");
	  System.out.printf(" \t                          00%d                       \n",getCustomer());
	  System.out.println("-------------------------------------------------------------------");
	  System.out.println("                                 영수증                            ");
	  System.out.println("===================================================================");
	  System.out.println("     음료 및 디저트     |        HOT/ICE         |      옵션      |");
	  System.out.println("-------------------------------------------------------------------");

      Iterator it = Cafe_Menus.vCafe_Select.iterator(); //    vCafe_Select 에 저장되어있는 <Cafe_Select> 타입 객체  
      Cafe_Menus cafe_menus = new Cafe_Menus();

      Pay_Control pay_control = new Pay_Control();
      pay_control.pay();
	 
      
      Scanner sc = new Scanner(System.in);

      while(it.hasNext())   // 객체가 없을 때까지 반복    it.hasNext()      
      {
         Object obj = it.next();   // <Cafe_Select> 타입 객체를 가져온다
         Cafe_Select cafe_select = (Cafe_Select)obj;

         //cafe_select.getMain();   // 장바구니에 담긴 메뉴 값 
         //cafe_select.getHiop();   // 장바구니에 담긴 HOT/ICE 옵션 값
         //cafe_select.getOP();   // 장바구니에 담긴 추가 옵션 값 

      
         if(cafe_select.getCategory() == 1) //카테고리값이 1이라면...커피
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
				   				 //|    음료 및 디저트      |
               
               }

               switch(cafe_select.getHiop())
               {
                   case 1 : hiop = "          HOT           |";	break;

                   case 2 : hiop = "          ICE           |";break;
								  //|        HOT/ICE        |
               }

               switch(cafe_select.getOp())
               {
                 case 1 : option = "      없음      |"; break;
								 //|      옵션      |
                 case 2 : option = "       샷       |"; break;
                       
                 case 3 : option = "   바닐라시럽   |"; break;
                           
                 case 4 : option = "    초코시럽    |" ;break;
                           
                 case 5 : option = "  헤이즐넛시럽  |"; break;
                           
                 case 6 : option = "   휘핑크림     |"; break;
                           
               }

            }

            else if(cafe_select.getCategory() == 2) //2번 논커피
            {
				cafe_select.setHiop(0);//테스트
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
				cafe_select.setHiop(0); //테스트
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
       
	   // 테스트를 위해 넣어본 구문 - 있어야 함 
		
         
      }//while문 end 
		     
		 System.out.println("-------------------------------------------------------------------");
	     System.out.printf (" 결제 금액 : %d원                      \n", Pay_Control.allPay);
	     

		// 이벤트 당첨 여부(flagDang 변수에 따른 if문 구성)
		//현재 스탬프 갯수(등록된 손님의 경우에만 출력)
		if(hashMap.containsKey(phone)==true)
		{
			if(flagDang==true)
			{
				System.out.println("=================================================================== ");
				System.out.println("           ※※※ 당첨 스탬프 10개가 적립되었습니다 ※※※          ");  
				
			}
			
			System.out.println("스탬프 적립된 휴대폰 번호 : " + phone);
			System.out.println("소유한 스탬프 개수 : "+hashMap.get(phone));
		}
		// 테이크아웃 여부
		if(Takeout.sel==2)
		{	
			System.out.println("--------------------------------------------------------------------");
			System.out.println(" 테이크아웃을 선택하셨습니다.                            ");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("                 감사합니다. 좋은 하루 보내세요.                    ");
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
			System.out.println(" 매장 식사를 선택하셨습니다.                           ");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("                  감사합니다. 좋은 하루 보내세요.                   ");
			System.out.println("=================================================================== ");
			System.out.println("                             - end -                                ");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();

		
		}
		
		//적립했을 경우 휴대폰번호
		
		//////////위치 확정///////////
		I_minus i_minus = new I_minus();
		Inven_Control inven_control = new Inven_Control();
		Sales_Control sales_control = new Sales_Control();

		
		 // 일별 판매량 누적시키는 메소드 - 영수증 별로  
	      sales_control.sales_Cal();  

		 //  일별 판매량 초기화 
		 TestCalendar tc =new TestCalendar();
		// tc.resetSales();// 일별 판매량 초기화 - 여기 아님
		
		
		// 재고 마이너스 시키는 메소드
		i_minus.invenMinus();					// 여기 위치 확정@@ 건드리면 안된다  
		//inven_control.totalInventory();		// 확인하기 위한 테스트 위치
		

		// 결제 금액과 자료구조 초기화시키는 메소드
		Pay_Control.allPay = 0; 
		Cafe_Menus.vCafe_Select.clear();

		// 손님 수 누적시키는 메소드(2명이 되면 날짜 바꾸고 0으로 초기화)
		tc.calendar();

		// 다시 처음의 메뉴로 돌아가기
		Cafe_Menus start = new Cafe_Menus();
		start.firPrint();
		
	}
	
	// Test위한 main 메소드
	/*
	public static void main(String[] args)
	{
		Receipt test = new Receipt();
		test.random();
	}
	*/
	
	
}