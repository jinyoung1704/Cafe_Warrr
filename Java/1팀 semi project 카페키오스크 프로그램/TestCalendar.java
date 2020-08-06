import java.util.Calendar;
//전진영
class TestCalendar //시연을 위해 날짜가 바뀌고 바꼈을 때 기능들을 보여주기 위한 클래스
{
	static int sumCustomer=0; //날짜를 바꾸기 위한 누적 손님 수 선언
	static int datePlus;//날짜 더해주기.날이 1번 바뀌면 1 더하고 2번 바뀌면 2 더하고

	public void calendar()
	{
		Calendar cal = Calendar.getInstance();//달력 인스턴스 생성

		
		Receipt rec = new Receipt(); //영수증 인스턴스 생성(손님수를 불러오기 위해)
		Money money = new Money();   //매출 인스턴스 생성(매출을 초기화 시키기 위해)
		Sales_Control sc = new Sales_Control(); //판매량 인스턴스 생성

		//날짜 테스트
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);

		sumCustomer += 1; //손님 수는 한명씩 늘어남  

		if((sumCustomer)%2 == 0 && (sumCustomer) != 0) //손님이 2명 오면 날짜가 바뀜 0명일 땐 적용안됨
		{
			datePlus= datePlus+1; 
			rec.setCustomer(0); //하루 손님 수 초기화 
			money.setCard_SalesD(0); //일별 카드값 초기화
			money.setBill_SalesD(0); //일별 현금값 초기화
			money.setBalju_moneyD(0); //일별 발주 금액 초기화

			// 총 판매량 누적시키는 메소드  
			sc.saveSales();
			resetSales();// 일별 판매량 초기화
			//resetChange();//거스름돈 초기화

					
	
		}

	}

	//날짜가 바뀌면 모든 메뉴 판매량 초기화
	void resetSales()
	{
		Sales sa = new Sales(); //판매량 클래스 인스턴스 생성

		  // ① 커피류
		   sa.setSespresso(0);
		   sa.setSamericano(0);   
		   sa.setSlatte(0);
		   sa.setScafeMoca(0);
		   sa.setScappuccino(0);
		   sa.setSvanillaLatte(0);
		   sa.setScaramelM(0);
		   
		   // ② 논커피류
		   sa.setSjamongAde(0);
		   sa.setSyogurt(0);
		   sa.setStea(0);
		   sa.setSorangeJuice(0);
		   sa.setSgogumaLatte(0);
		   
		   // ③ 디저트류 
		   sa.setScake(0);
		   sa.setSbagel(0);
		   sa.setSscone(0);
		   sa.setSmacaron(0);
		   sa.setScookie(0);



	}

	//날짜가 바뀌면 거스름돈 초기화
	void resetChange()
	{
		Change ch = new Change(); //거스름돈 클래스 인스턴스 생성

		ch.setOhmanwon(0);
		ch.setManwon(0);
		ch.setOhchonwon(0);
		ch.setChonwon(0);
		ch.setOhbackwon(0);
	}
	
}
