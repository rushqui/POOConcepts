package com.medical.appointments.model;

import java.util.Date;

public interface IScheduleable {

    void schedule(Date date, String time);
}

