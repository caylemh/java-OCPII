package ch4_StaticVarMethod;

public class Contacts {
    private final String firstName;
    private final String lastName;
    private final String mobileNo;

    public Contacts(String fname, String lname, String mobile) {
        this.firstName = fname;
        this.lastName = lname;
        this.mobileNo = mobile;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String toString() {
        return "\nName: " + firstName + " " + lastName +
                "\nMobile No: " + mobileNo;
    }
}
