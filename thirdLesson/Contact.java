package thirdLesson;

public class Contact {
    private String phone;
    private String surname;

    public Contact (String phone, String surname) {
        this.phone = phone;
        this.surname = surname;
    }

    public String toString() {
        return this.surname + " - " + this.phone;
    }
}
