package zmall.domain;

import zmall.domain.*;
import zmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class CookingCompleted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String price;
    private String quantity;
    private String status;

    public CookingCompleted(Order aggregate){
        super(aggregate);
    }
    public CookingCompleted(){
        super();
    }
}
