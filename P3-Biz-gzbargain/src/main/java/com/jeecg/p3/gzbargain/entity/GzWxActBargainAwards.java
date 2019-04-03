package com.jeecg.p3.gzbargain.entity;

import java.util.Date;

import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>WxActBargainAwards:领取奖品记录表<br>
 * @author junfeng.zhou
 * @since：2015年08月06日 18时46分34秒 星期四 
 * @version:1.0
 */
public class GzWxActBargainAwards implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	/**
	 *活动id
	 */
	private String actId;
	
	/**
	 * 奖品序号
	 */
	private Integer awardsSeq;
	/**
	 *兑奖人昵称
	 */
	private String nickname;
	/**
	 * 对应微信平台原始id
	 */
	private String jwid;
	
	/**
	 * 是否关注（ 用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。）
	 */
	private String subscribe;
		return actId;
	}
	public void setActId(String actId) {
		this.actId = actId;
	}
	public Integer getAwardsSeq() {
		return awardsSeq;
	}
	public void setAwardsSeq(Integer awardsSeq) {
		this.awardsSeq = awardsSeq;
	}
	public String getOpenid() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getRealName() {
	public String getJwid() {
		return jwid;
	}
	public void setJwid(String jwid) {
		this.jwid = jwid;
	}
	public String getSubscribe() {
		return subscribe;
	}
	public void setSubscribe(String subscribe) {
		this.subscribe = subscribe;
	}
	@Override
	public String toString() {
		return "GzWxActBargainAwards [id=" + id + ", actId=" + actId
				+ ", awardsSeq=" + awardsSeq + ", openid=" + openid
				+ ", nickname=" + nickname + ", realName=" + realName
				+ ", mobile=" + mobile + ", address=" + address
				+ ", awardsCode=" + awardsCode + ", createTime=" + createTime
				+ ", jwid=" + jwid + ", subscribe=" + subscribe + "]";
	}
	
	
}
