package HospitalManagementSystem;

/**
 * Doctor class represents a doctor in the hospital system.
 * Extends the Person class.
 * 
 * @author Hospital Management Team
 * @version 1.0
 */
public class Doctor extends person {
    private String doctorID;
    private String department;

    /**
     * Constructor to create a Doctor object.
     * 
     * @param personID Unique identifier for the person
     * @param name Name of the doctor
     * @param age Age of the doctor
     * @param gender Gender of the doctor
     * @param address Address of the doctor
     * @param contactDetails Contact information of the doctor
     * @param doctorID Unique doctor identifier
     * @param department Department where the doctor works
     */
    public Doctor(String personID, String name, int age, String gender, 
                  String address, String contactDetails, String doctorID, String department) {
        super(personID, name, age, gender, address, contactDetails);
        this.doctorID = doctorID;
        this.department = department;
    }

    /**
     * Views the details of a patient.
     * 
     * @param patient The patient whose details are to be viewed
     */
    public void seePatientDetails(Patient patient) {
        System.out.println("=== Patient Details ===");
        patient.viewPersonalDetails();
        System.out.println("Patient ID: " + patient.getPatientID());
    }

    /**
     * Prescribes treatment to a patient during an appointment.
     * 
     * @param patient The patient receiving treatment
     * @param type Type of treatment
     * @param description Description of the treatment
     * @return The created Treatment object
     */
    public Treatment prescribeTreatment(Patient patient, String type, String description) {
        String treatmentID = "TRT" + System.currentTimeMillis();
        Treatment treatment = new Treatment(treatmentID, type, description);
        System.out.println("Treatment prescribed for patient: " + patient.getName());
        return treatment;
    }

    /**
     * Gets the doctor ID.
     * 
     * @return The doctor ID
     */
    public String getDoctorID() {
        return doctorID;
    }

    /**
     * Gets the department.
     * 
     * @return The department name
     */
    public String getDepartment() {
        return department;
    }
}