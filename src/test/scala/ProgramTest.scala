import org.scalatest.funsuite.AnyFunSuiteLike

class ProgramTest extends AnyFunSuiteLike {
  test("testSortLength") {
    assert(new Sort().sortLength(List("123", "4567")) == List("4567", "123"))
    assert(new Sort().sortLength(List("hockey", "football", "basketball")) == List("basketball", "football", "hockey"))
    assert(new Sort().sortLength(List("123", "8910", "4567")) == List("8910", "4567", "123"))
    assert(new Sort().sortLength(List("abba", "nana", "acdc", "dragon")) == List("dragon", "abba", "nana", "acdc"))
    assert(new Sort().sortLength(List("ab", "na", "ac", "dr")) == List("ab", "na", "ac", "dr"))
    assert(new Sort().sortLength(List("abcd", "123456789", "abcdef", "1234567")) == List("123456789", "1234567", "abcdef", "abcd"))
  }
}
