

import java.util.Scanner;

// 관리자 메뉴 선택 클래스(전진영)
class Manager_Menus  
{   
   public static final int Balju_Menus = 1;         // 발주 메뉴선택
   public static final int Inven_Menus = 2;         // 재고 관리 메뉴선택
   public static final int Sales_Menus = 3;		    // 판매량및 매출액 조회 메뉴 선택
   public static final int Money_Management = 4;    // 잔고관리 메뉴 선택
   public static final int Password_Menus = 5;	    // 비밀번호 메뉴 선택 
   public static final int MANAGE_EXIT = 6;			// 관리자모드 종료
   public static final int PROGRAM_END = 7;			// 프로그램 종료


}

//관리자 메뉴()
public class ManagerMenu 
{
	//주요 속성 구성  
   public static Integer sel;            //-- 선택 값
   private static String con;            //-- 계속 여부
   public static boolean flag ;          //-- switch문 돌리기 위해


   //static 초기화 블럭
   static
	{
     
      //Scanner 클래스 인스턴스 생성
		Scanner sc = new Scanner(System.in);
      
      //사용자 입력값 초기화
	    sel=1;
	    con = "Y";
		flag = true;
     
   }

    //메뉴 출력 메소드
   public void menuDisp()
	{	
	     System.out.println();
         System.out.println(" [관리자 메뉴 선택]");
         System.out.println(" 1. 발주 ");
		 System.out.println(" 2. 재고 관리 ");
         System.out.println(" 3. 판매량 및 매출액 조회 ");
         System.out.println(" 4. 잔고관리 ");
         System.out.println(" 5. 비밀번호 관리 ");
         System.out.println(" 6. 관리자모드 종료");
         System.out.println(" 7. 프로그램 종료");
         System.out.print(" >> 메뉴 선택(1~7) : ");
   }

   //메뉴 선택 메소드
   public void menuSelect()
	{

		Scanner sc = new Scanner(System.in);
		 boolean check = true; //목록의 수 1~7을 벗어나면 다시 돌리기 위한 check

      do
      {
		  sel = sc.nextInt();
		  if(sel<1||sel>7){
          System.out.println(" 1~7중에 선택해주세요.");
          System.out.print(" >> 메뉴 선택(1~7) : ");
		 
		  }else
		  {
			  check = false;
		  }
      }
      while (check);          

   }

   //선택된 메뉴 실행에 따른 기능 호출 메소드
   public void menuRun() 
	{
		
	   Inven_Menus inven_menus = new Inven_Menus();  //재고관리 
	   Balju_Menus balju_menus = new Balju_Menus();	 //발주
	   Sales_Menus sales_menus = new Sales_Menus();  //판매량 및 매출액 조회
	   Money_Management money_management = new Money_Management(); //잔고 관리
	   Password_Menus password_menus = new Password_Menus(); //비밀번호 설정

		Cafe_Menus c = new Cafe_Menus();
	
		do
		{
			switch(sel)
			{
			   case 1 : 
				        balju_menus.menuDisp();
						balju_menus.menuSelect();
						balju_menus.menuRun();   
			   break;

			   case 2 :
						inven_menus.menuDisp();
						inven_menus.menuSelect();
						inven_menus.menuRun();   
			   break;

			  
			   case 3 :  sales_menus.menuDisp();
						 sales_menus.menuSelect();
						 sales_menus.menuRun();   
			   break;
			   
			   case 4 : money_management.menuDisp();
			   			money_management.menuSelect();
						money_management.menuRun(); 
			   break;
				
			   case 5 : password_menus.menuDisp();
						password_menus.menuSelect();
						password_menus.menuRun();   
			   break;
			   
		   
		   	
			   case 6 : System.out.println(" 관리자 모드를 종료합니다.");
			   			
						c.firPrint();
						c.menuSelect();
						c.menuRun();
						c.menuGo();
			   break;
			   
			   case 7 : System.out.println(" 프로그램을 종료합니다. ");
			   			System.exit(-1);
			  
			   
	
			}
		}
		while (flag);
	   
	}

}