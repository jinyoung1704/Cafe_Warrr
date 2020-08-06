import java.util.ArrayList;
import java.util.Iterator;

import java.util.Scanner;

// 결제금액 연산 위한 클래스(이채빈,전진영,주한별,최호석) 
class Pay_Control
{	

	private static int totalPay;	//-- 잔수 별로 결제 금액 담을 속성
	private int gap=0;	// 잔수별 금액을 누적하기 위한 변수 
	public static int allPay;		//-- 총 결제 금액  
	
	private static int mainPay;		//-- 메인 메뉴 금액
	private static int hiopPay;		//-- ICE 선택시 500원 추가금
	private static int opPay;		//-- 추가옵션 금액
	
	private static int customer;	// 방문 손님 수 → 스탬프 당첨 랜덤 이벤트 적용을 위해 만들었음
	
	public void setCustomer(int costomer)
	{
		this.customer = costomer;
	}
	public int getCustomer()
	{
		return customer;
	}
	
	// 스탬프 인스턴스 생성.
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


  // 사용자 선택 값에 따른 결제 금액 연산 메소드(이채빈)
   public void pay()
   {   

	  //Cafe_Menus.vCafe_Select -- 사용자 선택값 담은 자료구조
      //Cafe_Menus.vCafe_Select.get(0); 이런 방식으로 static 자료구조 호출

      Iterator it = Cafe_Menus.vCafe_Select.iterator(); //    vCafe_Select 에 저장되어있는 <Cafe_Select> 타입 객체  
      
      Menus_Price menus_price = new Menus_Price(); // 사용자 가격 담은 클래스 객체 생성
      Pay_Control pay_control = new Pay_Control(); // TotalPay 담을 클래스 객체 생성 
	  Cafe_Control cc = new Cafe_Control(); //오늘의 커피 메뉴를 선택했는지 알아보기 위해 객체 생성

      while(it.hasNext())   // 객체가 없을 때까지 반복       
      {	
		 cc.today_coffee();
         Object obj = it.next();   // <Cafe_Select> 타입 객체를 가져온다
         Cafe_Select cafe_select = (Cafe_Select)obj;

         //cafe_select.getMain();   // 사용자 선택값에 따른 메뉴 가격 
         //cafe_select.getHiop();   // 사용자 선택값에 따른 옵션 가격
         //cafe_select.getOP();      // 사용자 선택값에 따른 추가 옵션 가격  
      
         //테스트 - 쌓인 만큼 불러지는거 확인함
         //System.out.println(" 메뉴 값 " + cafe_select.getMain() + " HOT/ICE 옵션값 " + cafe_select.getHiop() + "추가 옵션 값 " +  cafe_select.getOp());
      
         //사용자 선택값에 따른 메뉴별 연산 메소드 selectPay() 호출 
            
         if (cafe_select.getCategory() == 1)	 // 카테고리 선택값이 커피  
         { 
			  switch (cafe_select.getMain())      // 메뉴 선택 값 
				{    
				   // 랜덤 커피 할인을 위한 연산(전진영)
				   case 1 : if(cc.todaynum[0]==cafe_select.getMain()) //todaynum은 커피의 고유번호 
							pay_control.setMainPay(menus_price.getPespresso()-500); //todaynum[0] 번호와 사용자가 입력한 음료선택 번호가 일치하면
					  else															//500원 할인
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

            switch (cafe_select.getOp())   // 옵션 선택 값 
            {
               case 1 : pay_control.setOpPay(0); break;
               case 2 : pay_control.setOpPay(menus_price.getPshot()); break;
               case 3 : pay_control.setOpPay(menus_price.getPvanilla()); break;
               case 4 : pay_control.setOpPay(menus_price.getPchoco());  break; 
               case 5 : pay_control.setOpPay(menus_price.getPhazel());  break;
               case 6 : pay_control.setOpPay(menus_price.getPcaramel());  break;
               case 7 : pay_control.setOpPay(menus_price.getPwhipcream());  break;
            }

            
            if (cafe_select.getHiop() == 2)   // HOT/ICE 옵션 선택 값이 ICE 이면 
            {
               pay_control.setHiopPay(500); 
            }
         
         }
         
         else if(cafe_select.getCategory() == 2)// 논커피 카테고리에서 
         {

			 pay_control.setHiopPay(0);	// HOT/ICE 옵션 가격과 추가 옵션 금액 0으로 초기화 
			 pay_control.setOpPay(0);

            switch (cafe_select.getMain())   // 메뉴 선택 값 
            {   
               case 1 : pay_control.setMainPay(menus_price.getPjamongAde());  break;
               case 2 : pay_control.setMainPay(menus_price.getPyogurt()); break;
               case 3 : pay_control.setMainPay(menus_price.getPtea()); break;
               case 4 : pay_control.setMainPay(menus_price.getPorangeJuice());  break;
               case 5 : pay_control.setMainPay(menus_price.getPgogumaLatte());  break;
            } 

         }


         else if(cafe_select.getCategory() == 3)// 디저트 카테고리에서 
         {      
			 pay_control.setHiopPay(0);	// HOT/ICE 옵션값 0으로 초기화 

            switch (cafe_select.getMain())   // 메뉴 선택 값 
            {
               case 1 : pay_control.setMainPay(menus_price.getPcake());   break;
               case 2 : pay_control.setMainPay(menus_price.getPbagel());  break;
               case 3 : pay_control.setMainPay(menus_price.getPscone());  break;
               case 4 : pay_control.setMainPay(menus_price.getPmacaron()); break;
               case 5 : pay_control.setMainPay(menus_price.getPcookie()); break;

            }
            switch (cafe_select.getOp()) // 옵션 선택 값 
            {
               case 1 : pay_control.setOpPay(0); break;
               case 2 : pay_control.setOpPay(menus_price.getPcreamcheese()); break;
               case 3 : pay_control.setOpPay(menus_price.getPstroberryjam()); break;
            
            }

            
         }
         
         pay_control.setTotalPay(getTotalPay()); //-- 한잔 가격 담긴 상태
         
         gap += getTotalPay();
         
         allPay = gap;	// 한 주문당 총 결제 금액   
         
         //테스트 
         //System.out.println("메인 결제 금액: " + pay_control.getMainPay() + " ICE 추가 금액 : " +  pay_control.getHiopPay() + " 옵션 추가 금액 : " + pay_control.getOpPay()); 

         //System.out.println("잔당 결제 금액: " + pay_control.getTotalPay()); // --> 각 잔별로 나온다 
         //System.out.println("총 결제 금액: " + allPay);//임시 위치

      }// while 문 end

   }

	// 카드 매출을 모으는 static 변수
	public static int cardSum;
	
	// Pay_Select 클래스의 메소드 호출
	Pay_Select pc = new Pay_Select();

	// 카드결제 메소드 (주한별)
	public void cardPay()
	{
		// 스캐너 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		// 카드 결제 
		System.out.println();
		System.out.print(" 카드를 투입해주세요(Y/N): ");
		String yon=sc.next();	// 사용자가 입력한 Y/N를 담을 변수 yon

		if(yon.equals("Y")||yon.equals("y"))
		{
			// 카드결제는 전액 결제가 한번에 된다.
			
			// 카드 매출액을 저장하기 위한 코드
			Money_Control money_control = new Money_Control();
			money_control.card_Sales();
			
			System.out.println();
			System.out.println("========================= 결제 진행중 ===========================>> ");
			System.out.println();
			System.out.println(" 카드 결제가 완료되었습니다.");
			System.out.println();
			
			
			
			// 다음 진행 메소드인 Stamp 클래스의 saveSelect() 메소드 호출
			stamp.saveSelect();
			
			
			// costomer 수 1 증가
			// 변수 costomerP는 결제를 완료한 후, 1이 더해진 새로운 costomer 수다.
			int customerP = getCustomer()+1;
			// 새로운 costomer 수를 setCostomer() 메소드를 통해
			// static costomer에 저장한다.
			setCustomer(customerP);
		}
		//(N을 선택할 경우)
		else
		{
			// Pay_Select 화면으로 이동한다.
			pc.menuDisp();
		}
		

	

	}
   
	// int반환형의 사용자 현금 입력 메소드(최호석) 
	public int inputBill() 
	{
		// 사용자의 현금 입력 메소드여서 이곳에서 일별 매출액이 쌓이면 안된다. 
		// 왜냐하면 사용자 현금 입력을 받아 
		// 사용자 현금과 결제될 금액(allPay)을 빼주어
		// 사용자가 거슬러 받아야할 값(user_money)만 연산해주고 
		// int값(user_money)를 반환해주는 메소드이기 때문이다.
		
		
		// 현금 결제 정산 메소드 호출(일별 매출액과 월별 매출액에 쌓인다.)
		// Money_Control money_control = new Money_Control();
		// money_control.money_Sales();
		// 20-03-14 01:45 395, 396번째줄 주석처리.(최호석)
		// 20-03-14 01:50 454,455,456번째줄에 다시 붙여넣음.
		 
		  Scanner sc = new Scanner(System.in);// 스캐너 인스턴스 생성.

		  int money=0; // 사용자 현금 입력을 받는 변수.
		
		  System.out.println();
		  System.out.print(" 현금을 결제해주세요 : ");
		  
		  //예외 처리는 어려워서 못하겠어서 임의의 처리방식을 하나 만들어놨음. 20-03-14 09:43 최호석 추가
		  while (!sc.hasNextInt()) //값이 숫자인지 판별
		  {
				sc.next();	//값이 숫자가 아니면 버린다.
				System.err.print(" 에러! 현금만을 결제해주세요 :");
				System.out.println();
		  }

		  money = sc.nextInt();	// 사용자 현금 스캐너로 입력 받기.

		  if(money < allPay)	// 사용자의 현금금액이 결제 금액보다 적을 경우
		  {
				System.out.println(" 잔액이 부족합니다. 다시 선택해주세요.");
				System.out.println();
				pc.menuDisp();	// 다시 결제 선택창으로 넘어가게끔 해놨다.
		  }
		  
		  int user_money = money - allPay;	// 사용자가 거슬러 받아야할 돈 = 사용자의 현금금액 - 총 결제금액

		  return user_money;				// 사용자가 거슬러 받아야할 돈을 int형값으로 반환한다.
											// 왜냐하면 아래의 거스름돈체크메소드와(checkbillPay(int user_money))
											// 현금결제메소드(billPay(int user_money)에 사용되기 때문이다.
	 }



		   Change c = new Change();				// 거스름돈(Change) 클래스 인스턴스 생성

		   int[] coinSet = {c.getOhmanwon(), c.getManwon(), c.getOhchonwon(), c.getChonwon(), c.getOhbackwon()};
		   // 거스름돈 세팅 배열 선언 및 초기화.
		   // Change 클래스와의 연동을 위해서
		   // {오만원의 개수, 만원의 개수, 오천원의 개수, 천원의 개수, 오백원의 개수};로 초기화시켜놓았다.

		   int coinName[] = { 50000, 10000, 5000, 1000, 500};
		   // 거스름돈 권종 배열 선언 및 초기화.
		   // 잔돈을 거슬러주기 위해서
		   // {오만원, 만원, 오천원, 천원, 오백원};으로 초기화시켜놓았다.



	 // boolean 반환형의 지폐반환여부 확인 메소드(거스름돈이 있는지 없는지)(최호석)
	 public boolean checkbillPay(int user_money)    
	 { 
		 for (int i = 0; i < coinName.length; i++)	// 0부터 지폐이름의 배열크기(5)만큼 돈다. 총 6번 돈다.
		 {
			if (user_money < coinName[i])			// 사용자가 거슬러 받아야할 돈이 지폐이름보다 작을 경우 ex) 1000 < coinName[0]=50000
				continue;							//(+ 뒷 부분 무시하고...) 계속해라. 뒷문장 이어지지 않고, 다시 for문을 돈다.
													
													// user_money(사용자가 거슬러 받아야할 돈)를 2500원이라 가정하자.
			int temp = user_money / coinName[i];	// int형의 temp값을 선언 후 temp에 (사용자가 거슬러 받아야할 돈 나누기 지폐의 이름) 담는다.
													// ex) temp = user_money(2500) / 1000 ,  temp = 2;

			if (temp > coinSet[i])					// temp가 2일 경우 천원의 개수와 비교하여 temp가 천원의 개수보다 크다면
			   temp = coinSet[i];					// temp값을 천원의 개수만큼 초기화시킨다. 천원의 개수가 1개라면 temp는 1로 초기화된다.
			user_money -= temp * coinName[i];		// 사용자가 거슬러 받아야할 돈(2500) -= 2 * 1000, 500원이 되고, 0원이 될때까지
													// 사용자가 거슬러 받아야할 돈이 0이 되면 for문은 종료된다.
		 }


		 if(user_money == 0)						// 사용자가 거슬러 받아야할 돈이 0이 되면 
			return true;							// 거슬러줄수 있는 지폐의 개수가 있다는 의미이므로 true값을 반환하고
		 else										// 사용자가 거슬러 받아야할 돈이 0이 되지 않으면
			return false;							// 거슬러줄수 있는 지폐의 개수가 없다는 의미이므로 false값을 반환한다.
	 }
	   



	//현금 결제 메소드 (최호석)
	 public void billPay(int user_money)			// 실제 잔돈 반환 메소드(위에 지폐반환여부 확인 메소드와 연동되게끔 해놓았다.
	 {												// 자세한 사항은 Pay_Select 74~92번째줄 참고.
		 
		 if(user_money==0)												// 사용자가 거슬러 받아야할 돈이 0원이면
			 System.out.println();
			 System.out.println("========================= 결제 진행중 ============================>> ");
			 System.out.println();
			 System.out.println(" 현금결제가 완료되었습니다.");			// 현금결제 완료 프린트를 해준다.
			 System.out.println();

		 if(user_money>0)												// 사용자가 거슬러 받아야할 돈이 0보다 크면
		 {	
			 System.out.println(" 잔돈을 받아주세요 : " + user_money+"원");	// 사용자가 거슬러 받아야할 돈을 프린트해준다.
			 System.out.println();
		 }
		
		 // 현금 결제가 완료 프린트가 작동되면
		 // 현금 결제 정산 메소드 호출(일별 매출액과 월별 매출액에 쌓인다.)
		 Money_Control money_control = new Money_Control();
		 money_control.money_Sales();

		 for (int i = 0; i < coinName.length; i++)	// 0부터 지폐이름의 배열크기(5)만큼 돈다. 총 6번 돈다.
		 {											// 사용자가 거슬러 받아야할 돈을 2500원이라 가정하자.
			if (user_money < coinName[i])			// 2500(user_money) < 50000 ,10000, 5000원(coinName[0], coinName[1], coinName[2]) 까지는
													// 뒷문장 실행안하고 for문으로 다시 돌아간다.
			   continue;	
													// 2500(user_money) < 1000, 500 (coinName[3],coinName[4]) 일때 if문이 실행되지 않으며
			int temp = user_money / coinName[i];	// temp = 2500/1000(coinName[3]), temp = 2 , for문이 마지막으로 돌때 temp = 2500/ 500(coinName[4]), temp =1
			if (temp > coinSet[i])					// 만약 coinSet[4]가 10개 이면 temp가 0보다 크므로 if문이 실행되면서
			   temp = coinSet[i];					// temp는 4로 초기화된다.
			user_money -= temp * coinName[i];		// 사용자가 거슬러 받아야할 돈(user_money)은 사용자가 거슬러 받아야할 돈(2500) - (5 * 500)으로 사용자가 거슬러 받아야할 돈이 0이됨.
			coinSet[i] -= temp;						// coinSet[4] = coinSet[4] - 4; 으로 초기화된다.
		 }


		  c.setOhmanwon(coinSet[0]);	// 거스름돈 클래스의 속성값 오만원의 세터를 이용해 차감된 오만원의 개수를 세팅해준다.
		  c.setManwon(coinSet[1]);		// 거스름돈 클래스의 속성값   만원의 세터를 이용해 차감된 오만원의 개수를 세팅해준다.
		  c.setOhchonwon(coinSet[2]);	// 거스름돈 클래스의 속성값 오천원의 세터를 이용해 차감된 오만원의 개수를 세팅해준다.
		  c.setChonwon(coinSet[3]);		// 거스름돈 클래스의 속성값   천원의 세터를 이용해 차감된 오만원의 개수를 세팅해준다.
		  c.setOhbackwon(coinSet[4]);	// 거스름돈 클래스의 속성값 오백원의 세터를 이용해 차감된 오만원의 개수를 세팅해준다.

		  
		  // 스탬프 선택창으로 가는 메소드 호출.
		  stamp.saveSelect();					
		  
		  // 20-03-14 01:50 이클립스 돌려보니 스탬프 선택창으로 가는 메소드 호출뒤 다시 돌아오는 문제 확인.
		  // 504~510번째의 있는 customer 수 증가 메소드가 스탬프 선택창으로 가는 메소드 호출 앞에 있어서 스탬프 선택창이
		  // billPay 메소드로 다시 돌아온 뒤
		  // 블럭 밖으로 빠져 나가면서 null값을 반환하는 익셉션 오류가 발생하여 498과 504~510번째의 두 메소드 자리를 바꾸니 오류없이 작동됨.

	 }

			// 최호석 20-03-14 03:31 billPay메소드 주석달기 종료. 연동되는 Pay_Select도 74~83번째줄 주석 달기 시작.
	
	// 스탬프결제 메소드(스탬프 클래스 연동)
	// 스탬프 결제 → 음료를 결제할 시 스탬프 10 차감, 3000원 할인
	// 휴대폰번호로 스탬프 자료구조에 접근해야한다.
	
	// 스탬프 결제 메소드(주한별)
	public void stampPay()	
	{
		stamp.hashMap.put("01030026023",10);	// Test 로 넣은 채빈이 번호
		
		// 스캐너 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		
		// 입력받은 휴대폰번호를 저장하기 위한 변수
		String phone;
		
		do
		{
			//stamp.stamp_add();
			System.out.println();
			System.out.println(" 스탬프 결제를 위해 등록된 휴대폰 번호를 입력해주세요('-' 제외) ");
			System.out.print(" : ");
			// 사용자가 입력한 값을 phone 변수에 담는다.
			phone=sc.next();
		}
		// 휴대폰번호가 11자리가 아니면 do-while문 반복으로 재입력받는다.
		while(phone.length()!=11);
		
		// 휴대폰번호-스탬프를 담은 HashMap 자료구조를 이용한다.
		// phone이 HashMap 자료구조에 없다면?
		if(Stamp.hashMap.containsKey(phone)==true)
		{	
			System.out.println();
			System.out.println(" " +phone+" 에서 스탬프 10개가 차감됩니다.");
			Stamp.hashMap.put(phone,Stamp.hashMap.get(phone)-10);
			// Test 스탬프 결제로 인해 스탬프가 차감되었는지 확인
			//System.out.println(Stamp.hashMap.get(phone)); → OK!
			
			// 전체 금액에서 할인 금액 3,000원을 빼면 0원일 경우
			if(allPay-3000<=0)
			{	
				System.out.println();
				System.out.println(" 스탬프 결제가 완료되었습니다.");
				System.out.println(" 남은 스탬프 개수 : "+Stamp.hashMap.get(phone));
				
				// 결제가 완료되었으므로 allPay의 변수 값을 '0'으로 초기화한다.
				this.allPay=0;
				
				// costomer 수 1 증가
				// 변수 costomerP는 결제를 완료한 후, 1이 더해진 새로운 costomer 수다.
				int customerP = getCustomer()+1;
				// 새로운 costomer 수를 setCostomer() 메소드를 통해
				// static costomer에 저장한다.
				setCustomer(customerP);
				
				// 다음 진행 메소드인 Stamp 클래스의 saveSelect() 메소드 호출
				stamp.saveSelect();
				
			}
			
			// 전체금액에서 할인 금액 3,000 원 빼고 남은 금액을 추가결제해야 하는 경우
			else
			{
				this.allPay = allPay-3000;

				System.out.println();
				System.out.println(" 스탬프 결제로 3,000원 할인되었습니다.");
				System.out.println(" 남은 결제 금액 : "+allPay+"원");
				System.out.println();
				System.out.println(" 남은 스탬프 개수 : " + Stamp.hashMap.get(phone));
			
				
				System.out.println();
				System.out.println(" 나머지 금액의 결제 수단을 선택해주세요.");

				// 다시 결제선택 화면으로 이동한다.
				pc.menuDisp();	

				
			}
		
		
		}
		else
		{
			System.out.println();
			System.out.println(" 입력한 휴대폰 번호가 등록되어 있지 않습니다. 결제 선택 화면으로 돌아갑니다.");

			// 다시 결제선택 화면으로 이동한다.
			pc.menuDisp();

			
		}
		

			
		

	}


}



