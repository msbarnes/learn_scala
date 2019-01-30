//immutable set
var airlineSet = Set("American", "Delta")
airlineSet += "United"
println(airlineSet.contains("Alaska"))

//mutable Set
import scala.collection.mutable

val jetSet = mutable.Set("Cathay Pacific", "Finnair")
jetSet += "LATAM"
println(jetSet)

//immutable HashSet
import scala.collection.immutable.HashSet

val jetSet2 = HashSet("Southwest", "Frontier")
println(jetSet2 + "Spirit")

//hashmap
/*
1 -> "Go to airport"
is transformed to
(1).->("Go to airport")
by the compiler
*/
val flightMap = mutable.Map[Int, String]()
flightMap += (1 -> "Go to airport")
flightMap += (2 -> "Go through security")
flightMap += (3 -> "Cry because you're flying United")
println(flightMap(2))

//immutable Map
val flightNums = Map(
    1 -> "497", 2 -> "1550", 3 -> "200", 4 -> "23"
)
println(flightNums(4))
