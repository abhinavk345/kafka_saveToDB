package com.abhi.producer;

import com.abhi.producer.broker.WikimediaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProducerApplication  implements CommandLineRunner {
    private WikimediaProducer wikimediaProducer;
    public SpringBootProducerApplication(WikimediaProducer wikimediaProducer) {
        this.wikimediaProducer = wikimediaProducer;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProducerApplication.class, args);
    }



    @Override
    public void run(String... args) throws Exception {
        wikimediaProducer.sendMessage();
    }
}

