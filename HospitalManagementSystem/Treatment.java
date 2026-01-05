package HospitalManagementSystem;

/**
 * Treatment class represents a treatment prescribed to a patient.
 * 
 * @author Hospital Management Team
 * @version 1.0
 */
public class Treatment {
    private String treatmentID;
    private String type;
    private String description;

    /**
     * Constructor to create a Treatment object.
     * 
     * @param treatmentID Unique identifier for the treatment
     * @param type Type of treatment (e.g., medication, surgery, therapy)
     * @param description Detailed description of the treatment
     */
    public Treatment(String treatmentID, String type, String description) {
        this.treatmentID = treatmentID;
        this.type = type;
        this.description = description;
    }

    /**
     * Updates the description of the treatment.
     * 
     * @param newDescription The new description for the treatment
     */
    public void updateDescription(String newDescription) {
        this.description = newDescription;
        System.out.println("Treatment description updated successfully.");
    }

    /**
     * Displays the details of the treatment.
     */
    public void viewTreatmentDetails() {
        System.out.println("=== Treatment Details ===");
        System.out.println("Treatment ID: " + treatmentID);
        System.out.println("Type: " + type);
        System.out.println("Description: " + description);
    }

    // Getters
    public String getTreatmentID() { return treatmentID; }
    public String getType() { return type; }
    public String getDescription() { return description; }
}
