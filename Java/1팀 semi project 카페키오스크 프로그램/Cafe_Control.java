//※ time_sales() 는 Time 클래스 연동, today_coffee() 메소드는 판매량 class가 연동되어야한다.
//sold_out() 메소드의 경우, Cafe_Menus 클래스와 inventory 클래스를 연동한다.
//sold_out() 메소드는 사용자에게 SOLD OUT을 알리는 기능까지 구현됨.(모든 품목 다 추가해야함)
//sold_out() 메소드가 실제 Cafe_Control 클래스에서 SOLD OUT 메뉴 주문을 막게 하는 방법은 고민해야함...

import java.util.TreeSet;
import java.util.Iterator;

// 메뉴 선택에서 사용되는 기능 클래스
class Cafe_Control	
{
	String todayMenu;
	public int[] todaynum = {1,2,3,4,5,6,7}; //어떤 커피를 시켰는지 확인하기 위해 커피의 고유번호를 연결
											//에스프레소 1번 아메리카노 2번...어느 클래스에서든 동일한 번호
   
   // 랜덤 커피 할인 메소드(전진영)
   public void today_coffee()
   {
      Sales s = new Sales();//판매량 클래스 인스턴스 생성
      
      int[] num = {s.getSespresso(),s.getSamericano(),s.getSlatte(),s.getScafeMoca(),s.getScappuccino(),s.getSvanillaLatte(),s.getScaramelM()};
      //배열 num에 각 커피의 판매량들을 담음
      //예를 들어 {7,6,5,4,3,2,1} 이렇게 담김

      String menu[] = {"에스프레소","아메리카노","카페라떼","카페모카","카푸치노","바닐라라떼","카라멜라떼"};
      //판매량 개수 num에 담긴거랑 menu 이름을 연결
      //num0번지가 menu[0],num[1] =menu[1] ...

      //문자배열을 받을 변수 
      String temp;

      //판매량의 자리가 바뀐다면 메뉴의 자리도 바뀌어야 함
      for(int i=0;i<num.length-1;i++) //0 1 2 3 ...기준 
      {

         for(int j=i+1;j<num.length;j++) //비교대상 1234567 234567 34567 4567
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
      
      //랜덤 커피 할인 메뉴 변수선언
       todayMenu = menu[0]; //메뉴 0번지(판매량이 가장 적은 것)를 랜덤 커피 할인 메뉴 변수에 담음
	
 }

	public void today_coffee_print()
   {	
	  today_coffee();
      //만약 판매량이 똑같다면 그냥 메뉴 순서 중 첫번째에 있는게 랜덤 커피 할인 메뉴임
	  System.out.println("-------------------------------------------------------------------");
      System.out.println("                     랜덤 커피 할인 : " + todayMenu+"                 ");
	 
    }
	

	// Sold Out  메소드 - 재고량 연동
	// Inventory 클래스, Cafe_Menus 클래스와 연동되어 사용된다.
	// 두 개의 재료가 SOLD OUT이 되었을 때, 중복되는 SOLD OUT 메뉴가 있어 출력이 중복된다.
	// → 중복을 허용하지 않는 TreeSet 자료구조를 사용해봅니다
	////////////////////////////////////////////////////////////////////
	// 자료구조 TreeSet 생성 (참조변수 so_out 은 Sold Out Menus 라는 뜻)
	static TreeSet<String> so_menus = new TreeSet<String>();
	
	// sold out 연산 메소드(기능: 주한별, 내용: 이채빈)
	void sold_out()
	{
		// Inventory 인스턴스 생성
		Inventory inventory = new Inventory();
		
		// 인벤토리의 bean 변수의 값이 0일때
		if(inventory.getNbean()==0)
		{
			// sold out 표시
			// 원두가 들어간 모든 음료
			// Sold out bean → 원두가 없을 시 SOLD OUT 처리되는 음료들
			String[] so_bean = {" 에스프레소        ", 
								" 아메리카노        ", 
								" 카페라떼          ", 
								" 카페모카          ", 
								" 카푸치노          ", 
								" 바닐라라떼        ", 
								" 카라멜마끼아또    "};
			
			// 배열을 반복문을 이용해 so_menus TreeSet 자료구조에 더하기
			for (String i:so_bean)
			{
				so_menus.add(i);
			}

			//Test로 담긴 TreeSet을 출력해보자 → 확인 완료!
			/*
			for (String Test: so_menus)
			{
				System.out.println(Test);
			}
			*/
			
		}
		
		
		// 인벤토리의 milk 변수의 값이 0일때 
		if(inventory.getNmilk() == 0)
		{
			// sold out 표시
			// 우유가 들어간 모든 음료
			String[] so_milk = {" 카페라떼          ", 
								" 카페모카          ",
								" 카푸치노          ", 
								" 바닐라라떼        ", 
								" 카라멜마끼아또    ",
								" 고구마라떼        "};
								
			// 배열을 반복문을 이용해 so_menus TreeSet 자료구조에 더하기
			for (String i:so_milk)
			{
				so_menus.add(i);
			}
			
		}
		
			

		// 인벤토리의 choco 변수의 값이 0일때 
		if(inventory.getNchoco()==0)
		{
			
			String[] so_choco =  {" 카페모카          "};
								//" 카라멜마끼아또    "
			// 배열을 반복문을 이용해 so_menus 자료구조에 더하기
			for (String i:so_choco)
			{
				so_menus.add(i);
			}
		}
		

		if(inventory.getNvanilla()==0)
		{
			String[] so_vanilla =  {" 바닐라시럽 추가   "};
								  //" 카라멜마끼아또    "
			// 배열을 반복문을 이용해 so_menus 자료구조에 더하기
			for (String i:so_vanilla)
			{
				so_menus.add(i);
			}
		}

	

		if(inventory.getNhazel()==0)
		{
			String[] so_hazel =  {" 헤이즐넛 시럽 추가"};
								//" 카라멜마끼아또    "
			// 배열을 반복문을 이용해 so_menus 자료구조에 더하기
			for (String i:so_hazel)
			{
				so_menus.add(i);
			}
		}
		
		

		if(inventory.getNcaramel()==0)
		{
			String[] so_caramel =  {" 카라멜마끼아또    "
								   ," 카라멜 시럽 추가  "};
								  //" 카라멜마끼아또    "
			// 배열을 반복문을 이용해 so_menus 자료구조에 더하기
			for (String i:so_caramel)
			{
				so_menus.add(i);
			}
		}
		
		

		if(inventory.getNgrapefruit()==0||inventory.getNspawater()==0)
		{
			String[] so_grapefruit =  {" 자몽에이드        "};
									 //" 카라멜마끼아또    "
			// 배열을 반복문을 이용해 so_menus 자료구조에 더하기
			for (String i:so_grapefruit)
			{
				so_menus.add(i);
			}
		}
		
		

		if(inventory.getNyogurtpowder()==0)
		{
			String[] so_yogurtpowder =  {" 요거트스무디      "};
									   //" 카라멜마끼아또    "
			// 배열을 반복문을 이용해 so_menus 자료구조에 더하기
			for (String i:so_yogurtpowder)
			{
				so_menus.add(i);
			}
		}
		

		
		if(inventory.getNteabag()==0)
		{
			String[] so_teabag =  {" 히비스커스티      "};
								// " 카라멜마끼아또    "
			// 배열을 반복문을 이용해 so_menus 자료구조에 더하기
			for (String i:so_teabag)
			{
				so_menus.add(i);
			}
		}
		

		if(inventory.getNgoguma()==0)
		{
			String[] so_goguma =  {" 고구마라떼        "};
								 //" 카라멜마끼아또    "
			// 배열을 반복문을 이용해 so_menus 자료구조에 더하기
			for (String i:so_goguma)
			{
				so_menus.add(i);
			}
		}
		

		if(inventory.getNorange()==0)
		{
			String[] so_orange =  {" 오렌지주스        "};
								 //" 카라멜마끼아또    "
			// 배열을 반복문을 이용해 so_menus 자료구조에 더하기
			for (String i:so_orange)
			{
				so_menus.add(i);
			}
		}
		

		if(inventory.getNcake()==0)
		{
			String[] so_cake =  {" 케이크            "};
							   //" 카라멜마끼아또    "
			// 배열을 반복문을 이용해 so_menus 자료구조에 더하기
			for (String i:so_cake)
			{
				so_menus.add(i);
			}
		}
		
		if(inventory.getNbagel()==0)
		{
			String[] so_bagel =  {" 베이글            "};
							    //" 카라멜마끼아또    "
			// 배열을 반복문을 이용해 so_menus 자료구조에 더하기
			for (String i:so_bagel)
			{
				so_menus.add(i);
			}
		}
		

		if(inventory.getNscone()==0)
		{
			String[] so_scone =  {" 스콘              "};
								//" 카라멜마끼아또    "
			// 배열을 반복문을 이용해 so_menus 자료구조에 더하기
			for (String i:so_scone)
			{
				so_menus.add(i);
			}
		}


		if(inventory.getNmacaron()==0)
		{
		
			String[] so_macaron =  {" 마카롱            "};
								  //" 카라멜마끼아또    "
			// 배열을 반복문을 이용해 so_menus 자료구조에 더하기
			for (String i:so_macaron)
			{
				so_menus.add(i);
			}
		}
		

		if(inventory.getNstroberryjam()==0)
		{
			String[] so_stroberryjam =   {" 딸기잼            "};
									    //" 카라멜마끼아또    "
			// 배열을 반복문을 이용해 so_menus 자료구조에 더하기
			for (String i:so_stroberryjam)
			{
				so_menus.add(i);
			}
		}
	

		if(inventory.getNcreamcheese()==0)
		{
			String[] so_creamcheese =  {" 크림치즈          "};
									  //" 카라멜마끼아또    "
			// 배열을 반복문을 이용해 so_menus 자료구조에 더하기
			for (String i:so_creamcheese)
			{
				so_menus.add(i);
			}
		}
		

		if(inventory.getNwhipcream()==0)
		{
			String[] so_whipcream =  {" 휘핑크림 추가     "};
									//" 카라멜마끼아또    "
			// 배열을 반복문을 이용해 so_menus 자료구조에 더하기
			for (String i:so_whipcream)
			{
				so_menus.add(i);
			}
		}
	
	
			
	}// sold_out() 종료
	
	
	// SOLD OUT 출력을 위한 메소드(주한별)
	void so_print()	
	{
		Cafe_Control c = new Cafe_Control();
		c.sold_out();
		
		// Iterator를 통해 출력해보기
		Iterator<String> it = so_menus.iterator();
		
		// 해당 출력문은 SOLD OUT 음료가 있을 경우만 출력된다.
		// 즉, so_menus TreeSet 자료구조가 비어있을 경우에만 출력된다.
		if(so_menus.isEmpty()!=true)	// isEmpty()는 자료구조가 비어있는지 아닌지 boolean값을 반환한다.
		{
			System.out.println("                          SOLD OUT (주문 불가)       ");
			System.out.println("-------------------------------------------------------------------");
		
		
			int i=1;
			// Iterator를 출력하기 위한 while 반복문
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
		
			so_menus.clear(); // 자료구조 초기화 

		}
		
	} 	//so_print() 종료	

}