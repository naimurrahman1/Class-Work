package com.bjit.Thymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/TicketBook")
    public String TicketBook(){
        return "welcome.html";
    }

    @PostMapping("/receive")
    public  String receiveData(@RequestParam String datepicker,@RequestParam String ticketCode,@RequestParam String name, @RequestParam String from, @RequestParam String to, @RequestParam String fare, Model model)
    {
        model.addAttribute("datepicker",datepicker);
        model.addAttribute("ticketCode",ticketCode);
        model.addAttribute("name",name);
        model.addAttribute("from",from);
        model.addAttribute("to",to);
        model.addAttribute("fare",fare);
        //System.out.println(id+" "+name+" "+domain);
        return "PassengerDetail.html";
    }
}
