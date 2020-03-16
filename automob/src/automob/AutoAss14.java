package automob;

import java.util.Date;

class Automobile
{
	Date make;
	String type;
	double maxSpeed,mileage;
	long price,registrationNumber;
	
	
	void setData(Date make,String type,double maxSpeed,double mileage,long price,long registrationNumber)  //setValues
	{
		this.make=make;
		this.type=type;
		this.maxSpeed=maxSpeed;
		this.mileage=mileage;
		this.price=price;
		this.registrationNumber=registrationNumber;
	}
	/*Automobile(Date make,String type,double maxSpeed,double mileage,long price,long registrationNumber)  //constructor
	{
		this.make=make;
		this.type=type;
		this.maxSpeed=maxSpeed;
		this.mileage=mileage;
		this.price=price;
		this.registrationNumber=registrationNumber;
		
	}*/
	
	void show1()    //displayValues
	{
		System.out.println(" Manufacture Date "+make+" Automobile Type "+type+" MaxSpeed "+maxSpeed+" Mileage "+mileage+" Price "+price+" RegistrationNumber "+registrationNumber);
		
	}
	
	
	
	
}

class Track extends Automobile
{
	double capacity;
	String hoodType;
	int noOfWheels;
	
	void setData(double capacity,String hoodTypes,int noOfWheels,Date make,String type,double maxSpeed,double mileage,long price,long registrationNumber)
	{
		super.setData(make, type, maxSpeed, mileage, price, registrationNumber);
		this.capacity=capacity;
		this.hoodType=hoodType;
		this.noOfWheels=noOfWheels;
	}
	
	void show1()
	{
		super.show1();
		System.out.println(" Capacity "+capacity+" hoodType "+hoodType+" noOfWheels "+noOfWheels);
	}
	
	/* Track(Date make,String type,double maxSpeed,double mileage,long price,long registrationNumber)     //invoking value by constructor
	{
		super(make,type,maxSpeed,mileage,price,registrationNumber);
	}
	
	void show()
	{
		super.show1();
		System.out.println(" Manufacture Date "+make+" Automobile Type "+type+" MaxSpeed "+maxSpeed+" Mileage "+mileage+" Price "+price+" RegistrationNumber "+registrationNumber);
		
		
	}
	
	Track(double capacity,String hoodType,int noOfWheels)  //set value by constructor
	{
		this.capacity=capacity;
		this.hoodType=hoodType;
		this.noOfWheels=noOfWheels;
	} */
	

	
	
	
}

class Car extends Automobile
{
	int noOfDoors,seatingCapacity;
	
	void setData(int noOfDoors,int seatingCapacity,Date make,String type,double maxSpeed,double mileage,long price,long registrationNumber)
	{
		super.setData(make, type, maxSpeed, mileage, price, registrationNumber);
		this.noOfDoors=noOfDoors;
		this.seatingCapacity=seatingCapacity;
		
	}
	
	void show1()
	{
		super.show1();
		System.out.println(" Number Of doors "+noOfDoors+" Seating Capacity "+seatingCapacity);
	}
	
	/* Car(Date make,String type,double maxSpeed,double mileage,long price,long registrationNumber)
	{
		super(make,type,maxSpeed,mileage,price,registrationNumber)
		
	}
	
	void show()
	{
		super.show1();
		System.out.println(" Manufacture Date "+make+" Automobile Type "+type+" MaxSpeed "+maxSpeed+" Mileage "+mileage+" Price "+price+" RegistrationNumber "+registrationNumber);
		
		
	} */
	
	
	
}

public class AutoAss14
{
	public static void main(String args[])
	{
		Automobile auto=new Automobile();
		Date d1= new Date(2020,02,16);
		auto.setData(d1,"ABC",40.00,50.00,60000L,12345L);
		auto.show1();
		Track tr=new Track();
		tr.setData(25.00,"Yes",4,d1,"DEF",50.00,60.00,75000L,23456L);
		tr.show1();
		Car c=new Car();
		c.setData(4,6,d1,"GHI",60.00,70.00,80000L,34567L);
		c.show1();
		
		
	}

}
