import familyhistory._
import org.scalatest.flatspec._


class TextTest extends UnitTest {
  behavior `of` "Text"
  it `must` "have a content string and language" in {
    Given("a string 'Hello World!'")
    val s = "Hello World!"
    And("the language English")
    val t = Text(s, Language.english)
    Then("content is 'Hello World!'")
    assert(s == t.content)
    And("language is English")
    assert(t.language == Language.english)
  }

  it `should` "default to an unknown language when not specified" in {
    Given("text with 'Hello World!'")
    val s = "Hello World!"
    And("an unspecified language")
    val t = Text(s)
    Then("the language is unknown")
    assert(t.language == Language.unknown)
  }
}
