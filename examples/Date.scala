
object Date {
  // Java의 Comparable 인터페이스와 같은 역할을 하는 Ord라고 불리는 새로운 타입을 만든다
  trait Ord {
    def < (that: Any): Boolean
    def <= (that: Any): Boolean = (this < that) || (this == that)
    def > (that: Any): Boolean = !(this <= that) 
    def >= (that: Any): Boolean = !(this < that)
  }
  /***
  * trait
  * Scala에서 어떤 클래스가 트레잇을 상속하면, 그 클래스는 트레잇의 인터페이스를 구현해야만 하고
  * 동시에 트레잇이 가진 모든 코드들을 가져오게 된다.
  **/

  class Date(y: Int, m: Int, d: Int) extends Ord {
    def year = y
    def month = m
    def day = d
    override def toString(): String = year + "-" + month + "-" + day
    override def equals(that: Any): Boolean = 
      that.isInstanceOf[Date] && {
        val o = that.asInstanceOf[Date]
        // asInstance 타입의 인스턴스이면 그렇게 여겨지도록 변환하고 아니라면 ClassCastException을 발생
        o.day == day && o.month == month && o.year == year
      }
    def < (that: Any): Boolean = {
      if (!that.isInstanceOf[Date]) 
        sys.error("cannot compare " + that + " and a Date")

      var o = that.asInstanceOf[Date]
      (year < o.year) ||
      (year == o.year && (month < o.month ||
        (month == o.month && day < o.day)))
    }
  }
  def main(args: Array[String]) {
    val today = new Date(2015, 5, 20)
    val tomorrow = new Date(2015, 5, 21)
    println(today)
    println(tomorrow)
    println(today < tomorrow)
  }
}
