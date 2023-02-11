package com.parkingmanager.parkingmanagerweb.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    
    @GetMapping("Dashboard")
    public String displayDashboard(){
        return "dashboard";
    }
}
