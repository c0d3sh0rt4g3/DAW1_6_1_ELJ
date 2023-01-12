fun main() {
    val gun= Gun(".45 magnum")
    gun.shoot()
    val shotgun = Shotgun("Double Barrel")
    shotgun.shoot()
    val rifle = Rifle("AK-47")
    rifle.shoot()
    rifle.shootMode()
}

open class Gun(){
    var gunModel = ""
    constructor(gunModel:String) : this(){
        this.gunModel = gunModel
    }
    open fun shoot(){
        println("The $gunModel gun shot losing all its bullets")
    }
}

class Shotgun(gunModel: String): Gun(gunModel){
    override fun shoot() {
        println("The $gunModel shotgun shot losing all its .12 bullets")
    }
}

class Rifle(gunModel: String): Gun(gunModel){
    override fun shoot() {
        println("The $gunModel rifle shot losing all its 7.62 bullets")
    }
    fun shootMode(){
        println("The $gunModel rifle can shoot in automatic and semiautomatic mode.")
    }
}