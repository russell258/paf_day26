package sg.edu.nus.iss.paf_day26.controller;

import java.util.List;
import java.util.Optional;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import sg.edu.nus.iss.paf_day26.model.Show;
import sg.edu.nus.iss.paf_day26.service.ShowsService;

@Controller
@RequestMapping
public class ShowController {
    @Autowired
    private ShowsService svc;

    @GetMapping(path="/show", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<String> getShowAsJson(@RequestParam String showName){
        Optional<Show> result = svc.getShowByName(showName);
        return ResponseEntity.ok(result.toString());
        
    }

    @GetMapping(path="/show")
    public ModelAndView getShow(@RequestParam String showName){
        Optional<Show> opt = svc.getShowByName(showName);
        ModelAndView mav = new ModelAndView();

        if (opt.isEmpty())

    }

    

}
