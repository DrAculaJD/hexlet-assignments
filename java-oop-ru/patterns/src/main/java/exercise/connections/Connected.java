package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Connected implements Connection {

    private final TcpConnection connection;

    public Connected(TcpConnection connection) {
        this.connection = connection;
    }
    @Override
    public void connect() {
        System.out.println("Error! Connection already connected");
    }

    @Override
    public void disconnect() {
        this.connection.setState(new Disconnected(this.connection));
    }

    @Override
    public String getState() {
        return "connected";
    }
}
// END
