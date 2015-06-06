package demo.service;

import demo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by umin on 15/6/5.
 */
public interface ItemRepository extends JpaRepository<Item,Integer> {


}
