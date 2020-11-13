package test;
	class Vehicle{
		int k =10;
		Vehicle(){
			System.out.println("Vehicle");
		}
	}
	
	class Bus extends Vehicle{
		int k = 20;
		Bus(){
			System.out.println("bus");
		}
	}
	public class Test021 {
	
	public static void main(String[] args) {
		System.out.println("[ Vehicle형 받기] ");
		Vehicle v = new Bus();
		System.out.println("v.k : "+v.k);
		System.out.println("[ Bus형 받기 ]");
		Bus v2 = new Bus();
		System.out.println("v2.k : "+v2.k);
		System.out.println("[ Vehicle형 받기 Vehicle객체생성하기 ]");
		Vehicle v3 = new Vehicle();
		System.out.println("v3.k : "+v3.k);
	}

}
