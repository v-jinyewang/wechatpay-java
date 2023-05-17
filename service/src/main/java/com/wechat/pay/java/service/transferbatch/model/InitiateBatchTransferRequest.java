// Copyright 2021 Tencent Inc. All rights reserved.
//
// 商家转账对外API
//
// * 场景及业务流程：     商户可通过该产品实现同时向多个用户微信零钱进行转账的操作，可用于发放奖金补贴、佣金货款结算、员工报销等场景。
// [https://pay.weixin.qq.com/index.php/public/product/detail?pid=108&productType=0](https://pay.weixin.qq.com/index.php/public/product/detail?pid=108&productType=0) * 接入步骤：     * 商户在微信支付商户平台开通“批量转账到零钱”产品权限，并勾选“使用API方式发起转账”。     * 调用批量转账接口，对多个用户微信零钱发起转账。     * 调用查询批次接口，可获取到转账批次详情及当前状态。     * 调用查询明细接口，可获取到单条转账明细详情及当前状态。
//
// API version: 1.0.4

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.transferbatch.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;
import com.wechat.pay.java.core.cipher.Encryption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/** InitiateBatchTransferRequest */
public class InitiateBatchTransferRequest {
  /** 商户appid 说明：申请商户号的appid或商户号绑定的appid（企业号corpid即为此appid） */
  @SerializedName("appid")
  private String appid;
  /** 商家批次单号 说明：商户系统内部的商家批次单号，要求此参数只能由数字、大小写字母组成，在商户系统内部唯一 */
  @SerializedName("out_batch_no")
  private String outBatchNo;
  /** 批次名称 说明：该笔批量转账的名称 */
  @SerializedName("batch_name")
  private String batchName;
  /** 批次备注 说明：转账说明，UTF8编码，最多允许32个字符 */
  @SerializedName("batch_remark")
  private String batchRemark;
  /** 转账总金额 说明：转账金额单位为“分”。转账总金额必须与批次内所有明细转账金额之和保持一致，否则无法发起转账操作 */
  @SerializedName("total_amount")
  private Long totalAmount;
  /** 转账总笔数 说明：一个转账批次单最多发起一千笔转账。转账总笔数必须与批次内所有明细之和保持一致，否则无法发起转账操作 */
  @SerializedName("total_num")
  private Integer totalNum;
  /** 转账明细列表 说明：发起批量转账的明细列表，最多一千笔 */
  @Encryption
  @SerializedName("transfer_detail_list")
  private List<TransferDetailInput> transferDetailList = new ArrayList<TransferDetailInput>();
  /** 转账场景ID 说明：该批次转账使用的转账场景，如不填写则使用商家的默认场景，如无默认场景可为空，可前往“商家转账到零钱-前往功能”中申请。 如：1001-现金营销 */
  @SerializedName("transfer_scene_id")
  private String transferSceneId;

  public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }

  public String getOutBatchNo() {
    return outBatchNo;
  }

  public void setOutBatchNo(String outBatchNo) {
    this.outBatchNo = outBatchNo;
  }

  public String getBatchName() {
    return batchName;
  }

  public void setBatchName(String batchName) {
    this.batchName = batchName;
  }

  public String getBatchRemark() {
    return batchRemark;
  }

  public void setBatchRemark(String batchRemark) {
    this.batchRemark = batchRemark;
  }

  public Long getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Long totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Integer getTotalNum() {
    return totalNum;
  }

  public void setTotalNum(Integer totalNum) {
    this.totalNum = totalNum;
  }

  public List<TransferDetailInput> getTransferDetailList() {
    return transferDetailList;
  }

  public void setTransferDetailList(List<TransferDetailInput> transferDetailList) {
    this.transferDetailList = transferDetailList;
  }

  public String getTransferSceneId() {
    return transferSceneId;
  }

  public void setTransferSceneId(String transferSceneId) {
    this.transferSceneId = transferSceneId;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateBatchTransferRequest {\n");
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    outBatchNo: ").append(toIndentedString(outBatchNo)).append("\n");
    sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
    sb.append("    batchRemark: ").append(toIndentedString(batchRemark)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
    sb.append("    transferDetailList: ").append(toIndentedString(transferDetailList)).append("\n");
    sb.append("    transferSceneId: ").append(toIndentedString(transferSceneId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public InitiateBatchTransferRequest cloneWithCipher(UnaryOperator<String> s) {
    InitiateBatchTransferRequest copy = new InitiateBatchTransferRequest();
    copy.appid = appid;
    copy.outBatchNo = outBatchNo;
    copy.batchName = batchName;
    copy.batchRemark = batchRemark;
    copy.totalAmount = totalAmount;
    copy.totalNum = totalNum;
    if (transferDetailList != null && transferDetailList.size() != 0) {
      // arr
      copy.transferDetailList = new ArrayList<>();
      for (TransferDetailInput val : transferDetailList) {
        if (val != null) {
          copy.transferDetailList.add(val.cloneWithCipher(s));
        }
      }
    }
    copy.transferSceneId = transferSceneId;
    return copy;
  }
}
