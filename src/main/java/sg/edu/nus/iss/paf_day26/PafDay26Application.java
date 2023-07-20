package sg.edu.nus.iss.paf_day26;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import sg.edu.nus.iss.paf_day26.repository.ShowRepository;

@SpringBootApplication
public class PafDay26Application{

	// @Autowired
	// private ShowRepository showRepo;

	// @Value("${spring.data.mongodb.uri}")
	// private String mongoURI;

	public static void main(String[] args) {
		SpringApplication.run(PafDay26Application.class, args);
	}

	// @Override
	// public void run(String... args) throws Exception{

	// 	System.out.printf(">>> URI: %s\n",mongoURI);

	// 	for (String r: showRepo.findShowsByGenre("Anime","Horror")){
	// 		System.out.printf(">>> %s\n",r);
	// 	}

	// 	List<Document> docs = showRepo.findShowsByName("Bitten");
		
		// for (Document d: docs){
		// 	String name = d.getString("name");
		// 	String type = d.getString("type");
		// 	Integer runtime = d.getInteger("runtime");
		// 	//returning the Json array as a list of String

		// 	List<String> genres = d.getList("genres",String.class);
		// 	// get average rating
		// 	Document rateDoc = d.get("rating",Document.class);
		// 	Double avg = rateDoc.getDouble("average");

		// 	System.out.printf(">>>> title: %s, type: %s, runtime: %d, avg rating: %.2f\n", name, type, runtime, avg);
		// 	System.out.printf("\tgenres: %s\n",genres);

		// }


}
