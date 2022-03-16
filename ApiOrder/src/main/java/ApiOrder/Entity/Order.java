package ApiOrder.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private long id;
    private int quantity;
    private List<Product> products;
    private StatusOrder status;
    private boolean paid;
}

