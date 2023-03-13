package exercise;

import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.List;
import java.util.ArrayList;

// BEGIN
public class TcpConnection {

    private final String ipAdress;
    private final int port;
    private Connection state;
    private List<String> buffer = new ArrayList<>();

    public TcpConnection(String ipAdress, int port) {
        this.ipAdress = ipAdress;
        this.port =  port;
        this.state = new Disconnected(this);
    }

    public String getCurrentState() {
        return state.getState();
    }

    public void connect() {
        this.state.connect();
    }

    public void disconnect() {

    }

    public void setState(Connection state) {
        this.state = state;
    }

    public void write(String data) {
        if (getCurrentState().equals("connected")) {
            this.buffer.add(data);
        } else {
            System.out.println("Error! Connection is disconnected");
        }
    }

}
// END
