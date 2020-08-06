
import java.util.Scanner;

// 발주 메뉴 선택 클래스(이채빈)
class Balju_Menus 
{
	private static int sel;            //-- 선택 값
	
   public static final int SETGAP = 1;		// 발주값 설정 
   public static final int ALL = 2;		// 전체 자동 발주
   public static final int SELECT = 3;		// 부분 자동 발주
   public static final int SELF = 4;		// 수동 발주 
   public static final int EXIT = 5;

	//메뉴 출력 메소드
   public void menuDisp()
	{	
	   	 System.out.println();
         System.out.println(" [발주 메뉴 선택]");
         System.out.println(" 1.자동 발주값 설정");
         System.out.println(" 2.전체 자동 발주 ");
         System.out.println(" 3.부분 자동 발주 ");
         System.out.println(" 4.수동 발주 ");
         System.out.println(" 5.돌아가기");
         System.out.print(" >>발주 메뉴 선택(1~5) : ");
   }

   //메뉴 선택 메소드
   public void menuSelect(){
	   
	  boolean check ;
	  check = true;  //-- 메뉴선택값 검사

	  Scanner sc = new Scanner(System.in);
      do{
         sel = sc.nextInt();
         if(sel<1||sel>5){
            System.out.println(" 1~5중에 선택해주세요.");
            System.out.print(" >>발주 메뉴 선택(1~5) : ");
         }else{
            check = false;
         }
      }while(check);
	 
   }

   //선택된 메뉴 실행에 따른 기능 호출 메소드
   public void menuRun(){

	   Balju_Control balju_control = new Balju_Control();	// Balju 클래스 인스턴스 생성

      switch(sel){
         
         case Balju_Menus.SETGAP: balju_control.setGap(); break;	//-- 자동 발주 기준값 설정하는 메소드 호출
         case Balju_Menus.ALL: balju_control.allAuto(); break;		//-- 자동 발주하는 메소드 호출
         case Balju_Menus.SELECT: balju_control.auto(); break;		//-- 부분 발주하는 메소드 호출
         case Balju_Menus.SELF: balju_control.self(); break;		//-- 수동 발주하는 메소드 호출 
         case Balju_Menus.EXIT: balju_control.exit(); break;		//-- 관리자 메뉴로 나가는 메소드 호출
      }

	}

}