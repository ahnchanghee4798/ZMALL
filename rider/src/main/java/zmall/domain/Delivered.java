package zmall.domain;

import zmall.domain.*;
import zmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Delivered extends AbstractEvent {

    private Long id;
    private Boolean isDelivered;

    public Delivered(DeliveryStatus aggregate){
        super(aggregate);
    }
    public Delivered(){
        super();
    }
}
