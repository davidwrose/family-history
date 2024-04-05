
// Text - strings with a language attribute
package familyhistory

// Languages use the ISO 639-3 standard
// Source: www.iso639-3.sil.org
// See iso639-3.sil.org/code_tables_download_tables for Terms of Use
// ISO 639-3 includes historical as well as extant languages
//  Short list for convenience, can be extended with iso properties


enum Language(iso_639_3_code: String):
  //Code reserved for private use, here to indicate language is unknown or not specified
  case unknown extends Language("qqx")
  //Code reserved for private use, here to indicate a language not on the list
  case other extends Language("qqq")
  //List of languages most likely to be used
  case english extends Language("eng")
  case french extends Language("fra")
  case german extends Language("deu")
  case dutch extends Language("nld")
  case gaelic extends Language("gla")
  case irish extends Language("gle")
  case hebrew extends Language("heb")
  case danish extends Language("dan")
  case chinese extends Language("zho")
  case italian extends Language("ita")
  case japanese extends Language("jpn")
  case korean extends Language("kor")
  case latin extends Language("lat")
  case norwegian extends Language("nor")
  case occitan extends Language("oci")
  case portuguese extends Language("por")
  case telugu extends Language("tel")
  case hindi extends Language("hin")

case class Text(content: String, language: Language = Language.unknown)
