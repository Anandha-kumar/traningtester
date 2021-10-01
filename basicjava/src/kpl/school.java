package kpl;

import java.util.ArrayList;

    class school4 {
    	void three () {
    		System.out.println("three is work");
    	}
    }
    
    class school3 extends school4 {
    	void two () {
    		System.out.println("two work");
    	}
    }



	 class  school2 extends school3{
		 
		 void one () {
			 System.out.println("one work work");
			
		 }
		
	}

			
		
		
	
public class school extends school2 {

	void sakthi() {
	int z,y,x;
		z=45;
		y=50;
		x=z+y;
		System.out.println("print "+x);
		
	}
	
	void kumar() {
		int h,g,s;
		h=678;
		g=345;
		s=h-g;
		System.out.println(s);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		school j=new school();
		j.sakthi();
		j.kumar();
		j.three();
		school2 j2=new school2();
		j2.one();
		
		school2 j3=new school2();
		j3.one();
		j3.two();
		
	
String v="sun life ";
		
System.out.println(v);


String during="kpl kings";
String makeing="kpl kings";
String schoole="indian crickert";
System.out.println(during.concat(schoole));
System.out.println(during.equals(makeing));
System.out.println(schoole.length());
System.out.println(schoole.charAt(5));
System.out.println(schoole.indexOf('n'));


	System.out.println("anandh");
	
	//arry loop
	
		String k[]= {"kannan,moorthy,kumar,sasi"};

		char h[]= {'w','r','k','p'};
		int m[]= {234,231,6725,4536,};
	
		for(int a1=0;a1<m.length;a1++)
		{
			System.out.println(m[a1]);
		}
		
//		---------------------------
		
		int a2=0;
		while (a2<k.length)
		{
			System.out.println(k[a2]);
			a2++;
		}
		
		
//		---------------------------
		
		int a3=0;
		do {
			System.out.println(h[a3]);
			a3++;
		}
          while(a3<h.length);
		
		ArrayList<String> car=new ArrayList<String>();
		car.add("kumar");
		car.add("mani");
		car.add("karnan");
		car.add("vijay");
		System.out.println(car);
		
		car.set(2,"raji");
		System.out.println(car);
		
		car.remove(3);
		System.out.println(car);
		
		int k1=90;
		if (k1>=70)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		
		}
		
//		nested ifElse condition
//		0-10 fail 1, 10-20 fail 2, 20-30 fail 3, 30-40 fail 4, above 50 pass
		
		int m1=101;
		if (m1<10 && m1>0) {
			System.out.println("fail 0-10");
		}
		else if(m1>=10 && m1<20) {
			System.out.println("fail 10-20");
		}
		else if (m1>=20 && m1<30) {
			System.out.println("fail 20-30");
		}
		else if (m1>=30 && m1<=40) {
			System.out.println("fail 30-40");
		}
		else if (m1>=100) {
			System.out.println("please enter below 100");
		}
		
		else {
			System.out.println("pass");
		}
		
		int months=133;
		switch (months) {
		case 1:
			System.out.println("jan");
		break;
		case 2:
			System.out.println("feb");
		break;
		case 3:
			System.out.println("march");
		break;
		case 4:
			System.out.println("april");
		break;
		
		case 5:
			System.out.println("may");
		break;
		case 6:
			System.out.println("june");
		break;
		case 7:
			System.out.println("july");
		break;
		case 8:
			System.out.println("augest");
		break;
		case 9:
			System.out.println("sep");
		break;
		case 10:
			System.out.println("oct");
		break;
		case 11:
			System.out.println("nov");
		break;
		case 12:
			System.out.println("dec");
		break;
		default :
			System.out.println("enter months value 1 to 12");
		break;	
		
}

		
}	
}
