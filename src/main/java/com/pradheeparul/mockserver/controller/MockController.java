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
     * Handles challenge for webhooks registered with the encoded instance ID
     */
    @ResponseBody
    @RequestMapping(value = "/temp", method = RequestMethod.GET, consumes = {
            MediaType.TEXT_PLAIN_VALUE
    }, produces = {
            MediaType.TEXT_PLAIN_VALUE
    })
    public Object handleGet1(@RequestParam("validationToken") String validationToken) {
        return "TEXT - " + validationToken;
    }

    /**
     * Handles challenge for webhooks registered with the encoded instance ID
     */
    @ResponseBody
    @RequestMapping(value = "/temp", method = RequestMethod.GET, consumes = {
            MediaType.APPLICATION_JSON_VALUE
    }, produces = {
            MediaType.APPLICATION_JSON_VALUE
    })
    public Object handleGet2(@RequestParam("validationToken") String validationToken) {
        return "JSON - " + validationToken;
    }

}
