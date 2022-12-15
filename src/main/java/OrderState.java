public interface OrderState {

  String getState();

  String openOrder(Order order);

  String payOrder(Order order);

  String separateOrder(Order order);

  String dispatchOrder(Order order);

  String deliverOrder(Order order);

  String cancelOrder(Order order);
}
