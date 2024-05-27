import java.lang.foreign.MemoryLayout;
import java.net.MulticastSocket;

public class Main {
    public static void main(String[] args) throws Exception{

        // Default port number we are going to use
        int portnumber = 50000;
        if (args.length >= 1) {
            portnumber = Integer.parseInt(args[0]);
        }

        // Create a MultitaskSocket
        MulticastSocket chatMultitaskSocket = new MulticastSocket(portnumber);

    }
}