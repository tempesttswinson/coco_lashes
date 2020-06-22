package com.win.coco_lashes.Repository;

import java.util.List;
import com.win.coco_lashes.Subscribe;
import org.springframework.data.repository.CrudRepository;

public interface SubscribeRepository extends CrudRepository<Subscribe, Long>{
    
    List<Subscribe> findByLastName(String lastName);

    
}