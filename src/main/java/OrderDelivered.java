public class OrderDelivered implements OrderState {
  private OrderDelivered() {
  };

  private static OrderDelivered instance = new OrderDelivered();

  public static OrderDelivered getInstance() {
    return instance;
  }

  public String getState() {
    return "Pedido entregue";
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
    return "Pedido não foi entregue";
  };

  public String cancelOrder(Order order) {
    return "Pedido não foi cancelado";
  };
}
