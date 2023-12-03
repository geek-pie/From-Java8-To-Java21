以下是从Java 8到Java 17每个版本的主要更新内容：

- **Java 8**³：
  - Lambda 表达式
  - 方法引用
  - 默认方法
  - 新的编译工具，如：Nashorn引擎 jjs、 类依赖分析器jdeps
  - Stream API
  - Date Time API
  - Optional 类

- **Java 9**⁶：
  - 平台级modularity（原名：Jigsaw） 模块化系统
  - Java 的 REPL 工具： jShell 命令
  - 多版本兼容 jar 包
  - 语法改进：接口的私有方法
  - 语法改进：UnderScore (下划线)使用的限制
  - 底层结构：String 存储结构变更
  - 集合工厂方法：快速创建只读集合
  - 增强的 Stream API

- **Java 10**[^10^]：
  - 局部变量的类型推断
  - 应用类数据共享
  - 向G1引入并行Full GC
  - 线程局部管控
  - 基于Java的JIT 编译器（试验版本）

- **Java 11**¹⁴：
  - String API 字符串绝对是 Java 中最常用的一个类了，String 类的方法使用率也都非常的高，在 Java 11 中又为 String 类带来了一系列的好用操作。 isBlank () 判空。
  - File API 读写文件变得更加方便。
  - JEP 321 - HTTP Client 在 Java 11 中 Http Client API 得到了标准化的支持。
  - JEP 323 - Lambda 局部变量推断 在 Java 10 中引入了 var 语法，可以自动推断变量类型。
  - JEP 330 - 单命令运行 Java

- **Java 12**¹⁶：
  - 改进的switch表达式

- **Java 13**¹⁸：
  - 多行字符串字面量

- **Java 14**¹⁹：
  - 改进的switch表达式
  - instanceof支持 模式匹配 （语言特性）
  - record 特性，省去写get，equals（）等方法
  - NullPointerException（JVM特性）,精确到哪一行
  - 加入了java打包工具jpackage的预览版

- **Java 15**²²：
  - CharSequence 增加 isEmpty 默认方法CharSequence 新增了 isEmpty 方法，用于判定字符序列是否为空。

- **Java 16**²³：
  - 类型判断的模式匹配（Java 14 开始预览），以下示例在效果上类似于 Kotlin 的智能类型转换： if (obj instanceof String s) { System.out.println(s.length()); }
  - 数据类（Java 14 开始预览）： record Point(int x, int y) { } Point p = new Point(3,4); System.out.println(p.x());

- **Java 17**²⁶：
  - 全新的 Java 长期支持版本提供数千个更新，进一步优化语言和平台，帮助开发人员提高工作效率
  - Oracle JDK 17 将为客户提供安全、性能和错误修复更新，至少到 2029 年 9 月

对于Java 18到Java 21的版本，我没有找到相关的更新信息。如果有任何新的信息，我会及时更新。⁵⁶[^10^]¹⁴¹⁶¹⁹²²²³²⁶

> (1) Java 8 新特性 | 菜鸟教程. https://bing.com/search?q=Java+8+%e4%b8%bb%e8%a6%81%e6%9b%b4%e6%96%b0%e5%86%85%e5%ae%b9.
>
> (2) Java 7～14各个版本新特性详解_java各版本新特性-CSDN博客. https://bing.com/search?q=Java+9+%e4%b8%bb%e8%a6%81%e6%9b%b4%e6%96%b0%e5%86%85%e5%ae%b9.
>
> (3) 赶紧收藏，Java 9~Java 17主要更新都在这了 - 阿里云开发者社区. https://bing.com/search?q=Java+10+%e4%b8%bb%e8%a6%81%e6%9b%b4%e6%96%b0%e5%86%85%e5%ae%b9.
>
> (4) 最通俗易懂的 Java 11 新特性讲解-腾讯云开发者社区-腾讯云. https://bing.com/search?q=Java+11+%e4%b8%bb%e8%a6%81%e6%9b%b4%e6%96%b0%e5%86%85%e5%ae%b9.
>
> (5) Java 9 ~Java 17 主要更新了什么？ - 知乎. https://bing.com/search?q=Java+12+%e4%b8%bb%e8%a6%81%e6%9b%b4%e6%96%b0%e5%86%85%e5%ae%b9.
>
> (6) Java 17 更新（1）：更快的 LTS 节奏-腾讯云开发者社区-腾讯云. https://cloud.tencent.com/developer/article/1883778.
>
> (7) Java 9 ~Java 17 主要更新了什么？ - 知乎. https://bing.com/search?q=Java+14+%e4%b8%bb%e8%a6%81%e6%9b%b4%e6%96%b0%e5%86%85%e5%ae%b9.
>
> (8) java 15 更新内容，隐藏类 - 知乎. https://zhuanlan.zhihu.com/p/500360501.
>
> (9) Java都到16了，为什么都还在用8，是越做越烂了么？ - 知乎专栏. https://zhuanlan.zhihu.com/p/358631538.
>
> (10) 甲骨文正式发布Java 17 - Oracle. https://bing.com/search?q=Java+17+%e4%b8%bb%e8%a6%81%e6%9b%b4%e6%96%b0%e5%86%85%e5%ae%b9.
>
> (11) java9到18版本中的新特性 - 知乎. https://zhuanlan.zhihu.com/p/390679021.
>
> (12) Java 9 ~Java 17 主要更新了什么？ - 知乎. https://www.zhihu.com/question/513873484.
> 
> (13) 赶紧收藏，Java 9~Java 17主要更新都在这了 - 阿里云开发者社区. https://developer.aliyun.com/article/940689.
> 
> (14) Java 8 新特性 | 菜鸟教程. https://www.runoob.com/java/java8-new-features.html.
> 
> (15) 再见Java8！万字总结Java 9~15新特性！真香 - 知乎. https://zhuanlan.zhihu.com/p/407817994.
> 
> (16) 赶紧收藏，Java 9~Java 17主要更新都在这了_jdk17 修改了那些版本_听闻余生的旋律的博客-CSDN博客. https://blog.csdn.net/qq_35956444/article/details/123005987.
> 
> (17) JDK各版本新特性(更新到Java21)_jdk各个版本新特性-CSDN博客. https://blog.csdn.net/qq_41806966/article/details/108647463.
> 
> (18) Java各版本的主要新增内容一览_java 8 种 pair具体是什么版本新增的-CSDN博客. https://blog.csdn.net/bashendixie5/article/details/124209777.
> 
> (19) Java版1.18 - Minecraft Wiki，最详细的我的世界百科. https://minecraft.fandom.com/zh/wiki/Java%E7%89%881.18.
> 
> (20) JDK11变化详解，JDK8升级JDK11详细指南 - 简书. https://www.jianshu.com/p/81b65eded96c.
> 
> (21) 10 w+字总结！Java 8---Java 17 特性详解 - 知乎. https://zhuanlan.zhihu.com/p/408593640.
> 
> (22) Java12主要更新介绍_java.security 更新-CSDN博客. https://blog.csdn.net/topdeveloperr/article/details/83340922.
> 
> (23) Java 7～14各个版本新特性详解_java各版本新特性-CSDN博客. https://blog.csdn.net/smallspot/article/details/105540222.
> 
> (24) Java 每半年就会更新一次新特性，再不掌握就要落伍了：Java15 的新特性 - CSDN博客. https://blog.csdn.net/liuxinghao/article/details/123541149.
> 
> (25) 为什么以及如何升级至 Java 16 或 17 - 知乎. https://zhuanlan.zhihu.com/p/411901405.
> 
> (26) 甲骨文正式发布Java 17 - Oracle. https://www.oracle.com/cn/news/announcement/oracle-releases-java-17-2021-09-14/.
> 
> (27) 一文总结Java\JDK 17发布的新特性 - 阿里云开发者社区. https://developer.aliyun.com/article/791372.
> 
> (28) undefined. https://docs.oracle.com/en/java/javase/11/migrate/index.html.
> 
> (29) undefined. https://openjfx.io/.
