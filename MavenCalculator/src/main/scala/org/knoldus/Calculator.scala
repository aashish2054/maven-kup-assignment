package org.knoldus

class Calculator {

  def add (first_num : Int , second_num : Int) : Int  = {first_num + second_num}

  def sub(first_num : Int , second_num : Int) : Int = {first_num - second_num}

  def mul(first_num : Int , second_num : Int) : Int = {first_num * second_num}

  def div (first_num : Int , second_num : Int) : Int = {
    if (second_num==0)
{
  0
}
  else{
  first_num / second_num}
}


  def power(first_num: Int, second_num: Int): Double = {
  Math.pow(first_num, second_num)
}

  def absolute(number:Int):Int = {
  Math.abs(number)
}

  def mod(first_num:Int , second_num:Int):Int = {
  first_num % second_num
}

  def max(first_num:Int , second_num:Int):Int = {
  if(first_num > second_num)
  {first_num}
  else{
  second_num}
}

  def min(first_num:Int,second_num:Int):Int = {
  if(first_num<second_num)
 {first_num}
  else{
  second_num}
}
}
