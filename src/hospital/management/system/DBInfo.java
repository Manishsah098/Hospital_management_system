import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.DatabaseMetaData;

public class DBInfo {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hospital_management_system",
                    "root",
                    "Manish098@"
            );
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet tables = metaData.getTables(null, null, "%", new String[]{"TABLE"});
            while (tables.next()) {
                String tableName = tables.getString("TABLE_NAME");
                System.out.println("TABLE: " + tableName);
                ResultSet columns = metaData.getColumns(null, null, tableName, "%");
                while (columns.next()) {
                    System.out.println("  COLUMN: " + columns.getString("COLUMN_NAME") + " - " + columns.getString("TYPE_NAME"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
