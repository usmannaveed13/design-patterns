package dependencyInversionPrincipleExample;

public class dependencyInversionPrincipleExample {
    interface DBConnectionInterface {
        public int connect();
    }

    class MySqlConnection implements DBConnectionInterface
    {
        public int connect(){
            return 1;
        }
    }

    class PasswordReminder {
        private DBConnectionInterface dbConnection;

        public PasswordReminder(DBConnectionInterface dbConnection)
        {
            this.dbConnection = dbConnection;
        }
    }

    public static void main(String[] args) {

    }
}
