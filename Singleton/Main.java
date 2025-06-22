public class Main {
    public static void main(String[] args) {
        DatabaseConnection conn1 = DatabaseConnection.getInstance();
        conn1.connect();

        DatabaseConnection conn2 = DatabaseConnection.getInstance();
        conn2.connect();

        if (conn1 == conn2) {
            System.out.println("Both connections are the same instance.");
        } else {
            System.out.println("Different instances were created!");
        }
    }
}
