package sg.edu.nus.iss.paf_day26.repository;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class ShowRepository {
    
    @Autowired
    private MongoTemplate template;

    public static final String F_Name = "name";
    public static final String F_GENRES = "genres";
    public static final String F_ID = "id";
    public static final String C_TVSHOW = "tvshows";


    /*
     * db.tvshows.find({
     *      genres:{$in:[g0,g1,..]}
     * })
     * 
     */

    public List<String> findShowsByGenre(Object... genreList){
        //create filter
        Criteria criteria = Criteria.where(F_GENRES).in(genreList);

        Query query = Query.query(criteria);
        query.fields()
                .exclude(F_ID)
                .include(F_Name);
        return template.find(query,String.class,C_TVSHOW);
    }


    /*
     * db.tvshows.find({name:'the name'})
     */

    public List<Document> findShowsByName(String programName){

        //set filter
        Criteria criteria = Criteria.where("name").is(programName);

        //create Mongo query with filter
        Query query = Query.query(criteria);

        //perform query
        return template.find(query, Document.class, C_TVSHOW);

    }

}
