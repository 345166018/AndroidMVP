package com.hongx.isolation_processor.httpprocessor;

import android.util.Log;

import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 回调接口的json版本的实现类
 * 用于把网络返回的json字符串转让换成对象(Result就是用户接收数据的类型)
 * //ResponceData就是Result
 */
public abstract class HttpCallback<Result> implements ICallback {
    @Override
    public void onSuccess(String result) {//result就是网络回来的数据

        Log.i("hongxue", "result = " + result);

        //result把转换成用户需要的对象
        Gson gson=new Gson();
        //需要得到用户输入的对象对应的字节码是什么样的
        //得到用户接收数据的对象对应的class
        Class<?> clz=analysisClassInfo(this);

        Result objResult=(Result)gson.fromJson(result,clz);

        //把已经转好的对象,交给用户
        onSuccess(objResult);
    }

    public abstract void onSuccess(Result result);

    private Class<?> analysisClassInfo(Object object) {
        //getGenericSuperclass可以得到包含原始类型,参数化类型,数组,类型变量,基本数据
        Type genType=object.getClass().getGenericSuperclass();
        //获取参数化类型
        Type[] params=((ParameterizedType)genType).getActualTypeArguments();
        return (Class<?>)params[0];
    }

    @Override
    public void onFailure(String e) {

    }
}
