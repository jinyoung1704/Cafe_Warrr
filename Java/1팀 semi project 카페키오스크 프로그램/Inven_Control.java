
import java.util.Scanner;
import java.util.Calendar;

// ������ ��� Ŭ����(���: ������, ����, ��¹� : ��ȣ��)
class Inven_Control
{
   private static Scanner sc;

	//��ü��� ���  �޼ҵ� 
   public void totalInventory() 
   { 
      sc = new Scanner(System.in);
	  Inventory inventory = new Inventory();
  
      Calendar ca = Calendar.getInstance();
      System.out.println("===================================================================");
      int y = ca.get(Calendar.YEAR);
      int m = ca.get(Calendar.MONTH)+1;
      int d = ca.get(Calendar.DATE);   
      System.out.printf("\t\t\t    %d�� %d�� %d��%n",y,m,d+TestCalendar.datePlus);
      System.out.println("===================================================================");
	  System.out.println("\t\t\t   ���� �� �� Ȳ��");
	  System.out.println("===================================================================");
      System.out.println("-------------------------------------------------------------------");
	  System.out.println("   ����\t          ����");
	  System.out.printf("��  ����\t\t  %d��%n", inventory.getNbean()); //1.����
	  System.out.printf("��  ����\t\t  %d��%n", inventory.getNmilk()); //2.����
	  System.out.printf("��  ���ڽ÷�\t\t  %d��%n",inventory.getNchoco());//3.���ڽ÷�
	  System.out.printf("��  �ٴҶ�÷�\t\t  %d��%n",inventory.getNvanilla());//4.�ٴҶ�÷�
	  System.out.printf("��  ������ӽ÷�\t  %d��%n",inventory.getNhazel());//5.������ӽ÷�
	  System.out.printf("��  ī���÷�\t\t  %d��%n",inventory.getNcaramel());//6.ī���÷�
	  System.out.printf("��  �ڸ�\t\t  %d��%n",inventory.getNgrapefruit());//7.�ڸ�
	  System.out.printf("��  ź���\t\t  %d��%n",inventory.getNspawater());//8.ź���
	  System.out.printf("��  ���Ʈ�Ŀ��\t  %d��%n",inventory.getNyogurtpowder());//9.���Ʈ�Ŀ��
	  System.out.printf("��  Ƽ��\t\t  %d��%n",inventory.getNteabag());//10.Ƽ��
	  System.out.printf("��  ����\t\t  %d��%n",inventory.getNgoguma());//11.����
	  System.out.printf("��  ������\t\t  %d��%n",inventory.getNorange());//12.������
	  System.out.printf("��  ����ũ\t\t  %d��%n",inventory.getNcake());//13.����ũ
	  System.out.printf("��  ���̱�\t\t  %d��%n",inventory.getNbagel());//14.���̱�
	  System.out.printf("��  ����\t\t  %d��%n",inventory.getNscone());//15.����
	  System.out.printf("��  ��ī��\t\t  %d��%n",inventory.getNmacaron());//16.��ī��
	  System.out.printf("��  ��Ű\t\t  %d��%n",inventory.getNcookie());//17.��Ű
	  System.out.printf("��  ũ��ġ��\t\t  %d��%n",inventory.getNcreamcheese());//18.ũ��ġ��
	  System.out.printf("��  ������\t\t  %d��%n",inventory.getNstroberryjam());//19.������
	  System.out.printf("��  ����ũ��\t\t  %d��%n",inventory.getNwhipcream());//20.����ũ��
	  System.out.println("-------------------------------------------------------------------");
	  System.out.println("===================================================================");

      System.out.println("1.�ڷ� ���ư���");
      int a =sc.nextInt();
      if(a==1)
      {
         return;
      }else
      {
         do
         {
            System.out.println("����");
            System.out.println("�ٽ� �Է����ּ���");
            a=sc.nextInt();
         }while(a!=1);
         
         if(a==1)
            
		return;
	  }
      
      
   }

   public  void imbakInventory() ///�����ӹ� ��� 
   {
      Inventory inventory = new Inventory();
      //��� 5�� �̸��� ���� �ӹ� ���� ��
	  System.out.println("===================================================================");
      System.out.println("\t\t         ������ �ӹ� ��� ��Ȳ��");
      System.out.println("-------------------------------------------------------------------");
	  System.out.println("   ����\t          ����");
      if(inventory.getNbean()<5)
      {
         System.out.printf("��  ����\t\t  %d��%n",inventory.getNbean());
      }
	   if(inventory.getNmilk()<5)
      {
         System.out.printf("��  ����\t\t  %d��%n",inventory.getNmilk());   
      }
	   if(inventory.getNchoco()<5)
      {
         System.out.printf("��  ����\t\t  %d��%n",inventory.getNchoco());
      }
	   if(inventory.getNvanilla()<5)
      {
         System.out.printf("��  �ٴҶ�÷�\t\t  %d��%n",inventory.getNvanilla());
      }
	   if(inventory.getNhazel()<5)
      {
         System.out.printf("��  ������ӽ÷�\t  %d��%n",inventory.getNhazel());
      }
	   if(inventory.getNcaramel()<5)
      {
         System.out.printf("��  ī���÷�\t\t  %d��%n",inventory.getNcaramel());
      }
	   if(inventory.getNgrapefruit()<5)
      {
         System.out.printf("��  �ڸ�\t\t  %d��%n",inventory.getNgrapefruit());
      }
	   if(inventory.getNspawater()<5)
      {
         System.out.printf("��  ź���\t\t  %d��%n",inventory.getNspawater());
      }
	   if(inventory.getNyogurtpowder()<5)
      {
         System.out.printf("��  ���Ʈ�Ŀ��\t  %d��%n",inventory.getNyogurtpowder());
      }
	   if(inventory.getNteabag()<5)
      {
         System.out.printf("��  Ƽ��\t\t  %d��%n",inventory.getNteabag());
      }
	   if(inventory.getNgoguma()<5)
      {
         System.out.printf("��  ����\t\t  %d��%n",inventory.getNgoguma());
      }
	   if(inventory.getNorange()<5)
      {
         System.out.printf("��  ������\t\t  %d��%n",inventory.getNorange());
      }
	   if(inventory.getNcake()<5)
      {
         System.out.printf("��  ����ũ\t\t  %d��%n",inventory.getNcake());
      }
	   if(inventory.getNbagel()<5)
      {
         System.out.printf("��  ���̱�\t\t  %d��%n",inventory.getNbagel());   
      }
	   if(inventory.getNscone()<5)
      {
         System.out.printf("��  ����\t\t  %d��%n",inventory.getNscone());   
      }
	   if(inventory.getNmacaron()<5)
      {
         System.out.printf("��  ��ī��\t\t  %d��%n",inventory.getNmacaron());   
      }
	   if(inventory.getNcookie()<5)
      {
         System.out.printf("��  ��Ű\t\t  %d��%n",inventory.getNcookie());   
      }
	   if(inventory.getNcreamcheese()<5)
      {
         System.out.printf("��  ũ��ġ��\t\t  %d��%n",inventory.getNcreamcheese());   
      }
	   if(inventory.getNstroberryjam()<5)
      {
         System.out.printf("��  ������\t\t  %d��%n",inventory.getNstroberryjam());   
      }
	   if(inventory.getNwhipcream()<5)
      {
         System.out.printf("��  ����ũ��\t\t  %d��%n",inventory.getNwhipcream());  
      }
	  System.out.println("-------------------------------------------------------------------");
	  System.out.println("===================================================================");
      System.out.println("1.�ڷ� ���ư���");
      int a =sc.nextInt();
      if(a==1)
      {
        return;
      }else 
      {
         do
         {
            System.out.println("����");
            System.out.println("�ٽ� �Է����ּ���");
            a=sc.nextInt();
         }while(a!=1);
         
         if(a==1)
           
        	 return;
      }
      
      
   }
      


   public void backInventory()
   {
      //������ ���� ���ư���
	  ManagerMenu m = new ManagerMenu();

		 while (true)
		 {
			 m.menuDisp();
			 m.menuSelect();
			 m.menuRun();
		 }
   }
}