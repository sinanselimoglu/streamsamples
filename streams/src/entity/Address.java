package entity;

public class Address {
    private String city;
    private String district;

    public Address(String city, String district) {
        this.city = city;
        this.district = district;
    }


    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address = (Address) o;

        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        return district != null ? district.equals(address.district) : address.district == null;

    }

    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + (district != null ? district.hashCode() : 0);
        return result;
    }
}
