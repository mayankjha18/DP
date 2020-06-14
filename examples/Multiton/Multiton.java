package designpattern.Multiton;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Multiton {
    private static final ConcurrentMap<String, FTPClient> multitons = new ConcurrentHashMap<>(10);
    private static final int MAX_SIZE = 10;

    private Multiton()
    {

    }

    public synchronized static FTPClient getFTPClient(String ipAddress)
    {
        if(multitons.size() >= MAX_SIZE)
        {
            if(!removeClosedConnection())
            {
                throw new RuntimeException("You are nowt allowed to have more than "+MAX_SIZE+" conections!!");
            }
        }
        if(multitons.size()< MAX_SIZE){
            if(!multitons.containsKey(ipAddress))
            {
                FTPClient ftpClient = new FTPClient(ipAddress);
                multitons.put(ipAddress, ftpClient);
            }
        }
        return multitons.get(ipAddress);
    }

    private static boolean removeClosedConnection()
    {
        boolean hasRemoved = false;
        for(String key: multitons.keySet())
        {
            if(multitons.get(key).isClosed())
            {
                multitons.remove(key);
                hasRemoved = true;
            }
        }

        return hasRemoved;
    }

    public static void printActiveConnections()
    {
        System.out.println("*****Printing available connections****");
        for(String key: multitons.keySet())
        {
            System.out.println(key);
        }
    }
}
