package kpl;

     abstract class create{
	 abstract void number();
	 abstract void number3();

}
 class create2 extends create{
	 public void number() {
		 System.out.println("abs class work");
	 }
	 public void number3() {
		 System.out.println("abs2 class work ");
	 }
 }




public class constracterclass {
	
	int z;
	int j;
	int n;
	public constracterclass(int year,int month,int day) {
		
	z=year;
	j=month;
	n=day;
	System.out.println("costracter work");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constracterclass cricket = new constracterclass(2020,50,50);
		System.out.println(cricket.z+cricket.j+cricket.n);
		
		create2 balls = new create2();
		balls.number();

		balls.number3();
	}

}
