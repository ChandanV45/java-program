class Wood{
	String name;
	int type;
	String color;
	String quality;
	double inch;
	
	Wood()
	{
		System.out.println("invoking main in wood");
	}
	
	Wood(String name)
	{
		System.out.println("invoking String const in wood");
		this.name=name;
	}
	
	Wood(String name,int type)
	{
		this(name);
		System.out.println("invoking String,int const in wood");
		this.type=type;
	}
	
	Wood(String name,int type,String color)
	{
		this(name,type);
		System.out.println("invoking String,int,String const in wood");
		this.color=color;
	}
	
	Wood(String name,int type,String color,String quality)
	{
		this(name,type,color);
		System.out.println("invoking String,int,String,String const in wood");
		this.quality=quality;
	}
	
	Wood(String name,int type,String color,String quality,float inch)
	{
		this(name,type,color,quality);
		System.out.println("invoking String,int,String,String,float const in wood");
		this.inch=inch;
	}
	
	
}