public class SimpleArray {
    public static void main(String[] args) {
        String[] crypto = new String[5];

        crypto[0] = "BTC";
        crypto[1] = "ETC";
        crypto[2] = "XRP";
        crypto[3] = "BNB";
        crypto[4] = "USDT";

        String babcia = crypto[3];
        System.out.println(babcia);

        int numberOfElements = crypto.length;
        System.out.println("Moja tablica zawiera " + (numberOfElements) + " elementów");
    }
}
