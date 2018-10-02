update ACT_GE_PROPERTY set VALUE_ = '5.20.0.1' where NAME_ = 'schema.version';

select if (
	exists(
		select distinct index_name
        from information_schema.statistics
        where table_schema = 'activiti' and table_name = 'ACT_RU_JOB' 
              and index_name = 'IX_ACT_RU_JOB_EXECUTION_ID_'
    )
    , 'select ''index IX_ACT_RU_JOB_EXECUTION_ID_ exists'' _______;'
    , 'create index IX_ACT_RU_JOB_EXECUTION_ID_ on ACT_RU_JOB(EXECUTION_ID_)'
) into @a;

PREPARE stmt1 FROM @a;
EXECUTE stmt1;
DEALLOCATE PREPARE stmt1;
