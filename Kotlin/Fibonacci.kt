fun main(){
    var a = 1
    var b = 1
    var c: Int 

    print("${a} ${b} ")

    for(i in 0 until 15 step 1){
        c = b + a
        a = b
        b = c
        print("${b} ")
    }

}