import java.util.HashMap;
import java.util.Scanner;

// ������ ����, ���� ��� Ŭ����(���Ѻ�)
public class Stamp 
{
	
	Scanner sc = new Scanner(System.in);
	
	// ���� ���θ� ���� �޼ҵ� 
	void saveSelect()
	{
		System.out.print(" ������ ������ �Ͻðڽ��ϱ�? (Y/N) : ");
		String yon=sc.next();
		
		if(yon.equals("Y")||yon.equals("y"))
		{
			// �޴��� ��ȣ �Է� �޼ҵ�� �̵�
			input_phone();
		}
		else if(yon.equals("N")||yon.equals("n"))
		{
			// ���� ���� ��쿡, Takeout Ŭ������ �Ѿ�Բ�
			Takeout takeout = new Takeout();
			takeout.menuDisp();
		}
		
	}
	
	// ����ȣ�� stamp ������ �����ϴ� �ڷᱸ�� ����
	static HashMap<String, Integer> hashMap = new HashMap<String, Integer>();	
	
	String phone;		// ����ڰ� �Է��ϴ� phone ��ȣ
	protected static int stamp; 		// phone�� ������ ������ ����



	// ���������� Random �̺�Ʈ�� ����ϱ� ���ؼ� protect�� ��� �����ϰ� ������
	// Stamp �ν��Ͻ� ���� 
	// phone�� �Է¹޴� �޼ҵ�
	protected void input_phone()	
	{
		
		// Stamp�� ����ڿ��� �Է� �޴� do-while��.
		// �޴�����ȣ 11�ڸ��� �ƴ� ���  ���Է��� ���.
		do
		{
			System.out.println();
			System.out.println(" �������� ������ �޴�����ȣ�� �Է����ּ���('-' ����) ");
			System.out.print(" : ");
			phone = sc.next();
		}
		while(phone.length()!=11);
		
		
		// ����ڰ� �Է��� �޴��� ��ȣ�� ���� ���θ� ����ڿ��� ���´�.
		System.out.println();
		System.out.print(" "+phone+"�� �����Ͻðڽ��ϱ�?(Y/N) :");
		String yon =sc.next();	// yon(Yes or no)
		
		// ���� �������� �ܼ���ŭ�� ����.
		stamp += Cafe_Menus.vCafe_Select.size();
	
		// ����ڰ� ������ 'YES' �Է��� ���, ���� �޼ҵ�� �ܰ踦 �����Ѵ�.(retrun�� ���)
		if(yon.equals("Y") || yon.equals("y"))
		{
			// ������ ���� �޼ҵ� ȣ��
			stamp_add();
		}
		// ����ڰ� ������ 'NO' �Է��� ���, ���ο� �޴��� ��ȣ�� �Է��ϰ� �Ѵ�.
		else if(yon.equals("N") || yon.equals("n"))
		{
			do
			{	System.out.println();
				System.out.println(" �������� ������ �޴�����ȣ�� �Է����ּ���('-' ����) ");
				System.out.print(" : ");
				phone = sc.next();
			}
			while(phone.length()!=11);
			
			// ������ ���� �޼ҵ� ȣ��
			stamp_add();
			
			
		}
		
	}// input_phone() �޼ҵ� �Ϸ�
	
	
	// ���������� Random �̺�Ʈ�� ����ϱ� ���ؼ� protect�� ��� �����ϰ� ������
	protected void stamp_add()
	{	
		hashMap.put("01030026023",10);	// Test �� ���� �Ѻ� ��ȣ
		hashMap.put(phone, stamp);		// ���� ������ ���� �ܼ�*1... ��class �������� ������ �ʿ��մϴ�.		

		stamp_gift();
	}
	
	
	void stamp_gift()		// stamp �����ϱ� �޼ҵ�
	{
		
		//stamp_add();
		
		int gift;			// ������ ������ ����
		String gift_phone;	// �����޴� ����ȣ
		
		
		// ������ ���� ���� ����
		System.out.println();
		System.out.print(" �������� �����Ͻðڽ��ϱ�?(Y/N) : ");
		String yon=sc.next();	//n yon(Yes or no)
		
		
		if(yon.equals("Y")||yon.equals("y"))
		{	
			System.out.println();
			System.out.print(" ������ ������ ������ �Է��ϼ��� :");
			gift = sc.nextInt();
			
			if (hashMap.get(phone)>=gift)	// ������ �ִ� �������� ������ ������(gift)���� Ŭ ���
			{								// ������ �����ϴ�.
				do 
				{	
					System.out.println();
					System.out.println(" ���� ���� �޴�����ȣ�� �Է����ּ���('-' ����) ");
					gift_phone=sc.next();
					
					// ���� ���� �޴��� ��ȣ�� gift ��ŭ�� ������ �߰�
					hashMap.put(gift_phone,(hashMap.get(gift_phone)+gift));
					
					if(hashMap.containsKey(gift_phone)!=true)	// �����޴� �޴��� ��ȣ�� �������� ���� ���
					{	
						System.out.println();
						System.out.println(" �����Ϸ��� ��ȣ�� ��� �Ǿ����� �ʽ��ϴ�.");
					}
				
				}
				while(hashMap.containsKey(gift_phone)!=true);
				
				// ���� ������ ������ do-while ���ǹ��� �������� ������ �Ϸ��
				System.out.println();
				System.out.println("======================== ������ ������ ===========================>> ");
				System.out.println();
				System.out.println(" ������ ������ �Ϸ�Ǿ����ϴ�.");
				
				// ������ �޴�����ȣ�� ������ stamp �������� gift�� ������ŭ �����Ѵ�.
				hashMap.put(phone, stamp-gift);
				
				// ������ ���� �޴��� ��ȣ�� ���� stamp �������� gift��ŭ ����
				hashMap.put(gift_phone, hashMap.get(gift_phone)+gift);
				// test
				//System.out.println("�׽�Ʈ :" +HashMap.get(gift_phone));
				
				
				// �����ܰ��� ��� �޼ҵ� ȣ��
				stamp_print();

			}
			else	// ���� �������� ������ �����Ϸ��� ���������� ���� ���.
			{	
				System.out.println();
				System.out.println(" �����Ϸ��� �������� ������ �����մϴ�.");
				// �����ܰ��� ��� �޼ҵ� ȣ��
				stamp_print();
			}	

		}
		else
		{
			stamp_print();
		}
	
		sc.close(); 	// scanner �ݱ�
	}// stamp_gift() �޼ҵ� �Ϸ�
	

	
	void stamp_print()	// ������ ��� �޼ҵ�
	{	
		System.out.println();
		System.out.println(" "+phone+" ���� "+hashMap.get(phone)+" ���� �������� �ֽ��ϴ�.");
		
		// ���� ��ģ ��, Takeout Ŭ������ �Ѿ�Բ� takeout �޼ҵ� ȣ��
		Takeout takeout = new Takeout();
		takeout.menuDisp();
		
	}//stamp_print() �޼ҵ� �Ϸ�
	
	
	// Test�� ���� main �Լ�
	
	/*
	public static void main(String[] args)
	{
		Stamp st = new Stamp();
		st.saveSelect();

	}
	*/
	
}



