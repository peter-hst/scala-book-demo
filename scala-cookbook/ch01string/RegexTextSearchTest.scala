object RegexTextSearchTest {

  def main(args:Array[String]) {
      val MoviesZipRE = "movies (\\d{5})".r
      val MoviesNearCityStateRE = "movies near ([a-z]+), ([a-z]{2})".r
      textUserTyped match { 
          case MoviesZipRE(zip) => getSearchResults(zip)
          case MoviesNearCityStateRE(city,state) => getSearchResults(city,state)
          case _ => println("did not match a reagx")
        }
  }
  def getSearchResults(args String*){
      println(args)
  }
}
