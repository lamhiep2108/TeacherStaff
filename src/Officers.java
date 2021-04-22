public class Officers {
    private String name;
    private String dateOfBirth;
    private String homeTown;

    public Officers() { }

    public Officers(String name, String dateOfBirth, String homeTown) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.homeTown = homeTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Override
    public String toString() {
        return "Officers{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }
}
