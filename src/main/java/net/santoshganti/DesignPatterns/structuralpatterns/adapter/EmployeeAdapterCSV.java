package net.santoshganti.DesignPatterns.structuralpatterns.adapter;

public class EmployeeAdapterCSV implements Employee {

    private final EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getFirstname();
    }

    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

    public String toString() {
        return "ID: " + instance.getId()
            + " FirstName: " + instance.getFirstname()
            + " LastName: " + instance.getLastname()
            + " Email: " + instance.getEmailAddress();
    }
}
