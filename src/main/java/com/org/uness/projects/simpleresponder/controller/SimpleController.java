package com.org.uness.projects.simpleresponder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping(value = "api/firstCaseScenario")
    String firstCaseScenarioReceiver(){
        return "hello1";
    }


    @GetMapping(value = "api/secondCaseScenario")
    String secondCaseScenarioReceiver(){ return "hello2"; }

    @GetMapping(value = "api/thirdCaseScenario")
    String thirdCaseScenarioReceiver(){
        return "hello3";
    }

}
