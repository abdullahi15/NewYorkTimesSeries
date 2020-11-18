package com.example.consumingrest;

import com.example.consumingrest.dto.Series;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NewYorkTimesApplication {

	private static final Logger log = LoggerFactory.getLogger(NewYorkTimesApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(NewYorkTimesApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Series series = restTemplate.getForObject(
					"https://api.nytimes.com/svc/topstories/v2/home.json?api-key=5Juyps8ID6qTGAC1bcsuk00GB6RfOzer"
					, Series.class);
			log.info(series.toString());
		};
	}
}
