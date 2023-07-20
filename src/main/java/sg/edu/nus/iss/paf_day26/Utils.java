package sg.edu.nus.iss.paf_day26;

import org.bson.Document;

import sg.edu.nus.iss.paf_day26.model.Show;

public class Utils {
    public static Show toTvShow(Document doc){
        return new Show(
            doc.getInteger("id"),
            doc.getString("name"),
            doc.getString("type"),
            doc.getString("language"),
            doc.getInteger("runtime")
        );
    }
}
