package designpattern.Multiton;

import designpattern.Multiton.FTPClient;
import designpattern.Multiton.Multiton;

public class TestMultiton {

    public static void main(String args[])
    {
//        cant create direct FTPCLient instance
//        FTPClient ftpClient = new FTPClient("10.7.8.18");

//        making 10 connections
//        for(int i=0;i<10;i++)
//        {
//           FTPClient ftpClient =  Multiton.getFTPClient("10.1.1."+i);
//        }
//        Multiton.printActiveConnections();

//        trying to make 11th connection
//        for(int i=0;i<11;i++)
//        {
//           FTPClient ftpClient =  Multiton.getFTPClient("10.1.1."+i);
//           ftpClient.connect();
//        }


        FTPClient ftpClient[] = new FTPClient[11];
        for(int i=0;i<11;i++)
        {
            String ipAdress = "20.1.1." + i;
            try
            {
                ftpClient[i] = Multiton.getFTPClient(ipAdress);
            }
            catch (Exception e)
            {
                System.out.println("Encountered error while connecting to ipAddress: "+ ipAdress);
                System.out.println(e);
            }
        }
        ftpClient[2].close();

        FTPClient ftpClientAFterClose =  Multiton.getFTPClient("10.1.1."+117);
        Multiton.printActiveConnections();

    }
}
