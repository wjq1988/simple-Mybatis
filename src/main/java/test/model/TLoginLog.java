package test.model;

import java.util.Date;
import tk.mybatis.simple.model.BaseEntity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_login_log
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class TLoginLog extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_log.login_log_id
     *
     * @mbggenerated
     */
    private Integer loginLogId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_log.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_log.ip
     *
     * @mbggenerated
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_log.login_datetime
     *
     * @mbggenerated
     */
    private Date loginDatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_log.login_log_id
     *
     * @return the value of t_login_log.login_log_id
     *
     * @mbggenerated
     */
    public Integer getLoginLogId() {
        return loginLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_log.login_log_id
     *
     * @param loginLogId the value for t_login_log.login_log_id
     *
     * @mbggenerated
     */
    public void setLoginLogId(Integer loginLogId) {
        this.loginLogId = loginLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_log.user_id
     *
     * @return the value of t_login_log.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_log.user_id
     *
     * @param userId the value for t_login_log.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_log.ip
     *
     * @return the value of t_login_log.ip
     *
     * @mbggenerated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_log.ip
     *
     * @param ip the value for t_login_log.ip
     *
     * @mbggenerated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_log.login_datetime
     *
     * @return the value of t_login_log.login_datetime
     *
     * @mbggenerated
     */
    public Date getLoginDatetime() {
        return loginDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_log.login_datetime
     *
     * @param loginDatetime the value for t_login_log.login_datetime
     *
     * @mbggenerated
     */
    public void setLoginDatetime(Date loginDatetime) {
        this.loginDatetime = loginDatetime;
    }
}