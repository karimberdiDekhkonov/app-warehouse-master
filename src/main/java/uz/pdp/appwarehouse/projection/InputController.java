package uz.pdp.appwarehouse.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Currency;
import uz.pdp.appwarehouse.entity.Input;
import uz.pdp.appwarehouse.entity.Supplier;
import uz.pdp.appwarehouse.entity.Warehouse;

import java.util.Date;

@Projection(types = Input.class)
public interface InputController {
    Integer getId();

    Date getDate();

    Warehouse getWarehouse();

    Supplier getSupplier();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();
}
