// Copyright 2021 Tencent Inc. All rights reserved.
//
// 微信支付分停车服务
//
// 微信支付分停车服务 扣费API
//
// API version: 1.2.1

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.wexinpayscoreparking.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** PromotionDetail */
public class PromotionDetail {
  /** 券ID 说明：券或者立减优惠id */
  @SerializedName("coupon_id")
  private String couponId;
  /** 优惠名称 说明：优惠名称 */
  @SerializedName("name")
  private String name;
  /** 优惠范围 说明：GLOBAL-全场代金券， SINGLE-单品优惠 */
  @SerializedName("scope")
  private String scope;
  /** 优惠类型 说明：枚举值： CASH：充值型代金券 NOCASH：免充值型代金券 */
  @SerializedName("type")
  private String type;
  /** 活动ID 说明：在微信商户后台配置的批次ID */
  @SerializedName("stock_id")
  private String stockId;
  /** 优惠券面额 说明：用户享受优惠的金额 */
  @SerializedName("amount")
  private Long amount;
  /** 微信出资 说明：特指由微信支付商户平台创建的优惠，出资金额等于本项优惠总金额，单位为分 */
  @SerializedName("wechatpay_contribute")
  private Long wechatpayContribute;
  /** 商户出资 说明：特指商户自己创建的优惠，出资金额等于本项优惠总金额，单位为分 */
  @SerializedName("merchant_contribute")
  private Long merchantContribute;
  /** 其他出资 说明：其他出资方出资金额，单位为分 */
  @SerializedName("other_contribute")
  private Long otherContribute;
  /** 优惠币种 说明：CNY：人民币，境内商户号仅支持人民币。 */
  @SerializedName("currency")
  private String currency;

  public String getCouponId() {
    return couponId;
  }

  public void setCouponId(String couponId) {
    this.couponId = couponId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getStockId() {
    return stockId;
  }

  public void setStockId(String stockId) {
    this.stockId = stockId;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Long getWechatpayContribute() {
    return wechatpayContribute;
  }

  public void setWechatpayContribute(Long wechatpayContribute) {
    this.wechatpayContribute = wechatpayContribute;
  }

  public Long getMerchantContribute() {
    return merchantContribute;
  }

  public void setMerchantContribute(Long merchantContribute) {
    this.merchantContribute = merchantContribute;
  }

  public Long getOtherContribute() {
    return otherContribute;
  }

  public void setOtherContribute(Long otherContribute) {
    this.otherContribute = otherContribute;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionDetail {\n");
    sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    stockId: ").append(toIndentedString(stockId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    wechatpayContribute: ")
        .append(toIndentedString(wechatpayContribute))
        .append("\n");
    sb.append("    merchantContribute: ").append(toIndentedString(merchantContribute)).append("\n");
    sb.append("    otherContribute: ").append(toIndentedString(otherContribute)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
