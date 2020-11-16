package Daehyun;

public class CarTest {

	static int geer = 0;
	
	public CarTest() {
		geer = 10;
	}
	
	public void Printgeer() {
		System.out.println(geer);
	}
	
	public static void main(String[] args) {
		
		System.out.println(geer);
		
		System.out.println((new CarTest()).geer);
		
	}
}
