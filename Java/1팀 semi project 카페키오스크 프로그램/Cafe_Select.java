

// // ����ڰ� �����ϴ� ���� ��� ���� �Ӽ� Ŭ����(��ä��)
class Cafe_Select
{	
	// 1. COFFEE ������
	public Cafe_Select(int category,int main,int hiop,int op)
	{
		this.category = category;
		this.main = main;
		this.hiop = hiop;
		this.op = op;
	}

	//3. DISSERT ������
	public Cafe_Select(int category,int main,int op)
	{
		this.category = category;
		this.main = main;
		this.op = op;
	}
	
	//2.NON_COFFEE ������,
	public Cafe_Select(int category,int main)
	{
		this.category = category;
		this.main = main;
	}

	public Cafe_Select()
	{}


	// �Ӽ� ��
	private int main;			//-- ���� �޴� ���ð�	
	private int hiop;			//-- HOT/ICE ���ð�
	private int op;				//-- �߰��ɼ� ���ð�
	private int category;		//-- ��ٱ��� ����� ���� sel���� ���� ���� 	
	
	//����/���� �޼ҵ�
	
	public int getCategory()
	{
		return category;
	}

	public int getMain()
	{
		return main;	
	}
	
	public void setMain(int main)
	{
		this.main = main;
	}

	public int getHiop()
	{
		return hiop;
	}

	public void setHiop(int hiop)
	{
		this.hiop = hiop;
	}

	public int getOp()
	{
		return op;
	}

	public void setOp(int op)
	{
		this.op = op;
	}

}