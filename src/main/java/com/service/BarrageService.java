package com.service;

import com.entity.Barrages;
import com.utils.HibernateUtils;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hht
 */
public class BarrageService extends BaseServices<Barrages> {
    

	

   
    //每一个视频获得弹幕数
    public int queryCountByVideo(String video_id) {
        Transaction tx = null;
        try {
            tx = HibernateUtils.getCurrentSession().beginTransaction();
            String hql = "select count(*) from Barrages b where b.barrage_video.videoId=? order by b.barrageCreateTime asc";
            String hql_new = "select count(*) from Barrages b group by b.videoId";
            int count = barrageDao.totalCount(hql, video_id);
            tx.commit();

            return count;

        } catch (Exception ce) {
            if (tx != null) {
                tx.rollback();
            }
            ce.printStackTrace();
        }
        return -1;
    }
}
