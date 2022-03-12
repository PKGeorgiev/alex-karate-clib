
public class KarateClubMain {

	public static void main(String[] args) throws Exception {

		KarateClub kc = new KarateClub();
		
		Trainee trainee1 = new Trainee();
		trainee1.setId(0);
		trainee1.setName("Rado Petrov (Sofia)");
		
		Trainee trainee2 = new Trainee();
		trainee2.setId(1);
		trainee2.setName("Rado Petrov (Burgas)");		
		
		kc.addTrainee(trainee1);
		kc.addTrainee(trainee2);
		
		Trainer trainer1 = new Trainer();
		trainer1.setId(0);
		
		kc.addTrainer(trainer1);

		System.out.println("Ok");
	}

}
