package pl.edu.vistula.firstrestapispring.product.repository;

import org.springframework.stereotype.Repository;
import pl.edu.vistula.firstrestapispring.product.domain.Product;

import java.util.HashMap;
import java.util.Map;

//klasa która ma być bezpośrednio odpowiedzialna za zapis i
//odczyt do bazy danych. Na tym etapie uprościłem nasz
//projekt i zamiast prawdziwej bazy danych mamy do
//czynienia z HashMap ą, która tylko udaję bazę danych, ale
//w kolejnych zadaniach połączymy naszą aplikację z
//bazą danych

@Repository
public class ProductRepository {

    protected Map<Long, Product> map = new HashMap<>();
    protected long counter = 1;

    public Product save(Product entity) {
        setId(entity);
        return entity;
    }

    private Product setId(Product entity) {
        entity.setId(counter);
        map.put(counter, entity);
        counter++;
        return entity;
    }
}
