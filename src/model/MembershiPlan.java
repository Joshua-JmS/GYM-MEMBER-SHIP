package model;

public class MembershiPlan {

    private int planId;
    private String planName;
    private String duration;
    private double amount;

    public MembershiPlan() {
    }

    public MembershiPlan(int planId, String planName, String duration, double amount) {
        this.planId = planId;
        this.planName = planName;
        this.duration = duration;
        this.amount = amount;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}