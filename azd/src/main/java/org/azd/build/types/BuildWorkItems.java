package org.azd.build.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BuildWorkItems {
    @JsonProperty("value")
    private List<BuildWorkItem> value;

    public List<BuildWorkItem> getBuildWorkItems() {
        return value;
    }

    public void setBuildWorkItems(List<BuildWorkItem> value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "BuildWorkItems{" +
                "value=" + value +
                '}';
    }

}
