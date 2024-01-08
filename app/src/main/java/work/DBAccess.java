package work;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBAccess {

    // データベース接続情報
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/training";
    static final String USER = "root";
    static final String PASS = "password";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            // JDBCドライバの登録
            Class.forName(JDBC_DRIVER);

            // データベースへの接続
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // SQLクエリの準備
            String sql = "SELECT * FROM training.account";
            stmt = conn.prepareStatement(sql);

            // クエリの実行と結果の処理
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                // データの取得
                int id = rs.getInt("id");
                String name = rs.getString("name");

                // 取得したデータの処理
                System.out.println("ID: " + id + ", Name: " + name);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // リソースの解放
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}