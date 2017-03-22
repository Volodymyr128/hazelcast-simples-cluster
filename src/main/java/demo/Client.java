package demo;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

/**
 * Created by volodymyr.bakhmatiuk on 3/9/17.
 */
public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ClientConfig config = new ClientConfig();
        config.getNetworkConfig().setAddresses(
                Arrays.asList("localhost:5072", "localhost:5073")
        );
        HazelcastClient.newHazelcastClient(config);
    }
}
