package chapter22.bridge;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @description 手机软甲抽象类
 */
public abstract class HandsetSoft {

    private String name;

    /**
     * @description 运行对应软件
     */
    public abstract void run();


    protected HandsetSoft(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof HandsetSoft)) return false;

        HandsetSoft that = (HandsetSoft) o;

        return new EqualsBuilder()
                .append(name, that.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(name)
                .toHashCode();
    }
}

