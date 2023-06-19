package autowiring.usingXml;

public class Teacher {
    private Subject subject;
    private String teacherName;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject=" + subject +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
