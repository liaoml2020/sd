package com.sd365.common.core.common.exception.code;

/**
 * @file: sd365-common-common-g05 com.sd365.common.core.common.exception.code
 * @author: abel.zhan
 * @date: 2021/07/24 14:48
 * @copyright: 2020-2023 www.bosssoft.com.cn Inc. All rights reserved.
 */
/**
 * @class IErrorCode
 * @classdesc 所有的模块的异常类型的的父接口该类将会具体的模块的编码枚举实现，枚举类将注入
 * 特定的异常类 如 BusinessException(IModuleCode,IErrorCode,message,ex)
 * @author Administrator
 * @date 2021-7-24  22:34
 * @version 1.0.0
 * @see
 * @since
 */
public interface IErrorTypeCode {
    /**
     * @return 取得枚举中的模块编码
     */
    String getCode();
    /**
     *
     * @return  取得枚举中的模块说明也就是 消息
     */
    String getMessage();

    /**
     *  访问数据库使用数据库返回错误码所以需要提供该接口赋值
     * @param code 外部应用生成的错误码 例如mysql数据库错误码
     */
    void setCode(String code);

    /**
     * 访问数据库使用数据库返回消息或者定义的所以需要提供该接口赋值
     * @param message
     */
    void setMessage(String message);


}
