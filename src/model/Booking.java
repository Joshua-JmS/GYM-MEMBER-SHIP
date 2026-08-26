package model;

public class Booking {

    private int bookingId;
    private int memberId;
    private int trainerId;
    private String bookingDate;
    private String sessionTime;

    public Booking() {
    }

    public Booking(int bookingId, int memberId, int trainerId,
                   String bookingDate, String sessionTime) {

        this.bookingId = bookingId;
        this.memberId = memberId;
        this.trainerId = trainerId;
        this.bookingDate = bookingDate;
        this.sessionTime = sessionTime;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(String sessionTime) {
        this.sessionTime = sessionTime;
    }
}