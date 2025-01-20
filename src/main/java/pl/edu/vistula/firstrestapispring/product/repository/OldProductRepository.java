package pl.edu.vistula.firstrestapispring.product.repository;

import org.springframework.stereotype.Repository;
import pl.edu.vistula.firstrestapispring.product.domain.Product;
import java.util.*;

@Repository
public class OldProductRepository {

    protected final Map<Long, Product> map = new HashMap<>();
    protected long counter = 1;

    public Product save(Product entity) {
        setId(entity);
        return entity;
    }

    private Product setId(Product entity) {
        if(entity.getId() != 0){
            map.put(entity.getId(), entity);
            System.out.println("Nie zwiekszam");
        } else {
            entity.setId(counter);
            map.put(counter, entity);
        }
        counter++;
        return entity;
    }

    public Optional<Product> findById(long id) {
        return Optional.ofNullable(map.get(id));
    }

    public List<Product> findAll() {
        return new ArrayList<>(map.values());
    }

    public void deleteById(long id) {
        map.remove(id);
    }
}
