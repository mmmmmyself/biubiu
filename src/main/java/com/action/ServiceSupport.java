package com.action;

import com.service.BarrageService;
import com.service.VideoService;

public interface ServiceSupport {
    
    BarrageService BARRAGE_SERVICE = new BarrageService();
    VideoService VIDEO_SERVICE = new VideoService();
}
