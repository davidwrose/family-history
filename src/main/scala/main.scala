// Configuration - user settings

package familyhistory
import cats.effect._


//Object to hold user preferences.  This is hard-coded for now,
//but should be enhanced to read from a config file or other options source
object Configuration:
  val language: Language = Language.english
//  val calendar: Calendar = Calendar.Gregorian

object Main extends IOApp:
  def run(args: List[String]): IO[ExitCode] =
    if (args.headOption.map(_ == "--do-it").getOrElse(false))
      IO.println("I did it!").as(ExitCode.Success)
    else
      IO.println("I didn't do it").as(ExitCode(-1))

//@main def main() =
//  printf("Hello, world!")
//  readGED()
