package com.dbkj.meet.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseChargeRecord<M extends BaseChargeRecord<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setCid(java.lang.Long cid) {
		set("cid", cid);
	}

	public java.lang.Long getCid() {
		return get("cid");
	}

	public void setAmount(java.math.BigDecimal amount) {
		set("amount", amount);
	}

	public java.math.BigDecimal getAmount() {
		return get("amount");
	}

	public void setCharge(java.math.BigDecimal charge) {
		set("charge", charge);
	}

	public java.math.BigDecimal getCharge() {
		return get("charge");
	}

	public void setCUid(java.lang.Long cUid) {
		set("c_uid", cUid);
	}

	public java.lang.Long getCUid() {
		return get("c_uid");
	}

	public void setGmtCreate(java.util.Date gmtCreate) {
		set("gmt_create", gmtCreate);
	}

	public java.util.Date getGmtCreate() {
		return get("gmt_create");
	}

	public void setGmtModified(java.util.Date gmtModified) {
		set("gmt_modified", gmtModified);
	}

	public java.util.Date getGmtModified() {
		return get("gmt_modified");
	}

}