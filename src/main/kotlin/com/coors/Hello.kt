package com.coors

/**
 * Kotlin 程式進入點
 */
fun main(args: Array<String>) {
    /**
     *  Kotlin 資料型態
     *  var , varialbe 可變的
     *  val , value 給值不可變
     *
     *  宣告變數 指定資料型態，並給予初值
     *  val age : Int = 19
     *
     *  宣告變數 不指定資料型態(變數型態，自動推斷)
     *  val age2 = 20
     *  var weight = 66.5f
     *
     *  宣告變數 指定資料型態，不給初值
     *  val name : String
     */

    /**
     * 建構子可以不依照參數位置，直接指定
     * var h = Human(weight = 66.5f, height = 1.6f)
     */
//    var h = Human(66.5f, 1.6f)
    var h = Human(height = 1.5f, weight = 66.6f)
    println("Kt BMI : " + h.bmi())

    println(h.bmi() > 20)
}

/**
 * Human 類別 主建構子
 *
 * 空建構子
 * class Human {}
 *
 * 建構子也可以給予初值
 * ex: class Human( var weight : Float = 66.5f , var height : Float = 1.6f ) {}
 *
 * @param weight 傳入體重 Float
 * @param height 傳入身高 Float
 */
class Human(var weight : Float , var height : Float) {
    /**
     * init 為建構完成後，第一個執行的fun
     */
    init {
        // java 字串 + 寫法
        println("init java type Weight " + weight)
        // kotlin 字串 $加上變數
        println("init kotlin type $weight " )
    }

    /**
     * 次要建構子
     * 1. 參數前不可以加上var & val
     * 2. 由於有使用到weight & height參數建構，需使用主建構子建構方式
     */
    constructor(name: String, weight: Float, height: Float) : this(weight, height)
    constructor(name: String , sex : String , weight: Float, height: Float) : this(weight, height)

    /**
     * Fun 列印出Hello world
     * 不回傳值，直接列印出
     */
    fun hello() {
        // 不回傳
        println("Hello Kotlin")
    }

    /**
     * Fun BMI 運算
     * @return Float 格式資料BMI值
     */
    fun bmi() : Float {
        return weight / (height * height)
    }
}