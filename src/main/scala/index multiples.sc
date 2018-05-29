val input = List(2,4,7,9,10)

val xxx = input.zipWithIndex

val xx = xxx.filterNot(x=> x._2 ==0 &&  x._1%x._2!=0 )

val yy = xx.filter(x=>x._1%x._2==0)

val zz = yy.map(x=> x._1)

