package zmall.domain;

import zmall.domain.*;
import zmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
    private String orderStatus;
    private String orderedTime;
    private String foodName;
    private String customerId;

    public Ordered(Order aggregate){
        super(aggregate);
    }
    public Ordered(){
        super();
    }
}
