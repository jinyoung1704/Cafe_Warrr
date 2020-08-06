
import java.util.Scanner;

// 테이크아웃 여부 묻는 클래스(최호석)
public class Takeout
{
	 public static final int T_STORE =1;		// 매장식사
	 public static final int T_TAKEOUT =2;		// 테이크아웃

	 public static Integer sel;

		//메뉴 출력 메소드
		public void menuDisp()
		 {    
			 System.out.println("===================================================================");
			 System.out.println("                           테이크아웃 여부                         ");
			 System.out.println("===================================================================");
			 System.out.println(" 1.매장");
			 System.out.println(" 2.테이크아웃");
			 System.out.println("===================================================================");

			 // 메뉴 선택 메소드 호출
			 menuSelect();
		 }

	 //메뉴 선택 메소드
	 public void menuSelect()
	 {

		   Scanner sc = new Scanner(System.in);
		   
		 do
		 {		
				System.out.print(" 1.매장 2.테이크아웃 선택(1~2) : ");
				sel =sc.nextInt();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();

		   
		 }
		 while (sel<1 || sel>2);
		
		 // 기능메소드 호출
		 menuRun();
	 }

	 //기능 메소드 호출
	 public void menuRun()
	 {
			switch(sel)
			{
			  case 1: System.out.println();
		
											//영수증 출력 메소드 호출
					  break;

			  case 2: System.out.println();
											 //영수증 출력 메소드 호출
					  break;
			}
			
			// Receipt 클래스의 첫번째 클래스 random() 메소드 호출
			Receipt receipt = new Receipt();
			receipt.random();
	  }

}