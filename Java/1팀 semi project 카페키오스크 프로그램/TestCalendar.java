import java.util.Calendar;
//������
class TestCalendar //�ÿ��� ���� ��¥�� �ٲ�� �ٲ��� �� ��ɵ��� �����ֱ� ���� Ŭ����
{
	static int sumCustomer=0; //��¥�� �ٲٱ� ���� ���� �մ� �� ����
	static int datePlus;//��¥ �����ֱ�.���� 1�� �ٲ�� 1 ���ϰ� 2�� �ٲ�� 2 ���ϰ�

	public void calendar()
	{
		Calendar cal = Calendar.getInstance();//�޷� �ν��Ͻ� ����

		
		Receipt rec = new Receipt(); //������ �ν��Ͻ� ����(�մԼ��� �ҷ����� ����)
		Money money = new Money();   //���� �ν��Ͻ� ����(������ �ʱ�ȭ ��Ű�� ����)
		Sales_Control sc = new Sales_Control(); //�Ǹŷ� �ν��Ͻ� ����

		//��¥ �׽�Ʈ
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);

		sumCustomer += 1; //�մ� ���� �Ѹ� �þ  

		if((sumCustomer)%2 == 0 && (sumCustomer) != 0) //�մ��� 2�� ���� ��¥�� �ٲ� 0���� �� ����ȵ�
		{
			datePlus= datePlus+1; 
			rec.setCustomer(0); //�Ϸ� �մ� �� �ʱ�ȭ 
			money.setCard_SalesD(0); //�Ϻ� ī�尪 �ʱ�ȭ
			money.setBill_SalesD(0); //�Ϻ� ���ݰ� �ʱ�ȭ
			money.setBalju_moneyD(0); //�Ϻ� ���� �ݾ� �ʱ�ȭ

			// �� �Ǹŷ� ������Ű�� �޼ҵ�  
			sc.saveSales();
			resetSales();// �Ϻ� �Ǹŷ� �ʱ�ȭ
			//resetChange();//�Ž����� �ʱ�ȭ

					
	
		}

	}

	//��¥�� �ٲ�� ��� �޴� �Ǹŷ� �ʱ�ȭ
	void resetSales()
	{
		Sales sa = new Sales(); //�Ǹŷ� Ŭ���� �ν��Ͻ� ����

		  // �� Ŀ�Ƿ�
		   sa.setSespresso(0);
		   sa.setSamericano(0);   
		   sa.setSlatte(0);
		   sa.setScafeMoca(0);
		   sa.setScappuccino(0);
		   sa.setSvanillaLatte(0);
		   sa.setScaramelM(0);
		   
		   // �� ��Ŀ�Ƿ�
		   sa.setSjamongAde(0);
		   sa.setSyogurt(0);
		   sa.setStea(0);
		   sa.setSorangeJuice(0);
		   sa.setSgogumaLatte(0);
		   
		   // �� ����Ʈ�� 
		   sa.setScake(0);
		   sa.setSbagel(0);
		   sa.setSscone(0);
		   sa.setSmacaron(0);
		   sa.setScookie(0);



	}

	//��¥�� �ٲ�� �Ž����� �ʱ�ȭ
	void resetChange()
	{
		Change ch = new Change(); //�Ž����� Ŭ���� �ν��Ͻ� ����

		ch.setOhmanwon(0);
		ch.setManwon(0);
		ch.setOhchonwon(0);
		ch.setChonwon(0);
		ch.setOhbackwon(0);
	}
	
}
