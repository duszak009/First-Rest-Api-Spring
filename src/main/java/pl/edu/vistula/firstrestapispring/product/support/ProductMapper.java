package pl.edu.vistula.firstrestapispring.product.support;

//klasa ProductMapper
//–
//zawierająca pewnego rodzaju
//klasę dodatkową
//        (wspierająca procesy w
//                naszym kodzie), klasa ta
//zajmuje się mapowaniem
//obiektów czyli
//przepisywaniem danych z
//jednego obiektu do drugiego.

import org.springframework.stereotype.Component;
import pl.edu.vistula.firstrestapispring.product.api.request.ProductRequest;
import pl.edu.vistula.firstrestapispring.product.api.response.ProductResponse;
import pl.edu.vistula.firstrestapispring.product.domain.Product;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest) {
        return new Product(productRequest.getName());
    }

    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName());
    }
}
