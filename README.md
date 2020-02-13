## ucloud-sdk-java
ucloud开发者工具套件（SDK）。<br/>
面向UCloud的多个产品服务，目前包括：
- uhost
- udisk
- unet
- ulb
- vpc
- ufs
- usql
- pathx
- udb
- udpn
- umem
- censor
- ocr
- usms
- ubill


后续将支持更多的UCloud的产品服务。

### 使用准备
- 需要一个UCloud的账号以及一对PrivateKey、PublicKey[点此获取](https://console.ucloud.cn/uapi/apikey)
  

### sdk获取
方式一、maven仓库

    以使用udisk为例：
    <dependency>
      <groupId>cn.ucloud</groupId>
      <artifactId>ucloud-sdk-java-udisk</artifactId>
      <version>0.8.2.9-release</version>
    </dependency>

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


### 版本更新历史
- 0.6-release

    第一个正式版本，支持了UHost、VPC、UDisk、UFS、UNet、ULB的产品服务调用
- 0.6.1-release

    修复了ucloud-sdk-java-common中存在的publicKey编码问题
- 0.6.2-release

    支持获取基础数据的接口GetRegion和GetProjectList
- 0.6.3-release

    修复个别接口返回结果和实际有出入的问题
- 0.6.3.1-release

    修复DescribeEIP接口与实际接口有出入的问题
- 0.8.0-release
    
    新增UMem、USQL、UDB、PathX、UDPN产品，对既有产品接口进行更新维护
- 0.8.1-release

    修复UNet.CreateFirewall规则错误的bug以及udb部分接口与实际返回有出入的问题
- 0.8.1.1-release

    修复UNet.UpdateFirewall规则错误的bug
    
- 0.8.2-release
    
    新增UAI的Censor、OCR产品，部分接口更新维护

- 0.8.2.1-release

    USQL维护更新

- 0.8.2.2-release
    
    UHost、UDisk维护更新

- 0.8.2.3-release
    
    UDB、UMem维护更新，UHost创建主机时绑定EIP和删除主机时解绑EIP、UDisk功能  
    维护更新，新增USMS产品

- 0.8.2.4-release
    
    UDB维护更新，common错误修复

- 0.8.2.5-release
    
    UDB、USMS 、UFS、UNet、USQL、VPC维护更新，接口入参和返回参数变动，部分接口废弃

- 0.8.2.6-release

    UDB、UMem、UFS维护更新，UFS部分接口增加必要字段
   
- 0.8.2.7-release
    
    UHost、UDisk、PathX、UNet维护更新，UCloudClient新增doAction方法

- 0.8.2.8-release

    PathX、ULB、VPC、UDB维护更新，USMS新增接口；接口调用改用POST方式

- 0.8.2.9-release
    UNet、ULB、UDPN维护更新；新增UBill模块
    