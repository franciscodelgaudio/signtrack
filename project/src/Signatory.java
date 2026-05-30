public class Signatory {
    private String name;
    private String email;
    private String cellPhone;

    public Signatory(String name, String email, String cellPhone) {
        this.name = name;
        this.email = email;
        this.cellPhone = cellPhone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }
}
