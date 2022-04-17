package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Measurement;

@Projection(types = Measurement.class)
public interface MeasurementController {
    Integer getId();

    String getName();

    Boolean getActive();
}
