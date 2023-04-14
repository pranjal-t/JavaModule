package com.immutable;

class Address
{
    private int houseNo;

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String locality;
    private String city;
}
final
class Employee
{
    public Employee(String name, int empId, Address address) {
        this.name = name;
        this.empId = empId;

        Address a = new Address();
        a.setCity(address.getCity());
        a.setLocality(address.getLocality());
        a.setHouseNo(address.getHouseNo());

        this.address = a;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public Address getAddress() {
        return address;
    }

    private final String name;
    private final int empId;
    private final Address address;

}
public class ImmutableDemo {

    public static void main(String[] args) {

        Address address = new Address();
        address.setHouseNo(204);
        address.setLocality("Avantika");
        address.setCity("Ghaziabad");

        Employee e1 = new Employee("Harish",12, address);
        System.out.println(e1.getEmpId() + " " + e1.getName() + " " + e1.getAddress().getCity());

        address.setCity("Delhi");

        System.out.println(e1.getEmpId() + " " + e1.getName() + " " + e1.getAddress().getCity());

    }
}

