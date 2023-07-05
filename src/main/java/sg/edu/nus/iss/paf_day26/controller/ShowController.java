package sg.edu.nus.iss.paf_day26.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.paf_day26.service.ShowsService;

@Controller
@RequestMapping
public class ShowController {
    @Autowired
    private ShowsService svc;

    

}
