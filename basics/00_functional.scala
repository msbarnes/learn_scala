//imperative style
/*
def printArgs(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
        println(args(i))
        i += 1
    }
}

//functional style
def printArgs(args: Array[String]): Unit = {
    for (arg <- args)
        println(arg)
}
*/
//functional style, alternative approach
def printArgs(args: Array[String]): Unit = {
    args.foreach(println)
}

//functional, refactored
def formatArgs(args: Array[String]) = args.mkString("\n")

val res = formatArgs(Array("zero", "one", "two"))
//if false, assert returns quietly
//if boolean is true, throws AssertionError
assert(res == "zero\none\ntwo")
