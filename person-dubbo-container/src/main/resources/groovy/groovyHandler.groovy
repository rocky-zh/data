import com.alibaba.dubbo.rpc.service.GenericException
import com.alibaba.dubbo.rpc.service.GenericService

//@GrabResolver(name='aliyun', root='http://maven.aliyun.com/nexus/content/groups/public/')
//@GrabResolver(name='dev-nexus', root='http://maven.dev.pagoda.com.cn:10008/nexus/content/groups/public')
//@Grapes([
//        @Grab('commons-io:commons-io:2.6'),
//        @Grab(group='org.eclipse.jetty.aggregate', module='jetty-server', version='8.1.7.v20120910')
//])
//import org.apache.commons.io.FileUtils
//import org.eclipse.jetty.server.Server

/**
 * groovy 默认处理，没有找到匹配的groovy文件时调用
 */
class groovyHandler implements GenericService {

    @Override
    Object $invoke(String method, String[] parameterTypes, Object[] args) throws GenericException {
        return "reply from groovyHandler " + method + " " +  args[0];
    }
}