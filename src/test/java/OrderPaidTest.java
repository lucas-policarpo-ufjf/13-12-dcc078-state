import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class OrderPaidTest {
  Order order;

  @BeforeEach
  public void setup() {
    order = new Order();
  }

  @Test
  void shouldNotOpenAnOrderPaid() {
    order.setState(OrderPaid.getInstance());
    assertEquals("Pedido não foi aberto", order.openOrder());
  }

  @Test
  void shouldNotPayAnOrderPaid() {
    order.setState(OrderPaid.getInstance());
    assertEquals("Pedido não foi pago", order.payOrder());
  }

  @Test
  void shouldSeparateAnOrderPaid() {
    order.setState(OrderPaid.getInstance());
    assertEquals("Pedido separado", order.separateOrder());
  }

  @Test
  void shouldNotDispatchAnOrderPaid() {
    order.setState(OrderPaid.getInstance());
    assertEquals("Pedido não foi despachado", order.dispatchOrder());
  }

  @Test
  void shouldNotDeliverAnOrderPaid() {
    order.setState(OrderPaid.getInstance());
    assertEquals("Pedido não foi entregue", order.deliverOrder());
  }

  @Test
  void shouldCancelAnOrderPaid() {
    order.setState(OrderPaid.getInstance());
    assertEquals("Pedido cancelado", order.cancelOrder());
  }
}
