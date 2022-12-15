import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class OrderCancelledTest {
  Order order;

  @BeforeEach
  public void setup() {
    order = new Order();
  }

  @Test
  void shouldNotOpenAnOrderCancelled() {
    order.setState(OrderCancelled.getInstance());
    assertEquals("Pedido não foi aberto", order.openOrder());
  }

  @Test
  void shouldNotPayAnOrderCancelled() {
    order.setState(OrderCancelled.getInstance());
    assertEquals("Pedido não foi pago", order.payOrder());
  }

  @Test
  void shouldNotSeparateAnOrderCancelled() {
    order.setState(OrderCancelled.getInstance());
    assertEquals("Pedido não foi separado", order.separateOrder());
  }

  @Test
  void shouldNotDispatchAnOrderCancelled() {
    order.setState(OrderCancelled.getInstance());
    assertEquals("Pedido não foi despachado", order.dispatchOrder());
  }

  @Test
  void shouldNotDeliverAnOrderCancelled() {
    order.setState(OrderCancelled.getInstance());
    assertEquals("Pedido não foi entregue", order.deliverOrder());
  }

  @Test
  void shouldNotCancelAnOrderCancelled() {
    order.setState(OrderCancelled.getInstance());
    assertEquals("Pedido não foi cancelado", order.cancelOrder());
  }

}
