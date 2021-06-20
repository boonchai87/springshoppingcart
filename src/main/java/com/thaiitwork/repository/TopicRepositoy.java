package com.thaiitwork.repository;

import com.thaiitwork.model.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepositoy extends CrudRepository<Topic, Long> {

}