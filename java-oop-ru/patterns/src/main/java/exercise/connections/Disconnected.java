package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Disconnected implements Connection{

    private final TcpConnection connection;

    public Disconnected(TcpConnection connection) {
        this.connection = connection;
    }
    @Override
    public void connect() {
        this.connection.setState(new Connected(this.connection));
    }

    @Override
    public void disconnect() {
        System.out.println("Error! Connection already disconnected");
    }

    @Override
    public String getState() {
        return "disconnected";
    }
}
// END
