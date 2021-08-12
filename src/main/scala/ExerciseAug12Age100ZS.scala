import scala.io.StdIn.readLine

object ExerciseAug12Age100ZS extends App {

  val currentYear = readLine("What is the year, my friend?").toDouble
  val userName = readLine("What is your name?")
  println(s"Great! Nice to meet you $userName!")
  val yourAge = readLine ("How old are you?").toDouble
  val age = 100
  val yearWhen100 =(age-yourAge+currentYear).toInt
  println (yearWhen100)
  println (s"$userName, it will be year $yearWhen100 when you turn 100 years old!")

}
