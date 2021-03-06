package com.alibaba.datax.plugin.writer.rediswriter;
import com.alibaba.datax.common.spi.ErrorCode;


public enum RedisError implements ErrorCode {

	REQUIRED_VALUE("RedisWriterError-01", "error necessery config item required value."),
	INVALID_ADDRESS("RedisWriterError-02","error config item:redis address."),
	INVALID_CLUSTERMODE("RedisWriterError-03","error config item:redis cluster-mode"),
	INVALID_VALUEMODE("RedisWriterError-04","error config item:redis value-mode"),
	INVALID_WRITEMODE("RedisWriterError-05","error config item:redis write-mode"),
		
	ILLEGAL_WRITEVPRARM("RedisWriterError-11","redis write task param check fail"),
	ILLEGAL_ADDRESS("RedisWriterError-12","error config item:redis address"),
	ILLEGAL_PEERCOLUMN("RedisWriterError-13","redis writer peer plugin colums item required value。"),
	COLUMN_NOT_CONTAINS("RedisWriterError-14","redis writer key-colums is not one ofthe peer-plugin-column。"),
	UNSUPPORT_PEER_PLUGIN("RedisWriterError-15","redis unsupported peer plugin"),
	COLUMN_CONVERT("RedisWriterError-16","redis key/value columns convert error"),
	COLUMN_VALUE_IS_NULL("RedisWriterError-17","redis key/value columns value is null"),
	ILLEGAL_PIPE_BATCHSIZE("RedisWriterError-18","redis pipeline batch size is illegal"),
	INVALID_ZKPROXY("RedisWriterError-19","zkproxy is illegal"),
	
	JEDIS_CONNECT_TIMEOUT("RedisWriterError-70","jedis client connect time out"),
	JEDIS_UNKOWN("RedisWriterError-71","jedis unkown error"),
	JODIS_POOLINIT_FAIL("RedisWriterError-72","jodis roundrobin pool inital failed"),
	JODIS_POOLJEDISGET_FAIL("RedisWriterError-73","get jedis instance from  jodis roundrobin pool failed"),
	JEDIS_CLUSTER_PIPESYNC_FAIL("RedisWriterError-74","jedis cluster pipeline sync failed"),
	JEDIS_PIPESYNC_FAIL("RedisWriterError-75","jedis pipeline sync failed"),
	
	SPLIT_ERROR("RedisWriterError-80","redis job split exception"),
	WRITE_ERROR("RedisWriterError-81","redis task write exception"),
    UNKNOWN("RedisWriterError-99","plugin inner exception/unknown exception");
	
	
    private final String code;
    private final String description;

    private RedisError(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return String.format("Code:[%s], Description:[%s]. ", this.code,
                this.description);
    }
}
