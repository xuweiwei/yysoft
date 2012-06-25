package net.caiban.domain.product;

import java.util.Date;

/**
 * ProductImage generated by MyEclipse Persistence Tools
 */

public class ProductImage implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer productId;
	private String filename;
	private String filetype;
	private String filepath;
	private String remark;
	private Date gmtcreate;
	private Integer uid;
	private Integer eid;

	// Constructors

	/** default constructor */
	public ProductImage() {
	}

	/** minimal constructor */
	public ProductImage(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public ProductImage(Integer id, Integer productId, String filename,
			String filetype, String filepath, String remark, Date gmtcreate,
			Integer uid, Integer eid) {
		this.id = id;
		this.productId = productId;
		this.filename = filename;
		this.filetype = filetype;
		this.filepath = filepath;
		this.remark = remark;
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

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFiletype() {
		return this.filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public String getFilepath() {
		return this.filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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