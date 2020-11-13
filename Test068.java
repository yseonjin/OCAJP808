package test;

public class Test068 {

	public static void main(String[] args) {
		String[][] chs = new String[5][2];
		chs[0] = new String [2];
		chs[1] = new String [5];
		int i = 97;
		System.out.println(chs.length);
		System.out.println(chs[0].length);
		System.out.println(chs[1].length);
		System.out.println(chs[2].length);
		System.out.println(chs[3].length);
	for (int a = 0 ; a < chs[0].length; a++) {
			for(int b = 0; b <chs[0].length; b++) {
			chs[a][b] = "" + i;
				i++;
			}
		}
		for(String[] ca : chs) {
			for(String c :ca) {
				System.out.println(c+"");
			}
		}
	}

}
