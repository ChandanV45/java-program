class Park{
	String name;
	int floor;
	String location;
	int stores;
	String color;
	double parking;
	String noofbrands;
	int chair;
	int trees;
	
	
	
	Park()
	{
		System.out.println("invoking main in Park");
	}
	
	Park(String name)
	{
		System.out.println("invoking String const in Park");
		this.name=name;
	}
	
	Park(String name,int floor)
	{
		this(name);
		System.out.println("invoking String,int const in Park");
		this.floor=floor;
	}
	
	Park(String name,int floor,String location)
	{
		this(name,floor);
		System.out.println("invoking String,int,String const in Park");
		this.location=location;
	}
	
	Park(String name,int floor,String location,int stores)
	{
		this(name,floor,location);
		System.out.println("invoking String,int,String,int const in Park");
		this.stores=stores;
	}
	
	Park(String name,int floor,String location,int stores,String color)
	{
		this(name,floor,location,stores);
		System.out.println("invoking String,int,String,String,float const in Park");
		this.color=color;
	}
	
	Park(String name,int floor,String location,int stores,String color,double parking)
	{
		this(name,floor,location,stores,color);
		System.out.println("invoking String,int,String,String,float,double const in Park");
		this.parking=parking;
	}
	
	Park(String name,int floor,String location,int stores,String color,double parking,String noofbrands)
	{
		this(name,floor,location,stores,color,parking);
		System.out.println("invoking String,int,String,String,float,double,String const in Park");
		this.noofbrands=noofbrands;
	}
	
	Park(String name,int floor,String location,int stores,String color,double parking,String noofbrands,int chair)
	{
		this(name,floor,location,stores,color,parking,noofbrands);
		System.out.println("invoking String,int,String,String,float,double,String,int const in Park");
		this.chair=chair;
	}
	Park(String name,int floor,String location,int stores,String color,double parking,String noofbrands,int chair,int trees)
	{
		this(name,floor,location,stores,color,parking,noofbrands,chair);
		System.out.println("invoking String,int,String,String,float,double,String,int,int const in Park");
		this.trees=trees;
	}
	
	
	
	
}