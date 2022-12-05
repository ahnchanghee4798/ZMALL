package zmall.domain;

import zmall.domain.*;
import zmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Picked extends AbstractEvent {

    private Long id;
    private Boolean isPicked;
    private Long orderId;
    private Boolean isDelivered;
    private Date pickedTime;

    public Picked(DeliveryStatus aggregate){
        super(aggregate);
    }
    public Picked(){
        super();
    }
}
