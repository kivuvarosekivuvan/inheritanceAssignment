fun main() {
var vehicles=Car("Volvo","Legacy2","Blue",10)
    vehicles.carry(12)
    println( vehicles.calculateParkingFee(6))


    var bs=Bus("Toyota","yoyo12", "Red" ,6)
    bs.maxTripFare(100.00)
    println(bs.calculateParkingFee(2))


}
 open class Car(var make:String, var model:String, var color:String,var capacity:Int) {
    fun carry(people: Int) {
        if (people <= capacity) {
            println("Carrying $people passengers")
        } else {
            var x = people - capacity
            println("overcapacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
   open fun calculateParkingFee(hours:Int):Int{
       var fee=hours*20
        return fee

    }
}
class Bus(make:String,model:String,color:String,capacity:Int):Car(make,model,color,capacity){
fun maxTripFare(fare: Double):Double{
    var max=fare*capacity
    return max
}

    override fun calculateParkingFee(hours: Int): Int{
//        return super.calculateParkingFee(hours)
        var fee=hours*capacity
        return fee
    }

}






















