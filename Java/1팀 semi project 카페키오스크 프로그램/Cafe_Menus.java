import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Calendar;

// 사용자 선택값을 자료구조에 담는 클래스(이채빈)
class Cafe_Menus
{	
	//ArrayList 자료구조 생성해서 Cafe_Select(속성 클래스) 타입의 객체를 저장할 것이다.
	static ArrayList<Cafe_Select> vCafe_Select = new ArrayList<Cafe_Select>();	

	private static int sel;	//-- 음료 카테고리 선택값
	private static int sel2;	//-- 1.장바구니 이동, 2.다른 메뉴 추가 선택값
	private int category;	//-- 장바구니 출력을 위해 sel을 담을 변수(static은 덮어씌워져서 출력이 제대로 안된다.) 
	
	private int main;	//-- 메인음료 선택값 담는 변수(선택값 검사를 위해)
	private int hiop;	//-- HOT/ICE 선택값 담는 변수
	private int op;		//-- OPTION 선택값 담는 변수 
	
	//sel 에서 사용되는 변수
	private static final int COFFEE = 1;			//  1.Coffee 세부 메뉴	
	private static final int NONCOFFEE = 2;			//  2.Non-Coffee 세부 메뉴
	private static final int DESSERT = 3;			//  3.Dessert 세부 메뉴
	private static final int PASSWORD = 9999;		//  관리자메뉴로 전환하기 위한 값	 

	// sel2 에서 사용되는 변수 
	private static final int BASKET = 1;			// 1. 장바구니로 이동  
	private static final int GOPLUS = 2;			// 2. 다른 메뉴  추가 
	
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
	
	//전체 메뉴 출력 메소드
	public void firPrint()
	{
		
		Scanner sc = new Scanner(System.in);
		
		Cafe_Control cafe_control = new Cafe_Control();
		
		//날짜 테스트 
		//TestCalendar tc = new TestCalendar();
		Calendar calendar = Calendar.getInstance();

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int date = calendar.get(Calendar.DATE);
		

		System.out.println("===================================================================");
		System.out.println("                            Wa_rrr CAFE                            ");
		System.out.println("-------------------------------------------------------------------");
		//System.out.printf("%61d-%d-%d\n",year,month,date);
		System.out.printf("%61d-%d-%d\n",year,month,date +TestCalendar.datePlus);						// 오늘 날짜 출력 메소드
		cafe_control.today_coffee();		// 랜덤 커피 할인 메뉴 연산 메소드
		cafe_control.today_coffee_print();	// 랜덤 커피 메뉴 출력 메소드
		System.out.println("-------------------------------------------------------------------");
		System.out.println("                               메뉴 선택	                       ");
		System.out.println("===================================================================");
		System.out.println("|     1.Coffee	       |     2.Non-Coffee    |     3.Dessert      |");
		System.out.println("|-----------------------------------------------------------------|");
		System.out.println("|    ·에스프레소      |    ·자몽에이드     |    ·케이크        |");
		System.out.println("|    ·아메리카노      |    ·요거트스무디   |    ·베이글        |");
		System.out.println("|    ·카페라떼        |    ·히비스커스티   |    ·스콘          |");
		System.out.println("|    ·카페모카        |    ·오렌지쥬스     |    ·마카롱        |");
		System.out.println("|    ·카푸치노        |    ·고구마라떼     |    ·쿠키          |");
		System.out.println("|    ·바닐라라떼      |                     |	                  |");
		System.out.println("|    ·카라멜마끼아또  |                     |                    |");
		System.out.println("===================================================================");
		cafe_control.so_print();
		System.out.print(" 카테고리를 선택해주세요 : ");
		sel = sc.nextInt();	// 사용자가 입력한 값으로 sel 변수 초기화
		category = sel;		// sel값으로 category 변수 초기화 

		menuSelect();
	}

	// 1. Coffee  카테고리 출력 메소드
	public void coffeePrint()
	{
		System.out.println("===================================================================");
		System.out.println("                        COFFEE (HOT/ICE)                           ");
		System.out.println("===================================================================");
		System.out.println("| 1)에스프레소          (2500원)                                  |");
		System.out.println("| 2)아메리카노          (3000원/3500원)                           |");
		System.out.println("| 3)카페라떼            (3500원/4000원)                           |");
		System.out.println("| 4)카페모카            (4000원/4500원)                           |");
		System.out.println("| 5)카푸치노            (4000원/4500원)                           |");
		System.out.println("| 6)바닐라라떼          (4500원/5000원)                           |");
		System.out.println("| 7)카라멜마끼아또      (4000원/4500원)                           |");

	}
	
	// HOT/ICE 옵션 선택 출력 메소드()  
	public void HOT()
	{	
		System.out.println("===================================================================");
		System.out.println("                        HOT/ICE                                    ");
		System.out.println("===================================================================");
		System.out.println("| 1) HOT                (추가요금 없음)                           |");
		System.out.println("| 2) ICE                (500원)                                   |");
		System.out.println("===================================================================");

	}

	 //커피 옵션 선택 메소드 
	public void coffeeOp()
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("                        COFFEE OPTION                              ");
		System.out.println("===================================================================");
		System.out.println("| 1)선택안함                                                      |");
		System.out.println("| 2)샷                  (500원)                                   |");
		System.out.println("| 3)바닐라시럽          (500원)                                   |");
		System.out.println("| 4)초코시럽            (500원)                                   |");
		System.out.println("| 5)헤이즐넛시럽        (500원)                                   |");
		System.out.println("| 6)카라멜 시럽         (500원)                                   |");
		System.out.println("| 7)휘핑크림            (500원)                                   |");
		System.out.println("===================================================================");
		System.out.print(" 메뉴를 선택해주세요(COFFEE, HOT/ICE, OPTION 공백 구분) : "           );
			
		main = sc.nextInt();	// 사용자 선택값을 담는 변수들 
		hiop = sc.nextInt();
		op = sc.nextInt();
		
		// 커피 선택값(main,hiop,op) 검사
		boolean check = true;
		do{
			 if((0<main&&main<8)&&(0<op&&op<8)&&(0<hiop&&hiop<3)){	
				check = false;
			 }else{
				
				 // 범위 외의 값을 입력하면 다시 처음 화면으로 돌아간다.
				 System.out.println();
				 System.out.println(" 알맞게 다시 선택해주세요.");
				 System.out.println();
				 firPrint();
				
			 }
		  }while(check);
		
		vCafe_Select.add(new Cafe_Select(sel,main,hiop,op));	
		// 커피류는 (카테고리,메인메뉴,HOT/ICE 옵션/추가옵션) 속성을 가진 객체가 자료구조에 추가된다.
	}

	// 2. Non-Coffee 카테고리 출력 메소드
	public void noncoffeePrint()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("===================================================================");
		System.out.println("                        NON-COFFEE                                 ");
		System.out.println("===================================================================");
		System.out.println("| 1)자몽에이드          (4000원)  ICE                             |");
		System.out.println("| 2)요거트스무디        (4500원)  ICE                             |");
		System.out.println("| 3)히비스커스티        (3500원)  HOT                             |");
		System.out.println("| 4)오렌지쥬스          (4000원)  ICE                             |");
		System.out.println("| 5)고구마라떼          (4000원)  HOT                             |");
		System.out.println("===================================================================");
		System.out.print(" 메뉴를 선택해주세요(NON-COFFEE) : "           );
		
		main = sc.nextInt();	// 사용자 입력 값을 담는 변수 
		
		boolean check = true;
		do{
			 if(0<main&&main<6){	
				check = false;
			 }else{
				 System.out.println(" 알맞게 다시 선택해주세요.");
				 firPrint();
				
			 }
		  }while(check);

		  vCafe_Select.add(new Cafe_Select(sel,main));
		  // 논커피류는 (카테고리, 메인메뉴) 속성을 가진 객체가 자료구조에 추가된다. 
	}

	// 3. Dessert 카테고리 출력 메소드
	public void dessert()
	{	
		

		System.out.println("===================================================================");
		System.out.println("                        DISSERT                                    ");
		System.out.println("===================================================================");
		System.out.println("| 1)케이크              (4000원)                                  |");
		System.out.println("| 2)베이글              (3500원)                                  |");
		System.out.println("| 3)스콘                (3500원)                                  |");
		System.out.println("| 4)마카롱              (2500원)                                  |");
		System.out.println("| 5)쿠키                (1000원)                                  |");
	}

	//디저트 옵션 선택 메소드
	public void dessertOp()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("===================================================================");
		System.out.println("                      DISSERT OPTION                               ");
		System.out.println("===================================================================");
		System.out.println("| 1)선택안함                                                      |");
		System.out.println("| 2)크림치즈            (1000원)                                  |");
		System.out.println("| 3)딸기잼              (500)                                     |");
		System.out.println("===================================================================");
		System.out.print(" 메뉴를 선택해주세요(DISSERT, OPTION 공백 구분) : ");
		
		main = sc.nextInt();
		op = sc.nextInt();
		
		boolean check = true;
		do{
			 if((0<main&&main<6)&&(0<op&&op<4)){	
				check = false;
			 }else{
				 System.out.println();
				 System.out.println(" 알맞게 다시 선택해주세요.");
				 System.out.println();
				 firPrint();
				
			 }
		  }while(check);

		vCafe_Select.add(new Cafe_Select(sel,main,op));
		// 디저트류는 (카테고리,메인메뉴,추가옵션) 속성을 가진 객체가 자료구조에 추가된다.
	
	}
	
	// 1. 장바구니로 2. 다른 메뉴 추가 선택하도록 하는 메소드
	public void go()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println(" 1. 장바구니로 이동   2. 다른 메뉴 추가 ");
		System.out.println();
		System.out.print(" 선택해주세요: ");
		sel2 = sc.nextInt();
		
		// 1. 장바구니 이동 2. 다른 메뉴 추가 선택값 검사 
		boolean check = true;
		do{
         if(sel2<1||sel2>2){
            System.out.println(" 1~2중에 선택해주세요.");
            go();
         }else{
			menuGo();
            check = false;
         }
      }while(check);
	    System.out.println();
		

	}//go() end


	//카테고리 선택값 검사하는 메소드 
   public void menuSelect(){
	   
	  boolean check ;
	  check = true;  //-- 카테고리 선택값 검사

    do{

			if(sel<1||sel>9999){
            System.out.println(" 1~3중에 선택해주세요.");
            firPrint();
			}else{			
					check = false;
			}
      }while(check);

	menuRun();

   } //menuSelect() end

   //선택된 메뉴 실행에 따른 기능 호출 메소드
   public void menuRun(){

	   Cafe_Menus cafe_menus = new Cafe_Menus();	// Cafe_Menus 클래스 인스턴스 생성
	   I_minus i_minus = new I_minus();
	   Pay_Control pay_control = new Pay_Control();
	   
		 switch(sel){
         
         case Cafe_Menus.COFFEE: cafe_menus.coffeePrint();	//1.COFFEE 출력 메소드
		 						 cafe_menus.HOT();			// 핫아이스 옵션 선택 메소드
								 cafe_menus.coffeeOp();     // 커피 옵션 선택 메소드 
								 cafe_menus.go();			// 1.장바구니 이동 2. 다른 메뉴 추가 

									break;

         case Cafe_Menus.NONCOFFEE: cafe_menus.noncoffeePrint(); //2.NONCOFFEE 출력 메소드
									cafe_menus.go();			 // 1.장바구니 이동 2. 다른 메뉴 추가 
						
									break;

         case Cafe_Menus.DESSERT: cafe_menus.dessert();		// 3. Dessert 카테고리 출력 메소드
		 						  cafe_menus.dessertOp();	// 디저트 옵션 선택 메소드
								  cafe_menus.go();			 // 1.장바구니 이동 2. 다른 메뉴 추가

									break;
		// 전진영
		 case Cafe_Menus.PASSWORD :   Scanner sc = new Scanner(System.in);
									  // 9999 입력 후 비밀번호를 입력하면 관리자 모드로 접근
									  System.out.print(" 관리자 비밀번호를 입력해주세요 :");
									  String password=sc.next();
									  System.out.println();
											
									Password_Control pc = new Password_Control();
									Cafe_Menus c = new Cafe_Menus();
									ManagerMenu m = new ManagerMenu();

									// password가 Password_Control에 등록된 password와 같으면 관리자모드 진입
									if(password.equals(pc.getPassword()))	
									{
										  
										 while (true)
										 {
											 m.menuDisp();
											 m.menuSelect();
											 m.menuRun();
										 }
									}
									//비밀번호 잘못 입력하면 메인 메뉴로
									else
									{
										System.out.println(" 비밀번호를 잘못 입력하셨습니다.");
								          c.firPrint();
									}
	
									break;
														
		}//switch문 end
	
	 }

	// 1. 장바구니 가기 2. 다른 메뉴 추가 선택하도록 하는 메소드 
	public void menuGo()
		{
			Cafe_Menus cafe_menus = new Cafe_Menus();	// Cafe_Menus 클래스 인스턴스 생성
			Pay_Control pay_control2 = new Pay_Control();
			Basket_Control basket_control = new Basket_Control();
			
			// 결제 금액 연산 메소드 
			pay_control2.pay();		//-- 결제금액 제대로 나오기 위한 위치!!! 확정@@@ 
			
			switch(sel2){
				
				case Cafe_Menus.BASKET : basket_control.print();	 //1.장바구니 가기 선택하면 결제창 프린트해주고
										 break;					// main() 에서 1이 아니면 계속 반복하도록 설정해뒀다.
				
				case Cafe_Menus.GOPLUS :cafe_menus.firPrint();
										cafe_menus.menuRun(); // 2.다른 메뉴 추가 선택하면 다시  
									
			}

		}	// menuGo() end 

} //Class Cafe_Menus end 

