
import java.util.Scanner;

// ���� �޴� ���� Ŭ����(��ä��)
class Balju_Menus 
{
	private static int sel;            //-- ���� ��
	
   public static final int SETGAP = 1;		// ���ְ� ���� 
   public static final int ALL = 2;		// ��ü �ڵ� ����
   public static final int SELECT = 3;		// �κ� �ڵ� ����
   public static final int SELF = 4;		// ���� ���� 
   public static final int EXIT = 5;

	//�޴� ��� �޼ҵ�
   public void menuDisp()
	{	
	   	 System.out.println();
         System.out.println(" [���� �޴� ����]");
         System.out.println(" 1.�ڵ� ���ְ� ����");
         System.out.println(" 2.��ü �ڵ� ���� ");
         System.out.println(" 3.�κ� �ڵ� ���� ");
         System.out.println(" 4.���� ���� ");
         System.out.println(" 5.���ư���");
         System.out.print(" >>���� �޴� ����(1~5) : ");
   }

   //�޴� ���� �޼ҵ�
   public void menuSelect(){
	   
	  boolean check ;
	  check = true;  //-- �޴����ð� �˻�

	  Scanner sc = new Scanner(System.in);
      do{
         sel = sc.nextInt();
         if(sel<1||sel>5){
            System.out.println(" 1~5�߿� �������ּ���.");
            System.out.print(" >>���� �޴� ����(1~5) : ");
         }else{
            check = false;
         }
      }while(check);
	 
   }

   //���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
   public void menuRun(){

	   Balju_Control balju_control = new Balju_Control();	// Balju Ŭ���� �ν��Ͻ� ����

      switch(sel){
         
         case Balju_Menus.SETGAP: balju_control.setGap(); break;	//-- �ڵ� ���� ���ذ� �����ϴ� �޼ҵ� ȣ��
         case Balju_Menus.ALL: balju_control.allAuto(); break;		//-- �ڵ� �����ϴ� �޼ҵ� ȣ��
         case Balju_Menus.SELECT: balju_control.auto(); break;		//-- �κ� �����ϴ� �޼ҵ� ȣ��
         case Balju_Menus.SELF: balju_control.self(); break;		//-- ���� �����ϴ� �޼ҵ� ȣ�� 
         case Balju_Menus.EXIT: balju_control.exit(); break;		//-- ������ �޴��� ������ �޼ҵ� ȣ��
      }

	}

}