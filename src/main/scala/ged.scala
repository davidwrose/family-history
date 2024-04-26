// Gedcom - Process GEDCOM files
package familyhistory
import cats.parse.Parser

def testParse() : Unit =
  val p: Parser[Char] = Parser.anyChar
  p.parse("t")

def readGED() : Unit =
  val fileName = "/home/dwrose/Dubreuil Family Tree.ged"
  var lineCount = 0
  for (lines <- scala.io.Source.fromFile(fileName).getLines())
    lineCount += 1
  println(s"Lines counted: $lineCount")
