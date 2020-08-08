package com.pradheeparul.mockserver.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * MockController
 *
 * @author PradheepKumarA
 * @date 2019-09-05
 */
@RestController
public class MockController {

    @RequestMapping("/")
    public Object mock(@RequestParam("validationToken") String validationToken) {
        return validationToken;
    }

    /**
     * Handles challenge for webhooks
     */
    @ResponseBody
    @RequestMapping(value = "/challenge", method = RequestMethod.GET, consumes = {
            MediaType.TEXT_PLAIN_VALUE
    }, produces = {
            MediaType.TEXT_PLAIN_VALUE
    })
    public Object handleGet1(@RequestParam("validationToken") String validationToken) {
        return "TEXT - " + validationToken;
    }

}
