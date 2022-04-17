package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.Measurement;
import uz.pdp.appwarehouse.projection.MeasurementController;

@RepositoryRestResource(path = "measurement",excerptProjection = MeasurementController.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {

    boolean existsByName(String name);

}
