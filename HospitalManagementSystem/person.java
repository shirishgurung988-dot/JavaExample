package HospitalManagementSystem;

/**
 * Person class represents a general person in the hospital system.
 * This is the parent class for Patient and Doctor.
 * 
 * @author Hospital Management Team
 * @version 1.0
 */
public class person {
    private String personID;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String contactDetails;

    /**
     * Constructor to create a Person object.
     * 
     * @param personID Unique identifier for the person
     * @param name Name of the person
     * @param age Age of the person
     * @param gender Gender of the person
     * @param address Address of the person
     * @param contactDetails Contact information of the person
     */
    public person(String personID, String name, int age, String gender, String address, String contactDetails) {
        this.personID = personID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.contactDetails = contactDetails;
    }

    /**
     * Displays the personal details of the person.
     */
    public void viewPersonalDetails() {
        System.out.println("Person ID: " + personID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contactDetails);
    }

    // Getters
    public String getPersonID() { return personID; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getAddress() { return address; }
    public String getContactDetails() { return contactDetails; }
}
