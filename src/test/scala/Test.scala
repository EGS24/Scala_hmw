import org.scalatest.funsuite.AnyFunSuiteLike

class Test extends AnyFunSuiteLike {
  test("sortLength should correctly sort a list of strings by length") {
    assert(new Sort().sortLength(List("123", "4567")) == List("4567", "123"))
    assert(new Sort().sortLength(List("hockey", "football", "basketball")) == List("basketball", "football", "hockey"))
    assert(new Sort().sortLength(List("123", "8910", "4567")) == List("8910", "4567", "123"))
    assert(new Sort().sortLength(List("abba", "nana", "acdc", "dragon")) == List("dragon", "abba", "nana", "acdc"))
    assert(new Sort().sortLength(List("ab", "na", "ac", "dr")) == List("ab", "na", "ac", "dr"))
    assert(new Sort().sortLength(List("abcd", "123456789", "abcdef", "1234567")) == List("123456789", "1234567", "abcdef", "abcd"))
  }

  test("sortLength should return an empty list if the input list is empty") {
    assert(new Sort().sortLength(List.empty[String]) == List.empty[String])
  }

  test("sortLength should return a list with the same elements in the same order if all strings have the same length") {
    assert(new Sort().sortLength(List("abc", "def", "ghi")) == List("abc", "def", "ghi"))
  }
}
