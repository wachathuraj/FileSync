import org.json.simple.JSONObject;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Stack;

public class ServerMain {
    public static void main(String[] args) {
        try {
            SocketServer socketServer = new SocketServer(155);
            socketServer.establishServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        TODO initially create file list in database
//        TODO identify changes
//        DBConnection dbConnection=new DBConnection();
//        dbConnection.connect();
//        try {
//            Object r = dbConnection.insertDataEntry("hunny","hello/3","hello/2","23232");
//            System.out.println(r);
//            Stack<JSONObject> data = dbConnection.executeSelectQuery("select * from file_info");
//            System.out.println(data);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
