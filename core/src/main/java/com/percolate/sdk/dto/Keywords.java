package com.percolate.sdk.dto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Keywords implements Serializable {

    private static final long serialVersionUID = 6882567642837188994L;

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("keyword")
    protected String keyword;

    @JsonProperty("total_occurences")
    protected Integer totalOccurences;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getTotalOccurences() {
        return totalOccurences;
    }

    public void setTotalOccurences(Integer totalOccurences) {
        this.totalOccurences = totalOccurences;
    }


}