package model;

public class Attendance {

    private int attendanceId;
    private int memberId;
    private String attendanceDate;
    private String status;

    public Attendance() {
    }

    public Attendance(int attendanceId, int memberId, String attendanceDate, String status) {
        this.attendanceId = attendanceId;
        this.memberId = memberId;
        this.attendanceDate = attendanceDate;
        this.status = status;
    }

    public int getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(String attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}