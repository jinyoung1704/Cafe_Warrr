import java.util.Scanner;

// ��й�ȣ ��� Ŭ����(������)
class  Password_Control
{

	//���� �ʱ� ��й�ȣ ����
	private static String password = "0000";
	
	//getter/setter ����
	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	//��й�ȣ�� �ٲ� �� �ʿ��� �޼ҵ�
	public void changePW() 
	{
		Scanner sc = new Scanner(System.in);
		String inputPW;  //�����ڰ� �Է��ϴ� ���� ��й�ȣ
		
		System.out.println("=====================[��й�ȣ ���� ����]==========================");
		System.out.print(" ���� ��й�ȣ�� �Է����ּ��� : ");
		inputPW = sc.next(); 
		System.out.println();

		if(!inputPW.equals(password)) //�����ڰ� �Է��� ��й�ȣ�� �ʱ� ��й�ȣ�� ���ٸ�
		{
			do
			{
				System.out.println(" ��й�ȣ�� ��ġ���� �ʽ��ϴ�..");
				System.out.println(" �ٽ� �Է����ּ���");
				inputPW = sc.next(); 
			}
			while (!inputPW.equals(password));	
		
		}
		
		System.out.print(" �ٲ� ��й�ȣ�� �Է����ּ��� : ");
		setPassword(sc.next());//�ٲ� ��й�ȣ�� �ٽ� �ʱ� ��й�ȣ�� ��Ƽ� ��й�ȣ ����
		System.out.println();

		System.out.println("==============================================================");
		System.out.println(" ��й�ȣ ������ �Ϸ�Ǿ����ϴ�.");
		System.out.println();
		System.out.print(" �����ڸ޴��� ���ư��ðڽ��ϱ�?(Y/N)");
		String back = sc.next();

		if(back.equals("Y")) //Y��� ������ �޴��� ���ư���
		{
			backPasswordMneu();

		}else //Y �̿��� �� �Է½� �ݺ�����.
		{
			do
			{
				System.out.print("�����ڸ޴��� ���ư��ðڽ��ϱ�?(Y/N)");
				back =sc.next();
			}
			while (!back.equals("Y"));
			
			if(back.equals("Y"))
				backPasswordMneu();

		}
		

		
	}

	//��й�ȣ�� 0000���� �ʱ�ȭ �ϴ� �޼ҵ�
	public void resetPW() 
	{
		Scanner sc = new Scanner(System.in);
		String resetok; //�ʱ�ȭ ���θ� Ȯ���ϱ� ���� �޼ҵ�
		
		System.out.println("��й�ȣ�� �ʱ�ȭ �Ͻðڽ��ϱ�?(Y/N)");
		resetok = sc.next();
		
		if(resetok.equals("Y")) //Y�Է½� �ʱ�ȭ
		{
			setPassword("0000");
			System.out.println("��й�ȣ�� �ʱ�ȭ�Ǿ����ϴ�.");
		}else //�ƴҽ� ��й�ȣ �޴��� ���ư���
			backPasswordMneu();
			
	}
	
	 //������ ���� ���ư��� �޼ҵ� 
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

	//��й�ȣ �޴��� ���ư��� �޼ҵ� 
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