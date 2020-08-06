
import java.util.Scanner;

// 결제 수단 선택 클래스(이채빈,최호석)
class Pay_Select
{
	public static Integer sel;	//-- 결제수단 선택값

	private static final int CARDPAY = 1;			//  1.카드결제
	private static final int BILLPAY = 2;			//  2.현금결제
	private static final int STAMPPAY = 3;			//  3.스탬프결제
	
	public void menuDisp()
	{
		
		// 스캐너 인스턴스 생성
		 Scanner sc = new Scanner(System.in);
		 
	     System.out.println("===================================================================");
	     System.out.printf (" 결제 금액 : %d원                      \n", Pay_Control.allPay);
	     System.out.println("===================================================================");
	     System.out.println(" 1.카드 결제                                      ");
	     System.out.println(" 2.현금 결제                                      ");
	     System.out.println(" 3.스탬프 결제                                    ");
	     System.out.println("===================================================================");
		 System.out.print(" 결제 수단을 선택해주세요 : ");
	     Pay_Select.sel = sc.nextInt();
		
		
	     // 순차적 진행을 위해 다음 메소드 호출
		menuSelect();
	}
 

	//메뉴 선택 메소드 
	 public void menuSelect(){
		   
		  Pay_Select pay_select = new Pay_Select();

		  boolean check ;
		  check = true;  //-- 메뉴선택값 검사

	  do{
				if(sel<1||sel>3){
				 System.out.println("1~3중에 선택해주세요.");
				 menuDisp(); //0315 이거 추가함
				}else{
						pay_select.menuRun();
						check = false;

				}
		}while(check);
			  System.out.println();
			  
			// 순차적 진행을 위해 다음 메소드 호출
				menuRun();

	 } 

	 public void menuRun(){
		 
		 Pay_Control pay_control = new Pay_Control ();   // Pay_Control  클래스 인스턴스 생성
		  
		 //pay_control.pay();   // 여기서 결제금액 연산하는 pay() 메소드 연동시켜야 함 
		 //pay_control.print();   // 장바구니 창 보여주기
		 
		 
		 switch(sel){
		 
		 
		 case Pay_Select.CARDPAY:   pay_control.cardPay();   // 1.카드 결제 메소드
		 
						   break;
	  
		case Pay_Select.BILLPAY:   //2. 현금 결제 메소드 (최호석)
							 int money = pay_control.inputBill();   // 사용자 현금 입력 메소드로 입력 받은 후 
														 // 사용자가 거슬러 받아야할 돈을 반환형으로 받아 int money 변수에 넣어준다.

						   if (pay_control.checkbillPay(money))   // 지폐반환여부 확인 메소드(매개변수 사용자가 거슬러 받아야할 돈) 가          
						   {                              // 참이라면(거스름돈이 있다면) true값 반환하여 if문이 안에 문장을 실행한다.
							  
							  pay_control.billPay(money);         // 실제 잔돈 반환 메소드는 사용자가 거슬러 받아야 할 돈을 출력하고 
														 // 거스름돈을 잔고에서 차감시켜준다.(사용자 눈에는 보이지 않지만 관리자 잔고확인하면 차감된다.)
						   }

						   else                           // 지폐반환여부 확인 메소드(거스름돈이 있는지 없는지)가
						   {                              // 거짓이라면(거스름돈이 있다면) false값 반환하여 else문이 안에 문장을 실행한다.
							  System.out.println();
							  System.out.println(" 죄송합니다. 거스름돈이 모자랍니다. 다시 선택해주시길 바랍니다.");
							  menuDisp();                     // 결제 선택 메뉴 호출.
							  
						   }
						   break;
	  

		 case Pay_Select.STAMPPAY: pay_control.stampPay();   // 3. 스탬프 결제 메소드     

							  break;            
		 
		 }//switch문 end
	 }
}