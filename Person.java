import java.util.Calendar;

public class Person {
    private String firstName;
    private String lastName;
    private String ID;
    private String Title;
    private int YOB;


    //GETTERS AND SETTERS
    public String getFirstName() {
        return firstName;}

    public void setFirstName(String firstName) {
        this.firstName = firstName;}

    public String getLastName() {
        return lastName;}

    public void setLastName(String lastName) {
        this.lastName = lastName;}

    public String getID() {
        return ID;}

    public void setID(String ID) {
        this.ID = ID;}

    public String getTitle() {
        return Title;}

    public void setTitle(String title) {
        Title = title;}

    public int getYOB() {
        return YOB;}

    public void setYOB(int YOB) {
        this.YOB = YOB;}

    //ADDITIONAL METHODS
    public String fullName() {
        return firstName + " " + lastName;}

    public String formalName() {
        return Title + " " + fullName();}

    public String getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return String.valueOf(currentYear - YOB);}

    public String getAge(int year){
        return String.valueOf(year - YOB);}

    public String toCSV(){
        return String.format("%s,%s,%s,%s,%d", ID, firstName, lastName, Title, YOB);}

    public String toJSON(){
        return String.format("{\"ID\":\"%s\",\"firstName\":\"%s\",\"lastName\":\"%s\",\"Title\":\"%s\",\"YOB\":%d}", ID, firstName, lastName, Title, YOB);}

    public String toXML() {
        return String.format("<person><ID>%s</ID><firstName>%s</firstName><lastName>%s</lastName><title>%s</Title><YOB>%d</YOB></person>", ID, firstName, lastName, Title, YOB);}

    @Override
    public String toString(){
        return String.format("Person{ID = '%s', firstName = '%s', lastName = '%s', Title = '%s', YOB = %d}", ID, firstName, lastName, Title, YOB);}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        Person person = (Person) obj;
        return YOB == person.YOB &&
                firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) &&
                ID.equals(person.ID) &&
                Title.equals(person.Title);

    }

    //CONSTRUCTOR
    public Person(String firstName, String lastName, String ID, String Title, int YOB) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.ID = ID;
            this.Title = Title;
            this.YOB = YOB;


    }
}

