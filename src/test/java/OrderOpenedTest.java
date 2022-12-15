import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class OrderOpenedTest {
  Order order;

  @BeforeEach
  public void setup() {
    order = new Order();
  }

  @Test
  void shouldNotOpenAnOrderOpened() {
    order.setState(OrderOpened.getInstance());
    assertEquals("Pedido não foi aberto", order.openOrder());
  }

  @Test
  void shouldPayAnOrderOpened() {
    order.setState(OrderOpened.getInstance());
    assertEquals("Pedido pago", order.payOrder());
  }

  @Test
  void shouldNotSeparateAnOrderOpened() {
    order.setState(OrderOpened.getInstance());
    assertEquals("Pedido não foi separado", order.separateOrder());
  }

  @Test
  void shouldNotDispatchAnOrderOpened() {
    order.setState(OrderOpened.getInstance());
    assertEquals("Pedido não foi despachado", order.dispatchOrder());
  }

  @Test
  void shouldNotDeliverAnOrderOpened() {
    order.setState(OrderOpened.getInstance());
    assertEquals("Pedido não foi entregue", order.deliverOrder());
  }

  @Test
  void shouldCancelAnOrderOpened() {
    order.setState(OrderOpened.getInstance());
    assertEquals("Pedido cancelado", order.cancelOrder());
  }
}
