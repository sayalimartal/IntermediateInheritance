//For corporate training, charges based on number of days
public class CorporateTraining extends Training {
	
	int days;
	
	CorporateTraining(String subject,double fees,int days) {  //Parameterized constructor to initialize instance members
		this.subject=subject;
		this.fees=fees;
		this.days=days;
	}
	
	public double getOrderValue()   //Overriding getOrderValue of Training class to calculate charges
	{
		return (fees*days);
	}

}
