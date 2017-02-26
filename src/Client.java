

import java.net.InetAddress;

/**
 * Created by Julie on 24-02-2017.
 */
public class Client {
    private int numMessage;
    private InetAddress clientAddress;
    private int port;
    private String username;
    final char[] validInput = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l',
            'm','n','o','p','q','r','s','t','u','v','w','x','y','z','æ','ø','å',
            '0','1','2','3','4','5','6','7','8','9','-','_'}; //husk equalsIgnoreCase

    public Client() {}

    public int getNumMessage() {
        return numMessage;
    }

    public void setNumMessage() {
        this.numMessage++;
    }

    public InetAddress getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(InetAddress clientAddress) {
        this.clientAddress = clientAddress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String toString(){
        return "Username: [" + username + "] Port: " + port + " IP: " + clientAddress;
    }
}