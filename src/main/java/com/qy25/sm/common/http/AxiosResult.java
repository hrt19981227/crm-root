package com.qy25.sm.common.http;

import com.fasterxml.jackson.annotation.JsonInclude;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
import lombok.Data;

@Data
//转json的时候只转值不为null的
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AxiosResult<T> {
    private int status;
    private String message;
    private T data;


    private AxiosResult() {

    }

    /**
     * 成功返回的方法
     *
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success() {
        return setData(AxiosStatus.OK, null);
    }

    /**
     * 成功返回带数据
     */
    public static <T> AxiosResult<T> success(T data) {
        return setData(AxiosStatus.OK, data);
    }

    /**
     * 成功返回自定义状态码
     */
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus) {
        return setData(axiosStatus, null);
    }

    /**
     * 成功返回自定义状态码带数据
     */
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus, T data) {
        return setData(axiosStatus, data);
    }

    /**
     * 错误返回
     *
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error() {
        return setData(AxiosStatus.ERROR, null);
    }

    /**
     * 错误返回状态码
     *
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus) {
        return setData(axiosStatus, null);
    }

    /**
     * 错误返回数据
     *
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(T data) {
        return setData(AxiosStatus.ERROR, data);
    }

    /**
     * 错误返回数据加状态码
     *
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus, T data) {
        return setData(axiosStatus, data);
    }


    private static <T> AxiosResult<T> setData(AxiosStatus axiosStatus, T data) {
        AxiosResult<T> axiosResult = new AxiosResult<>();
        axiosResult.setData(data);
        axiosResult.setStatus(axiosStatus.getStatus());
        axiosResult.setMessage(axiosStatus.getMessage());
        return axiosResult;
    }
}
