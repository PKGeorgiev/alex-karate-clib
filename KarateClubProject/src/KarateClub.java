import java.util.Arrays;

public class KarateClub {
	Trainer[] trainers = new Trainer[0];
	Trainee[] trainees = new Trainee[0];
	Training[] trainings = new Training[0];
	
	protected void ensureUniqueness(Identifiable[] arr, int id) throws Exception {
		
		for (var item : arr) {
			if (item.getId() == id) {
				throw new Exception("Exists!");
			}
		}
	}
	
	protected void ensureBelogingToTheClub(Identifiable[] arr, int id) throws Exception {
		
		for (var item : arr) {
			if (item.getId() == id) {
				return;
			}
		}
		
		throw new Exception("The item does not belong to the club!");
	}
	
	public void train(Trainer[] trainers, Trainee[] trainees, String trainingName) 
			throws Exception {
		
		for (Trainee trainee : trainees) {
			ensureBelogingToTheClub(trainees, trainee.getId());
		}
		
		for (Trainer trainer : trainers) {
			ensureBelogingToTheClub(trainers, trainer.getId());
		}
		
		var training = new Training();
		training.setTrainers(trainers);
		training.setTrainees(trainees);
		
		Training[] tmp = Arrays.copyOf(trainings, trainings.length + 1);
		tmp[tmp.length - 1] = training;
		
		trainings = tmp;		
		
	}
	
	public void addTrainee(Trainee trainee) throws Exception {
		ensureUniqueness(trainees, trainee.id);		
		
		Trainee[] tmp = Arrays.copyOf(trainees, trainees.length + 1);
		tmp[tmp.length - 1] = trainee;
		
		trainees = tmp;
		
	}
	
	public void addTrainer(Trainer trainer) throws Exception {
		ensureUniqueness(trainers, trainer.id);		
		
		Trainer[] tmp = Arrays.copyOf(trainers, trainers.length + 1);
		tmp[tmp.length - 1] = trainer;
		
		trainers = tmp;
		
	}
}
