package kg.gorillagym.shop.cart;

import ru.egalvi.shop.ClientData;

/**
 * Client data for purchase.
 */
public class GorillaGymClientData implements ClientData {
    private final String email;
    private final String name;
    private final String phone;
    private final String address;
    private final String token;
    private final String capture;

    public GorillaGymClientData(String email, String name, String phone, String address, String token, String capture) {
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.token = token;
        this.capture = capture;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getToken() {
        return token;
    }

    public String getCapture() {
        return capture;
    }

    @Override
    public String toString() {
        return "GorillaGymClientData{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", token='" + token + '\'' +
                ", capture='" + capture + '\'' +
                '}';
    }
}
