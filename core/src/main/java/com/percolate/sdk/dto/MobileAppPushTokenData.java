package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MobileAppPushTokenData implements Serializable {

    private static final long serialVersionUID = 6489210695336096464L;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("user_id")
    protected String userUID;

    @JsonProperty("token")
    protected String token;

    @JsonProperty("push_platform")
    protected String pushPlatform;

    @JsonProperty("bundle_identifier")
    protected String bundleIdentifier;

    @JsonProperty("is_active")
    protected Boolean active;

    @JsonProperty("arn")
    protected String arn;

    @JsonProperty("mobile_app_arn")
    protected String mobileAppArn;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArn() {
        return arn;
    }

    public void setArn(String arn) {
        this.arn = arn;
    }

    public String getPushPlatform() {
        return pushPlatform;
    }

    public void setPushPlatform(String pushPlatform) {
        this.pushPlatform = pushPlatform;
    }

    public String getBundleIdentifier() {
        return bundleIdentifier;
    }

    public void setBundleIdentifier(String bundleIdentifier) {
        this.bundleIdentifier = bundleIdentifier;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserUID() {
        return userUID;
    }

    public void setUserUID(String userUID) {
        this.userUID = userUID;
    }

    public String getMobileAppArn() {
        return mobileAppArn;
    }

    public void setMobileAppArn(String mobileAppArn) {
        this.mobileAppArn = mobileAppArn;
    }
}