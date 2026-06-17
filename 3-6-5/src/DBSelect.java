import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSelect {

    // ドライバーのクラス名 
    private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
    // JDBC接続先情報 
    // ① 
    private static final String JDBC_CONNECTION ="ここに記述してください。";
    // ユーザー名 
    // ② 
    private static final String USER ="ここに記述してください。";
    // パスワード 
    // ③ 
    private static final String PASS ="ここに記述してください。";

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName(POSTGRES_DRIVER);
            // ④
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://【ホスト名】/【データベース名】", "【ユーザ名】", "【パスワード】");
            statement = connection.createStatement();
            // ⑤
            String SQL = "ここにSQLを記述してください。";
            resultSet = statement.executeQuery(SQL);

            while (resultSet.next()) {
                // ⑥
                String column1 = resultSet.getString("商品IDのカラム名");
                String column2 = resultSet.getString("商品名のカラム名");
                int column3 = resultSet.getInt("単価のカラム名");

                System.out.print(column1 + ",");
                System.out.print(column2 + ",");
                System.out.println(column3);
            }

        // forName()で例外発生
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        // getConnection()、createStatement()、executeQuery()で例外発生
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();

            }
        }
    }
}
