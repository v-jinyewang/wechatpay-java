// Copyright 2021 Tencent Inc. All rights reserved.
//
// 境内普通商户退款API
//
// 境内普通商户退款功能涉及的API文档
//
// API version: 1.2.0

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.refund.model;

import com.google.gson.annotations.SerializedName;

/** AVAILABLE - 可用余额，多账户资金准备退款可用余额出资账户类型 UNAVAILABLE - 不可用余额，多账户资金准备退款不可用余额出资账户类型 */
public enum Account {
  @SerializedName("AVAILABLE")
  AVAILABLE,

  @SerializedName("UNAVAILABLE")
  UNAVAILABLE
}