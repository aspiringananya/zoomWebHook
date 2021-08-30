package com.hyland.webhook.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("/api/webhook")
    @Log4j2
    public class WebhookController {


        @PostMapping
        public ResponseEntity<String> getNotification(@RequestBody String requestBody) {
            log.info("#### Incoming Webhook Notification from Zoom API ##### {}" , requestBody);
            return new ResponseEntity<String>(requestBody, HttpStatus.OK);
        }
    }

