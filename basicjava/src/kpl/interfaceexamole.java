package kpl;
interface mark1{
	void one();
	void two();
}
interface mark2{
	void three();
	void four();
}
class college implements mark1,mark2{
	public void one( ) {
		System.out.println("one methods");
	}
	public void two( ) {
		System.out.println("two methods");
	}
	public void three( ) {
		int s,k;
		s=56;
		k=23;		
		System.out.println(s+k);
	}
	public void four( ) {
		int a,b;
		a=34;
		b=45;
		System.out.println(a-b);
	}
}
public class interfaceexamole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     college w=new college();
     w.one();
     w.two();
     w.three();
     w.four();
	}
	

}
