//Calculate training charges based on training types
public abstract class Training {

	int id;
	String subject;
	double fees;
	abstract double getOrderValue(); //Implement function according to training type

}

