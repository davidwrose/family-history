package familyhistory

//Enumeration of the calender systems used in representing dates.
//This list is mostly aspirational
//However there is an appalling lack of cultural sensitivity on the various different calendar dates in use
//in the present, not to mention historically.  So it is worth listing at least some of the major ones.
enum Calendar:
  case Gregorian
  case Julian
  case Hebrew
  case Hijri
  case Chinese
  case Dangun
  case SakaSamvat
  case VikramSamvat



enum When:
  case UnknownDate
  case Date(date: String, cal: Calendar) extends When
  case ApproximateDate(date: String, cal: Calendar) extends When
  case EstimatedDate(date: String, cal: Calendar) extends When
  case BeforeDate(date: String, cal: Calendar) extends When
  case AfterDate(date: String, cal: Calendar) extends When
  case DateRange(earliest: String, latest: String, cal: Calendar) extends When
  case ApproximateDateRange(likelyAfter: String, likelyBefore: String, cal: Calendar) extends When

object When
  
