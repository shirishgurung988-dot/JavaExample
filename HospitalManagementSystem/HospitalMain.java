package HospitalManagementSystem;

/**
 * Main class to demonstrate the Hospital Management System.
 * 
 * @author Hospital Management Team
 * @version 1.0
 */
public class HospitalMain {
    /**
     * Main method to run the hospital management system demo.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Hospital Management System ===\n");

        // Create a patient
        Patient patient1 = new Patient("P001", "John Doe", 35, "Male", 
                                       "123 Main St", "555-1234", "PAT001");
        
        // Create a doctor
        Doctor doctor1 = new Doctor("D001", "Dr. Sarah Smith", 45, "Female", 
                                    "456 Medical Ave", "555-5678", "DOC001", "Cardiology");

        // View patient details
        System.out.println("\n--- Patient Information ---");
        patient1.viewPersonalDetails();
        System.out.println("Patient ID: " + patient1.getPatientID());

        // View doctor details
        System.out.println("\n--- Doctor Information ---");
        doctor1.viewPersonalDetails();
        System.out.println("Doctor ID: " + doctor1.getDoctorID());
        System.out.println("Department: " + doctor1.getDepartment());

        // Patient books an appointment
        System.out.println("\n--- Booking Appointment ---");
        Appointment appointment1 = patient1.bookAppointment(doctor1, "2026-01-15", "10:00 AM");

        // View appointment details
        System.out.println("\n--- Appointment Information ---");
        appointment1.viewAppointmentDetails();

        // Doctor sees patient details
        System.out.println("\n--- Doctor Viewing Patient Details ---");
        doctor1.seePatientDetails(patient1);

        // Doctor prescribes treatment
        System.out.println("\n--- Prescribing Treatment ---");
        Treatment treatment1 = doctor1.prescribeTreatment(patient1, "Medication", 
                                                          "Take aspirin 100mg daily for 30 days");

        // View treatment details
        System.out.println("\n--- Treatment Information ---");
        treatment1.viewTreatmentDetails();

        // Reschedule appointment
        System.out.println("\n--- Rescheduling Appointment ---");
        appointment1.rescheduleAppointment("2026-01-20", "2:00 PM");

        // Update treatment description
        System.out.println("\n--- Updating Treatment ---");
        treatment1.updateDescription("Take aspirin 100mg twice daily for 30 days and monitor blood pressure");
        treatment1.viewTreatmentDetails();
    }
}
