package zmall.domain;

import zmall.domain.*;
import zmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Approved extends AbstractEvent {

    private Long id;
    private String orderId;
    private String price;
    private String quantity;
    private String status;

    public Approved(Order aggregate){
        super(aggregate);
    }
    public Approved(){
        super();
    }
}
