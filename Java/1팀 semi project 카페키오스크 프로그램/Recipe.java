// 재고 줄어들게 하는 기능 클래스(주한별)
public class Recipe
{
	// Inventory 인스턴스 생성
	Inventory inventory = new Inventory();
	
	// ① 커피류 레시피 메소드
	
	// 에프스레소 레시피 메소드 -원두
	protected void espresso_recipe()
	{ 
		
		// 커피원두 1개 inventory에서 빼기
		int inven_bean=inventory.getNbean();
		inventory.setNbean(inven_bean-=1);
		// Test (inventory 클래스에서 Bean이 하나 줄었는지)
		//System.out.println(inventory.getBean());
		//--==>> 2 (OK)
		
		  
		
	} // espresso_recipe() 완료
	

	// 아메리카노 레시피 메소드 -원두
	protected void americano_recipe()
	{ 
		
		// 커피원두 1개 inventory에서 빼기
		int inven_bean=inventory.getNbean();
		inventory.setNbean(inven_bean-=1);
		// Test (inventory 클래스에서 Bean이 하나 줄었는지)
		//System.out.println(inventory.getBean());
		//--==>> 2 (OK)
		
		  
		
	} // americano_recipe() 완료
	
	
	
	// 라테 레시피 메소드 -우유, -원두
	protected void latte_recipe()	// americano_recipe()와 같은 방식으로
	{
		
		// 커피원두 1개 inventory에서 빼기
		int inven_bean=inventory.getNbean();
		inventory.setNbean(inven_bean-=1);
		
		// 우유 1개 inventory에서 빼기
		int inven_milk =inventory.getNmilk();
		inventory.setNmilk(inven_milk-=1);
		

		
	} // latte_recipe() 완료
	
	// 카페모카 레시피 메소드
	protected void cafeMoca_recipe()
	{
		
		// 커피원두 1개 inventory에서 빼기
		int inven_bean=inventory.getNbean();
		inventory.setNbean(inven_bean-=1);
		
		// 우유 1개 inventory에서 빼기
		int inven_milk =inventory.getNmilk();
		inventory.setNmilk(inven_milk-=1);
		
		// 초코시럽 1개 inventory에서 빼기
		int inven_choco =inventory.getNchoco();
		inventory.setNchoco(inven_choco-=1);
		
	}// cafeMoca_recipe() 완료
	
	// 카푸치노 레시피 메소드
	protected void cappuccino_recipe()
	{
		
		// 커피원두 1개 inventory에서 빼기
		int inven_bean=inventory.getNbean();
		inventory.setNbean(inven_bean-=1);
		
		// 우유 1개 inventory에서 빼기
		int inven_milk =inventory.getNmilk();
		inventory.setNmilk(inven_milk-=1);

	}
	
	// 바닐라라떼 레시피 메소드
	protected void vanillaLatte_recipe()
	{
		
		// 커피원두 1개 inventory에서 빼기
		int inven_bean=inventory.getNbean();
		inventory.setNbean(inven_bean-=1);
		
		// 우유 1개 inventory에서 빼기
		int inven_milk =inventory.getNmilk();
		inventory.setNmilk(inven_milk-=1);
		
		// 바닐라 1개 inventory에서 빼기
		int inven_vanilla =inventory.getNvanilla();
		inventory.setNvanilla(inven_vanilla-=1);

	}// vanillaLatte_recipe() 완료
	
	// 카라멜마끼아또 레시피 메소드
	protected void caramelM_recipe()
	{
		
		// 커피원두 1개 inventory에서 빼기
		int inven_bean=inventory.getNbean();
		inventory.setNbean(inven_bean-=1);
		
		// 우유 1개 inventory에서 빼기
		int inven_milk =inventory.getNmilk();
		inventory.setNmilk(inven_milk-=1);
		
		// 카라멜 시럽 1개 inventory에서 빼기
		int inven_caramel =inventory.getNcaramel();
		inventory.setNcaramel(inven_caramel-=1);

	}
	
// ② 논커피류 레시피 메소드
	
	// 자몽에이드 레시피 메소드
	protected void jamongAde_recipe()
	{
		
		// 자몽 1개 inventory에서 빼기
		int inven_grapefruit=inventory.getNgrapefruit();
		inventory.setNgrapefruit(inven_grapefruit-=1);
		
		// 탄산수 1개 inventory에서 빼기
		int inven_spawater =inventory.getNspawater();
		inventory.setNspawater(inven_spawater-=1);
		

	} // jamongAde_recipe() 완료
	
	// 요거트스무디 레시피 메소드
	protected void yogurt_recipe()
	{
		
		// 요거트 1개 inventory에서 빼기
		int inven_yogurtpowder=inventory.getNyogurtpowder();
		inventory.setNyogurtpowder(inven_yogurtpowder-=1);
		
		
	}
	
	// 티 레시피 메소드
	protected void tea_recipe()
	{
		
		// 티 1개 inventory에서 빼기
		int inven_teabag=inventory.getNteabag();
		inventory.setNteabag(inven_teabag-=1);
		
		
	}
	
	// 오렌지주스 레시피 메소드
	protected void orangeJuice_recipe()
	{
		
		// 오랜지 1개 inventory에서 빼기
		int inven_orange=inventory.getNorange();
		inventory.setNorange(inven_orange-=1);
		
		
	}
	// 고구마라떼 레시피 메소드
	protected void gogumaLatte_recipe()
	{
		
		// 고구마 1개 inventory에서 빼기
		int inven_goguma=inventory.getNgoguma();
		inventory.setGoguma(inven_goguma-=1);
		
		// 우유 1개 inventory에서 빼기
		int inven_milk =inventory.getNmilk();
		inventory.setNmilk(inven_milk-=1);
		
	}
	
	// ③ 디저트 레시피 메소드
	
	// 케이크 레시피 메소드
	protected void cake_recipe()
	{
		
		// 케이크 1개 inventory에서 빼기
		int inven_cake=inventory.getNcake();
		inventory.setNcake(inven_cake-=1);

		
	}
	
	// 베이글 레시피 메소드
	protected void bagel_recipe()
	{
		
		// 베이글 1개 inventory에서 빼기
		int inven_bagel=inventory.getNbagel();
		inventory.setNbagel(inven_bagel-=1);

		
	}
	
	protected void scone_recipe()
	{
		
		// 스콘 1개 inventory에서 빼기
		int inven_scone=inventory.getNscone();
		inventory.setNscone(inven_scone-=1);
		
	}
	
	// 마카롱 레시피 메소드
	protected void macaron_recipe()
	{
		
		// 마카롱 1개 inventory에서 빼기
		int inven_macaron=inventory.getNmacaron();
		inventory.setNmacaron(inven_macaron-=1);
		
	}
	
	// 쿠키 레시피 메소드
	protected void cookie_recipe()
	{
		
		// 쿠키 1개 inventory에서 빼기
		int inven_cookie=inventory.getNcookie();
		inventory.setNcookie(inven_cookie-=1);
		
		
	}
	
	// ④ 옵션 레시피 메소드
	
	// 샷 옵션 메소드
	protected void shot_recipe()
	{
		
		// 원두 1개 inventory에서 빼기
		int inven_bean=inventory.getNbean();
		inventory.setNbean(inven_bean-=1);
		
		
	}
	
	// 바닐라 시럽 옵션 메소드
	protected void vanilla_recipe()
	{
		
		// 바닐라 1개 inventory에서 빼기
		int inven_vanilla =inventory.getNvanilla();
		inventory.setNvanilla(inven_vanilla-=1);
		
	}
	
	// 초코 시럽 옵션 메소드
	protected void choco_recipe()
	{
		
		// 초코시럽 1개 inventory에서 빼기
		int inven_choco =inventory.getNchoco();
		inventory.setNchoco(inven_choco-=1);
		
		
	}
	
	// 헤이즐넛 시럽 옵션 메소드
	protected void hazel_recipe()
	{
		
		// 헤이즐넛시럽 1개 inventory에서 빼기
		int inven_hazel =inventory.getNhazel();
		inventory.setNhazel(inven_hazel-=1);
		
		
	}
	
	// 휘핑크림 옵션 메소드
	protected void whipcream_recipe()
	{
		
		// 휘핑 1개 inventory에서 빼기
		int inven_whipcream=inventory.getNwhipcream();
		inventory.setNwhipcream(inven_whipcream-=1);
		
		
	}
	
	// 크림치즈 메소드
	protected void creamcheese_recipe()
	{
		
		// 크림치즈 1개 inventory에서 빼기
		int inven_creamcheese=inventory.getNcreamcheese();
		inventory.setNcreamcheese(inven_creamcheese-=1);
		
		
	}
	
	// 딸기잼 메소드
	protected void jam_recipe()
	{
		
		// 딸기잼 1개 inventory에서 빼기
		int inven_stroberryjam=inventory.getNstroberryjam();
		inventory.setNstroberryjam(inven_stroberryjam-=1);
		
		
	}
		
}