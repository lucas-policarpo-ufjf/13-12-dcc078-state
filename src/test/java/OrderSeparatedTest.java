import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class OrderSeparatedTest {
  Order order;

  @BeforeEach
  public void setup() {
    order = new Order();
  }

  @Test
  void shouldNotOpenAnOrderSeparated() {
    order.setState(OrderSeparated.getInstance());
    assertEquals("Pedido não foi aberto", order.openOrder());
  }

  @Test
  void shouldNotPayAnOrderSeparated() {
    order.setState(OrderSeparated.getInstance());
    assertEquals("Pedido não foi pago", order.payOrder());
  }

  @Test
  void shouldNotSeparateAnOrderSeparated() {
    order.setState(OrderSeparated.getInstance());
    assertEquals("Pedido não foi separado", order.separateOrder());
  }

  @Test
  void shouldDispatchAnOrderSeparated() {
    order.setState(OrderSeparated.getInstance());
    assertEquals("Pedido despachado", order.dispatchOrder());
  }

  @Test
  void shouldNotDeliverAnOrderSeparated() {
    order.setState(OrderSeparated.getInstance());
    assertEquals("Pedido não foi entregue", order.deliverOrder());
  }

  @Test
  void shouldCancelAnOrderSeparated() {
    order.setState(OrderSeparated.getInstance());
    assertEquals("Pedido cancelado", order.cancelOrder());
  }

}
