package cafeExam;

public class Cafe {
	private int coffee;
	private int sugar;
	private int cream;
	
	public void makeTea(int coffee) {
		this.coffee=coffee;
		System.out.println("��Ŀ�� ������~~");
		System.out.println("Ŀ�� ��:"+(coffee));
	}
	public void makeTea(int coffee,int sugar) {
		this.coffee=coffee;
		this.sugar=sugar;
		System.out.println("���� Ŀ�� ������~~");
		System.out.println("Ŀ�� ��:"+(coffee+sugar));
	}
	public void makeTea(int coffee, int sugar, int cream) {
		this.coffee=coffee;
		this.sugar=sugar;
		this.cream=cream;
		System.out.println("��ũĿ�� ������~~");
		System.out.println("Ŀ�ǳ�:"+(coffee+sugar+cream));
	}

}
