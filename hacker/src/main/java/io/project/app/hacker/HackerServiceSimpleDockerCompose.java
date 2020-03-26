package io.project.app.hacker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author armena
 */
@Service
@Component
@Slf4j
public class HackerServiceSimpleDockerCompose {

    @Autowired
    private EurekaService eurekaService;

    @Autowired
    private RestTemplate restTemplate;

    public String didNotWorkWithEureka() {
        String api = eurekaService.findUnicorn();
        log.info("REQUEST TO API: " + api);
        String results = restTemplate.getForObject(api + "data", String.class);
        return results;
    }

}
