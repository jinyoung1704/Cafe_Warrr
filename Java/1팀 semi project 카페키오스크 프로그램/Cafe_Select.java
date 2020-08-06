

// // 사용자가 선택하는 값을 담기 위한 속성 클래스(이채빈)
class Cafe_Select
{	
	// 1. COFFEE 생성자
	public Cafe_Select(int category,int main,int hiop,int op)
	{
		this.category = category;
		this.main = main;
		this.hiop = hiop;
		this.op = op;
	}

	//3. DISSERT 생성자
	public Cafe_Select(int category,int main,int op)
	{
		this.category = category;
		this.main = main;
		this.op = op;
	}
	
	//2.NON_COFFEE 생성자,
	public Cafe_Select(int category,int main)
	{
		this.category = category;
		this.main = main;
	}

	public Cafe_Select()
	{}


	// 속성 값
	private int main;			//-- 메인 메뉴 선택값	
	private int hiop;			//-- HOT/ICE 선택값
	private int op;				//-- 추가옵션 선택값
	private int category;		//-- 장바구니 출력을 위해 sel값을 담은 변수 	
	
	//게터/세터 메소드
	
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