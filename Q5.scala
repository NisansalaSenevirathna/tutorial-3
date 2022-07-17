object Q5 extends App{

  def  easy_pace(distance1:Double):Double =8*distance1;
  def tempo(distance2:Double):Double =7*distance2;
  def total_running_time(distance1:Double , distance2:Double):Double =easy_pace(distance1) + tempo(distance2);

  printf("\ntotal running time is:%.2f\n ",total_running_time(2,3));
}