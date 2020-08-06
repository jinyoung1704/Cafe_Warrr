
import java.util.Scanner;

// 재고 관리 선택 클래스(전진영)
class Inven_Menus
{
   public static final int I_TOTAL =1;//전체 재고
   public static final int I_COUNT =2;//매진 임박 재고
   public static final int I_BACK =3; //돌아가기

   private static Integer sel;


	//메뉴 보여주기
   public void menuDisp()
   {
	  System.out.println();
      System.out.println(" [재고 관리 메뉴 선택]");
      System.out.println("1. 전체 재고 조회");
      System.out.println("2. 매진 임박 재고 조회");
      System.out.println("3. 돌아가기");
      
   }

   //메뉴 선택
   public void menuSelect()
   {

	   Scanner sc = new Scanner(System.in);
      do 
      {   
         System.out.print(" >> 재고 관리 메뉴 선택(1~3) : ");
         sel =sc.nextInt();
         
      }while(sel<1 || sel>3);
   }

   //기능 메소드 호출
   public void menuRun()
   {

	   Inven_Control inven_control = new Inven_Control();
      switch(sel)
      {
      case Inven_Menus.I_TOTAL : inven_control.totalInventory();break;
      case Inven_Menus.I_COUNT : inven_control.imbakInventory();break;
      case Inven_Menus.I_BACK : inven_control.backInventory();break;
      }
   }
}