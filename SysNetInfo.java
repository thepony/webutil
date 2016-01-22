/* You may use this source only when giving credit as follows:
** You must give appropriate credit, provide a link to the source, and indicate if changes were made. You may
** do so in any reasonable manner, but not in any way that suggests the creator endorses you or your use. you
** may not distribute this source without contacting the creator (I just wanna know where its going if
** it goes anywhere :] thank you!)
**
** Donations welcome via bitcoin: 1K6hdkYQthme7o1eTp9bjKhY1jQikrS7VQ
** (Just helps me find chips and caffine while coding!)
*/


import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author brucecolburn
 */
public class SysNetInfo {

    protected String userName() {
        return System.getProperty("user.name");
    }
    
    protected String osName() {
        return System.getProperty("os.name");
    }
    
    protected String osVersion() {
        return System.getProperty("os.version");
    }
    
    protected String osArch() {
        return System.getProperty("os.arch");
    }
    
    protected String userHome() {
        return System.getProperty("user.home");
    }
    
    protected String osDir() {
        return System.getProperty("user.dir");
    }
    
    protected String ipHostAndAddress() throws SocketException {
        String IPData = "";
        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            IPData = ip.getHostName() + "::" + ip.getHostAddress();
        } 
        catch (UnknownHostException e) {
            System.err.println("Cannot read MAC Information");
        }
    return IPData;
    }

    protected String MAC() throws SocketException {
        String MAC = "", IPData = "";
        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
            byte[] mac = network.getHardwareAddress();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mac.length; i++) {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? ":" : ""));		
            }
            MAC = sb.toString();
            IPData = ip.getHostName() + "::" + ip.getHostAddress();
        } 
        catch (UnknownHostException e) {
            System.err.println("Cannot read MAC Information");
        }
    return MAC;
    }
    
    protected String systemFull() throws SocketException {
        String OS = System.getProperty("os.name");
        String Ver = System.getProperty("os.version");
        String Arc = System.getProperty("os.arch");
        String User = System.getProperty("user.name");
        String Home = System.getProperty("user.home");
        String Dir = System.getProperty("user.dir");
        String MAC = "", IPData = "";
        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
                 
            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
            byte[] mac = network.getHardwareAddress();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mac.length; i++) {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? ":" : ""));		
            }
                    
            MAC = sb.toString();
            IPData = ip.getHostName() + "::" + ip.getHostAddress();
        } 
        catch (UnknownHostException e) {
            System.err.println("Error Thrown System Info Module");
        }
                
        String INFO = OS + "::" + Ver + "::" + Arc + "::" + User + "::" + Home + "::" + Dir + "::" + IPData + "::" + MAC;
        
        return INFO;
    }
    

}
