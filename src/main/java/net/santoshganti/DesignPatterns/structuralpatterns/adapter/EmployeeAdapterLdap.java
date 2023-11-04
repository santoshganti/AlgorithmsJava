package net.santoshganti.DesignPatterns.structuralpatterns.adapter;

public class EmployeeAdapterLdap implements Employee {
    private final EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }


    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    public String toString() {
        return "ID: " + instance.getCn()
            + " FirstName: " + instance.getGivenName()
            + " LastName: " + instance.getSurname()
            + " Email: " + instance.getMail();
    }
}
