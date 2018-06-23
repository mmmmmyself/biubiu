package com.service;

import com.entity.VideoLike;
import com.entity.Videos;
import com.entity.modelBeans.PageModel;
import com.utils.HibernateUtils;
import com.utils.PropertiesUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by hht
 */
public class VideoService extends BaseServices<Videos> {

    @Override//添加视频
    public boolean save(Videos entity) {
        return super.save(entity);
    }

    @Override//删除视频
    public boolean delete(Videos entity) {
        return super.delete(entity);
    }

    @Override//更新视频
    public boolean update(Videos entity) {
        return super.update(entity);
    }

    @Override//获取视频
    public Videos get(Serializable id) {
        return super.get(id);
    }

    @Override//所有视频列表
    public List<Videos> findAll() {
        return super.findAll();
    }
    
    


    //根据类型,页码获取视频分页模型
    public PageModel<Videos> classify(PageModel<Videos> pageModel, String videoType) {

        String hql = "from Videos v where v.videoType=? order by v.videoWatchCount DESC,v.videoId ASC";
        PageModel<Videos> byPager = super.findByPager
                (pageModel.getPageNo(), pageModel.getPageSize(), hql, videoType);

        Iterator<Videos> iterator = byPager.getDatas().iterator();
        while (iterator.hasNext()) {
            Videos video = iterator.next();
            video.setVideoPath(PropertiesUtil.getProperty("cos.server.http.prefix") + video.getVideoPath());
            video.setVideoCoverPath(PropertiesUtil.getProperty("cos.server.http.prefix") + video.getVideoCoverPath());
        }

        return byPager;

    }

    
}
