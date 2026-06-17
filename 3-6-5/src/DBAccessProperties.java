import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class DBAccessProperties {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // プロパティファイル読み込み
            // ④
            ResourceBundle bundle = ResourceBundle.getBundle("ここを改修");
            // ドライバーのクラス名取得
            String driver = bundle.getString("driver");
            // ⑤
            String jdbcConnection = bundle.getString("ここを改修");
            // ⑥
            String userId = bundle.getString("ここを改修");
            // ⑦
            String pass = bundle.getString("ここを改修");

            Class.forName("driver");

            // ⑧
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://【ホスト名】/【データベース名】", "【ユーザ名】", "【パスワード】");
            statement = connection.createStatement();

            String SQL = "SELECT * FROM TB_SHOHIN";
            resultSet = statement.executeQuery(SQL);

            while (resultSet.next()) {
                String column1 = resultSet.getString("SHOHIN_ID");
                String column2 = resultSet.getString("SHOHIN_NAME");
                int column3 = resultSet.getInt("TANKA");

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