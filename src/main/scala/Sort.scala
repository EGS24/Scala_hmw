class Sort {
  // Сортируем строки в порядке убывания их длины
  def sortLength(list: List[String]): List[String] ={
    list.sortBy(_.length)(Ordering[Int].reverse)
  }
}
