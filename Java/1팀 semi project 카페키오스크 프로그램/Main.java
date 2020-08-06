

//※ 프로그램 실행을 위한 메인 메소드 (모든 프로그램은 여기서 실행됩니다~)

public class Main
{
	 public static void main(String[] args)
	 {
		   Cafe_Menus c = new Cafe_Menus();
		   
		   do
		   {
			  c.firPrint();
		   }
		   while (c.getSel2()!=1);   // sel2(1.장바구니로 이동 2.다른 메뉴 추가)값이 1이 아닐 때 반복
	 }
 
}

 
