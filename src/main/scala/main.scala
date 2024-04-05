// Configuration - user settings

package familyhistory



//Object to hold user preferences.  This is hard-coded for now,
//but should be enhanced to read from a config file or other options source
object Configuration:
  val language: Language = Language.english
//  val calendar: Calendar = Calendar.Gregorian

@main def main() =
  printf("Hello, world!")
