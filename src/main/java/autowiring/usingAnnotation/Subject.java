package autowiring.usingAnnotation;


public class Subject {
    private String subName;
    private String subCode;

    public String getSubName() {
        return subName;
    }


    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subName='" + subName + '\'' +
                ", subCode='" + subCode + '\'' +
                '}';
    }
}
