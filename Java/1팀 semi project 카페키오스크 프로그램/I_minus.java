
import java.util.Iterator;

// 재고 빠지는 기능을 하는 클래스(전진영)
class I_minus extends Recipe //Recipe를 상속받음,메뉴주문시 원재료품목 빠지는 클래스
{
	
	
	public void invenMinus()
	{
		Iterator it = Cafe_Menus.vCafe_Select.iterator(); //    vCafe_Select 에 저장되어있는 <Cafe_Select> 타입 객체  
		Cafe_Menus cafe_menus =new Cafe_Menus();
		
		while(it.hasNext())   // 객체가 없을 때까지 반복       
		{
			Object obj = it.next();   
			 Cafe_Select cafe_select = (Cafe_Select)obj;
				 

				if(cafe_select.getCategory() == 1) //카테고리값이 1이라면...커피
				{


					switch(cafe_select.getMain()) 
					{
						 case 1 : espresso_recipe(); break;
								 
						 case 2 :americano_recipe(); break;
											  
									 
						 case 3 :latte_recipe(); break;
								 
							  
						 case 4 :cafeMoca_recipe(); break;
								
								
						 case 5 :cappuccino_recipe(); break;
								 

						 case 6 : vanillaLatte_recipe(); break;
								 
									
						 case 7 :caramelM_recipe();  break;
					
					}
					switch(cafe_select.getOp())
					{

						case 2 : shot_recipe(); break;
					  		
					
						case 3 : vanilla_recipe(); break;
									

					    case 4 :  choco_recipe(); break;
									
						
						case 5 : hazel_recipe(); break;
									

						case 6 : whipcream_recipe(); break;
									
					}
					  
	

				}else if(cafe_select.getCategory() == 2) //2번에는 논커피
				{
					switch(cafe_select.getMain())
					{
						case 1 :jamongAde_recipe(); break;
									 
							
						case 2 :yogurt_recipe(); break;
										  
										 
					  case 3 :tea_recipe(); break;
							 
						  
					  case 4 :orangeJuice_recipe(); break;
							 
								
					  case 5 :gogumaLatte_recipe(); break;
					}
				}else if(cafe_select.getCategory() == 3)//3번에는 디저트
				{

					switch(cafe_select.getMain())
					{
						
						case 1 :cake_recipe(); break;
								
					    case 2 :bagel_recipe(); break;
										  
					    case 3 :scone_recipe(); break;
											  
					    case 4 :macaron_recipe(); break;
										
					    case 5 :cookie_recipe(); break;
								
					}
					
						
					switch(cafe_select.getOp())
					{
						
						case 2 : creamcheese_recipe();break;
					

						case 3 : jam_recipe();break;
						
					}
					
				}

		}// while 문 end

		
	
		
	}
	
	
		    
}