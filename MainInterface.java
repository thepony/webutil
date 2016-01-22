
import static java.lang.System.in;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/* You may use this source only when giving credit as follows:
** You must give appropriate credit, provide a link to the source, and indicate if changes were made. You may
** do so in any reasonable manner, but not in any way that suggests the creator endorses you or your use. you
** may not distribute this source without contacting the creator (I just wanna know where its going if
** it goes anywhere :] thank you!)
**
** Donations welcome via bitcoin: 1K6hdkYQthme7o1eTp9bjKhY1jQikrS7VQ
** (Just helps me find chips and caffine while coding!)
*/

/**
 *
 * @author brucecolburn
 */
public class MainInterface {
    public static String input;
    public static String data;
    public static ResultSet results;
    
    public static void main(String [] args) throws Exception {
        new GUI().setVisible(true);
//        Scanner scan = new Scanner(in);
//        http http = new http();
//        sql sql = new sql();
//        SysNetInfo si = new SysNetInfo();
//        
//        boolean looper = false;
//        while (!looper) {
//            System.out.print("main: ");
//            input = scan.nextLine();
//            if ("exit".equals(input)) System.exit(0);
//            if ("help".equals(input)) {
//                System.out.println("Options are: httpget, httpgetsecure, httppost, httppostsecure, " + 
//                        "systeminfo, sql, xor, xorbase64, base64decode, base64encode\n\n");
//            }
//            if ("httpget".equals(input)) {
//                System.out.print("enter http get request: ");
//                input = scan.nextLine();
//                input = http.get(input);
//                System.out.println(input);
//            }
//            if ("httpgetsecure".equals(input)) {
//                System.out.print("enter http get request: ");
//                input = scan.nextLine();
//                input = http.getS(input);
//                System.out.println(input);
//            }
//            if ("httppost".equals(input)) {
//                System.out.print("enter http URL: ");
//                input = scan.nextLine();
//                System.out.print("Enter POST data: ");
//                data = scan.nextLine();
//                input = http.post(input, data);
//                System.out.println(input);
//            }
//            if ("httppostsecure".equals(input)) {
//                System.out.print("enter http URL: ");
//                input = scan.nextLine();
//                System.out.print("Enter POST data: ");
//                data = scan.nextLine();
//                input = http.postSecure(input, data);
//                System.out.println(input);
//            }
//            if ("mysql".equals(input)) {
//                String IP, port, username, password, dbname, sqlr;
//                System.out.print("IP or Domain (no http/jdbc/mysql): ");
//                IP = scan.nextLine();
//                System.out.print("port (leave blank for 3306): ");
//                port = scan.nextLine();
//                System.out.print("username: ");
//                username = scan.nextLine();
//                System.out.print("password: ");
//                password = scan.nextLine();
//                System.out.print("dbname: ");
//                dbname = scan.nextLine();
//                System.out.print("SQL statement: ");
//                sqlr = scan.nextLine();
//                results = sql.sql(IP, port, username, password, dbname, sqlr);
//                ResultSetMetaData rsmd = results.getMetaData();
//                int columnsNumber = rsmd.getColumnCount();
//                while (results.next()) {
//                    for (int i = 1; i <= columnsNumber; i++) {
//                    String columnValue = results.getString(i);
//                    System.out.print(rsmd.getColumnName(i) + " :: " + columnValue + "\n");
//                    }
//                System.out.println("");
//                }
//            }
//            if ("systeminfo".equals(input)) {
//                data = si.systemFull();
//                String parts[] = data.split("::");
//                for (String part : parts) {
//                    System.out.println(part);
//                }
//                System.out.println("");
//            }
//            if ("base64encode".equals(input)) {
//                System.out.print("input line to encode: ");
//                input = scan.nextLine();
//                System.out.println(http.base64encode(input) + "\n");
//            }
//            if ("base64decode".equals(input)) {
//                System.out.print("input line to decode: ");
//                input = scan.nextLine();
//                System.out.println(http.base64decode(input) + "\n");
//            }
//            if ("xor".equals(input)) {
//                System.out.print("input String: ");
//                input = scan.nextLine();
//                System.out.print("input XOR key: ");
//                data = scan.nextLine();
//                System.out.println(http.xorKey(input, data) + "\n");
//            }
//            if ("xorbase64".equals(input)) {
//                System.out.print("input String: ");
//                input = scan.nextLine();
//                System.out.print("input XOR key: ");
//                data = scan.nextLine();
//                System.out.println(http.xorKeyBase64(input, data) + "\n");
//            }
//        }
    }
    
}
