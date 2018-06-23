package com.entity;

/**
 * Created by hht
 */
public class VideoLike {

    private VideoLikePK likeId;

    private Videos like_video;

    private  Users like_user;

    public Videos getLike_video() {
        return like_video;
    }

    public void setLike_video(Videos like_video) {
        this.like_video = like_video;
    }

    public Users getLike_user() {
        return like_user;
    }

    public void setLike_user(Users like_user) {
        this.like_user = like_user;
    }

    public VideoLikePK getLikeId() {
        return likeId;
    }

    public void setLikeId(VideoLikePK likeId) {
        this.likeId = likeId;
    }

}
