import java.util.Scanner;

// 비밀번호 기능 클래스(전진영)
class  Password_Control
{

	//기존 초기 비밀번호 설정
	private static String password = "0000";
	
	//getter/setter 구성
	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	//비밀번호를 바꿀 때 필요한 메소드
	public void changePW() 
	{
		Scanner sc = new Scanner(System.in);
		String inputPW;  //관리자가 입력하는 기존 비밀번호
		
		System.out.println("=====================[비밀번호 설정 관리]==========================");
		System.out.print(" 기존 비밀번호를 입력해주세요 : ");
		inputPW = sc.next(); 
		System.out.println();

		if(!inputPW.equals(password)) //관리자가 입력한 비밀번호와 초기 비밀번호가 같다면
		{
			do
			{
				System.out.println(" 비밀번호가 일치하지 않습니다..");
				System.out.println(" 다시 입력해주세요");
				inputPW = sc.next(); 
			}
			while (!inputPW.equals(password));	
		
		}
		
		System.out.print(" 바꿀 비밀번호를 입력해주세요 : ");
		setPassword(sc.next());//바꾼 비밀번호를 다시 초기 비밀번호에 담아서 비밀번호 변경
		System.out.println();

		System.out.println("==============================================================");
		System.out.println(" 비밀번호 설정이 완료되었습니다.");
		System.out.println();
		System.out.print(" 관리자메뉴로 돌아가시겠습니까?(Y/N)");
		String back = sc.next();

		if(back.equals("Y")) //Y라면 관리자 메뉴로 돌아가기
		{
			backPasswordMneu();

		}else //Y 이외의 것 입력시 반복질문.
		{
			do
			{
				System.out.print("관리자메뉴로 돌아가시겠습니까?(Y/N)");
				back =sc.next();
			}
			while (!back.equals("Y"));
			
			if(back.equals("Y"))
				backPasswordMneu();

		}
		

		
	}

	//비밀번호를 0000으로 초기화 하는 메소드
	public void resetPW() 
	{
		Scanner sc = new Scanner(System.in);
		String resetok; //초기화 여부를 확인하기 위한 메소드
		
		System.out.println("비밀번호를 초기화 하시겠습니까?(Y/N)");
		resetok = sc.next();
		
		if(resetok.equals("Y")) //Y입력시 초기화
		{
			setPassword("0000");
			System.out.println("비밀번호가 초기화되었습니다.");
		}else //아닐시 비밀번호 메뉴도 돌아가기
			backPasswordMneu();
			
	}
	
	 //관리자 모드로 돌아가는 메소드 
	 public void backManagermenu() 
	 {
		
		ManagerMenu m = new ManagerMenu();
		 while (true)
		 {
			 m.menuDisp();
			 m.menuSelect();
			 m.menuRun();
		 }
	  }

	//비밀번호 메뉴로 돌아가는 메소드 
	public void backPasswordMneu() 
	{
	    Password_Menus pm = new  Password_Menus();
		while(true)
		{
			pm.menuDisp();
			pm.menuSelect();
			pm.menuRun();
		}
	}

	
}