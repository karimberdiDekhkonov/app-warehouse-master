package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface WarehouseController {
    Integer getId();

    String getName();

    Boolean getActive();
}
