import java.util.Scanner;

// 비밀번호 관리 메뉴 선택 메소드(전진영) 
class  Password_Menus
{
	
   public static final int P_CHANGE =1;		// 비밀번호 변경
   public static final int P_RESET =2;		// 비밀번호 초기화
   public static final int P_BACK =3;		// 돌아가기

   private static Integer sel;


	//메뉴 메소드
   public void menuDisp()
   {
	  System.out.println();
      System.out.println(" [비밀번호 관리 메뉴 선택]");
      System.out.println(" 1.비밀번호 변경");
	  System.out.println(" 2.비밀번호 초기화");
	  System.out.println(" 3.관리자메뉴로 돌아가기");
   }

   //메뉴 선택 메소드
   public void menuSelect()
   {

	   Scanner sc = new Scanner(System.in);
	   
       do
       {
		    System.out.print(" >>비밀번호 관리 메뉴 선택(1~3) : ");
			sel =sc.nextInt();
         
       }
       while (sel<1 || sel>3);
      
   }

   //기능 메소드 호출
   public void menuRun()
   {

	   Password_Control password_control = new Password_Control();


		switch(sel)
		{
		  case 1: password_control.changePW();break; //비밀번호 바꾸기
		  case 2: password_control.resetPW();break;  //비밀번호 초기화
		  case 3: password_control.backManagermenu();break; //관리자메뉴로 가기
		}
   }



}