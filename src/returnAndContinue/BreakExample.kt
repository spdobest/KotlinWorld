package returnAndContinue


/**
    break -  Terminates the nearest enclosing loop.
 */
class BreakExample {


    fun breakFUn1(){
        loop@ for (i in 1..10) {
            println("outer $i")
            for (j in 1..10) {
                println("inner $j")
                if (i==7) break@loop
            }
        }
    }

    fun checkGrayCode( val1:Int, val2:Int){
        var num1 = val1
        var num2 = val2
        if(val1>0 && val2>0){
            var sum = 0
            while (num1>0 && num2>0){

                if(val1%10==val2%10){
                    num1 = num1/10
                    num2 = num2/10
                    sum++
                    if(sum>1){
                        print("Both are not gray Code")
                        break
                    }
                }


            }
            if(sum == 1){
                print("Both are not gray Code")
            }
        }
        else{
            print("Both are not gray Code")
        }
    }

}