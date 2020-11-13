package test;

public class Test004 {
	
	public static void main(String[] args) {
		int[]stack = {10,20,30};
		int size =3;
		int idx = 0;
		do {
			idx++;
		}while(idx < size-1);
		System.out.println(stack[idx]);
	}
}
