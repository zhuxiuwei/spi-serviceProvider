Java SPI实验。此工程定义了SPI具体实现类。（用来实现 Logger 接口）  
[Java SPI机制从原理到实战](https://segmentfault.com/a/1190000041020216)  
有道云笔记也有。  
接口工程见：[spi-interface](https://github.com/zhuxiuwei/spi-interface)  

注：不知道为啥pom里引用spi-interface不生效，只能通过把spi-interface的jar放到Lib目录，然后通过添加外部jar依赖的方式加入依赖。