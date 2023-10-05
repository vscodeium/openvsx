/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq;


import org.eclipse.openvsx.jooq.tables.AdminStatistics;
import org.eclipse.openvsx.jooq.tables.Extension;
import org.eclipse.openvsx.jooq.tables.ExtensionReview;
import org.eclipse.openvsx.jooq.tables.ExtensionVersion;
import org.eclipse.openvsx.jooq.tables.FileResource;
import org.eclipse.openvsx.jooq.tables.FlywaySchemaHistory;
import org.eclipse.openvsx.jooq.tables.JobrunrBackgroundjobservers;
import org.eclipse.openvsx.jooq.tables.JobrunrJobs;
import org.eclipse.openvsx.jooq.tables.JobrunrRecurringJobs;
import org.eclipse.openvsx.jooq.tables.NamespaceMembership;
import org.eclipse.openvsx.jooq.tables.PersistedLog;
import org.eclipse.openvsx.jooq.tables.SpringSession;
import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index EXTENSION__NAMESPACE_ID__IDX = Internal.createIndex(DSL.name("extension__namespace_id__idx"), Extension.EXTENSION, new OrderField[] { Extension.EXTENSION.NAMESPACE_ID }, false);
    public static final Index EXTENSION_REVIEW__EXTENSION_ID__IDX = Internal.createIndex(DSL.name("extension_review__extension_id__idx"), ExtensionReview.EXTENSION_REVIEW, new OrderField[] { ExtensionReview.EXTENSION_REVIEW.EXTENSION_ID }, false);
    public static final Index EXTENSION_REVIEW__USER_ID__IDX = Internal.createIndex(DSL.name("extension_review__user_id__idx"), ExtensionReview.EXTENSION_REVIEW, new OrderField[] { ExtensionReview.EXTENSION_REVIEW.USER_ID }, false);
    public static final Index EXTENSION_VERSION__EXTENSION_ID__IDX = Internal.createIndex(DSL.name("extension_version__extension_id__idx"), ExtensionVersion.EXTENSION_VERSION, new OrderField[] { ExtensionVersion.EXTENSION_VERSION.EXTENSION_ID }, false);
    public static final Index EXTENSION_VERSION__PUBLISHED_WITH_ID__IDX = Internal.createIndex(DSL.name("extension_version__published_with_id__idx"), ExtensionVersion.EXTENSION_VERSION, new OrderField[] { ExtensionVersion.EXTENSION_VERSION.PUBLISHED_WITH_ID }, false);
    public static final Index EXTENSION_VERSION_BY_TARGET_PLATFORM_ORDER_BY_IDX = Internal.createIndex(DSL.name("extension_version_by_target_platform_order_by_idx"), ExtensionVersion.EXTENSION_VERSION, new OrderField[] { ExtensionVersion.EXTENSION_VERSION.EXTENSION_ID, ExtensionVersion.EXTENSION_VERSION.UNIVERSAL_TARGET_PLATFORM.desc(), ExtensionVersion.EXTENSION_VERSION.TARGET_PLATFORM, ExtensionVersion.EXTENSION_VERSION.SEMVER_MAJOR.desc(), ExtensionVersion.EXTENSION_VERSION.SEMVER_MINOR.desc(), ExtensionVersion.EXTENSION_VERSION.SEMVER_PATCH.desc(), ExtensionVersion.EXTENSION_VERSION.SEMVER_IS_PRE_RELEASE, ExtensionVersion.EXTENSION_VERSION.TIMESTAMP.desc() }, false);
    public static final Index EXTENSION_VERSION_LATEST_ORDER_BY_IDX = Internal.createIndex(DSL.name("extension_version_latest_order_by_idx"), ExtensionVersion.EXTENSION_VERSION, new OrderField[] { ExtensionVersion.EXTENSION_VERSION.EXTENSION_ID, ExtensionVersion.EXTENSION_VERSION.SEMVER_MAJOR.desc(), ExtensionVersion.EXTENSION_VERSION.SEMVER_MINOR.desc(), ExtensionVersion.EXTENSION_VERSION.SEMVER_PATCH.desc(), ExtensionVersion.EXTENSION_VERSION.SEMVER_IS_PRE_RELEASE, ExtensionVersion.EXTENSION_VERSION.UNIVERSAL_TARGET_PLATFORM.desc(), ExtensionVersion.EXTENSION_VERSION.TARGET_PLATFORM, ExtensionVersion.EXTENSION_VERSION.TIMESTAMP.desc() }, false);
    public static final Index EXTENSION_VERSION_ORDER_BY_IDX = Internal.createIndex(DSL.name("extension_version_order_by_idx"), ExtensionVersion.EXTENSION_VERSION, new OrderField[] { ExtensionVersion.EXTENSION_VERSION.SEMVER_MAJOR.desc(), ExtensionVersion.EXTENSION_VERSION.SEMVER_MINOR.desc(), ExtensionVersion.EXTENSION_VERSION.SEMVER_PATCH.desc(), ExtensionVersion.EXTENSION_VERSION.SEMVER_IS_PRE_RELEASE, ExtensionVersion.EXTENSION_VERSION.UNIVERSAL_TARGET_PLATFORM.desc(), ExtensionVersion.EXTENSION_VERSION.TARGET_PLATFORM, ExtensionVersion.EXTENSION_VERSION.TIMESTAMP.desc() }, false);
    public static final Index EXTENSION_VERSION_VERSION_LIST_ORDER_BY_IDX = Internal.createIndex(DSL.name("extension_version_version_list_order_by_idx"), ExtensionVersion.EXTENSION_VERSION, new OrderField[] { ExtensionVersion.EXTENSION_VERSION.SEMVER_MAJOR.desc(), ExtensionVersion.EXTENSION_VERSION.SEMVER_MINOR.desc(), ExtensionVersion.EXTENSION_VERSION.SEMVER_PATCH.desc(), ExtensionVersion.EXTENSION_VERSION.SEMVER_IS_PRE_RELEASE, ExtensionVersion.EXTENSION_VERSION.VERSION }, false);
    public static final Index EXTENSION_VERSION_VERSION_MAP_ORDER_BY_IDX = Internal.createIndex(DSL.name("extension_version_version_map_order_by_idx"), ExtensionVersion.EXTENSION_VERSION, new OrderField[] { ExtensionVersion.EXTENSION_VERSION.EXTENSION_ID, ExtensionVersion.EXTENSION_VERSION.SEMVER_MAJOR.desc(), ExtensionVersion.EXTENSION_VERSION.SEMVER_MINOR.desc(), ExtensionVersion.EXTENSION_VERSION.SEMVER_PATCH.desc(), ExtensionVersion.EXTENSION_VERSION.SEMVER_IS_PRE_RELEASE, ExtensionVersion.EXTENSION_VERSION.VERSION }, false);
    public static final Index FILE_RESOURCE_EXTENSION_IDX = Internal.createIndex(DSL.name("file_resource_extension_idx"), FileResource.FILE_RESOURCE, new OrderField[] { FileResource.FILE_RESOURCE.EXTENSION_ID }, false);
    public static final Index FILE_RESOURCE_TYPE_IDX = Internal.createIndex(DSL.name("file_resource_type_idx"), FileResource.FILE_RESOURCE, new OrderField[] { FileResource.FILE_RESOURCE.TYPE }, false);
    public static final Index FLYWAY_SCHEMA_HISTORY_S_IDX = Internal.createIndex(DSL.name("flyway_schema_history_s_idx"), FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, new OrderField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SUCCESS }, false);
    public static final Index JOBRUNR_BGJOBSRVRS_FSTHB_IDX = Internal.createIndex(DSL.name("jobrunr_bgjobsrvrs_fsthb_idx"), JobrunrBackgroundjobservers.JOBRUNR_BACKGROUNDJOBSERVERS, new OrderField[] { JobrunrBackgroundjobservers.JOBRUNR_BACKGROUNDJOBSERVERS.FIRSTHEARTBEAT }, false);
    public static final Index JOBRUNR_BGJOBSRVRS_LSTHB_IDX = Internal.createIndex(DSL.name("jobrunr_bgjobsrvrs_lsthb_idx"), JobrunrBackgroundjobservers.JOBRUNR_BACKGROUNDJOBSERVERS, new OrderField[] { JobrunrBackgroundjobservers.JOBRUNR_BACKGROUNDJOBSERVERS.LASTHEARTBEAT }, false);
    public static final Index JOBRUNR_JOB_CREATED_AT_IDX = Internal.createIndex(DSL.name("jobrunr_job_created_at_idx"), JobrunrJobs.JOBRUNR_JOBS, new OrderField[] { JobrunrJobs.JOBRUNR_JOBS.CREATEDAT }, false);
    public static final Index JOBRUNR_JOB_RCI_IDX = Internal.createIndex(DSL.name("jobrunr_job_rci_idx"), JobrunrJobs.JOBRUNR_JOBS, new OrderField[] { JobrunrJobs.JOBRUNR_JOBS.RECURRINGJOBID }, false);
    public static final Index JOBRUNR_JOB_SCHEDULED_AT_IDX = Internal.createIndex(DSL.name("jobrunr_job_scheduled_at_idx"), JobrunrJobs.JOBRUNR_JOBS, new OrderField[] { JobrunrJobs.JOBRUNR_JOBS.SCHEDULEDAT }, false);
    public static final Index JOBRUNR_JOB_SIGNATURE_IDX = Internal.createIndex(DSL.name("jobrunr_job_signature_idx"), JobrunrJobs.JOBRUNR_JOBS, new OrderField[] { JobrunrJobs.JOBRUNR_JOBS.JOBSIGNATURE }, false);
    public static final Index JOBRUNR_JOBS_STATE_UPDATED_IDX = Internal.createIndex(DSL.name("jobrunr_jobs_state_updated_idx"), JobrunrJobs.JOBRUNR_JOBS, new OrderField[] { JobrunrJobs.JOBRUNR_JOBS.STATE, JobrunrJobs.JOBRUNR_JOBS.UPDATEDAT }, false);
    public static final Index JOBRUNR_RECURRING_JOB_CREATED_AT_IDX = Internal.createIndex(DSL.name("jobrunr_recurring_job_created_at_idx"), JobrunrRecurringJobs.JOBRUNR_RECURRING_JOBS, new OrderField[] { JobrunrRecurringJobs.JOBRUNR_RECURRING_JOBS.CREATEDAT }, false);
    public static final Index JOBRUNR_STATE_IDX = Internal.createIndex(DSL.name("jobrunr_state_idx"), JobrunrJobs.JOBRUNR_JOBS, new OrderField[] { JobrunrJobs.JOBRUNR_JOBS.STATE }, false);
    public static final Index NAMESPACE_MEMBERSHIP__NAMESPACE__IDX = Internal.createIndex(DSL.name("namespace_membership__namespace__idx"), NamespaceMembership.NAMESPACE_MEMBERSHIP, new OrderField[] { NamespaceMembership.NAMESPACE_MEMBERSHIP.NAMESPACE }, false);
    public static final Index NAMESPACE_MEMBERSHIP__USER_DATA__IDX = Internal.createIndex(DSL.name("namespace_membership__user_data__idx"), NamespaceMembership.NAMESPACE_MEMBERSHIP, new OrderField[] { NamespaceMembership.NAMESPACE_MEMBERSHIP.USER_DATA }, false);
    public static final Index PERSISTED_LOG__USER_DATA__IDX = Internal.createIndex(DSL.name("persisted_log__user_data__idx"), PersistedLog.PERSISTED_LOG, new OrderField[] { PersistedLog.PERSISTED_LOG.USER_DATA }, false);
    public static final Index SPRING_SESSION_IX1 = Internal.createIndex(DSL.name("spring_session_ix1"), SpringSession.SPRING_SESSION, new OrderField[] { SpringSession.SPRING_SESSION.SESSION_ID }, true);
    public static final Index SPRING_SESSION_IX2 = Internal.createIndex(DSL.name("spring_session_ix2"), SpringSession.SPRING_SESSION, new OrderField[] { SpringSession.SPRING_SESSION.EXPIRY_TIME }, false);
    public static final Index SPRING_SESSION_IX3 = Internal.createIndex(DSL.name("spring_session_ix3"), SpringSession.SPRING_SESSION, new OrderField[] { SpringSession.SPRING_SESSION.PRINCIPAL_NAME }, false);
    public static final Index UNIQUE_ADMIN_STATISTICS = Internal.createIndex(DSL.name("unique_admin_statistics"), AdminStatistics.ADMIN_STATISTICS, new OrderField[] { AdminStatistics.ADMIN_STATISTICS.YEAR, AdminStatistics.ADMIN_STATISTICS.MONTH }, true);
}
