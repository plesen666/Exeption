public class Main {
    public static void main(String[] args) {
        String login = "1234567890123456789_";
        String password = "123456";
        String confirmPassword = "123456";
        try {
            CheckLoginPassword.check(login, password, confirmPassword);
            System.out.println("Пароль соответствует требованиям");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Проверка пароля завершена");
        }
    }
}