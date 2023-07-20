class Mall{
	String name;
	int floor;
	String location;
	int stores;
	String color;
	double parking;
	String noofbrands;
	
	
	Mall()
	{
		System.out.println("invoking main in Mall");
	}
	
	Mall(String name)
	{
		System.out.println("invoking String const in Mall");
		this.name=name;
	}
	
	Mall(String name,int floor)
	{
		this(name);
		System.out.println("invoking String,int const in Mall");
		this.floor=floor;
	}
	
	Mall(String name,int floor,String location)
	{
		this(name,floor);
		System.out.println("invoking String,int,String const in Mall");
		this.location=location;
	}
	
	Mall(String name,int floor,String location,int stores)
	{
		this(name,floor,location);
		System.out.println("invoking String,int,String,int const in Mall");
		this.stores=stores;
	}
	
	Mall(String name,int floor,String location,int stores,String color)
	{
		this(name,floor,location,stores);
		System.out.println("invoking String,int,String,String,float const in Mall");
		this.color=color;
	}
	
	Mall(String name,int floor,String location,int stores,String color,double parking)
	{
		this(name,floor,location,stores,color);
		System.out.println("invoking String,int,String,String,float,double const in Mall");
		this.parking=parking;
	}
	
	Mall(String name,int floor,String location,int stores,String color,double parking,String noofbrands)
	{
		this(name,floor,location,stores,color,parking);
		System.out.println("invoking String,int,String,String,float,double,String const in Mall");
		this.noofbrands=noofbrands;
	}
	
	
	
	
}