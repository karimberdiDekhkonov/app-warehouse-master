package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Supplier;

@Projection(types = Supplier.class)
public interface SupplierController {
    Integer getId();

    String getName();

    Boolean getActive();

    String getPhoneNumber();
}
