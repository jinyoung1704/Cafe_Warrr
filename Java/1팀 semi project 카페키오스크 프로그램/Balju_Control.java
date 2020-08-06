
import java.util.Scanner;


//발주 기능 클래스 (기능: 이채빈, 출력문: 최호석)
class Balju_Control	
{
	int cha;	//-- 실제로 발주한 수량을 담는 변수(자동발주 기준값 - 원래 있던 재고수 )  
	int all;	//-- 누적을 위해 임시로 값을 담는 변수
	
	// 다음날에도 유지될 재고 수량 담는 변수
	static int Nbean;			// 원두
	static int Nmilk;			// 우유
	static int Nchoco;			// 초코시럽
	static int Nvanilla;		// 바닐라시럽
	static int Nhazel;			// 헤이즐넛시럽
	static int Ncaramel;		// 카라멜시럽
	static int Ngrapefruit;		// 자몽
	static int Nspawater;		// 탄산수
	static int Nyogurtpowder;	// 요거트파우더
	static int Nteabag;			// 티백
	static int Ngoguma;			// 고구마
	static int Norange;			// 오렌지
	static int Ncake;			// 케이크
	static int Nbagel;			// 베이글
	static int Nscone;			// 스콘
	static int Nmacaron;		// 마카롱
	static int Ncookie;			// 쿠키
	static int Ncreamcheese;	// 크림치즈
	static int Nstroberryjam;	// 딸기잼
	static int Nwhipcream;		// 휘핑크림
	
	// 자동 발주값 설정 관리 메소드 - 품목마다 발주값 입력 받기 
	public void setGap()
	{	
		Scanner sc = new Scanner(System.in);
		Inventory inventory = new Inventory();
		
		System.out.println("자동 발주값을 설정하세요.");
		System.out.println();

		System.out.print("발주 기준값 : ");
		int standard = sc.nextInt();

		inventory.setBeanL(standard);	//1.원두
		inventory.setMilkL(standard);	//2.우유
		inventory.setChocoL(standard);	//3.초코시럽
		inventory.setVanillaL(standard);	//4.바닐라시럽
		inventory.setHazelL(standard);//5.헤이즐넛시럽
		inventory.setCaramelL(standard);//6.카라멜시럽
		inventory.setGrapefruitL(standard);//7.자몽
		inventory.setSpawaterL(standard);//8.탄산수
		inventory.setYogurtpowderL(standard);//9.요거트파우더
		inventory.setTeabagL(standard);//10.티백
		inventory.setGogumaL(standard);//11.고구마
		inventory.setOrangeL(standard);//12.오렌지
		inventory.setCakeL(standard);//13.케이크
		inventory.setBagelL(standard);//14.베이글
		inventory.setSconeL(standard);//15.스콘
		inventory.setMacaronL(standard);//16.마카롱
		inventory.setCookieL(standard);//17.쿠키
		inventory.setCreamcheeseL(standard);//18.크림치즈
		inventory.setStroberryjamL(standard);//19.딸기잼
		inventory.setWhipcreamL(standard);//20.휘핑크림
		 
	}

	// 전체 자동 발주 메소드 
	public void allAuto()
	{
		Inventory inventory = new Inventory();

		//test - 확인 
		//System.out.println(cha);
		
		// 원두 자동 발주 
		cha = (inventory.getBeanL()-inventory.getBean());	// 원두 자동 발주했을 때 진짜 채워지는 수량	
		all = inventory.getBean()+cha;						// 현재 원두 수량 = 원래 있던 원두 수량 + 진짜 채워지는 수량 
		Nbean += all;										// 현재 원두 수량을 누적해서 변수 Nbean 에 담는다
		inventory.setNbean(Nbean);							// 누적 변수에 누적 수량을 넣는다
		//test -- 확인
		//System.out.println(cha); 

		// 우유 자동 발주
		cha = (inventory.getMilkL()-inventory.getMilk());	 
		all	=  inventory.getMilk() + cha;
		Nmilk += all;				
		inventory.setNmilk(Nmilk);
		
		// 초코시럽 자동 발주
		cha = (inventory.getChocoL()-inventory.getChoco());	
		all = inventory.getChoco()+cha;
		Nchoco += all;
		inventory.setNchoco(Nchoco);

		// 바닐라시럽 자동 발주
		cha = (inventory.getVanillaL()-inventory.getVanilla());	
		all = inventory.getVanilla()+cha;
		Nvanilla += all;
		inventory.setNvanilla(Nvanilla);
		
		// 헤이즐넛시럽 자동 발주
		cha = (inventory.getHazelL()-inventory.getHazel());	
		all = inventory.getHazel()+cha;
		Nhazel += all;
		inventory.setNhazel(Nhazel);

		// 카라멜시럽 자동 발주
		cha = (inventory.getCaramelL()-inventory.getCaramel());	
		all = inventory.getCaramel()+cha;
		Ncaramel += all;
		inventory.setNcaramel(Ncaramel);

		// 자몽 자동 발주
		cha = (inventory.getGrapefruitL()-inventory.getGrapefruit());
		all = inventory.getGrapefruit()+cha;
		Ngrapefruit += all;
		inventory.setNgrapefruit(Ngrapefruit);

		// 탄산수 자동 발주
		cha = (inventory.getSpawaterL()-inventory.getSpawater());	
		all = inventory.getSpawater()+cha;
		Nspawater += all;
		inventory.setNspawater(Nspawater);

		// 요거트파우더 자동 발주
		cha = (inventory.getYogurtpowderL()-inventory.getYogurtpowder());	
		all = inventory.getYogurtpowder()+cha;
		Nyogurtpowder += all;
		inventory.setNyogurtpowder(Nyogurtpowder);

		// 티백 자동 발주
		cha = (inventory.getTeabagL()-inventory.getTeabag());	
		all = inventory.getTeabag()+cha;
		Nteabag += all;
		inventory.setNteabag(Nteabag);
		
		// 고구마 자동 발주
		cha = (inventory.getGogumaL()-inventory.getGoguma());	
		all = inventory.getGoguma()+cha;
		Ngoguma += all;
		inventory.setNgoguma(Ngoguma);
		
		// 오렌지 자동 발주
		cha = (inventory.getOrangeL()-inventory.getOrange());
		all = inventory.getOrange()+cha;
		Norange += all;
		inventory.setNorange(Norange);

		// 케이크 자동 발주
		cha = (inventory.getCakeL()-inventory.getCake());
		all = inventory.getCake()+cha;
		Ncake += all;
		inventory.setNcake(Ncake);

		// 베이글 자동 발주
		cha = (inventory.getBagelL()-inventory.getBagel());
		all = inventory.getBagel()+cha;
		Nbagel += all;
		inventory.setNbagel(Nbagel);
		
		// 스콘 자동 발주
		cha = (inventory.getSconeL()-inventory.getScone());	
		all = inventory.getScone()+cha;
		Nscone += all;
		inventory.setNscone(Nscone);
		
		// 마카롱 자동 발주
		cha = (inventory.getMacaronL()-inventory.getMacaron());	
		all = inventory.getMacaron()+cha;
		Nmacaron += all;
		inventory.setNmacaron(Nmacaron);
		
		// 쿠키 자동 발주
		cha = (inventory.getCookieL()-inventory.getCookie());	
		all = inventory.getCookie()+cha;
		Ncookie += all;
		inventory.setNcookie(Ncookie);
		
		// 크림치즈 자동 발주
		cha = (inventory.getCreamcheeseL()-inventory.getCreamcheese());	
		all = inventory.getCreamcheese()+cha;
		Ncreamcheese += all;
		inventory.setNcreamcheese(Ncreamcheese);
		
		// 딸기잼 자동 발주
		cha = (inventory.getStroberryjamL()-inventory.getStroberryjam());	
		all = inventory.getStroberryjam()+cha;
		Nstroberryjam += all;
		inventory.setNstroberryjam(Nstroberryjam);

		// 휘핑크림 자동 발주
		cha = (inventory.getWhipcreamL()-inventory.getWhipcream());	
		all = inventory.getWhipcream()+cha;
		Nwhipcream += all;
		inventory.setNwhipcream(Nwhipcream);
	
		System.out.println("전체 품목을 자동 발주하였습니다.");
		System.out.println();
		

	  // 최호석
	  System.out.println("===================================================================");
      System.out.println("\t\t\t   【재 고 현 황】");
	  System.out.println("===================================================================");
      System.out.println("-------------------------------------------------------------------");
	  System.out.println("   재고명\t          수량");
	  System.out.printf("·  원두\t\t  %d개%n", inventory.getNbean()); //1.원두
	  System.out.printf("·  우유\t\t  %d개%n", inventory.getNmilk()); //2.우유
	  System.out.printf("·  초코시럽\t\t  %d개%n",inventory.getNchoco());//3.초코시럽
	  System.out.printf("·  바닐라시럽\t\t  %d개%n",inventory.getNvanilla());//4.바닐라시럽
	  System.out.printf("·  헤이즐넛시럽\t  %d개%n",inventory.getNhazel());//5.헤이즐넛시럽
	  System.out.printf("·  카라멜시럽\t\t  %d개%n",inventory.getNcaramel());//6.카라멜시럽
	  System.out.printf("·  자몽\t\t  %d개%n",inventory.getNgrapefruit());//7.자몽
	  System.out.printf("·  탄산수\t\t  %d개%n",inventory.getNspawater());//8.탄산수
	  System.out.printf("·  요거트파우더\t  %d개%n",inventory.getNyogurtpowder());//9.요거트파우더
	  System.out.printf("·  티백\t\t  %d개%n",inventory.getNteabag());//10.티백
	  System.out.printf("·  고구마\t\t  %d개%n",inventory.getNgoguma());//11.고구마
	  System.out.printf("·  오렌지\t\t  %d개%n",inventory.getNorange());//12.오렌지
	  System.out.printf("·  케이크\t\t  %d개%n",inventory.getNcake());//13.케이크
	  System.out.printf("·  베이글\t\t  %d개%n",inventory.getNbagel());//14.베이글
	  System.out.printf("·  스콘\t\t  %d개%n",inventory.getNscone());//15.스콘
	  System.out.printf("·  마카롱\t\t  %d개%n",inventory.getNmacaron());//16.마카롱
	  System.out.printf("·  쿠키\t\t  %d개%n",inventory.getNcookie());//17.쿠키
	  System.out.printf("·  크림치즈\t\t  %d개%n",inventory.getNcreamcheese());//18.크림치즈
	  System.out.printf("·  딸기잼\t\t  %d개%n",inventory.getNstroberryjam());//19.딸기잼
	  System.out.printf("·  휘핑크림\t\t  %d개%n",inventory.getNwhipcream());//20.휘핑크림
	  System.out.println("-------------------------------------------------------------------");
	  System.out.println("===================================================================");
	  System.out.println();

		Money_Control mc = new Money_Control();

		mc.money_Balju();

	}
	
	// 부분 자동 발주 메소드
	public void auto()
	{
		String str;				//-- 품목 입력받는 변수
		int cha;				//-- 발주 수량 입력받는 변수 
		boolean flag = true;	//-- do while 문 반복 중단을 위한 변수 
		
		Inventory inventory = new Inventory();
		Scanner sc = new Scanner(System.in);
		
		do 
		{	
			System.out.println();
			System.out.print("자동 발주할 품목을 입력하세요 (발주를 마치려면 N을 눌러주세요) : ");
			str = sc.next();
			
			if(str.equals("우유"))
			{
				// 우유 발주
				cha = (inventory.getMilkL()-inventory.getMilk());	 
				all	=  inventory.getMilk() + cha;
				Nmilk += all;				
				inventory.setNmilk(Nmilk);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 우유 재고 : " + inventory.getNmilk());
				System.out.println();
			}
			
			if(str.equals("원두"))
			{	
				// 원두 발주 
				cha = (inventory.getBeanL()-inventory.getBean());	
				all = inventory.getBean()+cha;	
				Nbean += all;					
				inventory.setNbean(Nbean);
		
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 원두 재고 : " + inventory.getNbean());	
				System.out.println();
			}

			if(str.equals("초코시럽"))
			{
				// 초코시럽 자동 발주
				cha = (inventory.getChocoL()-inventory.getChoco());	
				all = inventory.getChoco()+cha;
				Nchoco += all;
				inventory.setNchoco(Nchoco);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 초코시럽 재고 : " + inventory.getNchoco());	
				System.out.println();
			}
			if(str.equals("바닐라시럽"))
			{
				// 바닐라시럽 자동 발주
				cha = (inventory.getVanillaL()-inventory.getVanilla());	
				all = inventory.getVanilla()+cha;
				Nvanilla += all;
				inventory.setNvanilla(Nvanilla);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 바닐라시럽 재고 : " + inventory.getNvanilla());	
				System.out.println();
			}
			if(str.equals("헤이즐넛시럽"))
			{
				// 헤이즐넛시럽 자동 발주
				cha = (inventory.getHazelL()-inventory.getHazel());	
				all = inventory.getHazel()+cha;
				Nhazel += all;
				inventory.setNhazel(Nhazel);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 헤이즐넛시럽 재고 : " + inventory.getNhazel());	
				System.out.println();
			}

			if(str.equals("카라멜시럽"))
			{
				// 카라멜시럽 자동 발주
				cha = (inventory.getCaramelL()-inventory.getCaramel());	
				all = inventory.getCaramel()+cha;
				Ncaramel += all;
				inventory.setNcaramel(Ncaramel);
	
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 카라멜시럽 재고 : " + inventory.getNcaramel());	
				System.out.println();
			}

			if(str.equals("자몽"))
			{
				// 자몽 자동 발주
				cha = (inventory.getGrapefruitL()-inventory.getGrapefruit());
				all = inventory.getGrapefruit()+cha;
				Ngrapefruit += all;
				inventory.setNgrapefruit(Ngrapefruit);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 자몽 재고 : " + inventory.getNgrapefruit());
				System.out.println();
			}

			if(str.equals("탄산수"))
			{
				// 탄산수 자동 발주	
				cha = (inventory.getSpawaterL()-inventory.getSpawater());	
				all = inventory.getSpawater()+cha;
				Nspawater += all;
				inventory.setNspawater(Nspawater);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 탄산수 재고 : " + inventory.getNspawater());
				System.out.println();
			}

			if(str.equals("요거트파우더"))
			{
				// 요거트파우더 자동 발주
				cha = (inventory.getYogurtpowderL()-inventory.getYogurtpowder());	
				all = inventory.getYogurtpowder()+cha;
				Nyogurtpowder += all;
				inventory.setNyogurtpowder(Nyogurtpowder);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 요거트파우더 재고 : " + inventory.getNyogurtpowder());
				System.out.println();
			}

			if(str.equals("티백"))
			{
				// 티백 자동 발주
				cha = (inventory.getTeabagL()-inventory.getTeabag());	
				all = inventory.getTeabag()+cha;
				Nteabag += all;
				inventory.setNteabag(Nteabag);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 티백 재고 : " + inventory.getNteabag());
				System.out.println();
			}

				if(str.equals("고구마"))
			{
				// 고구마 자동 발주
				cha = (inventory.getGogumaL()-inventory.getGoguma());	
				all = inventory.getGoguma()+cha;
				Ngoguma += all;
				inventory.setNgoguma(Ngoguma);
		
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 고구마 재고 : " + inventory.getNgoguma());
				System.out.println();
			}

				if(str.equals("오렌지"))
			{
				// 오렌지 자동 발주
				cha = (inventory.getOrangeL()-inventory.getOrange());
				all = inventory.getOrange()+cha;
				Norange += all;
				inventory.setNorange(Norange);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 오렌지 재고 : " + inventory.getNorange());
				System.out.println();
			}

				if(str.equals("케이크"))
			{
				// 케이크 자동 발주
				cha = (inventory.getCakeL()-inventory.getCake());
				all = inventory.getCake()+cha;
				Ncake += all;
				inventory.setNcake(Ncake);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 케이크 재고 : " + inventory.getNcake());
				System.out.println();
			}

				if(str.equals("베이글"))
			{
				// 베이글 자동 발주
				cha = (inventory.getBagelL()-inventory.getBagel());
				all = inventory.getBagel()+cha;
				Nbagel += all;
				inventory.setNbagel(Nbagel);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 베이글 재고 : " + inventory.getNbagel());
				System.out.println();
			}

				if(str.equals("스콘"))
			{
				// 스콘 자동 발주
				cha = (inventory.getSconeL()-inventory.getScone());	
				all = inventory.getScone()+cha;
				Nscone += all;
				inventory.setNscone(Nscone);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 스콘 재고 : " + inventory.getNscone());
				System.out.println();
			}

				if(str.equals("마카롱"))
			{
				// 마카롱 자동 발주
				cha = (inventory.getMacaronL()-inventory.getMacaron());	
				all = inventory.getMacaron()+cha;
				Nmacaron += all;
				inventory.setNmacaron(Nmacaron);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 마카롱 재고 : " + inventory.getNmacaron());
				System.out.println();
			}

				if(str.equals("쿠키"))
			{
				// 쿠키 자동 발주
				cha = (inventory.getCookieL()-inventory.getCookie());	
				all = inventory.getCookie()+cha;
				Ncookie += all;
				inventory.setNcookie(Ncookie);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 쿠키 재고 : " + inventory.getNcookie());
				System.out.println();
			}

				if(str.equals("크림치즈"))
			{
				// 크림치즈 자동 발주
				cha = (inventory.getCreamcheeseL()-inventory.getCreamcheese());	
				all = inventory.getCreamcheese()+cha;
				Ncreamcheese += all;
				inventory.setNcreamcheese(Ncreamcheese);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 크림치즈 재고 : " + inventory.getNcreamcheese());
				System.out.println();
			}

				if(str.equals("딸기잼"))
			{
				// 딸기잼 자동 발주
				cha = (inventory.getStroberryjamL()-inventory.getStroberryjam());	
				all = inventory.getStroberryjam()+cha;
				Nstroberryjam += all;
				inventory.setNstroberryjam(Nstroberryjam);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 딸기잼 재고 : " + inventory.getNstroberryjam());
				System.out.println();
			}
			
				if(str.equals("휘핑크림"))
			{
				// 휘핑크림 자동 발주
				cha = (inventory.getWhipcreamL()-inventory.getWhipcream());	
				all = inventory.getWhipcream()+cha;
				Nwhipcream += all;
				inventory.setNwhipcream(Nwhipcream);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 휘핑크림 재고 : " + inventory.getNwhipcream());
				System.out.println();
			}

			
			if(str.equals("N"))
			{
				System.out.println("발주를 마칩니다.");
				System.out.println();
				flag = false;
			}
		}
		while(flag);

		Money_Control mc = new Money_Control();

		mc.money_Balju();
			
	}


	// 수동 발주 메소드 - 품목 선택하고 관리자가 입력한 수량만큼 재고 증가 
	public void self()
	{	
		String str;				//-- 품목 입력받는 변수
		int su;					//-- 수량 입력받는 변수
		boolean flag = true;	//-- do while 문 반복 중단을 위한 변수
	
		
		Scanner sc = new Scanner(System.in);

		Inventory inventory = new Inventory();
		
		do
		{	
			System.out.println();
			System.out.print("발주할 품목을 입력하세요 (발주를 마치려면 N을 눌러주세요) : ");
			str = sc.next();
			
			if(str.equals("우유"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				inventory.setNmilk(inventory.getNmilk()+su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 우유 재고 : " + inventory.getNmilk());
			}
			

			if(str.equals("원두"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				
				inventory.setNbean(inventory.getNbean()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 원두 재고 : " + inventory.getNbean());	
				
			}

			if(str.equals("초코시럽"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				inventory.setNchoco(inventory.getNchoco()+su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 초코시럽 재고 : " + inventory.getNchoco());	
				
			}

			if(str.equals("바닐라시럽"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				inventory.setNvanilla(inventory.getNvanilla()+su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 바닐라시럽 재고 : " + inventory.getNvanilla());	
				
			}

			if(str.equals("헤이즐넛시럽"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				inventory.setNhazel(inventory.getNhazel()+su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 헤이즐넛시럽 재고 : " + inventory.getNhazel());	
				
			}

			if(str.equals("카라멜시럽"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				inventory.setNcaramel(inventory.getNcaramel()+su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 카라멜시럽 재고 : " + inventory.getNcaramel());	
				
			}

			if(str.equals("자몽"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				inventory.setNgrapefruit(inventory.getNgrapefruit()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 자몽 재고 : " + inventory.getNgrapefruit());
				
			}

			if(str.equals("탄산수"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				inventory.setNspawater(inventory.getNspawater()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 탄산수 재고 : " + inventory.getNspawater());
				
			}

			if(str.equals("요거트파우더"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();
				
				inventory.setNyogurtpowder(inventory.getNyogurtpowder()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 요거트파우더 재고 : " + inventory.getNyogurtpowder());
				
			}

			if(str.equals("티백"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();
			
				inventory.setNteabag(inventory.getNteabag()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 티백 재고 : " + inventory.getNteabag());
				
			}

			if(str.equals("고구마"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				inventory.setNgoguma(inventory.getNgoguma()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 고구마 재고 : " + inventory.getNgoguma());
				
			}

			if(str.equals("오렌지"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				inventory.setNorange(inventory.getNorange()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 오렌지 재고 : " + inventory.getNorange());
				
			}

			if(str.equals("케이크"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();
				
				System.out.println();
				inventory.setNcake(inventory.getNcake()+su);
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 케이크 재고 : " + inventory.getNcake());
				
			}

			if(str.equals("베이글"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				inventory.setNbagel(inventory.getNbagel()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 베이글 재고 : " + inventory.getNbagel());
				
			}

			if(str.equals("스콘"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				inventory.setNscone(inventory.getNscone()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 스콘 재고 : " + inventory.getNscone());
				
			}

			if(str.equals("마카롱"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();
		
				inventory.setNmacaron(inventory.getNmacaron()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 마카롱 재고 : " + inventory.getNmacaron());
				
			}

			if(str.equals("쿠키"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				inventory.setNcookie(inventory.getNcookie()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 쿠키 재고 : " + inventory.getNcookie());
				
			}

			if(str.equals("크림치즈"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				inventory.setNcreamcheese(inventory.getNcreamcheese()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 크림치즈 재고 : " + inventory.getNcreamcheese());
				
			}

			if(str.equals("딸기잼"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				inventory.setNstroberryjam(inventory.getNstroberryjam()+su);
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 딸기잼 재고 : " + inventory.getNstroberryjam());
				
			}
			
			if(str.equals("휘핑크림"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				inventory.setNwhipcream(inventory.getNwhipcream()+su);
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 휘핑크림 재고 : " + inventory.getNwhipcream());
				
			}


			if(str.equals("N"))
			{
				System.out.println();
				System.out.println("발주를 마칩니다.");
				System.out.println();
				flag = false;
			}
			
		}
		while(flag);

		Money_Control mc = new Money_Control();

		mc.money_Balju();
			
	}

	// 발주 종료하고 이전으로 돌아가는 메소드 
	public void exit(){
	ManagerMenu m = new ManagerMenu();
	while (true)
	{
	   m.menuDisp();
	   m.menuSelect();
	   m.menuRun();
	}
}


}