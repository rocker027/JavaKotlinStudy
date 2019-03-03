package com.coors

import com.coors.kotlin.Car
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val parkingLot = hashMapOf<String,Car>()
    var enter = LocalDateTime.of(2019,1,29,11,0)
    val carId1 = "AAA-1234"
    val carId2 = "BBB-1234"

    var car1 : Car? = Car(carId1 , enter)
    var car2 = Car(carId2 , enter.plusMinutes(15))

    var leaveTime = enter.plusHours(2)
    car1?.leave = leaveTime
    car2.leave = leaveTime.minusHours(1)
    parkingLot.put(car1!!.id,car1)
    parkingLot.put(car2.id,car2)
    for (key in parkingLot.keys){
        var car = parkingLot.get(key)
        println("${car?.id} 停留時間為 : ${car?.getDuration()}")
    }
//    parkingLot.remove(key)
//    println("停車場剩餘車輛數 : ${parkingLot.size}" )

    // listTest()
}

private fun listTest() {
    val list = listOf(5, 1, 2, 6)
    println(list)
    val scores = listOf(68, 88, 78, 89)
    for (score in scores) {
        println(score)
    }
    // list 不可變
    println(list.get(3))

    // mutable 可變
    var mutableList = mutableListOf(5, 2, 1, 3)
    mutableList.add(6)
    mutableList.add(4)
    println(mutableList)

    for (count in mutableList) {
        println(count)
    }
}
