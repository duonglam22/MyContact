package org.ashina.mycontact;

import org.ashina.mycontact.entity.Contact;
import org.ashina.mycontact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MycontactApplication {

	@Autowired
	private ContactRepository contactRepository;
	public static void main(String[] args) {
		SpringApplication.run(MycontactApplication.class, args);
	}

//	@Bean
//	CommandLineRunner initDb() {
//		return args -> {
//			for(int i = 4 ; i < 100; ++i) {
//				contactRepository.save(new Contact("trang" + i, "trangTran" + i +"@gmail.com", "03758541" + i));
//			}
//		};
//	}

}

