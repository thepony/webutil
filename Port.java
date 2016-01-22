
import java.net.ServerSocket;
import java.net.Socket;

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
public class Port {
    public static void main(String[] args) {
        try {
            final ServerSocket serverSocket = new ServerSocket(80);
            new Thread("Device Listener") {
                @Override
                public void run() {
                    try {
                        System.out.println("Listener Running . . .");
                        Socket socket = null;
                        while ((socket = serverSocket.accept()) != null) {
                            System.out.println("| Incoming : "+ socket.toString());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                };
            }.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
