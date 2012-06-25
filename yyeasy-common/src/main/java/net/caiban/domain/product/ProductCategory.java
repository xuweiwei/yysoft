package net.caiban.domain.product;

import java.util.Date;

/**
 * ProductCategory generated by MyEclipse Persistence Tools
 */

public class ProductCategory implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Integer parentId;
	private Integer l;
	private Integer r;
	private Short del;
	private Date gmtcreate;
	private Integer uid;
	private Integer eid;

	// Constructors

	/** default constructor */
	public ProductCategory() {
	}

	/** minimal constructor */
	public ProductCategory(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public ProductCategory(Integer id, String name, Integer parentId,
			Integer l, Integer r, Short del, Date gmtcreate, Integer uid,
			Integer eid) {
		this.id = id;
		this.name = name;
		this.parentId = parentId;
		this.l = l;
		this.r = r;
		this.del = del;
		this.gmtcreate = gmtcreate;
		this.uid = uid;
		this.eid = eid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getL() {
		return this.l;
	}

	public void setL(Integer l) {
		this.l = l;
	}

	public Integer getR() {
		return this.r;
	}

	public void setR(Integer r) {
		this.r = r;
	}

	public Short getDel() {
		return this.del;
	}

	public void setDel(Short del) {
		this.del = del;
	}

	public Date getGmtcreate() {
		return this.gmtcreate;
	}

	public void setGmtcreate(Date gmtcreate) {
		this.gmtcreate = gmtcreate;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

}