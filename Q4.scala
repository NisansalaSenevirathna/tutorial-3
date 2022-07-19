object Q4 extends App{

  def book_price(copies:Int):Double=copies * 24.95; //total amount for x books
  def discount(amount:Double):Double=amount * 40/100;
  def shopping_cost(copies:Int):Double= if(copies<=50)3  else 3*50 +(copies-50) * 0.75;
  def total_cost(copies :Int):Double =book_price(copies) - discount(book_price(copies)) + shopping_cost(copies);

  printf("\nTotal cost is:%.2f\n",total_cost(60));
}
