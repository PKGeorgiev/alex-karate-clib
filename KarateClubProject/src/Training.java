
public class Training {
	int id;
	String training;
	Trainer[] trainers;
	Trainee[] trainees;
	
	public String getTraining() {
		return training;
	}
	public void setTraining(String training) {
		this.training = training;
	}
	public Trainer[] getTrainers() {
		return trainers;
	}
	public void setTrainers(Trainer[] trainers) {
		this.trainers = trainers;
	}
	public Trainee[] getTrainees() {
		return trainees;
	}
	public void setTrainees(Trainee[] trainees) {
		this.trainees = trainees;
	}
	public int getId() {
		return id;
	}
}
