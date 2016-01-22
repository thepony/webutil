
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

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
public class PortSend {
    public void sendToPort() throws IOException {
    Socket socket = null;
    OutputStreamWriter osw;
    String str = "Hello World";
    try {
        socket = new Socket("ip address", 4014);
        osw =new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
        osw.write(str, 0, str.length());
    } catch (IOException e) {
        System.err.print(e);
    } finally {
        socket.close();
    }

}
}
