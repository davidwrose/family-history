import familyhistory._
import org.scalatest.flatspec._


class textTest extends UnitTest {
  behavior `of` "text"
  it `must` "have a content string and language" in {
    val s = "Hello World!"
    val t = Text(s, Language.english)
    assert(s == t.content)
    assert(t.language == Language.english)
  }

  it `should` "default to an unknown language when not specified" in {
    val s = "Hello World!"
    val t = Text(s)
    assert(t.language == Language.unknown)
  }
}
