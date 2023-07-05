package sg.edu.nus.iss.paf_day26.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.paf_day26.model.Show;
import sg.edu.nus.iss.paf_day26.repository.ShowRepository;

@Service
public class ShowsService {
    
    @Autowired
    private ShowRepository repo;

    public Show getShowById(String showName){
        Optional<Show> searchResult = repo.findShowsByName(showName);

        if(searchResult.isPresent()){
            
        }

        return null;
    }

}
