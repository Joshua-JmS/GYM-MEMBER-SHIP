package model;

public class Trainer {

    private int trainerId;
    private String trainerName;
    private String specialization;
    private String phone;
    private int experience;

    public Trainer() {
    }

    public Trainer(int trainerId, String trainerName,
                   String specialization,
                   String phone,
                   int experience) {

        this.trainerId = trainerId;
        this.trainerName = trainerName;
        this.specialization = specialization;
        this.phone = phone;
        this.experience = experience;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

}