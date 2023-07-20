class Main{
	public static void main(String[] args)
	{
		System.out.println("invoking main in Main");
		
		Wood w1=new Wood();
		Wood w2=new Wood("polish");
		Wood w3=new Wood("brown",50);
		
		System.out.println("##############");

		Mall m1=new Mall();
		Mall m2=new Mall("orion");
		Mall m3=new Mall("bangalore",35);
		
		System.out.println("##############");

		Park p1=new Park();
		Park p2=new Park("lal bhag");
		Park p3=new Park("bangalore",1);
	}
}
