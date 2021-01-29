import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;

/**
 * @author shkstart
 * @create 2021-01-28-23:30
 */
public class Test {
    @org.junit.jupiter.api.Test
    public void test(){
        String version = SpringVersion.getVersion();
        String version1 = SpringBootVersion.getVersion();
        System.out.println(version);
        System.out.println(version1);
    }
}
