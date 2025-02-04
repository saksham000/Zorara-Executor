package com.websocket.notificatonsystem.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSocketController {
    //Server appication
    // now client can send req to this end point by adding /app to end point
    // /app/sendMessage
    @MessageMapping("/sendMessage")
    @SendTo("/topic/notifications") // now sending the message to broker broker will brodcast this
    public String sendMessage(String message){
        return message;
    }
    
}
