import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class OrderDispatchedTest {
  Order order;

  @BeforeEach
  public void setup() {
    order = new Order();
  }

  @Test
  void shouldNotOpenAnOrderDispatched() {
    order.setState(OrderDispatched.getInstance());
    assertEquals("Pedido não foi aberto", order.openOrder());
  }

  @Test
  void shouldNotPayAnOrderDispatched() {
    order.setState(OrderDispatched.getInstance());
    assertEquals("Pedido não foi pago", order.payOrder());
  }

  @Test
  void shouldNotSeparateAnOrderDispatched() {
    order.setState(OrderDispatched.getInstance());
    assertEquals("Pedido não foi separado", order.separateOrder());
  }

  @Test
  void shouldNotDispatchAnOrderDispatched() {
    order.setState(OrderDispatched.getInstance());
    assertEquals("Pedido não foi despachado", order.dispatchOrder());
  }

  @Test
  void shouldDeliverAnOrderDispatched() {
    order.setState(OrderDispatched.getInstance());
    assertEquals("Pedido entregue", order.deliverOrder());
  }

  @Test
  void shouldCancelAnOrderDispatched() {
    order.setState(OrderDispatched.getInstance());
    assertEquals("Pedido cancelado", order.cancelOrder());
  }

}
