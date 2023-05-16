public class Client {
    private String name;
    private String address;
    private String phone;

    public Client(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void showDatails() {
        System.out.println("Cliente: " + name);
        System.out.println("Endereço: " + address);
        System.out.println("Telefone: " + phone);
    }
}
