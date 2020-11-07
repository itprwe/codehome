package com.ctrip.tour.testlink.dal.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by hbhu on 2018/8/30.
 */
@Entity
@Table(name = "cr", schema = "testlink", catalog = "")
public class CrEntity {
    private int id;
    private String crId;
    private String assignee;
    private String assigneeName;
    private String assigneeEmail;
    private String reporter;
    private String reporterName;
    private String reporterEmail;
    private String tester;
    private String originalSubmitter;
    private int status;
    private String statusDesc;
    private String summary;
    private Timestamp created;
    private Timestamp updated;
    private Timestamp resolutionTime;
    private Integer fixVersionId;
    private String fixVersionName;
    private Timestamp submitTestTime;
    private Timestamp dataChangeCreateTime;
    private Timestamp dataChangeLastTime;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "crId", nullable = false, length = 30)
    public String getCrId() {
        return crId;
    }

    public void setCrId(String crId) {
        this.crId = crId;
    }

    @Basic
    @Column(name = "assignee", nullable = true, length = 20)
    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    @Basic
    @Column(name = "assigneeName", nullable = true, length = 20)
    public String getAssigneeName() {
        return assigneeName;
    }

    public void setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName;
    }

    @Basic
    @Column(name = "assigneeEmail", nullable = true, length = 50)
    public String getAssigneeEmail() {
        return assigneeEmail;
    }

    public void setAssigneeEmail(String assigneeEmail) {
        this.assigneeEmail = assigneeEmail;
    }

    @Basic
    @Column(name = "reporter", nullable = true, length = 20)
    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    @Basic
    @Column(name = "reporterName", nullable = true, length = 20)
    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    @Basic
    @Column(name = "reporterEmail", nullable = true, length = 50)
    public String getReporterEmail() {
        return reporterEmail;
    }

    public void setReporterEmail(String reporterEmail) {
        this.reporterEmail = reporterEmail;
    }

    @Basic
    @Column(name = "tester", nullable = true, length = 20)
    public String getTester() {
        return tester;
    }

    public void setTester(String tester) {
        this.tester = tester;
    }

    @Basic
    @Column(name = "originalSubmitter", nullable = true, length = 100)
    public String getOriginalSubmitter() {
        return originalSubmitter;
    }

    public void setOriginalSubmitter(String originalSubmitter) {
        this.originalSubmitter = originalSubmitter;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "statusDesc", nullable = true, length = 10)
    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    @Basic
    @Column(name = "summary", nullable = true, length = 200)
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Basic
    @Column(name = "created", nullable = false)
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Basic
    @Column(name = "updated", nullable = false)
    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    @Basic
    @Column(name = "resolutionTime", nullable = true)
    public Timestamp getResolutionTime() {
        return resolutionTime;
    }

    public void setResolutionTime(Timestamp resolutionTime) {
        this.resolutionTime = resolutionTime;
    }

    @Basic
    @Column(name = "fixVersionId", nullable = true)
    public Integer getFixVersionId() {
        return fixVersionId;
    }

    public void setFixVersionId(Integer fixVersionId) {
        this.fixVersionId = fixVersionId;
    }

    @Basic
    @Column(name = "fixVersionName", nullable = true, length = 100)
    public String getFixVersionName() {
        return fixVersionName;
    }

    public void setFixVersionName(String fixVersionName) {
        this.fixVersionName = fixVersionName;
    }

    @Basic
    @Column(name = "submitTestTime", nullable = true)
    public Timestamp getSubmitTestTime() {
        return submitTestTime;
    }

    public void setSubmitTestTime(Timestamp submitTestTime) {
        this.submitTestTime = submitTestTime;
    }

    @Basic
    @Column(name = "DataChange_CreateTime", nullable = true)
    public Timestamp getDataChangeCreateTime() {
        return dataChangeCreateTime;
    }

    public void setDataChangeCreateTime(Timestamp dataChangeCreateTime) {
        this.dataChangeCreateTime = dataChangeCreateTime;
    }

    @Basic
    @Column(name = "DataChange_LastTime", nullable = true)
    public Timestamp getDataChangeLastTime() {
        return dataChangeLastTime;
    }

    public void setDataChangeLastTime(Timestamp dataChangeLastTime) {
        this.dataChangeLastTime = dataChangeLastTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CrEntity crEntity = (CrEntity) o;

        if (id != crEntity.id) return false;
        if (status != crEntity.status) return false;
        if (crId != null ? !crId.equals(crEntity.crId) : crEntity.crId != null) return false;
        if (assignee != null ? !assignee.equals(crEntity.assignee) : crEntity.assignee != null) return false;
        if (assigneeName != null ? !assigneeName.equals(crEntity.assigneeName) : crEntity.assigneeName != null)
            return false;
        if (assigneeEmail != null ? !assigneeEmail.equals(crEntity.assigneeEmail) : crEntity.assigneeEmail != null)
            return false;
        if (reporter != null ? !reporter.equals(crEntity.reporter) : crEntity.reporter != null) return false;
        if (reporterName != null ? !reporterName.equals(crEntity.reporterName) : crEntity.reporterName != null)
            return false;
        if (reporterEmail != null ? !reporterEmail.equals(crEntity.reporterEmail) : crEntity.reporterEmail != null)
            return false;
        if (tester != null ? !tester.equals(crEntity.tester) : crEntity.tester != null) return false;
        if (originalSubmitter != null ? !originalSubmitter.equals(crEntity.originalSubmitter) : crEntity.originalSubmitter != null)
            return false;
        if (statusDesc != null ? !statusDesc.equals(crEntity.statusDesc) : crEntity.statusDesc != null) return false;
        if (summary != null ? !summary.equals(crEntity.summary) : crEntity.summary != null) return false;
        if (created != null ? !created.equals(crEntity.created) : crEntity.created != null) return false;
        if (updated != null ? !updated.equals(crEntity.updated) : crEntity.updated != null) return false;
        if (resolutionTime != null ? !resolutionTime.equals(crEntity.resolutionTime) : crEntity.resolutionTime != null)
            return false;
        if (fixVersionId != null ? !fixVersionId.equals(crEntity.fixVersionId) : crEntity.fixVersionId != null)
            return false;
        if (fixVersionName != null ? !fixVersionName.equals(crEntity.fixVersionName) : crEntity.fixVersionName != null)
            return false;
        if (submitTestTime != null ? !submitTestTime.equals(crEntity.submitTestTime) : crEntity.submitTestTime != null)
            return false;
        if (dataChangeCreateTime != null ? !dataChangeCreateTime.equals(crEntity.dataChangeCreateTime) : crEntity.dataChangeCreateTime != null)
            return false;
        if (dataChangeLastTime != null ? !dataChangeLastTime.equals(crEntity.dataChangeLastTime) : crEntity.dataChangeLastTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (crId != null ? crId.hashCode() : 0);
        result = 31 * result + (assignee != null ? assignee.hashCode() : 0);
        result = 31 * result + (assigneeName != null ? assigneeName.hashCode() : 0);
        result = 31 * result + (assigneeEmail != null ? assigneeEmail.hashCode() : 0);
        result = 31 * result + (reporter != null ? reporter.hashCode() : 0);
        result = 31 * result + (reporterName != null ? reporterName.hashCode() : 0);
        result = 31 * result + (reporterEmail != null ? reporterEmail.hashCode() : 0);
        result = 31 * result + (tester != null ? tester.hashCode() : 0);
        result = 31 * result + (originalSubmitter != null ? originalSubmitter.hashCode() : 0);
        result = 31 * result + status;
        result = 31 * result + (statusDesc != null ? statusDesc.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        result = 31 * result + (resolutionTime != null ? resolutionTime.hashCode() : 0);
        result = 31 * result + (fixVersionId != null ? fixVersionId.hashCode() : 0);
        result = 31 * result + (fixVersionName != null ? fixVersionName.hashCode() : 0);
        result = 31 * result + (submitTestTime != null ? submitTestTime.hashCode() : 0);
        result = 31 * result + (dataChangeCreateTime != null ? dataChangeCreateTime.hashCode() : 0);
        result = 31 * result + (dataChangeLastTime != null ? dataChangeLastTime.hashCode() : 0);
        return result;
    }
}
