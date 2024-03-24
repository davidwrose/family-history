// Behavior for dates and intervals in family history.


class dateTest extends UnitTest {
  behavior `of` "a date"
  it `should` "have a reasonable toString method" `ignore` {}
  it `should` "be associated with a calendar" `ignore` {}
  it `should` "be convertable to another calendar" `ignore` {}
  it `should` "be comparible to another date" `ignore` {}
}

class unknownDateTest extends UnitTest {
  behavior `of` "An unknown date"
  it `should` "be unknown" `ignore` {}
  it `should` "remain unknown converted to any calendar" `ignore` {}
}
