package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.OutputProduct;
import uz.pdp.appwarehouse.projection.OutputProductController;

@RepositoryRestResource(path = "outputProduct",excerptProjection = OutputProductController.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
}
