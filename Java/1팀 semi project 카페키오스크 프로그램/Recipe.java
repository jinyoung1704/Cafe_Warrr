// ��� �پ��� �ϴ� ��� Ŭ����(���Ѻ�)
public class Recipe
{
	// Inventory �ν��Ͻ� ����
	Inventory inventory = new Inventory();
	
	// �� Ŀ�Ƿ� ������ �޼ҵ�
	
	// ���������� ������ �޼ҵ� -����
	protected void espresso_recipe()
	{ 
		
		// Ŀ�ǿ��� 1�� inventory���� ����
		int inven_bean=inventory.getNbean();
		inventory.setNbean(inven_bean-=1);
		// Test (inventory Ŭ�������� Bean�� �ϳ� �پ�����)
		//System.out.println(inventory.getBean());
		//--==>> 2 (OK)
		
		  
		
	} // espresso_recipe() �Ϸ�
	

	// �Ƹ޸�ī�� ������ �޼ҵ� -����
	protected void americano_recipe()
	{ 
		
		// Ŀ�ǿ��� 1�� inventory���� ����
		int inven_bean=inventory.getNbean();
		inventory.setNbean(inven_bean-=1);
		// Test (inventory Ŭ�������� Bean�� �ϳ� �پ�����)
		//System.out.println(inventory.getBean());
		//--==>> 2 (OK)
		
		  
		
	} // americano_recipe() �Ϸ�
	
	
	
	// ���� ������ �޼ҵ� -����, -����
	protected void latte_recipe()	// americano_recipe()�� ���� �������
	{
		
		// Ŀ�ǿ��� 1�� inventory���� ����
		int inven_bean=inventory.getNbean();
		inventory.setNbean(inven_bean-=1);
		
		// ���� 1�� inventory���� ����
		int inven_milk =inventory.getNmilk();
		inventory.setNmilk(inven_milk-=1);
		

		
	} // latte_recipe() �Ϸ�
	
	// ī���ī ������ �޼ҵ�
	protected void cafeMoca_recipe()
	{
		
		// Ŀ�ǿ��� 1�� inventory���� ����
		int inven_bean=inventory.getNbean();
		inventory.setNbean(inven_bean-=1);
		
		// ���� 1�� inventory���� ����
		int inven_milk =inventory.getNmilk();
		inventory.setNmilk(inven_milk-=1);
		
		// ���ڽ÷� 1�� inventory���� ����
		int inven_choco =inventory.getNchoco();
		inventory.setNchoco(inven_choco-=1);
		
	}// cafeMoca_recipe() �Ϸ�
	
	// īǪġ�� ������ �޼ҵ�
	protected void cappuccino_recipe()
	{
		
		// Ŀ�ǿ��� 1�� inventory���� ����
		int inven_bean=inventory.getNbean();
		inventory.setNbean(inven_bean-=1);
		
		// ���� 1�� inventory���� ����
		int inven_milk =inventory.getNmilk();
		inventory.setNmilk(inven_milk-=1);

	}
	
	// �ٴҶ�� ������ �޼ҵ�
	protected void vanillaLatte_recipe()
	{
		
		// Ŀ�ǿ��� 1�� inventory���� ����
		int inven_bean=inventory.getNbean();
		inventory.setNbean(inven_bean-=1);
		
		// ���� 1�� inventory���� ����
		int inven_milk =inventory.getNmilk();
		inventory.setNmilk(inven_milk-=1);
		
		// �ٴҶ� 1�� inventory���� ����
		int inven_vanilla =inventory.getNvanilla();
		inventory.setNvanilla(inven_vanilla-=1);

	}// vanillaLatte_recipe() �Ϸ�
	
	// ī��Ḷ���ƶ� ������ �޼ҵ�
	protected void caramelM_recipe()
	{
		
		// Ŀ�ǿ��� 1�� inventory���� ����
		int inven_bean=inventory.getNbean();
		inventory.setNbean(inven_bean-=1);
		
		// ���� 1�� inventory���� ����
		int inven_milk =inventory.getNmilk();
		inventory.setNmilk(inven_milk-=1);
		
		// ī��� �÷� 1�� inventory���� ����
		int inven_caramel =inventory.getNcaramel();
		inventory.setNcaramel(inven_caramel-=1);

	}
	
// �� ��Ŀ�Ƿ� ������ �޼ҵ�
	
	// �ڸ����̵� ������ �޼ҵ�
	protected void jamongAde_recipe()
	{
		
		// �ڸ� 1�� inventory���� ����
		int inven_grapefruit=inventory.getNgrapefruit();
		inventory.setNgrapefruit(inven_grapefruit-=1);
		
		// ź��� 1�� inventory���� ����
		int inven_spawater =inventory.getNspawater();
		inventory.setNspawater(inven_spawater-=1);
		

	} // jamongAde_recipe() �Ϸ�
	
	// ���Ʈ������ ������ �޼ҵ�
	protected void yogurt_recipe()
	{
		
		// ���Ʈ 1�� inventory���� ����
		int inven_yogurtpowder=inventory.getNyogurtpowder();
		inventory.setNyogurtpowder(inven_yogurtpowder-=1);
		
		
	}
	
	// Ƽ ������ �޼ҵ�
	protected void tea_recipe()
	{
		
		// Ƽ 1�� inventory���� ����
		int inven_teabag=inventory.getNteabag();
		inventory.setNteabag(inven_teabag-=1);
		
		
	}
	
	// �������ֽ� ������ �޼ҵ�
	protected void orangeJuice_recipe()
	{
		
		// ������ 1�� inventory���� ����
		int inven_orange=inventory.getNorange();
		inventory.setNorange(inven_orange-=1);
		
		
	}
	// ������ ������ �޼ҵ�
	protected void gogumaLatte_recipe()
	{
		
		// ���� 1�� inventory���� ����
		int inven_goguma=inventory.getNgoguma();
		inventory.setGoguma(inven_goguma-=1);
		
		// ���� 1�� inventory���� ����
		int inven_milk =inventory.getNmilk();
		inventory.setNmilk(inven_milk-=1);
		
	}
	
	// �� ����Ʈ ������ �޼ҵ�
	
	// ����ũ ������ �޼ҵ�
	protected void cake_recipe()
	{
		
		// ����ũ 1�� inventory���� ����
		int inven_cake=inventory.getNcake();
		inventory.setNcake(inven_cake-=1);

		
	}
	
	// ���̱� ������ �޼ҵ�
	protected void bagel_recipe()
	{
		
		// ���̱� 1�� inventory���� ����
		int inven_bagel=inventory.getNbagel();
		inventory.setNbagel(inven_bagel-=1);

		
	}
	
	protected void scone_recipe()
	{
		
		// ���� 1�� inventory���� ����
		int inven_scone=inventory.getNscone();
		inventory.setNscone(inven_scone-=1);
		
	}
	
	// ��ī�� ������ �޼ҵ�
	protected void macaron_recipe()
	{
		
		// ��ī�� 1�� inventory���� ����
		int inven_macaron=inventory.getNmacaron();
		inventory.setNmacaron(inven_macaron-=1);
		
	}
	
	// ��Ű ������ �޼ҵ�
	protected void cookie_recipe()
	{
		
		// ��Ű 1�� inventory���� ����
		int inven_cookie=inventory.getNcookie();
		inventory.setNcookie(inven_cookie-=1);
		
		
	}
	
	// �� �ɼ� ������ �޼ҵ�
	
	// �� �ɼ� �޼ҵ�
	protected void shot_recipe()
	{
		
		// ���� 1�� inventory���� ����
		int inven_bean=inventory.getNbean();
		inventory.setNbean(inven_bean-=1);
		
		
	}
	
	// �ٴҶ� �÷� �ɼ� �޼ҵ�
	protected void vanilla_recipe()
	{
		
		// �ٴҶ� 1�� inventory���� ����
		int inven_vanilla =inventory.getNvanilla();
		inventory.setNvanilla(inven_vanilla-=1);
		
	}
	
	// ���� �÷� �ɼ� �޼ҵ�
	protected void choco_recipe()
	{
		
		// ���ڽ÷� 1�� inventory���� ����
		int inven_choco =inventory.getNchoco();
		inventory.setNchoco(inven_choco-=1);
		
		
	}
	
	// ������� �÷� �ɼ� �޼ҵ�
	protected void hazel_recipe()
	{
		
		// ������ӽ÷� 1�� inventory���� ����
		int inven_hazel =inventory.getNhazel();
		inventory.setNhazel(inven_hazel-=1);
		
		
	}
	
	// ����ũ�� �ɼ� �޼ҵ�
	protected void whipcream_recipe()
	{
		
		// ���� 1�� inventory���� ����
		int inven_whipcream=inventory.getNwhipcream();
		inventory.setNwhipcream(inven_whipcream-=1);
		
		
	}
	
	// ũ��ġ�� �޼ҵ�
	protected void creamcheese_recipe()
	{
		
		// ũ��ġ�� 1�� inventory���� ����
		int inven_creamcheese=inventory.getNcreamcheese();
		inventory.setNcreamcheese(inven_creamcheese-=1);
		
		
	}
	
	// ������ �޼ҵ�
	protected void jam_recipe()
	{
		
		// ������ 1�� inventory���� ����
		int inven_stroberryjam=inventory.getNstroberryjam();
		inventory.setNstroberryjam(inven_stroberryjam-=1);
		
		
	}
		
}