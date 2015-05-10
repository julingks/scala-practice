
class Reference[T] {
  private var contents: T = _
  /* 변수의 초기값이 _로 주어져 있다는 것인데, 여기서 _는 기본값을 뜻한다. 
   * 기본값은 수 타입에 대해서 0, Boolean 타입에 대해서 false, Unit 타입에 대해 (),
   * 그리고 모든 객체 타입에 대해 null이다.
   **/
  def set(value: T) { contents = value }
  def get: T = contents
}

object IntegerReference {
  def main(args: Array[String]) {
    val cell = new Reference[Int]
    cell.set(13)
    println("Reference contains the half of " + (cell.get *2))
  }
}


