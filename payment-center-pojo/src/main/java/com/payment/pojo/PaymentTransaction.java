package com.payment.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author Heaven
 * @date 2024/9/19 12:03
 */
@Data
public class PaymentTransaction {

    /**
     * 主键
     */
    private String id;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建日期
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新日期
     */
    private Date updateTime;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 备注
     */
    private String note;

    /**
     * 支付渠道
     */
    private Integer paymentChannel;

    /**
     * 第三方平台交易流水
     */
    private String paymentPlantformTransId;

    /**
     * 第三方平台交易订单号
     */
    private String paymentPlantformOrderId;

    /**
     * 订单号，送给三方平台
     */
    private String orderId;

    /**
     * 交易流水号，送给三方平台，business_trans_type+14位时间+12位流水号
     */
    private String paymentTransId;

    /**
     * 父级交易流水号，顶级为0
     */
    private String pPaymentTransId;

    /**
     * 交易金额
     */
    private Double amount;

    /**
     * 交易状态，以三方平台回更为准
     */
    private Integer transStatus;

    /**
     * 业务流水号
     */
    private String businessTransId;

    /**
     * 业务流水子单号
     */
    private String businessTransDetailId;

    /**
     * 资金类目
     */
    private Integer amountType;

    /**
     * JSON字段，存储各类场景下交易的详细内容
     */
    private String transDetail;

    /**
     * 付款方 三方账户号
     */
    private String payerAccountNo;

    /**
     * 收款方 三方账户号
     */
    private String payeeAccountNo;

    /**
     * 付款方单位类型
     */
    private Integer payerType;

    /**
     * 付款方单位类型Id
     */
    private String payerId;

    /**
     * 收款方单位类型
     */
    private Integer payeeType;

    /**
     * 收款方单位id
     */
    private String payeeId;

    /**
     * 代发外部银行卡号
     */
    private String bankAcctno;

    /**
     * 对账状态 0：待对账 1：平账 2：未平帐 3：未匹配
     */
    private Boolean checkStatus;

    /**
     * 最近一次对账时间
     */
    private Date checkTime;

    /**
     * 对账备注
     */
    private String checkRemark;

    /**
     * 修正父级流水单号
     */
    private String correctTransId;

    /**
     * 修正方式 0：无需修正 1：新增指令不执行 2：重复执行指令 3：新增指令并执行
     */
    private Boolean correctType;

    /**
     * 指令回调状态 0：未响应或无需响应 1：成功响应
     */
    private Boolean callBackStatus;

    /**
     * 暂存-上一次交易流水号，流水号存在父子关系，暂存用于处理父子关系。在第三方支付平台无法进行对流水号对应的指令进行事件触发时，需要更新原流水号。
     */
    private String oldPaymentTransId;

    /**
     * 自动到账标识：0：否，1：是
     */
    private Integer autoTransferFlag;

    /**
     * 是否已开票（0-否，1-是）
     */
    private Boolean isInvoiced;

    /**
     * 付款方户名
     */
    private String payerAccountName;

    /**
     * 收款方户名
     */
    private String payeeAccountName;

    /**
     * 到卡手续费用承担者:0:商户 1:个人
     */
    private Integer toCardAmountUnderTake;

    /**
     * 发送给银行的流水号
     */
    private String thirdVoucher;
}
