public class TrainingTest {

	public static void main(String[] args) {
		
		//Create object of PublicTraining using upcasting
		Training publictraining =new PublicTraining("Java",5000,50); 
		System.out.println("Cost of public training is "+publictraining.getOrderValue()); //Display training charges
		
		//Create object of CorporateTraining using upcasting
		Training corporatetraining =new CorporateTraining("Big Data",35000,4); 
		System.out.println("Cost of corporate training is "+corporatetraining.getOrderValue()); //Display training charges
		
	}
}
