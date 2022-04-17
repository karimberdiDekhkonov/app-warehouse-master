package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.Supplier;
import uz.pdp.appwarehouse.projection.SupplierController;

@RepositoryRestResource(path = "supplier",excerptProjection = SupplierController.class)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {

}
