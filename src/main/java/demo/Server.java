package demo;

import com.hazelcast.config.FileSystemXmlConfig;
import com.hazelcast.core.Hazelcast;
import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 * Created by volodymyr.bakhmatiuk on 3/9/17.
 */
public class Server {

    public static void main(String[] args) throws FileNotFoundException {
        Arrays.asList(
                "hazelcast-config-5072.xml",
                "hazelcast-config-5073.xml"
        )
                .forEach(configName -> {
                    try {
                        Hazelcast.newHazelcastInstance(new FileSystemXmlConfig(configName));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                });
    }
}
