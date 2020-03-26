package io.project.app.hacker;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
@Slf4j
public class EurekaService {

    /**
     * The eureka client
     */
    @Autowired
    private EurekaClient discoveryClient;

    public String findUnicorn() {

        try {
            InstanceInfo instance = discoveryClient.getNextServerFromEureka("unicorn", false);

            if (instance != null && instance.getPort() == 8080) {
                return "http://unicorn:2030/";
            }

            if (instance == null || instance.getHomePageUrl() == null) {
                return "http://unicorn:2030/";
            }
            log.info("HOST getHostName " + instance.getHostName());

            log.info("HOST getPort " + instance.getPort());
            log.info("HOST getIPAddr " + instance.getIPAddr());

            log.info("HOST getInstanceId " + instance.getInstanceId());

            log.info("HOST getSecurePort " + instance.getSecurePort());

            return instance.getHomePageUrl();
        } catch (Exception e) {

        }
        return "http://unicorn:2030/";
    }

    public String getApi(String service, String api) {
        return String.format("%s%s", this.discoveryClient.getNextServerFromEureka(service, false).getIPAddr(), api);
    }

}
