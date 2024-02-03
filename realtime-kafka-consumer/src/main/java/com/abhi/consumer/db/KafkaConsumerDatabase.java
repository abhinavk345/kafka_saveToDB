package com.abhi.consumer.db;

import com.abhi.consumer.entity.WikimediaData;
import com.abhi.consumer.repository.WikimediaDataRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerDatabase {

    @Autowired
    private WikimediaDataRepository wikimediaDataRepository;


    @KafkaListener(topics = "realtime",groupId = "mygroup")
    public void consume(String event){
        log.info(String.format("Message recieved > %s",event));
        WikimediaData wikimediaData=new WikimediaData();
        wikimediaData.setEventData(event);
        wikimediaDataRepository.save(wikimediaData);

    }
}
