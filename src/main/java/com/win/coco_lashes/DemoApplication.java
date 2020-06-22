package com.win.coco_lashes;

//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;

//import com.win.coco_lashes.Repository.SubscribeRepository;

//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	// private static final Logger log =
	// LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @Bean // dealing with data
	// public CommandLineRunner demo(SubscribeRepository repository) {
	// return (args) -> {
	// repository.save(new Subscribe("Rickey", "McTester", "rMcTest@gmail.com"));
	// repository.save(new Subscribe("Jane", "Doe", "jDoey@gmail.com"));
	// repository.save(new Subscribe("Micheal", "Jones", "rMcTestgmail.com"));
	// repository.save(new Subscribe("Sherell", "Sheshed", "mySheShed@gmail.com"));

	// log.info("Subscribers added to table");
	// log.info("=========================");
	// for (Subscribe subscribe : repository.findAll()) {
	// log.info(subscribe.toString());
	// }

	// log.info("");

	// repository.findById(1L).ifPresent(subscribe -> {
	// log.info("Subscriber found using findById");
	// log.info("===============================");
	// log.info(subscribe.toString());
	// log.info("");
	// });

	// log.info("Subscriber found using findByLastName");
	// log.info("=================================");
	// repository.findByLastName("Jones").forEach(cust -> {
	// log.info(cust.toString());
	// });

	// log.info("-------End--------");
	// };

	// }

}
