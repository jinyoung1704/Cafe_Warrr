
import java.util.Scanner;

// 잔고관리 기능(최호석)
class Money_Control
{
	// Change(거스름돈) 클래스 인스턴스 생성
	Change c = new Change();

	Money m = new Money();// 머니 인스턴스 생성

	//속성: 거스름돈 비울때 거스름돈통 값을 담아둘 속성 
	
	int sum = 0; //발주금액의 최종 합계를 정산해주는 sum 변수 선언.

	//거스름돈 확인 메소드
	public void hakin()
	{	
		System.out.println();
		System.out.println("===================================================================");
        System.out.println("\t\t         【잔고 현황】");
        System.out.println("-------------------------------------------------------------------");
		System.out.println("     권종\t         장수");
		System.out.printf("·  오만원\t\t %d장%n",c.getOhmanwon());	// 오만원 개수
		System.out.printf("·  일만원\t\t %d장%n",c.getManwon());	// 일만원 개수
		System.out.printf("·  오천원\t\t %d장%n",c.getOhchonwon());// 오천원 개수
		System.out.printf("·  일천원\t\t %d장%n",c.getChonwon());	// 일천원 개수
		System.out.printf("·  오백원\t\t %d장%n",c.getOhbackwon());// 오백원 개수
		System.out.println("-------------------------------------------------------------------");
	    System.out.println("===================================================================");
		System.out.println();
	}

	//잔돈 입금 메소드()
	public void changeInput() // -  잔돈입금 메소드
	{

		Scanner sc = new Scanner(System.in);
		
		int oh;								// 오만원의 장수를 받아주는 변수 선언
		int man;							// 일만원의 장수를 받아주는 변수 선언
		int ochon;							// 오천원의 장수를 받아주는 변수 선언
		int chon;							// 일천원의 장수를 받아주는 변수 선언
		int obak;							// 오백원의 장수를 받아주는 변수 선언

		do
		{
			System.out.print(" 오만원을 몇장 넣으시겠습니까? : ");
			oh = sc.nextInt();				// 스캐너로 오만원 장수 입력받기
			System.out.println();
		}
		while (!(oh>0));					// 입력한 장수가 음수일 경우 다시 입력받도록 do ~ While문 설정
		
		
		do
		{
			System.out.print(" 만원을 몇장 넣으시겠습니까? : ");
			man = sc.nextInt();				// 스캐너로 일만원 장수 입력받기
			System.out.println();	

		}
		while (!(man>0));					// 입력한 장수가 음수일 경우 다시 입력받도록 do ~ While문 설정
		
		do
		{
			System.out.print(" 오천원을 몇장 넣으시겠습니까? : ");
			ochon = sc.nextInt();			// 스캐너로 오천원 장수 입력받기
			System.out.println();
		}
		while (!(ochon>0));					// 입력한 장수가 음수일 경우 다시 입력받도록 do ~ While문 설정
		
		do
		{
			System.out.print(" 천원을 몇장 넣으시겠습니까? : ");
			chon = sc.nextInt();			// 스캐너로 일천원 장수 입력받기
			System.out.println();
		}
		while (!(chon>0));					// 입력한 장수가 음수일 경우 다시 입력받도록 do ~ While문 설정
		
		do
		{	
			System.out.print(" 오백원을 몇장 넣으시겠습니까? : ");
			obak = sc.nextInt();			// 스캐너로 오백원 장수 입력받기
			System.out.println();
		}
		while (!(obak>0));					// 입력한 장수가 음수일 경우 다시 입력받도록 do ~ While문 설정

        

		// 기존 오만원의 개수와 입력받은 오만원을 더해주면 오만원의 개수가 누적
		c.setOhmanwon(c.getOhmanwon()+oh);	
		
		// 오만원 세팅과 동일
		c.setManwon(c.getManwon()+man);

		// 오만원 세팅과 동일
		c.setOhchonwon(c.getOhchonwon()+ochon);

		// 오만원 세팅과 동일
		c.setChonwon(c.getChonwon()+chon);

		// 오만원 세팅과 동일
		c.setOhbackwon(c.getOhbackwon()+obak);
		
		// 잔돈을 입금 받은만큼 계산해주어 int a에 담음. (잔돈만큼 매출액에서 차감하기 위해)
		int a = c.getOhmanwon() * 50000 + c.getManwon() * 10000 + c.getOhchonwon() * 5000 + c.getChonwon() * 1000 + c.getOhbackwon() * 500;
		
		System.out.println();
		System.out.println(" 현재 입금한 거스름돈 총 금액 : " + a);
		System.out.println();
		System.out.println("===================================================================");
        System.out.println("\t\t         【잔고 현황】");
        System.out.println("-------------------------------------------------------------------");
		System.out.println("     권종\t         장수");
		System.out.printf("·  오만원\t\t %d장%n",c.getOhmanwon());	// 오만원 개수
		System.out.printf("·  일만원\t\t %d장%n",c.getManwon());	// 일만원 개수
		System.out.printf("·  오천원\t\t %d장%n",c.getOhchonwon());// 오천원 개수
		System.out.printf("·  일천원\t\t %d장%n",c.getChonwon());	// 일천원 개수
		System.out.printf("·  오백원\t\t %d장%n",c.getOhbackwon());// 오백원 개수
		System.out.println("-------------------------------------------------------------------");
	    System.out.println("===================================================================");
		System.out.println();
		
		
	}

	
	public void change_Reset() // - 거스름돈 초기화 작업.
	{

		// 정산후 초기화
		c.setOhmanwon(0);	// 오만원의 개수를 0개로 초기화.
		c.setManwon(0);		// 일만원의 개수를 0개로 초기화.
		c.setOhchonwon(0);	// 오천원의 개수를 0개로 초기화.
		c.setChonwon(0);	// 일천원의 개수를 0개로 초기화.
		c.setOhbackwon(0);	// 오백원의 개수를 0개로 초기화.

		System.out.println();
		System.out.println("===================================================================");
        System.out.println("\t\t         【잔고 현황】");
        System.out.println("-------------------------------------------------------------------");
		System.out.println("     권종\t         장수");
		System.out.printf("·  오만원\t\t %d장%n",c.getOhmanwon());	// 오만원 개수
		System.out.printf("·  일만원\t\t %d장%n",c.getManwon());	// 일만원 개수
		System.out.printf("·  오천원\t\t %d장%n",c.getOhchonwon());// 오천원 개수
		System.out.printf("·  일천원\t\t %d장%n",c.getChonwon());	// 일천원 개수
		System.out.printf("·  오백원\t\t %d장%n",c.getOhbackwon());// 오백원 개수	
		System.out.println("-------------------------------------------------------------------");
	    System.out.println("===================================================================");
		System.out.println();
		
	}

	//거스름돈통 정산 메소드()
	//{거스름돈통의 값을 거스름돈 속성값에 담고 비우는 의미 }

	// class Money 속성에 담기도록 
	
	
	// 전진영
	//현금 매출 정산 메소드() - 현금 결제로 결제된 금액을 일 매출과 월매출에 쌓는다. 영수증 클래스에서 초기화 되기 전에 호출
	   public void money_Sales()
	   {
		   // 일 현금 매출액을 누적하기 위한 세팅값은 
           // 기존 일 현금매출액에 총결제금액을 더해주어야만 총 현금 매출 합계가 구해진다.
		   m.setBill_SalesD(m.getBill_SalesD() + Pay_Control.allPay);   
		   
		   m.setBill_SalesM(m.getBill_SalesM() + Pay_Control.allPay);
	   }

	
	//이채빈
	   //카드 매출 정산 메소드() - 카드 결제로 결제된 금액을 일 매출과 월매출에 쌓는다. 영수증 클래스에서 초기화 되기 전에 호출
	   public void card_Sales()
	   {
		   // 일 카드 매출액을 누적하기 위한 세팅값은 
           // 기존 일 카드매출액에 총결제금액을 더해주어야만 총 카드 매출 합계가 구해진다.
		   m.setCard_SalesD(m.getCard_SalesD() + Pay_Control.allPay);
	       m.setCard_SalesM(m.getCard_SalesM() + Pay_Control.allPay);
	   }

	//발주 금액 정산 메소드() 일을 기준.
	public void money_Balju()	// 수정 예정.
	{
		Balju_Price bp = new Balju_Price();	//발주가격 인스턴스 생성
		Inventory inventory = new Inventory();//재고 인스턴스 생성
		
		// 원두의 발주가격과 원두의 재고수량을 곱하여 원두의 발주금액을 누적변수 sum에 더해준다.
		sum += bp.getBean() * inventory.getNbean();

		// 자몽의 발주가격과 자몽의 재고수량을 곱하여 자몽의 발주금액을 누적변수 sum에 더해준다.
		sum += bp.getGrapefruit() * inventory.getNgrapefruit();

		// 원두 자몽과 같이 모든 재고의 가격과 재고수량을 곱한 재고의 발주금액을 누적변수 sum에 더해준다.
		sum += bp.getSpawater() * inventory.getNspawater();
		sum += bp.getYogurtpowder() * inventory.getNyogurtpowder();
		sum += bp.getTeabag() * inventory.getNteabag();
		sum += bp.getGoguma() * inventory.getNgoguma();
		sum += bp.getOrange() * inventory.getNorange();
		sum += bp.getCake() * inventory.getNcake();
		sum += bp.getBagel() * inventory.getNbagel();
		sum += bp.getScone() * inventory.getNscone();
		sum += bp.getMacaron() * inventory.getNmacaron();
		sum += bp.getCookie() * inventory.getNcookie();
		sum += bp.getCreamcheese() * inventory.getNcreamcheese();
		sum += bp.getStroberryjam() * inventory.getNstroberryjam();
		sum += bp.getWhipcream() * inventory.getNwhipcream();

		m.setBalju_moneyD(sum);					// 발주했던 모든 재고의 가격이 발주금액 변수에 담긴다.

		m.setBalju_moneyM(m.getBalju_moneyD()); // 일의 발주값이 월에 쌓이는 구조
	}


	//순수익 정산 메소드()
	//{ 매출 - 발주금액 }
	public int money_Profit()
	{
		int profit = m.getBill_SalesD() + m.getCard_SalesD() - c.getChange() - m.getBalju_moneyD(); 
	      //순수익 = 일 현금 매출액 + 일 카드매출액 - 잔고금액 - 발주금액

	      return profit;
	      //순수익 금액 리턴.
	}




	public void change_Inventory()	// 돌아가기 메소드
	{

		ManagerMenu m = new ManagerMenu();

		 while (true)
		 {
			 m.menuDisp();
			 m.menuSelect();
			 m.menuRun();
		 }
	}

}
