package sg.edu.nus.iss.paf_day26.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class ShowRepository {
    
    @Autowired
    private MongoTemplate template;

    public static final String F_Name = "name";
    public static final String C_TVSHOW = "tvshow";

    public List<Document> findShowsByName(String programName){
        
        //set filter
        Criteria criteria = Criteria.where("name").is(programName);

        //create Mongo query with filter
        Query query = Query.query(criteria);

        //perform query
        return template.find(query, Document.class, "tvshow");

    }

}
