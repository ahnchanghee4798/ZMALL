package zmall.domain;

import zmall.domain.OrderCanceled;
import zmall.StoreApplication;
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
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String price;
    
    
    
    
    
    private String quantity;
    
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){


        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = StoreApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }



    public void acceptOrder(){
        Approved approved = new Approved(this);
        approved.publishAfterCommit();

    }
    public void cook(){
        CookingCompleted cookingCompleted = new CookingCompleted(this);
        cookingCompleted.publishAfterCommit();

    }

    public static void receiveOrderInformation(OrderPaid orderPaid){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPaid.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }


}
