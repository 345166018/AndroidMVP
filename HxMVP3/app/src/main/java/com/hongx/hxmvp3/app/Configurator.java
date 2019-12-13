package com.hongx.hxmvp3.app;

import java.util.HashMap;

/**
 * @author: fuchenming
 * @create: 2019-09-17 13:29
 */

/**
 * 配置器
 */
public class Configurator {

    //用来保存各种配置信息
    private static final HashMap<Object, Object> CONFIGS = new HashMap<>();

    //单例 begin
    //静态内部类的Holder实现方式
    //java并发实战中推的方法
    private static class Holder {
        private static final Configurator INSTANCE = new Configurator();
    }

    private Configurator() {
        //默认是false，配置信息不可用
        CONFIGS.put(ConfigKeys.CONFIG_READY.name(), false);
    }

    public static Configurator getInstance() {
        return Holder.INSTANCE;
    }
    //单例end
    //注：
    // 单例如果不考虑并发问题，可以使用饿汉或者懒汉；
    // 如果考虑并发问题，可以使用双重锁或者静态内部类。如果带参就使用双重锁，如果不带参就使用静态内部类。

    //获取配置信息
    final HashMap<Object, Object> getConfigs() {
        return CONFIGS;
    }

    //配置APIHOST
    public final Configurator withApiHost(String host) {
        CONFIGS.put(ConfigKeys.API_HOST, host);
        return this;
    }

    //配置完成
    public final void configure() {
        CONFIGS.put(ConfigKeys.CONFIG_READY.name(), true);
    }

    //检查配置是否完成
    private void checkConfiguration() {
        final boolean isReady = (boolean) CONFIGS.get(ConfigKeys.CONFIG_READY.name());
        if (!isReady) {
            throw new RuntimeException("Configuration is not ready,call configure()");
        }
    }

    final <T> T getConfiguration(Object key) {
        checkConfiguration();
        final Object value = CONFIGS.get(key);
        if (value == null) {
            throw new NullPointerException(key.toString() + "IS NULL");
        }
        return (T) value;
    }

}
