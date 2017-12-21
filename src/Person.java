public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) throws NameUndefinedException, IncorrectAgeException {
        if (firstName == null || firstName.length() < 2 ) {
            throw new NameUndefinedException();
        }
        else {
            this.firstName = firstName;
        }

        if (lastName == null || lastName.length() < 2 ) {
            throw new NameUndefinedException();
        }
        else {
            this.lastName = lastName;
        }
        if (age < 1){
            throw new IncorrectAgeException();
        }
        else {
            this.age = age;
        }
        this.pesel = pesel;
    }

    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
