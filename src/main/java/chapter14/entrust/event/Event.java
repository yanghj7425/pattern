package chapter14.entrust.event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

public class Event {

    private Logger logger = Logger.getLogger(getClass().getSimpleName());

    //执行方法的对象
    private Object object;

    //执行的方法名
    private String methodName;

    //执行方法参数
    private Object[] params;

    //执行方法参数类型
    private Class[] paramType;

    public Event(Object object, String methodName, Object... params) {
        this.object = object;

        this.methodName = methodName;

        this.params = params;

        constructParamType(params);
    }

    private void constructParamType(Object[] params) {
        this.paramType = new Class[params.length];

        for (int i = 0; i < params.length; i++) {
            this.paramType[i] = params[i].getClass();
            System.out.println(params[i].getClass().getSimpleName());
        }
    }


    public void invoke() {
        try {

            Method invokeMethod = getObject().getClass().getMethod(getMethodName(), getParamType());
            invokeMethod.invoke(getObject(), getParams());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class[] getParamType() {
        return paramType;
    }

    public void setParamType(Class[] paramType) {
        this.paramType = paramType;
    }
}
