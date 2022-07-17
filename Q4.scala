object Q4 extends App{

  def discount(price:Double):Double=price *40/100;
  def shipping_cost(copies:Int):Double=3*50 +(copies-50)*0.75;
  def books(price:Double , copies:Int):Double=price * copies;
  def total_cost(price:Double , copies:Int):Double =books(price ,copies) - discount(books(price,copies)) + shipping_cost(copies);

  printf("\nTotal cost is:%.2f\n",total_cost(24.95,60));
}