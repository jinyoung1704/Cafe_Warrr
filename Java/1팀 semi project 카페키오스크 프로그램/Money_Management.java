
import java.util.Scanner;

// 잔고관리 메뉴 선택(최호석)
class Money_Management 
{
 	//1. 잔돈 입금
 	//2. 초기화
	//3. 돌아가기

   public static final int C_IUPUT =1;		// 잔돈입금
   public static final int C_RESET =2;		// 초기화
   public static final int C_HAKIN =3;		// 거스름돈 확인
   public static final int C_BACK =4;		// 돌아가기

   private static Integer sel;

	//메뉴 보여주기
   public void menuDisp()
   {
	  // 여기에서 3번에 연결되는 removeInventory() 메소드 실행되도록
	  System.out.println();
      System.out.println(" [잔고 관리 메뉴 선택]");
      System.out.println(" 1.잔돈 입금");
      System.out.println(" 2.초기화");
	  System.out.println(" 3.거스름돈 확인");
      System.out.println(" 4.돌아가기");
      
   }

   //메뉴 선택
   public void menuSelect()
   {

	   Scanner sc = new Scanner(System.in);
      do 
      {  System.out.println();
         System.out.print(" 잔고 관리 메뉴 선택(1~4) : ");
         sel =sc.nextInt();
         
      }while(sel<1 || sel>4);
   }

   //기능 메소드 호출
   public void menuRun()
   {

	  Money_Control money_control = new Money_Control();

      switch(sel)
      {
		  case Money_Management.C_IUPUT : money_control.changeInput();break;	//잔돈입금 메소드 호출
		  case Money_Management.C_RESET : money_control.change_Reset();break;	//잔돈초기화 메소드 호출
		  case Money_Management.C_HAKIN : money_control.hakin();break;			//잔돈 확인 메소드 호출
		  case Money_Management.C_BACK : money_control.change_Inventory();break;// 돌아가기 메소드 호출
      }
   }
}

