package test;

public class Test002 {

	public static void main(String[] args) {
		
		int n = 123;
		int answer = 0;
	    String ns = n+"";
	    for(int i = 0 ; i < ns.length(); i ++) {
	    	System.out.println(i);
	    	int num = Integer.parseInt((ns.charAt(i))+"");
	    	answer += num;
	    }
	    System.out.println(answer);
	}
}
