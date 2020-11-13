package test;

public class Test011 {
	public static void main(String[] args) {
		String[] strs = {"A","B"};
		int idx = 0;
		for (String s :strs) {
			System.out.print("String s : "+ s+" /");
			System.out.println(strs[idx].concat(" element "+idx));
			idx++;
		}
		
		System.out.println("");
		for(idx = 0 ;idx < strs.length ; idx++) {
			System.out.println(strs[idx].concat(" element "+idx));
			System.out.println(strs[idx]);
		}
		System.out.println("===향상된 for문 이용하기===");
		int[] num = {1,2,3};
		for(int i : num) {
			System.out.println(i);
		}
	}
}
