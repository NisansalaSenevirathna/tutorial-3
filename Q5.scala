object Q5 extends App{

  def  easy_pace(distance:Double):Double =distance*8;
  def tempo(distance:Double):Double =distance *7 ;
  def total_running_time(d1:Double , d2:Double, d3:Double):Double =easy_pace(d1) + tempo(d2) +easy_pace(d3);

  printf("\ntotal running time is:%.2f\n ",total_running_time(2,3,2));
}