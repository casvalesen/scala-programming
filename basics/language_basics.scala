// Basic tour of scala 
//https://docs.scala-lang.org/tour/basics.html

// Simple print statements
println(1+1)
println("Hello, world!")

// Values
// Naming results of expressions with val keyword
val x = 1 + 1 
print(x)

// Referencing a value does not recompute it
// e.g x = 3 does not compile

// The type of a value can be omitted and inferred, or explicitly stated
val y: Int = 1 + 1 

// Variables 
// variables can be reassigned
var z = 1 + 1
z = 3
println(z*z)

// Blocks 
// You can combine expressions by surrounding them with {}, this becomes a block 

println( {
  
  val a = 1 + 1 
   a + 1
})

// Functions 
// Functions are expressions that have parameters and take arguments 
// Anonymous function 

(a: Int) => a+1  // On  the left of => is a list of parameters, on the right is an expression involving the parameteres. 

// Function with multiple parameters 

val add = (x: Int, y: Int) => x+y 

// Function with no parameters 

val getTheAnswer = () => 42 
println(getTheAnswer())

// Methods 
// Methods defined with the def keyword
def addMethod(x: Int, y: Int): Int = x + y
println(addMethod(1, 2))

//methods can take multiple parameter lists 
def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x+y) * multiplier

println(addThenMultiply(1,2)(3))