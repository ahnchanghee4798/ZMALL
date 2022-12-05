package zmall.domain;

import zmall.domain.Ordered;
import zmall.domain.OrderCanceled;
import zmall.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Order_table")
@Data

public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderStatus;
    
    
    
    
    
    private String orderedTime;
    
    
    
    
    
    private String foodName;
    
    
    
    
    
    private String customerId;

    @PostPersist
    public void onPostPersist(){


        Ordered ordered = new Ordered(this);
        ordered.publishAfterCommit();

    }
    @PreRemove
    public void onPreRemove(){


        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
