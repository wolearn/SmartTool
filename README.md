# SmartTool

# 前言
开发过程中，通过日志，AS等工具查看网络，异常等信息总是感觉不太方便，于是萌发了开发个更好用的工具的想法。要能简单接入，要调试信息能清晰的可视化展示，要交互容易，要页面美观.....于是开始了整理需求，切图，编码......

# 最新版本
### 1.0.0
修复部分bug，并将程序的入口由悬浮窗改为通知栏。详细集成参考"10秒接入"
```
compile 'com.transfar:smarttoolui:1.0.0'
```

# 简介
SmartTool（中文名：机智的兔儿）这是一款离线工具，作用于开发、测试阶段。通过Gradle的方式简单集成。主要检测信息：
* App基本信息
* 应用内网络请求
* 异常信息监控
* 电量信息
* UI慢交互
* 内存信息

# 10秒接入
在工程下的build.gradle中添加
```
classpath 'com.wolearn:ajcplugin:1.0.1'
```

在module下的build.gradle中引入插件
```
apply plugin: 'wolearn.ajcplugin'
```

同时引入依赖
```
compile 'com.transfar:smarttoolui:1.0.0'
```

在Application的onCreate()函数中添加启动函数
```
SmartToolCore.getInstance().init(this);
```

# 功能
通知栏显示smarttool入口
#### 1.基本信息展示
![ ](http://upload-images.jianshu.io/upload_images/1931006-63d10c59194f22d9.gif?imageMogr2/auto-orient/strip)
#### 2.应用内网络请求
![ ](http://upload-images.jianshu.io/upload_images/1931006-128bbce43c061191.gif?imageMogr2/auto-orient/strip)
#### 3.异常信息监控
![ ](http://upload-images.jianshu.io/upload_images/1931006-aacad960c1d82f58.gif?imageMogr2/auto-orient/strip)
#### 4.电量信息
![ ](http://upload-images.jianshu.io/upload_images/1931006-0d01d2db9e019d83.gif?imageMogr2/auto-orient/strip)
#### 5.UI慢交互
![ ](http://upload-images.jianshu.io/upload_images/1931006-6d001f48b7805a86.gif?imageMogr2/auto-orient/strip)
#### 6.内存信息
![ ](http://upload-images.jianshu.io/upload_images/1931006-cff5ca04cbcff3c3.gif?imageMogr2/auto-orient/strip)

# 说明
* 本工具采取了无侵入的方式，除了上述的接入代码，不用写其他任何代码
* 抓取网络信息目前只适配了Okhttp3 Retrofit2
* 本工具只适用于上线前的阶段，上线请移除接入的代码
* 本工具相关的知识点：AOP后续可能出文章详细说明
* 有问题或建议可以给我留言，工具后续还有更新请关注

# 关于
感谢贡献代码的另外两位同学：农文学，时文涛
欢迎关注的我 
[github](https://github.com/wolearn)
[简书](http://www.jianshu.com/u/ed407c8602e0)
[掘金](https://gold.xitu.io/user/568dd715cbc2e8a30c443427)

(微信扫一扫)
![](http://upload-images.jianshu.io/upload_images/1931006-a94af6d0df05701b.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

