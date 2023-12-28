// Сделал задачу "Compare length of two strings" https://rosettacode.org/wiki/Compare_length_of_two_strings
//Task
//  Given two strings of different length, determine which string is longer or shorter.
//  Print both strings and their length, one on each line. Print the longer one first.
//
//  Measure the length of your string in terms of bytes or characters, as appropriate for your language.
//  If your language doesn't have an operator for measuring the length of a string, note it.
//
//  Extra credit
//  Given more than two strings:
//  list = ["abcd","123456789","abcdef","1234567"]
//  Show the strings in descending length order.

import scala.io.StdIn

object Program {
    def main(args: Array[String]): Unit = {

      // Создаем новый отсортированный готовый список
    val resultList = new Sort().sortLength((1 to StdIn.readInt()).map(_ => io.StdIn.readLine).toList)

    // Выводим строки и их длину
    resultList.foreach { str =>
      println(s"$str - ${str.length}")
    }
  }
}
