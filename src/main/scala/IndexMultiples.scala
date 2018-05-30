object IndexMultiples {


  def index (input:List[Int]): List[Any] ={


    input.zipWithIndex.collect{
      case (0,0) => 0
      case (x,i) if x !=0&& i !=0 && x%i ==0 => x
    }


  }
}
