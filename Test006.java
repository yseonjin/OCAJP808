package test;

import java.io.IOException;

class X{
	public void printFileContent(){
		try {
			throw new IOException("Hello mungmung");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
	}
}
public class Test006 {
	public static void main(String[] args) throws IOException {
		X xobj = new X();
		xobj.printFileContent();
	}
}
