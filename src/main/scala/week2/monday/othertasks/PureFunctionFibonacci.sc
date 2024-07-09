val fibonacciSequence: String = ""
def generateFibonacciNumber(n:Int):String= {
  if(n==0) fibonacciSequence
  else if(n==1) fibonacciSequence + "3"
  else if(n==2) fibonacciSequence + "4"
  else {
    fibonacciSequence + s"${generateFibonacciNumber(n-1)+ generateFibonacciNumber(n-2)}"
  }
}
println(generateFibonacciNumber(5))
