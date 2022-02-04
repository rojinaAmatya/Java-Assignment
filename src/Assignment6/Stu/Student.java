package Assignment6;

class Student {
    private int studentId;
    private String studentName;
    private long mobileNum;
    private String address;
    private String course;

    public Student(int studentId, String studentName, long mobileNum, String address, String course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mobileNum = mobileNum;
        this.address = address;
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(long mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

}




