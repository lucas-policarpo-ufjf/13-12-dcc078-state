import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class OrderDeliveredTest {
  Order order;

  @BeforeEach
  public void setup() {
    order = new Order();
  }

  @Test
  void shouldNotOpenAnOrderDelivered() {
    order.setState(OrderDelivered.getInstance());
    assertEquals("Pedido não foi aberto", order.openOrder());
  }

  @Test
  void shouldNotPayAnOrderDelivered() {
    order.setState(OrderDelivered.getInstance());
    assertEquals("Pedido não foi pago", order.payOrder());
  }

  @Test
  void shouldNotSeparateAnOrderDelivered() {
    order.setState(OrderDelivered.getInstance());
    assertEquals("Pedido não foi separado", order.separateOrder());
  }

  @Test
  void shouldNotDispatchAnOrderDelivered() {
    order.setState(OrderDelivered.getInstance());
    assertEquals("Pedido não foi despachado", order.dispatchOrder());
  }

  @Test
  void shouldNotDeliverAnOrderDelivered() {
    order.setState(OrderDelivered.getInstance());
    assertEquals("Pedido não foi entregue", order.deliverOrder());
  }

  @Test
  void shouldNotCancelAnOrderDelivered() {
    order.setState(OrderDelivered.getInstance());
    assertEquals("Pedido não foi cancelado", order.cancelOrder());
  }

}
