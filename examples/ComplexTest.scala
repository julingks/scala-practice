object ComplexTest {
  class Complex(real: Double, imaginary: Double) {
    def re() = real
    def im() = imaginary
  }
  
  def main(args: Array[String]) {
    val c = new Complex(1,10)
    println(c.re(),c.im())
  }
}



