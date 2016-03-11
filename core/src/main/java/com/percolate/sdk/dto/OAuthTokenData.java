package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class OAuthTokenData implements Serializable {

    private static final long serialVersionUID = 6215034140127772622L;

    @JsonProperty("token_id")
    protected String tokenUID;

    @JsonProperty("license_token_id")
    protected String licenseTokenUID;

    @JsonProperty("scope_id")
    protected String scopeUID;

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getTokenUID() {
        return tokenUID;
    }

    public void setTokenUID(String tokenUID) {
        this.tokenUID = tokenUID;
    }

    public String getLicenseTokenUID() {
        return licenseTokenUID;
    }

    public void setLicenseTokenUID(String licenseTokenUID) {
        this.licenseTokenUID = licenseTokenUID;
    }

    public String getScopeUID() {
        return scopeUID;
    }

    public void setScopeUID(String scopeUID) {
        this.scopeUID = scopeUID;
    }

    public Map<String, Object> getExtraFields() {
        if(extraFields == null) {
            extraFields = new HashMap<>();
        }
        return extraFields;
    }

    @JsonAnySetter
    public void putExtraField(String key, Object value) {
        getExtraFields().put(key, value);
    }
}
