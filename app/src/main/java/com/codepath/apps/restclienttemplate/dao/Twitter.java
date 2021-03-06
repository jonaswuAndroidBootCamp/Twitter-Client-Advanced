package com.codepath.apps.restclienttemplate.dao;

import java.util.List;
import com.codepath.apps.restclienttemplate.dao.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table TWITTER.
 */
public class Twitter {

    private Long internalId;
    private Long id;
    private java.util.Date created_at;
    private Long retweet_count;
    private Long favorite_count;
    private String type;
    private String text;
    private Long twitterUserIdMapping;
    private Long in_reply_to_user_id;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient TwitterDao myDao;

    private User user;
    private Long user__resolvedKey;

    private List<Media> mediaList;
    private List<Twitter> twitterList;

    public Twitter() {
    }

    public Twitter(Long internalId) {
        this.internalId = internalId;
    }

    public Twitter(Long internalId, Long id, java.util.Date created_at, Long retweet_count, Long favorite_count, String type, String text, Long twitterUserIdMapping, Long in_reply_to_user_id) {
        this.internalId = internalId;
        this.id = id;
        this.created_at = created_at;
        this.retweet_count = retweet_count;
        this.favorite_count = favorite_count;
        this.type = type;
        this.text = text;
        this.twitterUserIdMapping = twitterUserIdMapping;
        this.in_reply_to_user_id = in_reply_to_user_id;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getTwitterDao() : null;
    }

    public Long getInternalId() {
        return internalId;
    }

    public void setInternalId(Long internalId) {
        this.internalId = internalId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.util.Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(java.util.Date created_at) {
        this.created_at = created_at;
    }

    public Long getRetweet_count() {
        return retweet_count;
    }

    public void setRetweet_count(Long retweet_count) {
        this.retweet_count = retweet_count;
    }

    public Long getFavorite_count() {
        return favorite_count;
    }

    public void setFavorite_count(Long favorite_count) {
        this.favorite_count = favorite_count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getTwitterUserIdMapping() {
        return twitterUserIdMapping;
    }

    public void setTwitterUserIdMapping(Long twitterUserIdMapping) {
        this.twitterUserIdMapping = twitterUserIdMapping;
    }

    public Long getIn_reply_to_user_id() {
        return in_reply_to_user_id;
    }

    public void setIn_reply_to_user_id(Long in_reply_to_user_id) {
        this.in_reply_to_user_id = in_reply_to_user_id;
    }

    /** To-one relationship, resolved on first access. */
    public User getUser() {
        Long __key = this.twitterUserIdMapping;
        if (user__resolvedKey == null || !user__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            UserDao targetDao = daoSession.getUserDao();
            User userNew = targetDao.load(__key);
            synchronized (this) {
                user = userNew;
            	user__resolvedKey = __key;
            }
        }
        return user;
    }

    public void setUser(User user) {
        synchronized (this) {
            this.user = user;
            twitterUserIdMapping = user == null ? null : user.getInternalId();
            user__resolvedKey = twitterUserIdMapping;
        }
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<Media> getMediaList() {
        if (mediaList == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            MediaDao targetDao = daoSession.getMediaDao();
            List<Media> mediaListNew = targetDao._queryTwitter_MediaList(internalId);
            synchronized (this) {
                if(mediaList == null) {
                    mediaList = mediaListNew;
                }
            }
        }
        return mediaList;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetMediaList() {
        mediaList = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<Twitter> getTwitterList() {
        if (twitterList == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            TwitterDao targetDao = daoSession.getTwitterDao();
            List<Twitter> twitterListNew = targetDao._queryTwitter_TwitterList(internalId);
            synchronized (this) {
                if(twitterList == null) {
                    twitterList = twitterListNew;
                }
            }
        }
        return twitterList;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetTwitterList() {
        twitterList = null;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
