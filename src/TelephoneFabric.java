public class TelephoneFabric {

    public static Telephone getTelephone(String model, String battery, String langitude, String latitude) {
        Telephone telephone;

        if ("Iphone5".equalsIgnoreCase(model)) {

            telephone = new Iphone5(model, battery, langitude, latitude);
        } else if ("Iphone13".equalsIgnoreCase(model)) {

            telephone = new Iphone13(model, battery, langitude, latitude);
        } else {
            throw new RuntimeException("This telephone is not ready");
        }

        return telephone;
    }
}
