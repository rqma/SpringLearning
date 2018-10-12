package com.adi.a_proxy_a_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * @Description:jdk动态代理
 * @Auther: Adi
 * @Date: 2018/10/4 13:52
 */
public class MyBeanFactory {

    public static UserService create() {
        //1.目标类
        final UserService userservice = new UserServiceImpl();
        //2.切面类
        final MyAspect myAspect = new MyAspect();
        /**
         * 3.代理类：将目标类与(切入点)切面类(通知)结合 -->切面
         * Proxy.newProxyInstance()
         * 参数1：loder,类加载器，动态戴代理类运行时创建，任何类都需要类加载器加载到内存
         *        一般情况：当前类.class.getClassLoader
         *                目标类实例.getclass.getClassLoader
         * 参数2：interfaces 代理类需要实现的所有接口
         *        方式一：目标类实例.getClass.getInterfaces() ；注意：只能获得自己接口，不能获得父元素接口
         *        方式二：new Class[]{UserService.class}
         *        例如： jdbc 驱动 -->DriverManger 获得接口Connection
         * 参数3：InvocationHandler 处理类，接口，必须进行实现类。一般采用匿名内部
         *        提供 invoke 方法，代理类的每一个方法执行时，都将调用invoke方法(仔细理解)
         *          参数31：Object proxy:代理对象
         *          参数32：Method method：代理对象当前执行的方法的描述对象 (反射)
         *                 执行方法名：method.getName()
         *                 执行方法：method.invoke(对象，实际参数)
         *          参数33：Object[] args 方法实际参数
         *
         */
        UserService proxyService = (UserService) Proxy.newProxyInstance(MyBeanFactory.class.getClassLoader(), userservice.getClass().getInterfaces(),
                new InvocationHandler() {

                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        myAspect.before();
                        Object object=method.invoke(userservice,args);
                        myAspect.after();
                        return object;
                    }
                });

        return proxyService;
    }
}
