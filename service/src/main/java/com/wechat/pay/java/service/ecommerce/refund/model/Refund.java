// Copyright 2021 Tencent Inc. All rights reserved.
//
// 电商退款API
//
// 境内电商退款功能相关API文档
//
// API version: 1.1.8

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.ecommerce.refund.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/** Refund */
public class Refund {
  /** 微信支付退款订单号 说明：微信支付退款订单订单号 */
  @SerializedName("refund_id")
  private String refundId;
  /** 商户退款单号 说明：商户系统内部的退款单号，商户系统内部唯一，只能是数字、大小写字母_-|*@ ，同一退款单号多次请求只退一笔。 */
  @SerializedName("out_refund_no")
  private String outRefundNo;
  /** 微信支付交易订单号 说明：微信支付交易订单号 */
  @SerializedName("transaction_id")
  private String transactionId;
  /** 商户原交易订单号 说明：返回的原交易订单号 */
  @SerializedName("out_trade_no")
  private String outTradeNo;
  /**
   * 退款渠道 说明：ORIGINAL—原路退款 BALANCE—退回到余额 OTHER_BALANCE—原账户异常退到其他余额账户 OTHER_BANKCARD—原银行卡异常退到其他银行卡
   */
  @SerializedName("channel")
  private String channel;
  /**
   * 退款入账账户 说明：取当前退款单的退款入账方 1）退回银行卡： {银行名称}{卡类型}{卡尾号} 2）退回支付用户零钱: 支付用户零钱 3）退还商户: 商户基本账户 商户结算银行账户
   * 4）退回支付用户零钱通: 支付用户零钱通
   */
  @SerializedName("user_received_account")
  private String userReceivedAccount;
  /**
   * 退款成功时间
   * 说明：退款成功时间，退款状态status为SUCCESS（退款成功）时，返回该字段。遵循rfc3339标准格式，格式为YYYY-MM-DDTHH:mm:ss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC
   * 8小时，即北京时间）。例如：2015-05-20T13:29:35+08:00表示，北京时间2015年5月20日13点29分35秒。
   */
  @SerializedName("success_time")
  private String successTime;
  /**
   * 退款创建时间
   * 说明：退款受理时间，遵循rfc3339标准格式，格式为YYYY-MM-DDTHH:mm:ss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC
   * 8小时，即北京时间）。例如：2015-05-20T13:29:35+08:00表示，北京时间2015年5月20日13点29分35秒。
   */
  @SerializedName("create_time")
  private String createTime;
  /**
   * 退款状态 说明：退款状态： SUCCESS—退款成功 CLOSED—退款关闭。 PROCESSING—退款处理中
   * ABNORMAL—退款异常，退款到银行发现用户的卡作废或者冻结了，导致原路退款银行卡失败，可前往商户平台（pay.weixin.qq.com）-交易中心，手动处理此笔退款。
   */
  @SerializedName("status")
  private String status;
  /** 退款金额 说明：退款金额信息 */
  @SerializedName("amount")
  private RefundAmount amount;
  /** 营销详情 说明：优惠退款信息 */
  @SerializedName("promotion_detail")
  private List<PromotionDetail> promotionDetail;
  /**
   * 退款出资商户 说明：REFUND_SOURCE_PARTNER_ADVANCE : 电商平台垫付 REFUND_SOURCE_SUB_MERCHANT : 二级商户，默认值
   * 注意：申请退款时可能会出现暂未扣除退款资金的情况，此时不返回本字段，需继续查单确认。
   */
  @SerializedName("refund_account")
  private String refundAccount;
  /**
   * 资金账户 说明：UNSETTLED : 未结算资金 AVAILABLE : 可用余额 UNAVAILABLE : 不可用余额 OPERATION : 运营户 BASIC :
   * 基本账户（含可用余额和不可用余额） ECNY_BASIC : 数字人民币基本账户
   */
  @SerializedName("funds_account")
  private String fundsAccount;

  public String getRefundId() {
    return refundId;
  }

  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }

  public String getOutRefundNo() {
    return outRefundNo;
  }

  public void setOutRefundNo(String outRefundNo) {
    this.outRefundNo = outRefundNo;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public String getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }

  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public String getUserReceivedAccount() {
    return userReceivedAccount;
  }

  public void setUserReceivedAccount(String userReceivedAccount) {
    this.userReceivedAccount = userReceivedAccount;
  }

  public String getSuccessTime() {
    return successTime;
  }

  public void setSuccessTime(String successTime) {
    this.successTime = successTime;
  }

  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public RefundAmount getAmount() {
    return amount;
  }

  public void setAmount(RefundAmount amount) {
    this.amount = amount;
  }

  public List<PromotionDetail> getPromotionDetail() {
    return promotionDetail;
  }

  public void setPromotionDetail(List<PromotionDetail> promotionDetail) {
    this.promotionDetail = promotionDetail;
  }

  public String getRefundAccount() {
    return refundAccount;
  }

  public void setRefundAccount(String refundAccount) {
    this.refundAccount = refundAccount;
  }

  public String getFundsAccount() {
    return fundsAccount;
  }

  public void setFundsAccount(String fundsAccount) {
    this.fundsAccount = fundsAccount;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Refund {\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    outRefundNo: ").append(toIndentedString(outRefundNo)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    userReceivedAccount: ")
        .append(toIndentedString(userReceivedAccount))
        .append("\n");
    sb.append("    successTime: ").append(toIndentedString(successTime)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    promotionDetail: ").append(toIndentedString(promotionDetail)).append("\n");
    sb.append("    refundAccount: ").append(toIndentedString(refundAccount)).append("\n");
    sb.append("    fundsAccount: ").append(toIndentedString(fundsAccount)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
