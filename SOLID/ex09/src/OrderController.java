public class OrderController {
    private OrderRepository orderRepository;
    
    public OrderController(OrderRepository repo) {
        this.orderRepository = repo;
    }
    
    public void create(String id) {
        orderRepository.save(id);
        System.out.println("Created order: " + id);
    }
}