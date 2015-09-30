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

    public GorillaGymClientData(String email, String name, String phone, String address) {
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.address = address;
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
}
