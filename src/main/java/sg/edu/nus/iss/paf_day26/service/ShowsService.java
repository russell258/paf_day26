package sg.edu.nus.iss.paf_day26.service;

import java.util.List;
import java.util.Optional;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import sg.edu.nus.iss.paf_day26.Utils;
import sg.edu.nus.iss.paf_day26.model.Show;
import sg.edu.nus.iss.paf_day26.repository.ShowRepository;

@Service
public class ShowsService {
    
    @Autowired
    private ShowRepository repo;

    public Optional<Show> getShowByName(String showName){
        List<Document> result = repo.findShowsByName(showName);

        if(result.size()<=0){
            return Optional.empty();
        }

        return Optional.of(Utils.toTvShow(result.get(0)));
    }

}
