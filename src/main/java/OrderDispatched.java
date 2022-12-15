public class OrderDispatched implements OrderState {
  private OrderDispatched() {
  };

  private static OrderDispatched instance = new OrderDispatched();

  public static OrderDispatched getInstance() {
    return instance;
  }

  public String getState() {
    return "Pedido despachado";
  }

  public String openOrder(Order order) {
    return "Pedido não foi aberto";
  };

  public String payOrder(Order order) {
    return "Pedido não foi pago";
  };

  public String separateOrder(Order order) {
    return "Pedido não foi separado";
  };

  public String dispatchOrder(Order order) {
    return "Pedido não foi despachado";
  };

  public String deliverOrder(Order order) {
    order.setState(OrderDelivered.getInstance());
    return "Pedido entregue";
  };

  public String cancelOrder(Order order) {
    order.setState(OrderCancelled.getInstance());
    return "Pedido cancelado";
  };
}
