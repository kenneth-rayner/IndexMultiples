object IndexMultiples {


  def index (input:List[Int]): List[Any] ={


    input.zipWithIndex.collect{
      case (x,i) if x==0 && i ==0=>x
      case (x,i) if x !=0&& i !=0 && x%i ==0 => x
    }


  }
}
