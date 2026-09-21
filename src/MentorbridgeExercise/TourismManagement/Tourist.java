package MentorbridgeExercise.TourismManagement;

public class Tourist {

    private int touristId;
    private String touristName;
    private String email;
    private String phone;

    // No-argument constructor
    public Tourist() {
    }

    // Parameterized constructor
    public Tourist(int touristId, String touristName,
                   String email, String phone) {

        this.touristId = touristId;
        this.touristName = touristName;
        this.email = email;
        this.phone = phone;
    }

    // Getters
    public int getTouristId() {
        return touristId;
    }

    public String getTouristName() {
        return touristName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    // Setters
    public void setTouristId(int touristId) {
        this.touristId = touristId;
    }

    public void setTouristName(String touristName) {
        this.touristName = touristName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Display tourist details
    public void displayTouristDetails() {

        System.out.println("Tourist ID   : " + touristId);
        System.out.println("Name         : " + touristName);
        System.out.println("Email        : " + email);
        System.out.println("Phone        : " + phone);
    }
}