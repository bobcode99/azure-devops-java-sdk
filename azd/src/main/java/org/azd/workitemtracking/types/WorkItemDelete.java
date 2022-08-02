package org.azd.workitemtracking.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * Full deleted work item object
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkItemDelete {
    /***
     * Work item ID.
     */
    @JsonProperty("id")
    private int id;
    /***
     * Type of work item.
     */
    @JsonProperty("type")
    private String type;
    /***
     * Name or title of the work item.
     */
    @JsonProperty("name")
    private String name;
    /***
     * Parent project of the deleted work item.
     */
    @JsonProperty("project")
    private String project;
    /**
     * The work item object that was deleted.
     */
    @JsonProperty("resource")
    private WorkItem resource;
    /***
     * The work item deletion date.
     */
    @JsonProperty("deletedDate")
    private String deletedDate;
    /***
     * The user who deleted the work item type.
     */
    @JsonProperty("deletedBy")
    private String deletedBy;
    /***
     * The HTTP status code for work item operation in a batch request.
     */
    @JsonProperty("code")
    private int code;
    /***
     * REST API URL of the resource
     */
    @JsonProperty("url")
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(String deletedDate) {
        this.deletedDate = deletedDate;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "WorkItemDelete{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", project='" + project + '\'' +
                ", deletedDate='" + deletedDate + '\'' +
                ", deletedBy='" + deletedBy + '\'' +
                ", code=" + code +
                ", url='" + url + '\'' +
                '}';
    }
}
