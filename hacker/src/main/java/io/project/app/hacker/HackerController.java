/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.app.hacker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author armena
 */
@RestController
@RequestMapping("/hacker")
@Slf4j
public class HackerController {

    @Autowired
    private HackerService hackerServiceSimpleDockerCompose;

    @GetMapping("/attack")
    public String stack() {
        //working withour eureka!!!
        return hackerServiceSimpleDockerCompose.runWithDockerCompose();
    }

    @GetMapping("/attack/fails")
    public String compose() {
        log.info("Run with eureka, will fail");
        return hackerServiceSimpleDockerCompose.didNotWorkWithEureka();
    }

}
