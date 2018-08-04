//For public training, charges based on number of participants
public class PublicTraining extends Training {
	
	int participants;
	
	PublicTraining(String subject,double fees,int participants) { //Parameterized constructor to initialize instance members
		this.subject=subject;
		this.fees=fees;
		this.participants=participants;
	}
	
	public double getOrderValue()  //Overriding getOrderValue of Training class to calculate charges
	{
		return (fees*participants);
	}

}

