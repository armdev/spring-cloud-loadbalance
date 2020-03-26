/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.app.unicorn;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author armena
 */
@RestController
@RequestMapping("/data")
@Slf4j
public class InfoController {
    @GetMapping
    public String get() {
        String hostName = "";
        try {
            log.info("Hello: I am called ");
            hostName = InetAddress.getLocalHost().getHostName();
            log.info("HOSTNAME IS " + InetAddress.getLocalHost().getHostName());
        } catch (UnknownHostException ex) {
        }
        final String date = new Date(System.currentTimeMillis()).toString();
        return "Date is " + date + " and hostname is " + hostName;
    }

}
