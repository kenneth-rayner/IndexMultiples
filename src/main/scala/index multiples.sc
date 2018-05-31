val aa = List("","b","c")
val bb = List("a","b","c")

val cc = aa.zip(bb)


cc.map(x => if (x._1 =="")0)


