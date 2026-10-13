
public class LoginService {

    public boolean login(String id, String password) {

        String savedId = "admin";
        String savedPassword = "1234";

        return id.equals(savedId)
                && password.equals(savedPassword);
    }

    public static void main(String[] args) {

        LoginService service = new LoginService();

        System.out.println(service.login("admin", "1234"));
        System.out.println(service.login("admin", "wrong"));
    }
}
