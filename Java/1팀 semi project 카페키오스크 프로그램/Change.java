// �Ž����� �Ӽ� Ŭ����(������) 
public class Change
{
	
	//�Ӽ�: ������, ����, ��õ��, õ��, ����� 
	private static int ohmanwon;
	private static int manwon;
	private static int ohchonwon;
	private static int chonwon;
	private static int ohbackwon;

	
	private static int change;   //�Ž����� �ݾ��� ��� ����

   public int getChange()
   {
	  return getOhmanwon() * 50000 + getManwon() * 10000 + getOhchonwon() * 5000 + getChonwon() * 1000 + getOhbackwon() * 500;
   }

	public int getOhmanwon()
	{
		return ohmanwon;
	}
	public void setOhmanwon(int ohmanwon)
	{
		this.ohmanwon = ohmanwon;
	}
	public int getManwon()
	{
		return manwon;
	}
	public void setManwon(int manwon)
	{
		this.manwon = manwon;
	}
	public int getOhchonwon()
	{
		return ohchonwon;
	}
	public void setOhchonwon(int ohchonwon)
	{
		this.ohchonwon = ohchonwon;
	}
	public int getChonwon()
	{
		return chonwon;
	}
	public void setChonwon(int chonwon)
	{
		this.chonwon = chonwon;	
	}
	public int getOhbackwon()
	{
		return ohbackwon;
	}
	public void setOhbackwon(int ohbackwon)
	{
		this.ohbackwon = ohbackwon;
	}

}