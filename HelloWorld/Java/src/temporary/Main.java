package temporary;

public class Main {
    public static void main(String[] arg) {
        try {
            String username = "user@ust.com";
            String password = "aloha-1234-23";
        }catch ( e) {
            System.out.println("Check the calculation");
        }finally {
            System.out.println("Session Expired");
        }
    }
}
