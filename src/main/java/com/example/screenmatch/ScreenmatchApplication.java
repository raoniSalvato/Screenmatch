package com.example.screenmatch;

import com.example.screenmatch.model.DataSeries;
import com.example.screenmatch.service.ConsumeApi;
import com.example.screenmatch.service.ConvertData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		ConsumeApi consumeApi = new ConsumeApi();
		var json = consumeApi.getData("https://www.omdbapi.com/?t=gilmore+girls&apikey=543af4b4");
		System.out.println(json);

		ConvertData convertData = new ConvertData();

		DataSeries dataSeries = convertData.getData(json, DataSeries.class);
		System.out.println(dataSeries);

	}
}
