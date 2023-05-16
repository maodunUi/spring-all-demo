package cn.maodun.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author DELL
 * @date 2023/5/16
 */
@ConfigurationProperties("hello")
public class HelloProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
