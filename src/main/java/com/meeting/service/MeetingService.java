package com.meeting.service;



import com.meeting.pojo.MeetingPojo;

import java.util.List;

public interface MeetingService {
    List<MeetingPojo> selectAll();
}
