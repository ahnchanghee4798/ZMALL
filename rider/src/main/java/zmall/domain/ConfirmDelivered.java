package zmall.domain;

import zmall.domain.*;
import zmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class ConfirmDelivered extends AbstractEvent {

    private Long id;
    private Boolean isConfirmDelivered;

    public ConfirmDelivered(DeliveryStatus aggregate){
        super(aggregate);
    }
    public ConfirmDelivered(){
        super();
    }
}
