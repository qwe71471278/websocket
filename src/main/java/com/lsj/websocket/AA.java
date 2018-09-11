package com.lsj.websocket;

import com.lsj.websocket.server.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.io.IOException;

@Controller
@RequestMapping("/")
public class AA {

    @Resource
    WebSocketServer webSocketServer;


    @RequestMapping("/aa")
    public String aa(){
        return "AAA";
    }

    @RequestMapping("/bb")
    public String bb(){
        return "BBB";
    }

    @RequestMapping("/ee")
    public String ee(){
        return "CCC";
    }
    @RequestMapping("/ff")
    public String ff(){
        return "DDD";
    }


    @RequestMapping("/cc")
    public void send(){

        try {
            webSocketServer.sendToUser("普通用户信息，管理员收得到 ","1");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/dd")
    public void send2(){

        try {
            webSocketServer.sendToUser("管理员专属信息 ","2");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
