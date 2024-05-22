package ch.bbw.productcatalogservice.repos;

import ch.bbw.productcatalogservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "products")
public interface ProductRepo extends JpaRepository<Product, Long> {
}
