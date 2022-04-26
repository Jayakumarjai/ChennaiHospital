package jai.work;

public class DataType {
	public long tamil() {
		long a =7;
		long b =2;
		long c =a+b;
		System.out.println(c);
		return c;
		
	}
	public long english() {
		long d =20;
		long e =10;
		long f =d+e;
		
		System.out.println(f);
		return f;
	}
	public static void main(String[] args) {
		DataType D = new DataType();
		long c = D.tamil();
		long f = D.english();
		System.out.println(c+f);
	}

}
