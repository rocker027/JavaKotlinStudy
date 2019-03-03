package com.coors.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    /**
     * id 車牌
     * enter 進場時間
     * leave 出場時間
     */
    private String id;
    private LocalDateTime enter;
    private LocalDateTime leave;

    public Car(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }

    /**
     * 計算總停留時間
     * @return 分鐘數
     */
    public Long getDuration() {
        Duration duraton = Duration.between(getEnter(), leave);
        return duraton.toMinutes();
    }

    public void leave() {
        setLeave(LocalDateTime.now());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getEnter() {
        return enter;
    }

    public void setEnter(LocalDateTime enter) {
        this.enter = enter;
    }

    public LocalDateTime getLeave() {
        return leave;
    }

    public void setLeave(LocalDateTime leave) {
        if (leave.isAfter(enter)) {
            this.leave = leave;
        }
    }
}
