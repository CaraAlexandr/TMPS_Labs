package models;

public class Factory {
private String name;
    private String address;
    private String phone;
    private String email;
    private String website;
    private String contactPerson;

    private FactoryType factoryType;

    public Factory() {
    }

    public Factory(String name, String address, String phone, String email, String website, String contactPerson, FactoryType factoryType) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.website = website;
        this.contactPerson = contactPerson;
        this.factoryType = factoryType;
    }

    public void displayDetails() {
        System.out.println("Factory name: " + name);
        System.out.println("Factory address: " + address);
        System.out.println("Factory phone: " + phone);
        System.out.println("Factory email: " + email);
        System.out.println("Factory website: " + website);
        System.out.println("Factory contact person: " + contactPerson);
        System.out.println("Factory type: " + factoryType);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email= email;
    }

    public void setFactoryType(FactoryType factoryType) {
        this.factoryType = factoryType;
    }

    public String getName() {
        return name;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getAddress() {
        return address;
    }

    public String getWebsite() {
        return website;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public FactoryType getFactoryType() {
        return factoryType;
    }

}
