package com.coors.parking;

import java.time.LocalDateTime;

public class Car {
    /**
     * id 車牌
     * enter 進場時間
     * leave 出場時間
     */
    private String id;
    private long enter;
    private long leave;

    public Car(String id, long enter) {
        this.id = id;
        this.enter = enter;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getEnter() {
        return enter;
    }

    public void setEnter(long enter) {
        this.enter = enter;
    }

    public long getLeave() {
        return leave;
    }

    public void setLeave(long leave) {
        this.leave = leave;
    }
}
