import java.lang.ArithmeticException
import java.lang.Exception
import java.util.*

fun main (args:Array<String>){
    println("select which function do you want to execute")
    println("please enter either number or operation name")
    println("Press 1.Multiplcation")
    println("Press 2.Addition")
    println("Press 3.Subtraction")
    println("Press 4.Division")
    println("Press 5.percentage")
    val obj =arithmetic_operation()
    obj.select_operation()

}
class arithmetic_operation {
    var read : Scanner = Scanner(System.`in`)


  fun select_operation(){
      print("which of the function do you want to execute")
      var select: Char = readLine()!![0]
      if (select == 'm' ||select == 'M'||select=='1'){
          print("Enter  how many number you want to multiplication")
          val obj1= Multiplication()
          obj1.mul()
      }
      else if (select == 'A' ||select == 'a'||select=='2'){
          print("Enter  how many number you want to addition")
          val obj2= Addition()
          obj2.add()
      }
      else if (select == 's' ||select == 'S'||select=='3'){
          print("Enter  how many number you want to subtration")
          val obj3= Subtration()
          obj3.sub()
      }
      else if (select == 'd' ||select == 'D'||select=='4'){
          print("Enter  how many number you want to division")
          val obj4= Division()
          obj4.div()
      }
      else if(select == 'p' ||select == 'P'||select=='5'){
          val obj5= Percentage()
          obj5.per()

      }
  }
    class Multiplication{

        var read : Scanner = Scanner(System.`in`)
        var a:Int = read.nextInt()
        var b = Array<Double>(a){0.0}
        var x:Int = 0
        var mul3:Double= 1.0
        fun mul(){
            while (a > 0) {

                println("enter ${x +1} number")
                b[x] = read.nextDouble()
                x++
                a--
            }
            for (item in b.indices)
                mul3 = b[item] * mul3
            print(mul3)

      }
    }
    class Addition{
        var read : Scanner = Scanner(System.`in`)

        var a:Int = read.nextInt()
        var b = Array<Double>(a){0.0}
        var x:Int = 0
        var sum3:Double =0.0

        fun add(){

            while (a > 0) {

                println("enter ${x +1} number")
                b[x] = read.nextDouble()
                x++
                a--
            }
            for (item in b.indices)
               sum3 = b[item] + sum3
            print(sum3)
        }
    }
    class Subtration{
            var read : Scanner = Scanner(System.`in`)
            var a:Int = read.nextInt()
            var b = Array<Double>(a){0.0}
            var x:Int = 0
            var sub3:Double =0.0

            fun sub(){
                while (a > 0) {


                    if(x==0) {
                        a--
                        println("please first enter big value")
                        println("enter ${x +1} number")
                        sub3 = read.nextDouble()
                        x++
                    }
                    println("enter ${x +1} number")
                    b[x] = read.nextDouble()
                    x++
                    a--
                }
                for (item in b.indices) {
                    sub3 = sub3 -b[item]
                }
                    print(sub3)
            }
    }
    class Division {
        var read: Scanner = Scanner(System.`in`)
        var a: Double =0.0
        var b:Double = 0.0
        var div3: Double = 0.0

            fun div() {
                println("enter first dividen")
                a = read.nextDouble()
                println("Now enter diviaor")
                b = read.nextDouble()

                try{
                    div3 = a / b
                }catch (e:ArithmeticException){
                    println("you can't divided by zero")
                }
                print(div3)
            }
    }
    class Percentage {
            var read: Scanner = Scanner(System.`in`)
            var a: Double =0.0
            var b:Double = 0.0
        var per3: Double = 0.0

        fun per() {
            println("enter first partnumber")
            a = read.nextDouble()
            println("Now enter total number")
            b = read.nextDouble()
            per3 = (a / b)*100
            print(per3)
        }
    }
}

