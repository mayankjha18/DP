package designpattern.Multiton;

public class FTPClient {
    private boolean isClosed = false;
    private String ipAdress;

    protected FTPClient(String ipAdderss)
    {
        this.ipAdress = ipAdderss;
    }

    public void connect()
    {
        System.out.println("Connecting to IP: "+ipAdress);
    }
    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public void close()
    {
        this.isClosed = true;
    }
}
