
import java.util.Scanner;

// 판매량 및 매출 메뉴 선택 클래스(최호석)
class Sales_Menus
{

   public static final int S_DAY =1;		// 일별 매출 조회
   public static final int S_MONTH =2;		// 월별 매출 조회
   public static final int S_BACK =3;		// 돌아가기

   private static Integer sel;


	//메뉴 보여주기
   public void menuDisp()
   { 
	  System.out.println();
      System.out.println(" [매출 조회 메뉴 선택]");
      System.out.println(" 1.일별 매출 조회");
      System.out.println(" 2.총매출 조회");
      System.out.println(" 3.돌아가기");
      
   }

   //메뉴 선택
   public void menuSelect()
   {

	   Scanner sc = new Scanner(System.in);
      do 
      {   
         System.out.print(" >> 매출 조회 메뉴 선택(1~3) : ");
         sel =sc.nextInt();
         
      }while(sel<1 || sel>3);
   }

   //기능 메소드 호출
   public void menuRun()
   {

	  Sales_Control sales_Control = new Sales_Control();

      switch(sel)
      {
		  case Sales_Menus.S_DAY : sales_Control.sales_day_Lookup();break;
		  case Sales_Menus.S_MONTH : sales_Control.sales_month_Lookup();break;
		  case Sales_Menus.S_BACK : sales_Control.sales_Inventory();break;
      }
   }
}