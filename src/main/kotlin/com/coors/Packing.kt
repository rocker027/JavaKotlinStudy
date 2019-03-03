package com.coors.kotlin

import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {
    var id = "AAA-1234"
    var enter = LocalDateTime.of(2019, 1, 28,
            9, 0)
    var car = Car(id, enter)
    println("${car.id} 進場時間 : ${car.enter}")
    car.carLeave()
    println("${car.id} 出場時間 : ${car.leave}")
    println("${car.id} 總停車時間 : ${car.getDuration()} 分鐘")
    println("${car.id} 總停車時間 : ${car.getParkingHours()} 小時")
    println("${car.id} 停車單價 : ${car.price} 元/小時")
    println("${car.id} 總停車費用 : ${car.getParkingPamment()} 元")
}

class Car( _id: String,_enter: LocalDateTime) {
    val price = 30
    var id = _id
            set(value) {
            if (value.isNotEmpty()) {
                field = value
            }
        }
    var enter = _enter
        set(value) {
            if (value != null) {
                field = value
            }
        }
    var leave: LocalDateTime? = null
        set(value) {
            if (enter.isBefore(value)) {
                field = value
            }
        }

    fun carLeave() {
        this.leave = LocalDateTime.now()
    }

    fun getDuration() = Duration.between(enter, leave).toMinutes()

    fun getParkingHours() = Math.ceil(getDuration() / 60.0).toLong()

    fun getParkingPamment() = getParkingHours() * price
}

