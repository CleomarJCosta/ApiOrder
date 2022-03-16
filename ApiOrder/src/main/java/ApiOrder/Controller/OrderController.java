package ApiOrder.Controller;

import ApiOrder.Entity.Order;
import ApiOrder.Entity.User;
import ApiOrder.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
   private OrderRepository repository ;


    @RequestMapping(value = "/order", method =  RequestMethod.POST)
    public ResponseEntity<User> AddOrderByUser( @RequestBody User user){
        repository.save(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }



  

}
