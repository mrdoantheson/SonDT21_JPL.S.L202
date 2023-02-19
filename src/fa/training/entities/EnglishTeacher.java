package fa.training.entities;
/**
 * @author SonDT21
 */
public class EnglishTeacher extends Teacher implements Actionable {
    private String mainSubject;

    public EnglishTeacher() {
    }

    public EnglishTeacher(String designation, String collegeName, String mainSubject) {
        super(designation, collegeName);
        this.mainSubject = mainSubject;
    }

    public String getMainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }
    @Override
    public void teach() {
        System.out.println("English English subject");
    }

    @Override
    public void toSchool() {
        System.out.println("Math teacher go to school by motorbike!");
    }

    public String translate(String en, String vi) {
        return en + " in Vietnamese " + vi;
    }

    @Override
    public String toString() {
        return "EnglishTeacher [mainSubject=" + mainSubject +
                ", getDesignation()=" + getDesignation() +
                ", getCollegename()=" + getCollegeName() + "]";
    }
}
