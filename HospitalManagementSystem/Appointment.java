package HospitalManagementSystem;

/**
 * Appointment class represents an appointment between a patient and a doctor.
 * 
 * @author Hospital Management Team
 * @version 1.0
 */
public class Appointment {
    private String appointmentID;
    private String appointmentDate;
    private String appointmentTime;
    private Patient patient;
    private Doctor doctor;

    /**
     * Constructor to create an Appointment object.
     * 
     * @param appointmentID Unique identifier for the appointment
     * @param appointmentDate Date of the appointment
     * @param appointmentTime Time of the appointment
     * @param patient The patient for this appointment
     * @param doctor The doctor for this appointment
     */
    public Appointment(String appointmentID, String appointmentDate, String appointmentTime, 
                       Patient patient, Doctor doctor) {
        this.appointmentID = appointmentID;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.patient = patient;
        this.doctor = doctor;
    }

    /**
     * Reschedules the appointment to a new date and time.
     * 
     * @param newDate New date for the appointment
     * @param newTime New time for the appointment
     */
    public void rescheduleAppointment(String newDate, String newTime) {
        this.appointmentDate = newDate;
        this.appointmentTime = newTime;
        System.out.println("Appointment rescheduled to " + newDate + " at " + newTime);
    }

    /**
     * Cancels the appointment.
     */
    public void cancelAppointment() {
        System.out.println("Appointment " + appointmentID + " has been cancelled.");
    }

    /**
     * Displays the details of the appointment.
     */
    public void viewAppointmentDetails() {
        System.out.println("=== Appointment Details ===");
        System.out.println("Appointment ID: " + appointmentID);
        System.out.println("Date: " + appointmentDate);
        System.out.println("Time: " + appointmentTime);
        System.out.println("Patient: " + patient.getName());
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Department: " + doctor.getDepartment());
    }

    // Getters
    public String getAppointmentID() { return appointmentID; }
    public String getAppointmentDate() { return appointmentDate; }
    public String getAppointmentTime() { return appointmentTime; }
    public Patient getPatient() { return patient; }
    public Doctor getDoctor() { return doctor; }
}