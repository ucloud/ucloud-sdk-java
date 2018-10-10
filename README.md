## ucloud-sdk-java
ucloud开发者工具套件（SDK）。<br>
面向UCloud的多个产品服务，目前包括：
- uhost
- udisk
- unet
- ulb
- vpc
- ufs

后续将支持更多的UCloud的产品服务。

### 使用准备
- 需要一个UCloud的账号以及一对PrivateKey、PublicKey[点此获取](https://console.ucloud.cn/uapi/apikey)
  
  说明：如果获取到的PublicKey中包含"/"，则需要重新获取。

### sdk获取
方式一、maven仓库（暂时无效）

方式二、官网下载（暂时无效）

### 快速开始
以使用“获取udisk信息”为例：

第一步、创建UdiskClient并实例化，默认实例化为DefaultUdiskClient

        在ucloud-sdk-java中，*Client都是sdk的客户端接口，通过*Client发起目标操作。并且，*Client都有一个已经
     实现的Default*Client。
        
        在实例化Default*Client时，设置*Config参数，*Config接受一个Account对象的实例化参数。在*Config可能会
     需要一些其他的必要参数，这个需要根据具体使用的Client确定。
    
            
第二步、创建DescribeUDiskParam并实例化，作为请求的参数对象
    
        在ucloud-sdk-java中，*Param对象都是请求的参数类。
        
        每个参数类中属性注释“require”代表参数为必要参数，“optional”代表参数为可选参数。
        
        *Param实例化时所需要的构造参数均为必要参数，当然，一些“Array”类型或者“对象”类型的参数并没有出现构造参数中，
     对于这样的必要参数，你需要通过set方法设置，如果缺少了这些必要参数，sdk将抛出“ValidationException”，并且在
     异常信息中会给出必要参数的属性名称。

第三步、发起请求并处理结果（支持三种方式）

----   
        方式1：同步处理
        try{
            result = client.method(param);
        } catch (Exception e){
            // 这里可能会抛出一些异常
            // 比如网络异常等
        }
        这个方式与常见调用方式相同，阻塞调用，直到当前请求结果返回。
----        
        方式2：同步回调处理
        client.method(param, new UcloudHandler<*Result>() {
             @Override
             public Object success(*Result result) {
                  // result中的retCode为0时
                  return null;
             }
                                               
             @Override
             public Object failed(*Result result) {
                  // result中的retCode不为0时
                  return null;
             }
                                               
             @Override
             public Object error(Exception e) {
                   // 当发生异常时候，需要在这个方法中进行处理
                   return null;
             }
        },false);
        这个方式也是阻塞的，直到当前请求结果返回。
----
        方式3：异步回调处理    
        这个方式是非阻塞的，调用方式与方式2类似，但是要缺省method()最后的flag参数，或者为true。
        
代码示例：
```java
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udisk.client.DefaultUdiskClient;
import cn.ucloud.udisk.client.UdiskClient;
import cn.ucloud.udisk.model.DescribeUDiskParam;
import cn.ucloud.udisk.model.DescribeUDiskResult;
import cn.ucloud.udisk.pojo.UdiskConfig;


public class Main {

    public static void main(String []args)  {
        UdiskClient client = new DefaultUdiskClient(new UdiskConfig(
                new Account("PrivateKey",
                        "PublicKey")
        ));
        DescribeUDiskParam param = new DescribeUDiskParam("region");
        param.setProjectId("projectId");
        DescribeUDiskResult describeUDisk = null;
        try {
            describeUDisk = client.describeUDisk(param);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(describeUDisk);
    }
}
```

### 业务集成

在ucloud-sdk-java-integration中，对于一些常见的业务流程或者一些有着特定前置条件的接口，<br>
我们对这些流程进行了集成封装处理。你可以直接调用这些封装好了的接口来完成目标操作，而不<br>需要关心业务细节或者那些特定前置条件。

目前支持的流程操作：

uhost：
- TerminateUHostInstanceIntegration 删除云主机


