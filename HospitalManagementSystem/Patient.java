package HospitalManagementSystem;

/**
 * Patient class represents a patient in the hospital system.
 * Extends the Person class.
 * 
 * @author Hospital Management Team
 * @version 1.0
 */
public class Patient extends person {
    private String patientID;

    /**
     * Constructor to create a Patient object.
     * 
     * @param personID Unique identifier for the person
     * @param name Name of the patient
     * @param age Age of the patient
     * @param gender Gender of the patient
     * @param address Address of the patient
     * @param contactDetails Contact information of the patient
     * @param patientID Unique patient identifier
     */
    public Patient(String personID, String name, int age, String gender, 
                   String address, String contactDetails, String patientID) {
        super(personID, name, age, gender, address, contactDetails);
        this.patientID = patientID;
    }

    /**
     * Books an appointment with a doctor.
     * 
     * @param doctor The doctor to book appointment with
     * @param appointmentDate Date of the appointment
     * @param appointmentTime Time of the appointment
     * @return The created Appointment object
     */
    public Appointment bookAppointment(Doctor doctor, String appointmentDate, String appointmentTime) {
        String appointmentID = "APT" + System.currentTimeMillis();
        Appointment appointment = new Appointment(appointmentID, appointmentDate, appointmentTime, this, doctor);
        System.out.println("Appointment booked successfully!");
        System.out.println("Appointment ID: " + appointmentID);
        return appointment;
    }

    /**
     * Gets the patient ID.
     * 
     * @return The patient ID
     */
    public String getPatientID() {
        return patientID;
    }
}
