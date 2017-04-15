package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询企业，以及基于关联关系拓展的企业和个人的失信情况
 *
 * @author auto create
 * @since 1.0, 2016-10-21 14:31:01
 */
public class SsdataDataserviceInfoAtlasnegQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8543113687788228576L;

	/**
	 * 填写法人,任职,投资,股权，如"法人,投资"就是以给定节点查找这两种关联关系的节点，以英文逗号作为分隔符
	 */
	@ApiField("edges")
	private String edges;

	/**
	 * 企业中文名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 从给定的节点向外扩展的企业层数，比如，2，就代表从给定的企业名称找2度关联的企业
	 */
	@ApiField("step")
	private String step;

	public String getEdges() {
		return this.edges;
	}
	public void setEdges(String edges) {
		this.edges = edges;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getStep() {
		return this.step;
	}
	public void setStep(String step) {
		this.step = step;
	}

}
