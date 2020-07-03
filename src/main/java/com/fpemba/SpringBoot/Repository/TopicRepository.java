package com.fpemba.SpringBoot.Repository;

import com.fpemba.SpringBoot.Entity.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {

}
