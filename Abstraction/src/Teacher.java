public class Teacher extends Person {

    String subject;
    String school;

    public Teacher(String name, String subject, String school) {
        super(name);
        this.subject = subject;
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void describeRole() {
        System.out.println(getName() + "  Teaches " + subject + "   at " + school);
    }

}
