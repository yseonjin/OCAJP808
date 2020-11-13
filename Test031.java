package test;

public class Test031 {
	int i;
	static int j;
	public static void main(String[] args) {
		Test031 t1 = new Test031();
		Test031 t2 = new Test031();	
		t1.i = 3;
		t1.j = 4;
		t2.i = 5;
		t2.j = 6;
		System.out.println(t1.i);
		System.out.println(t1.j);
		System.out.println(t2.i);
		System.out.println(t2.j);
		System.out.println(j);
		
	}

}
