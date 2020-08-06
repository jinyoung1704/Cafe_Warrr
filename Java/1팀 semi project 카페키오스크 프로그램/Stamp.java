import java.util.HashMap;
import java.util.Scanner;

// 스탬프 적립, 선물 기능 클래스(주한별)
public class Stamp 
{
	
	Scanner sc = new Scanner(System.in);
	
	// 적립 여부를 묻는 메소드 
	void saveSelect()
	{
		System.out.print(" 스탬프 적립을 하시겠습니까? (Y/N) : ");
		String yon=sc.next();
		
		if(yon.equals("Y")||yon.equals("y"))
		{
			// 휴대폰 번호 입력 메소드로 이동
			input_phone();
		}
		else if(yon.equals("N")||yon.equals("n"))
		{
			// 적립 안할 경우에, Takeout 클래스로 넘어가게끔
			Takeout takeout = new Takeout();
			takeout.menuDisp();
		}
		
	}
	
	// 폰번호와 stamp 갯수를 저장하는 자료구조 생성
	static HashMap<String, Integer> hashMap = new HashMap<String, Integer>();	
	
	String phone;		// 사용자가 입력하는 phone 번호
	protected static int stamp; 		// phone에 연동된 스탬프 갯수



	// 영수증에서 Random 이벤트때 사용하기 위해서 protect로 상속 가능하게 만들어둠
	// Stamp 인스턴스 생성 
	// phone을 입력받는 메소드
	protected void input_phone()	
	{
		
		// Stamp를 사용자에게 입력 받는 do-while문.
		// 휴대폰번호 11자리가 아닐 경우  재입력이 뜬다.
		do
		{
			System.out.println();
			System.out.println(" 스탬프를 적립할 휴대폰번호를 입력해주세요('-' 생략) ");
			System.out.print(" : ");
			phone = sc.next();
		}
		while(phone.length()!=11);
		
		
		// 사용자가 입력한 휴대폰 번호에 적립 여부를 사용자에게 묻는다.
		System.out.println();
		System.out.print(" "+phone+"에 적립하시겠습니까?(Y/N) :");
		String yon =sc.next();	// yon(Yes or no)
		
		// 기존 스탬프에 잔수만큼을 더함.
		stamp += Cafe_Menus.vCafe_Select.size();
	
		// 사용자가 적립에 'YES' 입력할 경우, 다음 메소드로 단계를 진행한다.(retrun문 사용)
		if(yon.equals("Y") || yon.equals("y"))
		{
			// 스탬프 적립 메소드 호출
			stamp_add();
		}
		// 사용자가 적립에 'NO' 입력할 경우, 새로운 휴대폰 번호를 입력하게 한다.
		else if(yon.equals("N") || yon.equals("n"))
		{
			do
			{	System.out.println();
				System.out.println(" 스탬프를 적립할 휴대폰번호를 입력해주세요('-' 생략) ");
				System.out.print(" : ");
				phone = sc.next();
			}
			while(phone.length()!=11);
			
			// 스탬프 적립 메소드 호출
			stamp_add();
			
			
		}
		
	}// input_phone() 메소드 완료
	
	
	// 영수증에서 Random 이벤트때 사용하기 위해서 protect로 상속 가능하게 만들어둠
	protected void stamp_add()
	{	
		hashMap.put("01030026023",10);	// Test 로 넣은 한별 번호
		hashMap.put(phone, stamp);		// 적립 스탬프 수는 잔수*1... 『class 결제』와 연동이 필요합니다.		

		stamp_gift();
	}
	
	
	void stamp_gift()		// stamp 선물하기 메소드
	{
		
		//stamp_add();
		
		int gift;			// 선물할 스탬프 개수
		String gift_phone;	// 선물받는 폰번호
		
		
		// 스탬프 선물 여부 묻기
		System.out.println();
		System.out.print(" 스탬프를 선물하시겠습니까?(Y/N) : ");
		String yon=sc.next();	//n yon(Yes or no)
		
		
		if(yon.equals("Y")||yon.equals("y"))
		{	
			System.out.println();
			System.out.print(" 선물할 스탬프 갯수를 입력하세요 :");
			gift = sc.nextInt();
			
			if (hashMap.get(phone)>=gift)	// 가지고 있는 스탬프가 선물할 스탬프(gift)보다 클 경우
			{								// 선물이 가능하다.
				do 
				{	
					System.out.println();
					System.out.println(" 선물 받을 휴대폰번호를 입력해주세요('-' 생략) ");
					gift_phone=sc.next();
					
					// 선물 받은 휴대폰 번호에 gift 만큼의 스탬프 추가
					hashMap.put(gift_phone,(hashMap.get(gift_phone)+gift));
					
					if(hashMap.containsKey(gift_phone)!=true)	// 선물받는 휴대폰 번호가 존재하지 않을 경우
					{	
						System.out.println();
						System.out.println(" 선물하려는 번호가 등록 되어있지 않습니다.");
					}
				
				}
				while(hashMap.containsKey(gift_phone)!=true);
				
				// 선물 조건을 만족해 do-while 조건문을 빠져나와 선물이 완료됨
				System.out.println();
				System.out.println("======================== 스탬프 선물중 ===========================>> ");
				System.out.println();
				System.out.println(" 스탬프 선물이 완료되었습니다.");
				
				// 선물한 휴대폰번호에 적립된 stamp 갯수에서 gift의 갯수만큼 차감한다.
				hashMap.put(phone, stamp-gift);
				
				// 선물을 받은 휴대폰 번호는 기존 stamp 개수에서 gift만큼 증가
				hashMap.put(gift_phone, hashMap.get(gift_phone)+gift);
				// test
				//System.out.println("테스트 :" +HashMap.get(gift_phone));
				
				
				// 다음단계인 출력 메소드 호출
				stamp_print();

			}
			else	// 가진 스탬프의 갯수가 선물하려는 스탬프보다 적을 경우.
			{	
				System.out.println();
				System.out.println(" 선물하려는 스탬프의 개수가 부족합니다.");
				// 다음단계인 출력 메소드 호출
				stamp_print();
			}	

		}
		else
		{
			stamp_print();
		}
	
		sc.close(); 	// scanner 닫기
	}// stamp_gift() 메소드 완료
	

	
	void stamp_print()	// 스탬프 출력 메소드
	{	
		System.out.println();
		System.out.println(" "+phone+" 님은 "+hashMap.get(phone)+" 개의 스탬프가 있습니다.");
		
		// 적립 마친 후, Takeout 클래스로 넘어가게끔 takeout 메소드 호출
		Takeout takeout = new Takeout();
		takeout.menuDisp();
		
	}//stamp_print() 메소드 완료
	
	
	// Test를 위한 main 함수
	
	/*
	public static void main(String[] args)
	{
		Stamp st = new Stamp();
		st.saveSelect();

	}
	*/
	
}



