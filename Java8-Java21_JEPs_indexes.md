# Java 8 - Java 21 版本对应JEP索引

---

## 以下内容停止维护，见Excel

---

## 文章迭代
* [x] 整理Java8 - Java21 的JEP检索清单
* [x] 添加JEP概要的翻译便于检索
* [ ] 按序过一遍JEP列表，标注▲
* [ ] 对于▲的内容，进行详细解读

## 基础信息

JSR 是什么

JEP 0 回答了是什么
JEP是所有JDK增强建议(JDK Enhancement Proposals, 简称JEP)的索引。

[JEP字典](https://openjdk.org/jeps/0)

通过以下地址访问JEPS(更改其中的1为对应的jep-id):
[https://openjdk-org.translate.goog/jeps/1?_x_tr_sl=en&_x_tr_tl=zh-CN&_x_tr_hl=zh-CN&_x_tr_pto=sc](https://openjdk-org.translate.goog/jeps/1?_x_tr_sl=en&_x_tr_tl=zh-CN&_x_tr_hl=zh-CN&_x_tr_pto=sc)

参考地址

[https://openjdk.org/projects/jdk/](https://openjdk.org/projects/jdk/)

[https://openjdk.org/projects/jdk7/](https://openjdk.org/projects/jdk7/)

> 以下内容的原始数据是通过从上述url爬取的方式获得，可以作为一个参阅字典。其中▲是ly认为作为Java开发需要了解的重点内容。

## **▲Java 8**：
[https://openjdk.org/projects/jdk8/](https://openjdk.org/projects/jdk8/)
[https://openjdk.org/projects/jdk8u/](https://openjdk.org/projects/jdk8u/)

[https://openjdk.org/projects/jdk8/features](https://openjdk.org/projects/jdk8/features)

--/-- 
##### JEP 126 ▲ Lambda Expressions & Virtual Extension Methods
为 Java 编程语言和平台添加 lambda 表达式（闭包）和支持功能，包括方法引用、增强型推理和虚拟扩展方法。

##### JEP 138 Autoconf-Based Build System
引入 autoconf（./configure-style）构建设置，重构 Makefile 以去除递归，并利用 JEP 139：增强 javac 以提高构建速度。

##### JEP 160 Lambda-Form Representation for Method Handles
用可优化的中间表示法替换汇编语言路径，然后重构实现，从而在可移植 Java 代码中完成更多工作，而不是硬连接到 JVM 中，从而改进方法句柄的实现。

##### JEP 161 Compact Profiles
定义 Java SE 平台规范的几个子集配置文件，以便在小型设备上部署和运行不需要整个平台的应用程序。

##### JEP 162 Prepare for Modularization
进行修改，以便在未来版本中顺利过渡到模块化，提供新工具帮助开发人员为模块化平台做好准备，并淘汰某些严重阻碍模块化的应用程序接口。

##### JEP 164 Leverage CPU Instructions for AES Cryptography
在可用时使用 x86 AES 指令，并避免对 AES 密钥进行不必要的重新扩展，从而提高开箱即用的 AES Crypto 性能。

##### JEP 174 Nashorn JavaScript Engine
设计并实现一种新的轻量级、高性能 JavaScript 实现，并将其集成到 JDK 中。新引擎将通过现有的 javax.script API 提供给 Java 应用程序，也可通过新的命令行工具提供给 Java 应用程序。

##### JEP 176 Mechanical Checking of Caller-Sensitive Methods
改进 JDK 方法句柄实现的安全性，用一种能准确识别此类方法并可靠地发现其调用者的机制，取代现有的手工维护的调用者敏感方法列表。

##### JEP 179 Document JDK API Support and Stability
长期以来，JDK 在明确规定 com.sun.* 类型和 JDK 随附的其他类型（Java SE 规范之外）的支持和稳定性使用契约方面存在缺陷。这些契约和潜在的演进策略应在类型的源代码和生成的类文件中明确捕获。这些信息可以用 JDK 特定的注解类型来建模。

vm/-- 
##### JEP 142 Reduce Cache Contention on Specified Fields
定义一种方法，指定对象中的一个或多个字段在处理器内核之间可能会出现高度竞争，这样虚拟机就可以安排这些字段不与其他字段或其他对象共享缓存行，而这些字段或对象可能会被独立访问。

vm/gc 
##### ▲ JEP 122 Remove the Permanent Generation
从Hotspot JVM 中移除永久代，从而无需调整永久代的大小。

##### JEP 173 Retire Some Rarely-Used GC Combinations
删除三种很少使用的垃圾收集器组合，以降低持续开发、维护和测试成本。

vm/rt 
##### JEP 136 Enhanced Verification Errors
提供有关字节码验证错误的更多上下文信息，以方便在现场诊断字节码或堆栈图的缺陷。

##### JEP 147 Reduce Class Metadata Footprint
减少 HotSpot 的类元数据内存占用，以提高在小型设备上的性能。

##### JEP 148 Small VM
支持创建不大于 3MB 的小型虚拟机。

##### JEP 171 Fence Intrinsics
为 sun.misc.Unsafe 类添加三个内存排序本征。

core/-- 
##### JEP 153 Launch JavaFX Applications
增强java命令行启动器以启动JavaFX应用程序。

core/lang 
##### JEP 101 Generalized Target-Type Inference
平滑地扩展方法类型推理的范围，以支持(i)方法上下文中的推理和(ii)链式调用中的推理。

##### JEP 104 Annotations on Java Types
扩展Java编程语言语法中的可注释位置集，以包含指示类型使用以及(根据Java SE 5.0)类型声明的名称。

##### JEP 105 DocTree API
扩展编译器树API，以提供对javadoc注释内容的结构化访问。

##### JEP 106 Add Javadoc to javax.tools
扩展javax.tools API提供对javadoc的访问。

##### JEP 117 Remove the Annotation-Processing Tool (apt)
从JDK中删除apt工具、相关API和文档。

##### ▲ JEP 118 Access to Parameter Names at Runtime
提供一种机制，以便在运行时通过核心反射轻松可靠地检索方法和构造函数的参数名。

##### ▲ JEP 120 Repeating Annotations
更改Java编程语言，以允许对单个程序元素使用相同类型的多个注释应用程序。

##### JEP 139 Enhance javac to Improve Build Speed
通过修改Java编译器，使其在单个持久进程中的所有可用内核上运行，减少构建JDK所需的时间，并支持增量构建，跟踪构建之间的包和类依赖关系，自动生成本机方法的头文件，并清理不再需要的类和头文件。

##### JEP 172 DocLint
在开发周期的早期提供一种方法来检测Javadoc注释中的错误，并且以一种容易链接回源代码的方式。

core/libs 
##### JEP 103 Parallel Array Sorting
向java.util.Arrays添加额外的实用程序方法，这些方法使用JSR 166 Fork/Join并行公共池提供并行数组排序。

##### JEP 107 Bulk Data Operations for Collections
向Java Collections Framework中添加对数据进行批量操作的功能。这通常被称为“Java的filter/map/reduce”。批量数据操作包括串行(在调用线程上)和并行(使用多个线程)版本的操作。对数据的操作通常表示为lambda函数。

##### JEP 109 Enhance Core Libraries with Lambda
使用新的lambda语言特性增强Java核心库api，以提高库的可用性和便利性。

##### JEP 112 Charset Implementation Improvements
改进标准和扩展字符集实现的可维护性和性能。

##### JEP 119 javax.lang.model Implementation Backed by Core Reflection
提供javax.lang.model的实现。* API支持核心反射而不是javac。换句话说，提供一个替代API来访问和处理由核心反射提供的关于已加载类的反射信息。

##### JEP 135 Base64 Encoding & Decoding
定义Base64编码和解码的标准API。

##### JEP 149 Reduce Core-Library Memory Usage
减少核心库类使用的动态内存，而不会对性能产生不利影响。

##### ▲ JEP 150 Date & Time API
为Java SE平台定义一个新的日期、时间和日历API。

##### JEP 155 Concurrency Updates
可伸缩的可更新变量，面向缓存的ConcurrentHashMap API增强，ForkJoinPool改进，以及额外的Lock和Future类。

##### JEP 170 JDBC 4.2
对JDBC进行了较小的增强，以提高可用性和可移植性

##### JEP 177 Optimize java.text.DecimalFormat.format
通过利用整数和浮点算术的数值属性来优化java.text.DecimalFormat.format，以加速小数点后有两位或三位数字的情况。

##### JEP 178 Statically-Linked JNI Libraries
增强JNI规范以支持静态链接的本机库。

##### JEP 180 Handle Frequent HashMap Collisions with Balanced Trees
通过使用平衡树而不是链表来存储映射条目，提高java.util.HashMap在高哈希冲突条件下的性能。在LinkedHashMap类中实现同样的改进。

core/i18n 
##### JEP 127 Improve Locale Data Packaging and Adopt Unicode CLDR Data
创建一个工具，将LDML(区域数据标记语言)文件转换为运行时库可以直接使用的格式，定义一种将结果打包到模块中的方法，然后使用这些方法将Unicode Consortium的CLDR项目发布的事实上的标准区域数据合并到JDK中。

##### JEP 128 BCP 47 Locale Matching
定义api，以便使用BCP 47语言标签(参见RFC 5646)的应用程序能够以符合RFC 4647的方式将它们与用户的语言首选项相匹配。

##### JEP 133 Unicode 6.2
扩展现有的平台api以支持Unicode标准的6.2版。

core/net 
##### JEP 184 HTTP URL Permissions
定义一种新的网络权限类型，根据url而不是低级IP地址授予访问权限。

core/sec 
##### JEP 113 MS-SFU Kerberos 5 Extensions
将MS-SFU扩展添加到JDK的Kerberos 5实现中。

##### JEP 114 TLS Server Name Indication (SNI) Extension
增加对TLS服务器名称指示(SNI)扩展的支持，以允许基于SSL/TLS协议的更灵活的安全虚拟主机和虚拟机基础设施。

##### JEP 115 AEAD CipherSuites
支持由SP-800-380D、RFC 5116、RFC 5246、RFC 5288、RFC 5289和RFC 5430定义的AEAD/GCM密码套件。

##### JEP 121 Stronger Algorithms for Password-Based Encryption
在SunJCE提供程序中提供更强大的基于密码加密(PBE)算法实现。

##### JEP 123 Configurable Secure Random-Number Generation
增强用于安全随机数生成的API，以便可以将其配置为在指定的质量和响应性约束下运行。

##### JEP 124 Enhance the Certificate Revocation-Checking API
改进证书吊销检查API，以支持尽力而为检查、终端实体证书检查和特定于机制的选项和参数。

##### JEP 129 NSA Suite B Cryptographic Algorithms
提供NSA Suite B所需的加密算法的实现。

##### JEP 130 SHA-224 Message Digests
实现SHA-224消息摘要算法及相关算法。

##### JEP 131 PKCS#11 Crypto Provider for 64-bit Windows
在64位Windows的JDK中包含SunPKCS11提供程序。

##### JEP 140 Limited doPrivileged
使代码能够断言其特权的子集，而不会阻止检查其他权限的完整访问控制堆栈遍历。

##### JEP 166 Overhaul JKS-JCEKS-PKCS12 Keystores
通过向pkcs# 12密钥库添加等效支持，方便从JKS和JCEKS密钥库迁移数据。增强KeyStore API以支持新特性，例如条目元数据和跨多个密钥存储库的逻辑视图。启用JEP-121中引入的强加密算法来保护密钥存储库项。

web/jaxp 
##### JEP 185 Restrict Fetching of External XML Resources
增强JAXP api，以添加限制可用于获取外部资源的网络协议集的功能。

## **Java 9**：
[https://openjdk.org/projects/jdk9/](https://openjdk.org/projects/jdk9/)

##### JEP 102: Process API Updates
> Improve the API for controlling and managing operating-system processes.

改进用于控制和管理操作系统进程的API。

##### JEP 110: **▲[HTTP 2 Client](https://openjdk.org/jeps/110)**
> Define a new HTTP client API that implements HTTP/2 and WebSocket, and can replace the legacy HttpURLConnection API. The API will be delivered as an incubator module, as defined in JEP 11, with JDK 9. This implies:
> - The API and implementation will not be part of Java SE.
> - The API will live under the jdk.incubtor namespace.
> - The module will not resolve by default at compile or run time.

定义一个新的HTTP客户端API，实现HTTP/2和WebSocket，并可以取代旧的HttpURLConnection API。该API将作为孵化器模块交付，如JEP 11和JDK 9中定义的那样。这意味着:
- API和实现将不是Java SE的一部分。
- API将在jdk下运行。incubtor名称空间。
- 该模块在编译或运行时默认不会解析。


##### JEP 143: Improve Contended Locking
> Improve the performance of contended Java object monitors.

##### JEP 158: Unified JVM Logging
> Introduce a common logging system for all components of the JVM.

为JVM的所有组件引入一个通用的日志系统。

##### JEP 165: Compiler Control
> This JEP proposes an improved way to control the JVM compilers. It enables runtime manageable, method dependent compiler flags. (Immutable for the duration of a compilation.)

这个JEP提出了一种改进的方法来控制JVM编译器。它支持运行时可管理的、依赖于方法的编译器标志。(在编译期间不可变。)

##### JEP 193: Variable Handles
> Define a standard means to invoke the equivalents of various java.util.concurrent.atomic and sun.misc.Unsafe operations upon object fields and array elements, a standard set of fence operations for fine-grained control of memory ordering, and a standard reachability-fence operation to ensure that a referenced object remains strongly reachable.

定义一种标准方法来调用对对象字段和数组元素的各种java.util.concurrent.atomic和sun.misc.Unsafe操作的等价内容，定义一组标准的栅栏操作，用于细粒度控制内存排序，定义一种标准的可达性栅栏操作，以确保引用的对象保持强可达性。

##### JEP 197: Segmented Code Cache
> Divide the code cache into distinct segments, each of which contains compiled code of a particular type, in order to improve performance and enable future extensions.

将代码缓存划分为不同的段，每个段包含特定类型的编译代码，以便提高性能并支持将来的扩展。

##### JEP 199: Smart Java Compilation, Phase Two
> Improve the sjavac tool so that it can be used by default in the JDK build, and generalize it so that it can be used to build large projects other than the JDK.

改进sjavac工具，使其可以在JDK构建中默认使用，并对其进行一般化，使其可以用于构建除JDK之外的大型项目。

##### JEP 200: The Modular JDK
> Use the Java Platform Module System, specified by JSR 376 and implemented by JEP 261, to modularize the JDK.

使用JSR 376指定并由JEP 261实现的Java平台模块系统来模块化JDK。

##### JEP 201: Modular Source Code
> Reorganize the JDK source code into modules, enhance the build system to compile modules, and enforce module boundaries at build time.

将JDK源代码重新组织为模块，增强构建系统以编译模块，并在构建时强制执行模块边界。

##### JEP 211: Elide Deprecation Warnings on Import Statements
> As of Java SE 8, java compilers are required by reasonable interpretations of the Java Language Specification to issue deprecation warnings when a deprecated type is imported by name or when a deprecated member (method, field, nested type) is imported statically. These warnings are uninformative and should not be required. Deprecation warnings at actual uses of deprecated members should remain.

从Java SE 8开始，Java语言规范的合理解释要求Java编译器在按名称导入已弃用类型或静态导入已弃用成员(方法、字段、嵌套类型)时发出弃用警告。这些警告是没有信息的，不应该被要求。在实际使用已弃用成员时，应保留弃用警告。

##### JEP 212: Resolve Lint and Doclint Warnings
> The JDK code base contains numerous lint and doclint errors as reported by javac. These warnings should be resolved, at least for the fundamental parts of the platform.

DK代码库包含许多由javac报告的lint和文档错误。这些警告应该得到解决，至少对于平台的基本部分是这样。

##### JEP 213: Milling Project Coin
> The small language changes included in Project Coin / JSR 334 as part of JDK 7 / Java SE 7 have been easy to use and have worked well in practice. However, a few amendments could address the rough edges of those changes. In addition, using underscore ("_") as an identifier, which generates a warning as of Java SE 8, should be turned into an error in Java SE 9. It is also proposed that interfaces be allowed to have private methods.

作为JDK 7 / Java SE 7的一部分，Project Coin / JSR 334中包含的小语言变化很容易使用，并且在实践中运行良好。然而，一些修正案可以解决这些变化的粗糙边缘。此外，使用下划线(“_”)作为标识符会在Java SE 8中生成警告，在Java SE 9中应该会转换为错误。还建议允许接口具有私有方法。

##### JEP 214: Remove GC Combinations Deprecated in JDK 8
> Remove the GC combinations that were previously deprecated in JDK 8 via JEP 173.

通过JEP 173删除JDK 8中以前弃用的GC组合。

##### JEP 215: Tiered Attribution for javac
> Implement a new method type-checking strategy in javac to speed up attribution of poly expression in argument position.

在javac中实现了一种新的方法类型检查策略，以加快参数位置多表达式的归属。

##### JEP 216: Process Import Statements Correctly
> Fix javac to properly accept and reject programs regardless of the order of import statements and extends and implements clauses.

修复javac以正确地接受和拒绝程序，而不考虑import语句和extends和implements子句的顺序。

##### JEP 217: Annotations Pipeline 2.0
> Redesign the javac annotations pipeline to better address the requirements of annotations and tools that process annotations.

重新设计javac注释pipeline，以更好地满足注释和处理注释的工具的需求。

##### JEP 219: Datagram Transport Layer Security (DTLS)
> Define an API for Datagram Transport Layer Security (DTLS) version 1.0 (RFC 4347) and 1.2 (RFC 6347).

定义数据报传输层安全(DTLS)版本1.0 (RFC 4347)和1.2 (RFC 6347)的API。

##### JEP 220: Modular Run-Time Images
> Restructure the JDK and JRE run-time images to accommodate modules and to improve performance, security, and maintainability. Define a new URI scheme for naming the modules, classes, and resources stored in a run-time image without revealing the internal structure or format of the image. Revise existing specifications as required to accommodate these changes.

重构JDK和JRE运行时映像以适应模块，并改进性能、安全性和可维护性。定义一个新的URI方案，用于命名存储在运行时映像中的模块、类和资源，而不泄露映像的内部结构或格式。根据需要修改现有规范以适应这些变化。

##### JEP 221: New Doclet API
> Provide a replacement for the Doclet API to leverage appropriate Java SE and JDK APIs, and update the standard doclet to use the new API.

提供Doclet API的替代品以利用适当的Java SE和JDK API，并更新标准Doclet以使用新的API。

##### JEP 222: jshell: The Java Shell (Read-Eval-Print Loop)
> Provide an interactive tool to evaluate declarations, statements, and expressions of the Java programming language, together with an API so that other applications can leverage this functionality.

提供一个交互式工具来评估Java编程语言的声明、语句和表达式，并提供API，以便其他应用程序可以利用此功能。

##### JEP 223: New Version-String Scheme
> Define a version-string scheme that easily distinguishes major, minor, and security-update releases, and apply it to the JDK.

定义一个版本字符串方案，以方便地区分主要、次要和安全更新版本，并将其应用于JDK。

##### JEP 224: HTML5 Javadoc
> Enhance the javadoc tool to generate HTML5 markup.

增强javadoc工具以生成HTML5标记。

##### JEP 225: Javadoc Search
> Add a search box to API documentation generated by the standard doclet that can be used to search for program elements and tagged words and phrases within the documentation. The search box appears in the header of all pages generated by the standard doclet.

在标准doclet生成的API文档中添加一个搜索框，该搜索框可用于搜索文档中的程序元素和标记的单词和短语。搜索框出现在标准doclet生成的所有页面的页眉中。

##### JEP 226: UTF-8 Property Resource Bundles
> Define a means for applications to specify property files encoded in UTF-8, and extend the ResourceBundle API to load them.

为应用程序定义一种方法来指定以UTF-8编码的属性文件，并扩展ResourceBundle API来加载它们。

##### JEP 227: Unicode 7.0
> Upgrade existing platform APIs to support version 7.0 of the Unicode Standard.

升级现有的平台api以支持7.0版本的Unicode标准。

##### JEP 228: Add More Diagnostic Commands
> Define additional diagnostic commands, in order to improve the diagnosability of Hotspot and the JDK.

定义额外的诊断命令，以提高Hotspot和JDK的可诊断性。

##### JEP 229: Create PKCS12 Keystores by Default
> Transition the default keystore type from JKS to PKCS12.

将默认密钥存储库类型从JKS转换为PKCS12。

##### JEP 231: Remove Launch-Time JRE Version Selection
> Remove the ability to request, at JRE launch time, a version of the JRE that is not the JRE being launched.

删除在JRE启动时请求不是正在启动的JRE的JRE版本的功能。

##### JEP 232: Improve Secure Application Performance
> Improve the performance of applications that are run with a security manager installed.

提高安装了安全管理器的应用程序的性能。

##### JEP 233: Generate Run-Time Compiler Tests Automatically
> Develop a tool to test the run-time compilers by automatically generating test cases.

开发一个工具，通过自动生成测试用例来测试运行时编译器。

##### JEP 235: Test Class-File Attributes Generated by javac
> Write tests to verify the correctness of class-file attributes generated by javac.

编写测试以验证javac生成的类文件属性的正确性。

##### JEP 236: Parser API for Nashorn
> Define a supported API for Nashorn's ECMAScript abstract syntax tree.

为Nashorn的ECMAScript抽象语法树定义一个受支持的API。

##### JEP 237: Linux/AArch64 Port
> Port JDK 9 to Linux/AArch64.

将JDK 9移植到Linux/AArch64。

##### JEP 238: Multi-Release JAR Files
> Extend the JAR file format to allow multiple, Java-release-specific versions of class files to coexist in a single archive.

扩展JAR文件格式，以允许类文件的多个特定于java发行版的版本共存于单个归档文件中。

##### JEP 240: Remove the JVM TI hprof Agent
> Remove the hprof agent from the JDK.

从JDK中删除hprof代理。

##### JEP 241: Remove the jhat Tool
> Remove the antiquated jhat tool.

删除过时的jhat工具。

##### JEP 243: Java-Level JVM Compiler Interface
> Develop a Java based JVM compiler interface (JVMCI) enabling a compiler written in Java to be used by the JVM as a dynamic compiler.

开发基于Java的JVM编译器接口(JVMCI)，使用Java编写的编译器可以被JVM用作动态编译器。

##### JEP 244: TLS Application-Layer Protocol Negotiation Extension
> Extend the javax.net.ssl package to support the TLS Application Layer Protocol Negotiation (ALPN) Extension, which provides the means to negotiate an application protocol for a TLS connection.

扩展javax.net.ssl包以支持TLS应用层协议协商(ALPN)扩展，该扩展提供了为TLS连接协商应用程序协议的方法。

##### JEP 245: Validate JVM Command-Line Flag Arguments
> Validate the arguments to all JVM command-line flags so as to avoid crashes, and ensure that appropriate error messages are displayed when they are invalid.

验证所有JVM命令行标志的参数，以避免崩溃，并确保在它们无效时显示适当的错误消息。

##### JEP 246: Leverage CPU Instructions for GHASH and RSA
> Improve the performance of GHASH and RSA cryptographic operations by leveraging recently-introduced SPARC and Intel x64 CPU instructions.

通过利用最近引入的SPARC和Intel x64 CPU指令，提高GHASH和RSA加密操作的性能。

##### JEP 247: Compile for Older Platform Versions
> Enhance javac so that it can compile Java programs to run on selected older versions of the platform.

增强javac，使其能够编译Java程序，以便在选定的旧版本平台上运行。

##### JEP 248: Make G1 the Default Garbage Collector
> Make G1 the default garbage collector on 32- and 64-bit server configurations.

将G1设置为32位和64位服务器配置上的默认垃圾收集器。

##### JEP 249: OCSP Stapling for TLS
> Implement OCSP stapling via the TLS Certificate Status Request extension (section 8 of RFC 6066) and the Multiple Certificate Status Request Extension (RFC 6961).

通过TLS证书状态请求扩展(RFC 6066第8节)和多证书状态请求扩展(RFC 6961)实现OCSP订书机。

##### JEP 250: Store Interned Strings in CDS Archives
> Store interned strings in class-data sharing (CDS) archives.

将驻留字符串存储在类数据共享 (CDS) 档案中。

##### JEP 251: Multi-Resolution Images
> Define a multi-resolution image API so that images with resolution variants can easily be manipulated and displayed.

定义多分辨率图像 API，以便可以轻松操作和显示具有不同分辨率的图像。

##### JEP 252: Use CLDR Locale Data by Default
> Use locale data from the Unicode Consortium's Common Locale Data Repository (CLDR) by default.

默认情况下，使用 Unicode 联盟的公共区域设置数据存储库 (CLDR)中的区域设置数据。

##### JEP 253: Prepare JavaFX UI Controls & CSS APIs for Modularization
> Define public APIs for the JavaFX UI controls and CSS functionality that is presently only available via internal APIs and will hence become inaccessible due to modularization.

为 JavaFX UI 控件和 CSS 功能定义公共 API，这些功能目前只能通过内部 API 获得，因此由于模块化而将变得无法访问。

##### ▲ JEP 254: Compact Strings
> Adopt a more space-efficient internal representation for strings.

采用更节省空间的字符串内部表示形式。

##### JEP 255: Merge Selected Xerces 2.11.0 Updates into JAXP
> Upgrade the version of the Xerces XML parser included in the JDK with important changes from Xerces 2.11.0.

升级 JDK 中包含的 Xerces XML 解析器的版本，并对Xerces 2.11.0进行了重要更改。

##### JEP 256: BeanInfo Annotations
> Replace @beaninfo Javadoc tags with proper annotations, and process those annotations at run time to generate BeanInfo classes dynamically.

用适当的注释替换@beaninfo Javadoc 标记，并在运行时处理这些注释以BeanInfo动态生成类。

##### JEP 257: Update JavaFX/Media to Newer Version of GStreamer
> Update the version of GStreamer included in FX/Media in order to improve security, stability, and performance.

更新 FX/Media 中包含的 GStreamer 版本，以提高安全性、稳定性和性能。

##### JEP 258: HarfBuzz Font-Layout Engine
> Replace the existing ICU OpenType font-layout engine with HarfBuzz.

用 HarfBuzz 替换现有的 ICU OpenType 字体布局引擎。

##### ▲ JEP 259: Stack-Walking API
> Define an efficient standard API for stack walking that allows easy filtering of, and lazy access to, the information in stack traces.

为堆栈遍历定义一个高效的标准 API，允许轻松过滤和延迟访问堆栈跟踪中的信息。

##### JEP 260: Encapsulate Most Internal APIs
> Encapsulate most of the JDK's internal APIs by default so that they are inaccessible at compile time, and prepare for a future release in which they will be inaccessible at run time. Ensure that critical, widely-used internal APIs are not encapsulated, so that they remain accessible until supported replacements exist for all or most of their functionality.

默认情况下封装了 JDK 的大部分内部 API，以便在编译时无法访问它们，并为将来的版本在运行时无法访问它们做好准备。确保关键的、广泛使用的内部 API 没有被封装，以便它们保持可访问性，直到其全部或大部分功能出现受支持的替代品为止。

##### ▲ JEP 261: Module System
> Implement the Java Platform Module System, as specified by JSR 376, together with related JDK-specific changes and enhancements.

实现JSR 376指定的 Java 平台模块系统，以及相关的 JDK 特定更改和增强。

##### JEP 262: TIFF Image I/O
> Extend the standard set of Image I/O plugins to support the TIFF image format.

扩展图像 I/O 插件的标准集以支持 TIFF 图像格式。

##### JEP 263: HiDPI Graphics on Windows and Linux
> Implement HiDPI graphics on Windows and Linux.

在 Windows 和 Linux 上实现 HiDPI 图形。

##### JEP 264: Platform Logging API and Service
> Define a minimal logging API which platform classes can use to log messages, together with a service interface for consumers of those messages. A library or application can provide an implementation of this service in order to route platform log messages to the logging framework of its choice. If no implementation is provided then a default implementation based upon the java.util.logging API is used.

定义平台类可用于记录消息的最小日志记录 API，以及这些消息的使用者的服务接口。库或应用程序可以提供此服务的实现，以便将平台日志消息路由到其选择的日志框架。java.util.logging如果未提供实现，则使用基于 API 的默认实现。

##### JEP 265: Marlin Graphics Renderer
> Update Java 2D to use the Marlin Renderer as the default graphics rasterizer.

更新Java 2D以使用Marlin Renderer作为默认的图形光栅化器。


##### △ JEP 266: More Concurrency Updates
> An interoperable publish-subscribe framework, enhancements to the CompletableFuture API, and various other improvements.

一个可交互的发布-订阅框架，对CompletableFuture API的增强，以及其他各种改进。

##### JEP 267: Unicode 8.0
> Upgrade existing platform APIs to support version 8.0 of the Unicode Standard.

升级现有平台API以支持Unicode标准的8.0版本。

##### JEP 268: XML Catalogs
> Develop a standard XML Catalog API that supports the OASIS XML Catalogs standard, v1.1. The API will define catalog and catalog-resolver abstractions which can be used with the JAXP processors that accept resolvers.

开发一个标准的XML目录API，支持OASIS XML目录标准v1.1。该API将定义目录和目录解析器抽象，可与接受解析器的JAXP处理器一起使用。


##### JEP 269: Convenience Factory Methods for Collections
> Define library APIs to make it convenient to create instances of collections and maps with small numbers of elements, so as to ease the pain of not having collection literals in the Java programming language.

定义库api，以便方便地创建具有少量元素的集合和映射实例，从而减轻Java编程语言中没有集合字面量的痛苦。

##### JEP 270: Reserved Stack Areas for Critical Sections
> Reserve extra space on thread stacks for use by critical sections, so that they can complete even when stack overflows occur.

在线程堆栈上保留额外的空间供临界区使用，这样即使发生堆栈溢出，它们也可以完成。

##### JEP 271: Unified GC Logging
> Reimplement GC logging using the unified JVM logging framework introduced in JEP 158.

使用JEP 158中引入的统一JVM日志框架重新实现GC日志记录。

##### JEP 272: Platform-Specific Desktop Features
> Define a new public API to access platform-specific desktop features such as interacting with a task bar or dock, or listening for system or application events.

定义一个新的公共API来访问特定于平台的桌面特性，比如与任务栏或dock交互，或者监听系统或应用程序事件。

##### JEP 273: DRBG-Based SecureRandom Implementations
> Implement the three Deterministic Random Bit Generator (DRBG) mechanisms described in NIST 800-90Ar1.

实现NIST 800-90Ar1中描述的三种确定性随机比特发生器(DRBG)机制。

##### △ JEP 274: Enhanced Method Handles
> Enhance the MethodHandle, MethodHandles, and MethodHandles.Lookup classes of the java.lang.invoke package to ease common use cases and enable better compiler optimizations by means of new MethodHandle combinators and lookup refinement.

增强了MethodHandle、MethodHandles和MethodHandles。调用包的查找类简化了常见的用例，并通过新的MethodHandle组合子和查找细化实现了更好的编译器优化。

##### △ JEP 275: Modular Java Application Packaging
> Integrate features from Project Jigsaw into the Java Packager, including module awareness and custom run-time creation.

将Project Jigsaw的特性集成到Java Packager中，包括模块感知和自定义运行时创建。

##### △ JEP 276: Dynamic Linking of Language-Defined Object Models
> Provide a facility for linking high-level operations on objects such as "read a property", "write a property", "invoke a callable object", etc., expressed as names in INVOKEDYNAMIC call sites. Provide a default linker for the usual semantics of these operations on plain Java objects, as well as a facility for installing language-specific linkers.

提供一种连接对象上的高级操作的工具，如“读取属性”、“写入属性”、“调用可调用对象”等，在INVOKEDYNAMIC调用站点中表示为名称。为普通Java对象上这些操作的通常语义提供默认链接器，以及用于安装特定于语言的链接器的工具。

##### JEP 277: Enhanced Deprecation
> Revamp the @Deprecated annotation, and provide tools to strengthen the API life cycle.

修改@Deprecated注释，并提供工具来加强API的生命周期。

##### JEP 278: Additional Tests for Humongous Objects in G1
> Develop additional white-box tests for the Humongous Objects feature of the G1 Garbage Collector.

为G1垃圾收集器的Humongous Objects特性开发额外的白盒测试。

##### JEP 279: Improve Test-Failure Troubleshooting
> Automatically collect diagnostic information which can be used for further troubleshooting in case of test failures and timeouts.

自动收集诊断信息，可用于在测试失败和超时的情况下进行进一步的故障排除。

##### JEP 280: Indify String Concatenation
> Change the static String-concatenation bytecode sequence generated by javac to use invokedynamic calls to JDK library functions. This will enable future optimizations of String concatenation without requiring further changes to the bytecode emitted by javac.

将javac生成的静态字符串连接字节码序列更改为使用对JDK库函数的invokedynamic调用。这将使将来的字符串连接优化成为可能，而不需要进一步更改javac发出的字节码。

##### JEP 281: HotSpot C++ Unit-Test Framework
> Enable and encourage the development of C++ unit tests for HotSpot.

支持并鼓励为HotSpot开发c++单元测试。

##### △ JEP 282: jlink: The Java Linker
> Create a tool that can assemble and optimize a set of modules and their dependencies into a custom run-time image as defined in JEP 220.

创建一个工具，该工具可以将一组模块及其依赖项组装并优化为JEP 220中定义的自定义运行时映像。

##### JEP 283: Enable GTK 3 on Linux
> Enable Java graphical applications, whether based on JavaFX, Swing, or AWT, to use either GTK 2 or GTK 3 on Linux.

使Java图形化应用程序(无论是基于JavaFX、Swing还是AWT)能够在Linux上使用GTK 2或GTK 3。

##### JEP 284: New HotSpot Build System
> Rewrite the HotSpot build system using the build-infra framework.

使用build-infra框架重写HotSpot构建系统。

##### JEP 285: Spin-Wait Hints
> Define an API to allow Java code to hint that a spin loop is being executed.

定义一个API，允许Java代码提示正在执行自旋循环。

##### JEP 287: SHA-3 Hash Algorithms
> Implement the SHA-3 cryptographic hash functions (BYTE-only) specified in NIST FIPS 202.

实现NIST FIPS 202中指定的SHA-3加密散列函数(仅限字节)。

##### JEP 288: Disable SHA-1 Certificates
> Improve the security configuration of the JDK by providing a more flexible mechanism to disable X.509 certificate chains with SHA-1 based signatures.

通过提供更灵活的机制来禁用基于SHA-1签名的X.509证书链，从而改进JDK的安全配置。

##### JEP 289: Deprecate the Applet API
> Deprecate the Applet API, which is rapidly becoming irrelevant as web-browser vendors remove support for Java browser plug-ins. Guide developers to alternative technologies such as Java Web Start or installable applications.

弃用Applet API，随着web浏览器供应商取消对Java浏览器插件的支持，Applet API正迅速变得无关紧要。指导开发人员使用其他技术，如Java Web Start或可安装的应用程序。

##### JEP 290: Filter Incoming Serialization Data
> Allow incoming streams of object-serialization data to be filtered in order to improve both security and robustness.

允许对传入的对象序列化数据流进行过滤，以提高安全性和健壮性。

##### ▲ JEP 291: Deprecate the Concurrent Mark Sweep (CMS) Garbage Collector
> Deprecate the Concurrent Mark Sweep (CMS) garbage collector, with the intent to stop supporting it in a future major release.

弃用并发标记扫描(CMS)垃圾收集器，并打算在未来的主要版本中停止支持它。

##### JEP 292: Implement Selected ECMAScript 6 Features in Nashorn
> Implement, in Nashorn, a selected set of the many new features introduced in the 6th edition of ECMA-262, also known as ECMAScript 6, or ES6 for short.

在Nashorn中实现ECMA-262(也称为ECMAScript 6，简称ES6)第6版中引入的一组精选的新特性。

##### JEP 294: Linux/s390x Port
> Port JDK 9 to Linux/s390x.

将JDK 9移植到Linux/s390x。

##### ▲ JEP 295: Ahead-of-Time Compilation
> Compile Java classes to native code prior to launching the virtual machine.

在启动虚拟机之前，将Java类编译为本机代码。[spring-native重要基础]

##### JEP 297: Unified arm32/arm64 Port
> Integrate the unified port of HotSpot for arm32 and arm64, contributed by Oracle, into the JDK.

将Oracle贡献的用于arm32和arm64的HotSpot的统一端口集成到JDK中。

##### JEP 298: Remove Demos and Samples
> Remove the outdated and unmaintained demos and samples.

删除过时的和未维护的demo和example。

##### JEP 299: Reorganize Documentation
> Update the organization of the documents in the JDK, in both the source repositories and the generated docs.

更新JDK中文档的组织，包括源存储库和生成的文档。

## **Java 10**：

[https://openjdk.org/projects/jdk/10/](https://openjdk.org/projects/jdk/10/)

##### △ JEP 286: Local-Variable Type Inference
> Enhance the Java Language to extend type inference to declarations of local variables with initializers.

增强Java语言，将类型推断扩展到使用初始化器的局部变量声明。

##### JEP 296: Consolidate the JDK Forest into a Single Repository
> Combine the numerous repositories of the JDK forest into a single repository in order to simplify and streamline development.

将JDK林中的众多存储库合并为单个存储库，以简化和流线化开发。

##### JEP 304: Garbage Collector Interface
> Improve the source code isolation of different garbage collectors by introducing a clean garbage collector (GC) interface.

通过引入一个干净的垃圾收集器(GC)接口，改进不同垃圾收集器的源代码隔离。

##### JEP 307: Parallel Full GC for G1
> Improve G1 worst-case latencies by making the full GC parallel.

通过使全GC并行来改善G1最坏情况延迟。

##### JEP 310: Application Class-Data Sharing
> To improve startup and footprint, extend the existing Class-Data Sharing ("CDS") feature to allow application classes to be placed in the shared archive.

为了改进启动和内存占用，可以扩展现有的类-数据共享(“CDS”)特性，以允许将应用程序类放在共享存档中。

##### △ JEP 312: Thread-Local Handshakes
> Introduce a way to execute a callback on threads without performing a global VM safepoint. Make it both possible and cheap to stop individual threads and not just all threads or none.

引入一种在线程上执行回调而不执行全局VM安全点的方法。使停止单个线程(而不是停止所有线程或不停止)成为可能且成本低廉。

##### JEP 313: Remove the Native-Header Generation Tool (javah)
> Remove the javah tool from the JDK.

从JDK中删除javah工具。

##### JEP 314: Additional Unicode Language-Tag Extensions
> Enhance java.util.Locale and related APIs to implement additional Unicode extensions of BCP 47 language tags.

增强java.util.Locale和相关api，以实现BCP 47语言标记的额外Unicode扩展。

##### JEP 316: Heap Allocation on Alternative Memory Devices
> Enable the HotSpot VM to allocate the Java object heap on an alternative memory device, such as an NV-DIMM, specified by the user.

启用HotSpot VM在用户指定的替代内存设备(如NV-DIMM)上分配Java对象堆。

##### JEP 317: Experimental Java-Based JIT Compiler
> Enable the Java-based JIT compiler, Graal, to be used as an experimental JIT compiler on the Linux/x64 platform.

启用基于java的JIT编译器Graal作为Linux/x64平台上的实验性JIT编译器。

##### JEP 319: Root Certificates
> Provide a default set of root Certification Authority (CA) certificates in the JDK.

在JDK中提供一组默认的根证书颁发机构(CA)证书。

##### JEP 322: Time-Based Release Versioning
> Revise the version-string scheme of the Java SE Platform and the JDK, and related versioning information, for present and future time-based release models.

针对当前和未来基于时间的发布模型，修改Java SE平台和JDK的版本字符串方案，以及相关的版本控制信息。

## **Java 11▲**：
[https://openjdk.org/projects/jdk/11/](https://openjdk.org/projects/jdk/11/)

##### JEP 181: Nest-Based Access Control
> Introduce nests, an access-control context that aligns with the existing notion of nested types in the Java programming language. Nests allow classes that are logically part of the same code entity, but which are compiled to distinct class files, to access each other's private members without the need for compilers to insert accessibility-broadening bridge methods.

引入nests，这是一种访问控制上下文，与Java编程语言中现有的嵌套类型概念保持一致。nests允许逻辑上属于同一代码实体的类，但它们被编译为不同的类文件，可以访问彼此的私有成员，而不需要编译器插入可访问性扩展的桥接方法。

##### JEP 309: Dynamic Class-File Constants
> Extend the Java class-file format to support a new constant-pool form, CONSTANT_Dynamic. Loading a CONSTANT_Dynamic will delegate creation to a bootstrap method, just as linking an invokedynamic call site delegates linkage to a bootstrap method.

扩展Java类文件格式以支持新的常量池形式CONSTANT_Dynamic。加载CONSTANT_Dynamic将把创建委托给一个bootstrap方法，就像链接invokedynamic调用站点将链接委托给一个bootstrap方法一样。

##### JEP 315: Improve Aarch64 Intrinsics
> Improve the existing string and array intrinsics, and implement new intrinsics for the java.lang.Math sin, cos and log functions, on AArch64 processors.

改进现有的字符串和数组的内在特性，并在AArch64处理器上为java.lang.Math的sin、cos和log函数实现新的内在特性。

##### JEP 318: Epsilon: A No-Op Garbage Collector (Experimental)
> Develop a GC that handles memory allocation but does not implement any actual memory reclamation mechanism. Once the available Java heap is exhausted, the JVM will shut down.

开发一个处理内存分配但不实现任何实际内存回收机制的GC。一旦可用的Java堆耗尽，JVM将关闭。

##### JEP 320: Remove the Java EE and CORBA Modules
> Remove the Java EE and CORBA modules from the Java SE Platform and the JDK. These modules were deprecated in Java SE 9 with the declared intent to remove them in a future release.

从Java SE平台和JDK中删除Java EE和CORBA模块。这些模块在Java SE 9中已弃用，并声明打算在将来的版本中删除它们。

##### JEP 321: HTTP Client
> Standardize the incubated HTTP Client API introduced in JDK 9, via JEP 110, and updated in JDK 10.

标准化JDK 9中引入的孵化HTTP客户端API，通过JEP 110实现，并在JDK 10中更新。

##### ▲ JEP 323: Local-Variable Syntax for Lambda Parameters
> Allow var to be used when declaring the formal parameters of implicitly typed lambda expressions.

允许在声明隐式类型化lambda表达式的形式参数时使用var。

##### JEP 324: Key Agreement with Curve25519 and Curve448
> Implement key agreement using Curve25519 and Curve448 as described in RFC 7748.

使用RFC 7748中描述的Curve25519和Curve448实现密钥协议。

##### JEP 327: Unicode 10
> Upgrade existing platform APIs to support version 10.0 of the Unicode Standard.

升级现有的平台api以支持Unicode标准的10.0版本。

##### JEP 328: Flight Recorder
> Provide a low-overhead data collection framework for troubleshooting Java applications and the HotSpot JVM.

提供低开销的数据收集框架，用于对Java应用程序和HotSpot JVM进行故障排除。

##### JEP 329: ChaCha20 and Poly1305 Cryptographic Algorithms
> Implement the ChaCha20 and ChaCha20-Poly1305 ciphers as specified in RFC 7539. ChaCha20 is a relatively new stream cipher that can replace the older, insecure RC4 stream cipher.

实现RFC 7539中指定的ChaCha20和ChaCha20- poly1305密码。ChaCha20是一种相对较新的流密码，可以取代旧的、不安全的RC4流密码。

##### △ JEP 330: Launch Single-File Source-Code Programs
> Enhance the java launcher to run a program supplied as a single file of Java source code, including usage from within a script by means of "shebang" files and related techniques.

增强java启动器以运行作为单个java源代码文件提供的程序，包括通过“shebang”文件和相关技术从脚本中使用程序。

##### JEP 331: Low-Overhead Heap Profiling
> Provide a low-overhead way of sampling Java heap allocations, accessible via JVMTI.

提供一种低开销的Java堆分配抽样方法，可通过JVMTI访问。

##### JEP 332: Transport Layer Security (TLS) 1.3
> Implement version 1.3 of the Transport Layer Security (TLS) Protocol RFC 8446.

实现1.3版本的传输层安全(TLS)协议RFC 8446。

##### JEP 333: ZGC: A Scalable Low-Latency Garbage Collector (Experimental)
> The Z Garbage Collector, also known as ZGC, is a scalable low-latency garbage collector.

Z垃圾收集器(也称为ZGC)是一种可伸缩的低延迟垃圾收集器。

##### JEP 335: Deprecate the Nashorn JavaScript Engine
> Deprecate the Nashorn JavaScript script engine and APIs, and the jjs tool, with the intent to remove them in a future release.

弃用Nashorn JavaScript脚本引擎和api，以及js工具，并打算在未来的版本中删除它们。

##### JEP 336: Deprecate the Pack200 Tools and API
> Deprecate the pack200 and unpack200 tools, and the Pack200 API in java.util.jar.

弃用pack200和unpack200工具，以及java.util.jar中的pack200 API。

## **Java 12**：
[https://openjdk.org/projects/jdk/12/](https://openjdk.org/projects/jdk/12/)

##### ▲ JEP 189: Shenandoah: A Low-Pause-Time Garbage Collector (Experimental)
> Add a new garbage collection (GC) algorithm named Shenandoah which reduces GC pause times by doing evacuation work concurrently with the running Java threads. Pause times with Shenandoah are independent of heap size, meaning you will have the same consistent pause times whether your heap is 200 MB or 200 GB.

添加一个名为Shenandoah的新垃圾收集(GC)算法，该算法通过与正在运行的Java线程并发地执行疏散工作来减少GC暂停时间。Shenandoah的暂停时间与堆大小无关，这意味着无论堆大小是200 MB还是200 GB，暂停时间都是一致的。

##### JEP 230: Microbenchmark Suite
> Add a basic suite of microbenchmarks to the JDK source code, and make it easy for developers to run existing microbenchmarks and create new ones.

向JDK源代码中添加一套基本的微基准测试，使开发人员可以轻松地运行现有的微基准测试并创建新的微基准测试。

##### JEP 325: Switch Expressions (Preview)
> Extend the switch statement so that it can be used as either a statement or an expression, and that both forms can use either a "traditional" or "simplified" scoping and control flow behavior. These changes will simplify everyday coding, and also prepare the way for the use of pattern matching (JEP 305) in switch. This is a preview language feature in JDK 12.

扩展switch语句，使其既可以用作语句也可以用作表达式，并且这两种形式都可以使用“传统”或“简化”的作用域和控制流行为。这些变化将简化日常编码，并为在交换机中使用模式匹配(JEP 305)做好准备。这是JDK 12中的一个预览语言特性。

##### JEP 334: JVM Constants API
> Introduce an API to model nominal descriptions of key class-file and run-time artifacts, in particular constants that are loadable from the constant pool.

引入一个API来对关键类文件和运行时工件(特别是可从常量池加载的常量)的标称描述进行建模。

##### JEP 340: One AArch64 Port, Not Two
> Remove all of the sources related to the arm64 port while retaining the 32-bit ARM port and the 64-bit aarch64 port.

删除与arm64端口相关的所有源代码，同时保留32位ARM端口和64位aarch64端口。

##### JEP 341: Default CDS Archives
> Enhance the JDK build process to generate a class data-sharing (CDS) archive, using the default class list, on 64-bit platforms.

增强JDK构建过程，在64位平台上使用默认类列表生成类数据共享(CDS)归档。

##### JEP 344: Abortable Mixed Collections for G1
> Make G1 mixed collections abortable if they might exceed the pause target.

如果G1混合集合可能超过暂停目标，则使其可中止。

##### JEP 346: Promptly Return Unused Committed Memory from G1
> Enhance the G1 garbage collector to automatically return Java heap memory to the operating system when idle.

增强G1垃圾收集器，以便在空闲时自动将Java堆内存返回给操作系统。

## **Java 13**：
[https://openjdk.org/projects/jdk/13/](https://openjdk.org/projects/jdk/13/)

##### JEP 350: Dynamic CDS Archives
> Extend application class-data sharing to allow the dynamic archiving of classes at the end of Java application execution. The archived classes will include all loaded application classes and library classes that are not present in the default, base-layer CDS archive.

扩展应用程序类数据共享，允许在Java应用程序执行结束时对类进行动态归档。归档的类将包括所有加载的应用程序类和库类，这些类没有出现在默认的基础层CDS归档中。

##### JEP 351: ZGC: Uncommit Unused Memory (Experimental)
> Enhance ZGC to return unused heap memory to the operating system.

增强ZGC以将未使用的堆内存返回给操作系统。

##### ▲ JEP 353: Reimplement the Legacy Socket API
> Replace the underlying implementation used by the java.net.Socket and java.net.ServerSocket APIs with a simpler and more modern implementation that is easy to maintain and debug. The new implementation will be easy to adapt to work with user-mode threads, a.k.a. fibers, currently being explored in Project Loom.

将java.net.Socket和java.net.ServerSocket api使用的底层实现替换为更简单、更现代、易于维护和调试的实现。新的实现将很容易适应使用用户模式线程，也就是纤维，目前正在Project Loom中进行探索。

##### ▲ JEP 354: Switch Expressions (Second Preview)
> Extend switch so it can be used as either a statement or an expression, and so that both forms can use either traditional case ... : labels (with fall through) or new case ... -> labels (with no fall through), with a further new statement for yielding a value from a switch expression. These changes will simplify everyday coding, and prepare the way for the use of pattern matching (JEP 305) in switch. This is a preview language feature in JDK 13.

扩展switch，使其既可以用作语句也可以用作表达式，并且这两种形式都可以使用传统的大小写…标签(有掉落)或新包装…→标签(没有失败)，以及用于从switch表达式生成值的进一步的新语句。这些变化将简化日常编码，并为在交换机中使用模式匹配(JEP 305)做好准备。这是JDK 13中的一个预览语言特性。

##### JEP 355: Text Blocks (Preview)
> Add text blocks to the Java language. A text block is a multi-line string literal that avoids the need for most escape sequences, automatically formats the string in a predictable way, and gives the developer control over format when desired. This is a preview language feature in JDK 13.

向Java语言中添加文本块。文本块是一个多行字符串字面值，它避免了大多数转义序列的需要，以可预测的方式自动格式化字符串，并在需要时为开发人员提供对格式的控制。这是JDK 13中的一个预览语言特性。

## **Java 14**：
[https://openjdk.org/projects/jdk/14/](https://openjdk.org/projects/jdk/14/)

##### JEP 305: Pattern Matching for instanceof (Preview)
> Enhance the Java programming language with pattern matching for the instanceof operator. Pattern matching allows common logic in a program, namely the conditional extraction of components from objects, to be expressed more concisely and safely. This is a preview language feature in JDK 14.

使用instanceof操作符的模式匹配增强Java编程语言。模式匹配允许程序中的公共逻辑，即从对象中有条件地提取组件，以更简洁和安全的方式表达。这是JDK 14中的一个预览语言特性。

##### JEP 343: Packaging Tool (Incubator)
> Create a tool for packaging self-contained Java applications.

创建一个工具来打包自包含的Java应用程序。

##### JEP 345: NUMA-Aware Memory Allocation for G1
> Improve G1 performance on large machines by implementing NUMA-aware memory allocation.

通过实现numa感知的内存分配来提高大型机器上的G1性能。

##### JEP 349: JFR Event Streaming
> Expose JDK Flight Recorder data for continuous monitoring.

公开JDK Flight Recorder数据以进行持续监控。

##### JEP 352: Non-Volatile Mapped Byte Buffers
> Add new JDK-specific file mapping modes so that the FileChannel API can be used to create MappedByteBuffer instances that refer to non-volatile memory.

添加新的特定于jdk的文件映射模式，以便FileChannel API可以用于创建引用非易失性内存的MappedByteBuffer实例。

##### △ JEP 358: Helpful NullPointerExceptions
> Improve the usability of NullPointerExceptions generated by the JVM by describing precisely which variable was null.

通过精确描述哪个变量为空，提高JVM生成的NullPointerExceptions的可用性。

##### JEP 359: Records (Preview)
> Enhance the Java programming language with records. Records provide a compact syntax for declaring classes which are transparent holders for shallowly immutable data. This is a preview language feature in JDK 14.

用记录增强Java编程语言。记录提供了一种紧凑的语法来声明类，这些类是浅层不可变数据的透明持有者。这是JDK 14中的一个预览语言特性。

##### ▲ JEP 361: Switch Expressions
> Extend switch so it can be used as either a statement or an expression, and so that both forms can use either traditional case ... : labels (with fall through) or new case ... -> labels (with no fall through), with a further new statement for yielding a value from a switch expression. These changes will simplify everyday coding, and prepare the way for the use of pattern matching in switch. This was a preview language feature in JDK 12 and JDK 13.

扩展switch，使其既可以用作语句也可以用作表达式，并且这两种形式都可以使用传统的大小写…标签(有掉落)或新包装…→标签(没有失败)，以及用于从switch表达式生成值的进一步的新语句。这些变化将简化日常编码，并为在switch中使用模式匹配做好准备。这是JDK 12和JDK 13中的一个预览语言特性。

##### JEP 362: Deprecate the Solaris and SPARC Ports
> Deprecate the Solaris/SPARC, Solaris/x64, and Linux/SPARC ports, with the intent to remove them in a future release.

弃用Solaris/SPARC、Solaris/x64和Linux/SPARC端口，并打算在将来的版本中删除它们。

##### ▲ JEP 363: Remove the Concurrent Mark Sweep (CMS) Garbage Collector
> Remove the Concurrent Mark Sweep (CMS) garbage collector.

删除并发标记清除(CMS)垃圾收集器。

##### JEP 364: ZGC on macOS (Experimental)
> Port the ZGC garbage collector to macOS.

将ZGC垃圾收集器移植到macOS。

##### JEP 365: ZGC on Windows (Experimental)
> Port the ZGC garbage collector to Windows.

将ZGC垃圾收集器移植到Windows。

##### JEP 366: Deprecate the ParallelScavenge + SerialOld GC Combination
> Deprecate the combination of the Parallel Scavenge and Serial Old garbage collection algorithms.

不赞成并行清除和串行旧垃圾收集算法的组合。

##### JEP 367: Remove the Pack200 Tools and API
> Remove the pack200 and unpack200 tools, and the Pack200 API in the java.util.jar package. These tools and API were deprecated for removal in Java SE 11 with the express intent to remove them in a future release.

删除pack200和unpack200工具，以及java.util.jar包中的pack200 API。这些工具和API在Java SE 11中已被弃用，并明确打算在将来的版本中删除它们。

##### JEP 368: Text Blocks (Second Preview)
> Add text blocks to the Java language. A text block is a multi-line string literal that avoids the need for most escape sequences, automatically formats the string in a predictable way, and gives the developer control over the format when desired. This is a preview language feature in JDK 14.

向Java语言中添加文本块。文本块是一个多行字符串字面值，它避免了大多数转义序列的需要，以可预测的方式自动格式化字符串，并在需要时让开发人员控制格式。这是JDK 14中的一个预览语言特性。

##### JEP 370: Foreign-Memory Access API (Incubator)
> Introduce an API to allow Java programs to safely and efficiently access foreign memory outside of the Java heap.

引入一个API，允许Java程序安全有效地访问Java堆之外的外部内存。

## **Java 15**：
[https://openjdk.org/projects/jdk/15/](https://openjdk.org/projects/jdk/15/)

##### JEP 339: Edwards-Curve Digital Signature Algorithm (EdDSA)
> Implement cryptographic signatures using the Edwards-Curve Digital Signature Algorithm (EdDSA) as described by RFC 8032.

使用RFC 8032中描述的爱德华兹曲线数字签名算法(EdDSA)实现加密签名。

##### JEP 360: Sealed Classes (Preview)
> Enhance the Java programming language with sealed classes and interfaces. Sealed classes and interfaces restrict which other classes or interfaces may extend or implement them. This is a preview language feature in JDK 15.

使用密封类和接口增强Java编程语言。密封类和接口限制了哪些其他类或接口可以扩展或实现它们。这是JDK 15中的一个预览语言特性。

##### JEP 371: Hidden Classes
> Introduce hidden classes, which are classes that cannot be used directly by the bytecode of other classes. Hidden classes are intended for use by frameworks that generate classes at run time and use them indirectly, via reflection. A hidden class may be defined as a member of an access control nest, and may be unloaded independently of other classes.

引入隐藏类，这些类不能被其他类的字节码直接使用。隐藏类是为在运行时生成类并通过反射间接使用它们的框架所使用的。隐藏类可以定义为访问控制嵌套的成员，并且可以独立于其他类卸载。

##### JEP 372: Remove the Nashorn JavaScript Engine
> Remove the Nashorn JavaScript script engine and APIs, and the jjs tool. The engine, the APIs, and the tool were deprecated for removal in Java 11 with the express intent to remove them in a future release.

删除Nashorn JavaScript脚本引擎和api，以及js工具。引擎、api和工具在Java 11中已被弃用，并明确打算在将来的版本中删除它们。

##### JEP 373: Reimplement the Legacy DatagramSocket API
> Replace the underlying implementations of the java.net.DatagramSocket and java.net.MulticastSocket APIs with simpler and more modern implementations that are easy to maintain and debug. The new implementations will be easy to adapt to work with virtual threads, currently being explored in Project Loom. This is a follow-on to JEP 353, which already reimplemented the legacy Socket API.

将java.net.DatagramSocket和java.net.MulticastSocket api的底层实现替换为更简单、更现代、易于维护和调试的实现。新的实现将很容易适应虚拟线程的工作，目前正在Project Loom中进行探索。这是JEP 353的后续版本，后者已经重新实现了旧的Socket API。

##### ▲ JEP 374: Deprecate and Disable Biased Locking
> Disable biased locking by default, and deprecate all related command-line options.

默认情况下禁用偏锁，并弃用所有相关的命令行选项。

##### JEP 375: Pattern Matching for instanceof (Second Preview)
> Enhance the Java programming language with pattern matching for the instanceof operator. Pattern matching allows common logic in a program, namely the conditional extraction of components from objects, to be expressed more concisely and safely. This is a preview language feature in JDK 15.

使用instanceof操作符的模式匹配增强Java编程语言。模式匹配允许程序中的公共逻辑，即从对象中有条件地提取组件，以更简洁和安全的方式表达。这是JDK 15中的一个预览语言特性。

##### ▲ JEP 377: ZGC: A Scalable Low-Latency Garbage Collector (Production)
> Change the Z Garbage Collector from an experimental feature into a product feature.

将Z垃圾收集器从实验特性更改为产品特性。

##### ▲ JEP 378: Text Blocks
> Add text blocks to the Java language. A text block is a multi-line string literal that avoids the need for most escape sequences, automatically formats the string in a predictable way, and gives the developer control over the format when desired.

向Java语言中添加文本块。文本块是一个多行字符串字面值，它避免了大多数转义序列的需要，以可预测的方式自动格式化字符串，并在需要时让开发人员控制格式。

##### ▲ JEP 379: Shenandoah: A Low-Pause-Time Garbage Collector (Production)
> Change the Shenandoah garbage collector from an experimental feature into a product feature.

将Shenandoah垃圾收集器从实验功能更改为产品功能。

##### JEP 381: Remove the Solaris and SPARC Ports
> Remove the source code and build support for the Solaris/SPARC, Solaris/x64, and Linux/SPARC ports. These ports were deprecated for removal in JDK 14 with the express intent to remove them in a future release.

删除源代码并构建对Solaris/SPARC、Solaris/x64和Linux/SPARC端口的支持。这些端口在JDK 14中已被弃用，并明确打算在未来的版本中删除它们。

##### JEP 383: Foreign-Memory Access API (Second Incubator)
> Introduce an API to allow Java programs to safely and efficiently access foreign memory outside of the Java heap.

引入一个API，允许Java程序安全有效地访问Java堆之外的外部内存。

##### JEP 384: Records (Second Preview)
> Enhance the Java programming language with records, which are classes that act as transparent carriers for immutable data. Records can be thought of as nominal tuples. This is a preview language feature in JDK 15.

使用记录增强Java编程语言，记录是充当不可变数据透明载体的类。记录可以被认为是名义元组。这是JDK 15中的一个预览语言特性。

##### ▲ JEP 385: Deprecate RMI Activation for Removal
> Deprecate the RMI Activation mechanism for future removal. RMI Activation is an obsolete part of RMI that has been optional since Java 8. No other part of RMI will be deprecated.

弃用RMI激活机制以便将来删除。RMI激活是RMI的一个过时的部分，自Java 8以来一直是可选的。RMI的其他部分不会被弃用。

## **Java 16**：
[https://openjdk.org/projects/jdk/16/](https://openjdk.org/projects/jdk/16/)

##### JEP 338: Vector API (Incubator)
> Provide an initial iteration of an incubator module, jdk.incubator.vector, to express vector computations that reliably compile at runtime to optimal vector hardware instructions on supported CPU architectures and thus achieve superior performance to equivalent scalar computations.

提供孵化器模块jdk.incubator的初始迭代。向量，表示在运行时可靠地在支持的CPU架构上编译为最优矢量硬件指令的矢量计算，从而获得优于等效标量计算的性能。

##### JEP 347: Enable C++14 Language Features
> Allow the use of C++14 language features in JDK C++ source code, and give specific guidance about which of those features may be used in HotSpot code.

允许在JDK c++源代码中使用c++ 14语言特性，并对HotSpot代码中可以使用哪些特性给出具体的指导。

##### JEP 357: Migrate from Mercurial to Git
> Migrate the OpenJDK Community's source code repositories from Mercurial (hg) to Git.

将OpenJDK社区的源代码库从Mercurial (hg)迁移到Git。

##### JEP 369: Migrate to GitHub
> Host the OpenJDK Community's Git repositories on GitHub. In concert with JEP 357 (Migrate from Mercurial to Git), this would migrate all single-repository OpenJDK Projects to GitHub, including both JDK feature releases and JDK update releases for versions 11 and later.

在GitHub上托管OpenJDK社区的Git存储库。与JEP 357(从Mercurial迁移到Git)一致，这将把所有单一存储库的OpenJDK项目迁移到GitHub，包括JDK功能版本和JDK 11及以后版本的更新版本。

##### JEP 376: ZGC: Concurrent Thread-Stack Processing
> Move ZGC thread-stack processing from safepoints to a concurrent phase.

将ZGC线程堆栈处理从安全点移到并发阶段。

##### JEP 380: Unix-Domain Socket Channels
> Add Unix-domain (AF_UNIX) socket support to the socket channel and server-socket channel APIs in the java.nio.channels package. Extend the inherited channel mechanism to support Unix-domain socket channels and server socket channels.

在java.nio.channels包中为套接字通道和服务器-套接字通道api添加unix域(AF_UNIX)套接字支持。扩展继承的通道机制以支持unix域套接字通道和服务器套接字通道。

##### JEP 386: Alpine Linux Port
> Port the JDK to Alpine Linux, and to other Linux distributions that use musl as their primary C library, on both the x64 and AArch64 architectures,

在x64和AArch64架构上，将JDK移植到Alpine Linux，以及其他使用musl作为主要C库的Linux发行版。

##### JEP 387: Elastic Metaspace
> Return unused HotSpot class-metadata (i.e., metaspace) memory to the operating system more promptly, reduce metaspace footprint, and simplify the metaspace code in order to reduce maintenance costs.

将未使用的HotSpot类元数据(即元空间)内存更及时地返回给操作系统，减少元空间占用，简化元空间代码，从而降低维护成本。

##### JEP 388: Windows/AArch64 Port
> Port the JDK to Windows/AArch64.

将JDK移植到Windows/AArch64。

##### JEP 389: Foreign Linker API (Incubator)
> Introduce an API that offers statically-typed, pure-Java access to native code. This API, together with the Foreign-Memory API (JEP 393), will considerably simplify the otherwise error-prone process of binding to a native library.

引入一个API，提供对本机代码的静态类型纯java访问。这个API与外部内存API (JEP 393)一起，将大大简化绑定到本机库的过程，否则容易出错。

##### JEP 390: Warnings for Value-Based Classes
> Designate the primitive wrapper classes as value-based and deprecate their constructors for removal, prompting new deprecation warnings. Provide warnings about improper attempts to synchronize on instances of any value-based classes in the Java Platform.

将原语包装器类指定为基于值的类，并弃用它们的构造函数以移除，从而提示新的弃用警告。对于在Java平台中任何基于值的类的实例上进行不正确的同步尝试，提供警告。

##### JEP 392: Packaging Tool
> Provide the jpackage tool, for packaging self-contained Java applications.

提供jpackage工具，用于打包自包含的Java应用程序。

##### JEP 393: Foreign-Memory Access API (Third Incubator)
> Introduce an API to allow Java programs to safely and efficiently access foreign memory outside of the Java heap.

引入一个API，允许Java程序安全有效地访问Java堆之外的外部内存。

##### JEP 394: Pattern Matching for instanceof
> Enhance the Java programming language with pattern matching for the instanceof operator. Pattern matching allows common logic in a program, namely the conditional extraction of components from objects, to be expressed more concisely and safely.

使用instanceof操作符的模式匹配增强Java编程语言。模式匹配允许程序中的公共逻辑，即从对象中有条件地提取组件，以更简洁和安全的方式表达。

##### JEP 395: Records
> Enhance the Java programming language with records, which are classes that act as transparent carriers for immutable data. Records can be thought of as nominal tuples.

使用记录增强Java编程语言，记录是充当不可变数据透明载体的类。记录可以被认为是名义元组。

##### JEP 396: Strongly Encapsulate JDK Internals by Default
> Strongly encapsulate all internal elements of the JDK by default, except for critical internal APIs such as sun.misc.Unsafe. Allow end users to choose the relaxed strong encapsulation that has been the default since JDK 9.

默认情况下，强封装JDK的所有内部元素，但关键的内部api(如sun.misc.Unsafe)除外。允许最终用户选择宽松的强封装，这是JDK 9以来的默认设置。

##### JEP 397: Sealed Classes (Second Preview)
> Enhance the Java programming language with sealed classes and interfaces. Sealed classes and interfaces restrict which other classes or interfaces may extend or implement them. This is a preview language feature in JDK 16.

使用密封类和接口增强Java编程语言。密封类和接口限制了哪些其他类或接口可以扩展或实现它们。这是JDK 16中的一个预览语言特性。

## **Java 17▲** ：
[https://openjdk.org/projects/jdk/17/](https://openjdk.org/projects/jdk/17/)

##### JEP 306: Restore Always-Strict Floating-Point Semantics
> Make floating-point operations consistently strict, rather than have both strict floating-point semantics (strictfp) and subtly different default floating-point semantics. This will restore the original floating-point semantics to the language and VM, matching the semantics before the introduction of strict and default floating-point modes in Java SE 1.2.

使浮点操作始终严格，而不是同时具有严格的浮点语义(strictfp)和略有不同的默认浮点语义。这将恢复语言和VM的原始浮点语义，与Java SE 1.2中引入严格和默认浮点模式之前的语义相匹配。

##### ▲ JEP 356: Enhanced Pseudo-Random Number Generators
> Provide new interface types and implementations for pseudorandom number generators (PRNGs), including jumpable PRNGs and an additional class of splittable PRNG algorithms (LXM).

为伪随机数生成器(PRNG)提供新的接口类型和实现，包括可跳转PRNG和另一类可分割PRNG算法(LXM)。

##### JEP 382: New macOS Rendering Pipeline
> Implement a Java 2D internal rendering pipeline for macOS using the Apple Metal API as alternative to the existing pipeline, which uses the deprecated Apple OpenGL API.

使用Apple Metal API为macOS实现一个Java 2D内部渲染管道，作为现有管道的替代方案，该管道使用已弃用的Apple OpenGL API。

##### JEP 391: macOS/AArch64 Port
> Port the JDK to macOS/AArch64.

将JDK移植到macOS/AArch64。

##### JEP 398: Deprecate the Applet API for Removal
> Deprecate the Applet API for removal. It is essentially irrelevant since all web-browser vendors have either removed support for Java browser plug-ins or announced plans to do so.

弃用Applet API以便删除。它本质上是无关紧要的，因为所有的web浏览器供应商要么已经取消了对Java浏览器插件的支持，要么宣布了这样做的计划。

##### JEP 403: Strongly Encapsulate JDK Internals
> Strongly encapsulate all internal elements of the JDK, except for critical internal APIs such as sun.misc.Unsafe. It will no longer be possible to relax the strong encapsulation of internal elements via a single command-line option, as was possible in JDK 9 through JDK 16.

坚定地封装JDK的所有内部元素，除了关键的内部api(如sun.misc.Unsafe)。不再可能像JDK 9到JDK 16那样，通过单个命令行选项放松对内部元素的强封装。

##### JEP 406: Pattern Matching for switch (Preview)
> Enhance the Java programming language with pattern matching for switch expressions and statements, along with extensions to the language of patterns. Extending pattern matching to switch allows an expression to be tested against a number of patterns, each with a specific action, so that complex data-oriented queries can be expressed concisely and safely. This is a preview language feature in JDK 17.

使用switch表达式和语句的模式匹配增强Java编程语言，以及对模式语言的扩展。将模式匹配扩展到switch允许针对多个模式对表达式进行测试，每个模式都有一个特定的操作，这样就可以简明而安全地表达复杂的面向数据的查询。这是JDK 17中的一个预览语言特性。

##### JEP 407: Remove RMI Activation
> Remove the Remote Method Invocation (RMI) Activation mechanism, while preserving the rest of RMI

删除远程方法调用(RMI)激活机制，同时保留RMI的其余部分。

##### JEP 409: Sealed Classes
> Enhance the Java programming language with sealed classes and interfaces. Sealed classes and interfaces restrict which other classes or interfaces may extend or implement them.

使用密封类和接口增强Java编程语言。密封类和接口限制了哪些其他类或接口可以扩展或实现它们。

##### ▲ JEP 410: Remove the Experimental AOT and JIT Compiler
> Remove the experimental Java-based ahead-of-time (AOT) and just-in-time (JIT) compiler. This compiler has seen little use since its introduction and the effort required to maintain it is significant. Retain the experimental Java-level JVM compiler interface (JVMCI) so that developers can continue to use externally-built versions of the compiler for JIT compilation.

删除实验性的基于java的提前(AOT)和即时(JIT)编译器。该编译器自推出以来很少使用，维护它所需的工作量很大。保留实验性的java级JVM编译器接口(JVMCI)，以便开发人员可以继续使用外部构建版本的编译器进行JIT编译。

##### JEP 411: Deprecate the Security Manager for Removal
> Deprecate the Security Manager for removal in a future release. The Security Manager dates from Java 1.0. It has not been the primary means of securing client-side Java code for many years, and it has rarely been used to secure server-side code. To move Java forward, we intend to deprecate the Security Manager for removal in concert with the legacy Applet API (JEP 398).

弃用安全管理器以便在将来的版本中删除。安全管理器可以追溯到Java 1.0。多年来，它一直不是保护客户端Java代码的主要手段，而且很少用于保护服务器端代码。为了推动Java向前发展，我们打算弃用安全管理器，以便与遗留Applet API (JEP 398)一起删除。

##### JEP 412: Foreign Function & Memory API (Incubator)
> Introduce an API by which Java programs can interoperate with code and data outside of the Java runtime. By efficiently invoking foreign functions (i.e., code outside the JVM), and by safely accessing foreign memory (i.e., memory not managed by the JVM), the API enables Java programs to call native libraries and process native data without the brittleness and danger of JNI.

引入一个API，通过该API, Java程序可以与Java运行时之外的代码和数据进行互操作。通过有效地调用外部函数(即JVM外部的代码)和安全地访问外部内存(即JVM不管理的内存)，API使Java程序能够调用本机库并处理本机数据，而不会出现JNI的脆弱性和危险。

##### JEP 414: Vector API (Second Incubator)
> Introduce an API to express vector computations that reliably compile at runtime to optimal vector instructions on supported CPU architectures, thus achieving performance superior to equivalent scalar computations.

引入API来表达矢量计算，在运行时可靠地在支持的CPU架构上编译为最优矢量指令，从而实现优于等效标量计算的性能。

##### JEP 415: Context-Specific Deserialization Filters
> Allow applications to configure context-specific and dynamically-selected deserialization filters via a JVM-wide filter factory that is invoked to select a filter for each individual deserialization operation.

允许应用程序通过jvm范围的过滤器工厂配置上下文特定的和动态选择的反序列化过滤器，该过滤器工厂被调用以为每个单独的反序列化操作选择过滤器。

## **Java 18**：
[https://openjdk.org/projects/jdk/18/](https://openjdk.org/projects/jdk/18/)
##### △ JEP 400: UTF-8 by Default
> Specify UTF-8 as the default charset of the standard Java APIs. With this change, APIs that depend upon the default charset will behave consistently across all implementations, operating systems, locales, and configurations.

指定UTF-8作为标准Java api的默认字符集。通过此更改，依赖于默认字符集的api将在所有实现、操作系统、语言环境和配置中保持一致。

##### JEP 408: Simple Web Server
> Provide a command-line tool to start a minimal web server that serves static files only. No CGI or servlet-like functionality is available. This tool will be useful for prototyping, ad-hoc coding, and testing purposes, particularly in educational contexts.

提供一个命令行工具来启动一个只提供静态文件的最小web服务器。没有CGI或类似servlet的功能可用。这个工具对于原型设计、特别编码和测试非常有用，特别是在教育环境中。

##### JEP 413: Code Snippets in Java API Documentation
> Introduce an @snippet tag for JavaDoc's Standard Doclet, to simplify the inclusion of example source code in API documentation.

为JavaDoc的Standard Doclet引入@snippet标记，以简化在API文档中包含示例源代码的过程。

##### JEP 416: Reimplement Core Reflection with Method Handles
> Reimplement java.lang.reflect.Method, Constructor, and Field on top of java.lang.invoke method handles. Making method handles the underlying mechanism for reflection will reduce the maintenance and development cost of both the java.lang.reflect and java.lang.invoke APIs.

重装数组;方法、构造函数和字段位于java.lang.invoke方法句柄之上。使方法处理反射的底层机制将减少java.lang.reflect和java.lang.invoke api的维护和开发成本。

##### JEP 417: Vector API (Third Incubator)
> Introduce an API to express vector computations that reliably compile at runtime to optimal vector instructions on supported CPU architectures, thus achieving performance superior to equivalent scalar computations.

引入API来表达矢量计算，在运行时可靠地在支持的CPU架构上编译为最优矢量指令，从而实现优于等效标量计算的性能。

##### △ JEP 418: Internet-Address Resolution SPI
> Define a service-provider interface (SPI) for host name and address resolution, so that java.net.InetAddress can make use of resolvers other than the platform's built-in resolver.

为主机名和地址解析定义一个服务提供者接口(SPI)，以便java.net.InetAddress可以使用平台内置解析器以外的解析器。

##### JEP 419: Foreign Function & Memory API (Second Incubator)
> Introduce an API by which Java programs can interoperate with code and data outside of the Java runtime. By efficiently invoking foreign functions (i.e., code outside the JVM), and by safely accessing foreign memory (i.e., memory not managed by the JVM), the API enables Java programs to call native libraries and process native data without the brittleness and danger of JNI.

引入一个API，通过该API, Java程序可以与Java运行时之外的代码和数据进行互操作。通过有效地调用外部函数(即JVM外部的代码)和安全地访问外部内存(即JVM不管理的内存)，API使Java程序能够调用本机库并处理本机数据，而不会出现JNI的脆弱性和危险。

##### JEP 420: Pattern Matching for switch (Second Preview)
> Enhance the Java programming language with pattern matching for switch expressions and statements, along with extensions to the language of patterns. Extending pattern matching to switch allows an expression to be tested against a number of patterns, each with a specific action, so that complex data-oriented queries can be expressed concisely and safely. This is a preview language feature in JDK 18.

使用switch表达式和语句的模式匹配增强Java编程语言，以及对模式语言的扩展。将模式匹配扩展到switch允许针对多个模式对表达式进行测试，每个模式都有一个特定的操作，这样就可以简明而安全地表达复杂的面向数据的查询。这是JDK 18中的一个预览语言特性。

##### JEP 421: Deprecate Finalization for Removal
> Deprecate finalization for removal in a future release. Finalization remains enabled by default for now, but can be disabled to facilitate early testing. In a future release it will be disabled by default, and in a later release it will be removed. Maintainers of libraries and applications that rely upon finalization should consider migrating to other resource management techniques such as the try-with-resources statement and cleaners.

为了在将来的版本中删除，不建议使用最终化。最终化目前默认是启用的，但是可以禁用它来促进早期测试。在未来的版本中，默认情况下它将被禁用，在以后的版本中它将被删除。依赖于终结的库和应用程序的维护者应该考虑迁移到其他资源管理技术，比如try-with-resources语句和清理器。

## **Java 19**：
[https://openjdk.org/projects/jdk/19/](https://openjdk.org/projects/jdk/19/)

##### JEP 405: Record Patterns (Preview)
> Enhance the Java programming language with record patterns to deconstruct record values. Record patterns and type patterns can be nested to enable a powerful, declarative, and composable form of data navigation and processing. This is a preview language feature.

使用记录模式增强Java编程语言，以解构记录值。可以嵌套记录模式和类型模式，以支持强大的、声明性的和可组合的数据导航和处理形式。这是一个预览语言特性。

##### JEP 422: Linux/RISC-V Port
> Port the JDK to Linux/RISC-V.

将JDK移植到Linux/RISC-V上。

##### JEP 424: Foreign Function & Memory API (Preview)
> Introduce an API by which Java programs can interoperate with code and data outside of the Java runtime. By efficiently invoking foreign functions (i.e., code outside the JVM), and by safely accessing foreign memory (i.e., memory not managed by the JVM), the API enables Java programs to call native libraries and process native data without the brittleness and danger of JNI. This is a preview API.

引入一个API，通过该API, Java程序可以与Java运行时之外的代码和数据进行互操作。通过有效地调用外部函数(即JVM外部的代码)和安全地访问外部内存(即JVM不管理的内存)，API使Java程序能够调用本机库并处理本机数据，而不会出现JNI的脆弱性和危险。这是一个预览API。

##### JEP 425: Virtual Threads (Preview)
> Introduce virtual threads to the Java Platform. Virtual threads are lightweight threads that dramatically reduce the effort of writing, maintaining, and observing high-throughput concurrent applications. This is a preview API.

向Java平台引入虚拟线程。虚拟线程是轻量级线程，可以显著减少编写、维护和观察高吞吐量并发应用程序的工作量。这是一个预览API。

##### JEP 426: Vector API (Fourth Incubator)
> Introduce an API to express vector computations that reliably compile at runtime to optimal vector instructions on supported CPU architectures, thus achieving performance superior to equivalent scalar computations.

引入API来表达矢量计算，在运行时可靠地在支持的CPU架构上编译为最优矢量指令，从而实现优于等效标量计算的性能。

##### JEP 427: Pattern Matching for switch (Third Preview)
> Enhance the Java programming language with pattern matching for switch expressions and statements. Extending pattern matching to switch allows an expression to be tested against a number of patterns, each with a specific action, so that complex data-oriented queries can be expressed concisely and safely. This is a preview language feature.

使用switch表达式和语句的模式匹配增强Java编程语言。将模式匹配扩展到switch允许针对多个模式对表达式进行测试，每个模式都有一个特定的操作，这样就可以简明而安全地表达复杂的面向数据的查询。这是一个预览语言特性。

##### JEP 428: Structured Concurrency (Incubator)
> Simplify multithreaded programming by introducing an API for structured concurrency. Structured concurrency treats multiple tasks running in different threads as a single unit of work, thereby streamlining error handling and cancellation, improving reliability, and enhancing observability. This is an incubating API.

通过引入结构化并发的API来简化多线程编程。结构化并发将在不同线程中运行的多个任务视为单个工作单元，从而简化了错误处理和取消，提高了可靠性并增强了可观察性。这是一个正在孵化的API。

## **Java 20**：
[https://openjdk.org/projects/jdk/20/](https://openjdk.org/projects/jdk/20/)

##### JEP 429: Scoped Values (Incubator)
> Introduce scoped values, which enable the sharing of immutable data within and across threads. They are preferred to thread-local variables, especially when using large numbers of virtual threads. This is an incubating API.

引入有作用域的值，这样可以在线程内部和线程之间共享不可变数据。它们比线程局部变量更可取，特别是在使用大量虚拟线程时。这是一个正在孵化的API。

##### JEP 432: Record Patterns (Second Preview)
> Enhance the Java programming language with record patterns to deconstruct record values. Record patterns and type patterns can be nested to enable a powerful, declarative, and composable form of data navigation and processing. This is a preview language feature.

使用记录模式增强Java编程语言，以解构记录值。可以嵌套记录模式和类型模式，以支持强大的、声明性的和可组合的数据导航和处理形式。这是一个预览语言特性。

##### JEP 433: Pattern Matching for switch (Fourth Preview)
> Enhance the Java programming language with pattern matching for switch expressions and statements. Extending pattern matching to switch allows an expression to be tested against a number of patterns, each with a specific action, so that complex data-oriented queries can be expressed concisely and safely. This is a preview language feature.

使用switch表达式和语句的模式匹配增强Java编程语言。将模式匹配扩展到switch允许针对多个模式对表达式进行测试，每个模式都有一个特定的操作，这样就可以简明而安全地表达复杂的面向数据的查询。这是一个预览语言特性。

##### JEP 434: Foreign Function & Memory API (Second Preview)
> Introduce an API by which Java programs can interoperate with code and data outside of the Java runtime. By efficiently invoking foreign functions (i.e., code outside the JVM), and by safely accessing foreign memory (i.e., memory not managed by the JVM), the API enables Java programs to call native libraries and process native data without the brittleness and danger of JNI. This is a preview API.

引入一个API，通过该API, Java程序可以与Java运行时之外的代码和数据进行互操作。通过有效地调用外部函数(即JVM外部的代码)和安全地访问外部内存(即JVM不管理的内存)，API使Java程序能够调用本机库并处理本机数据，而不会出现JNI的脆弱性和危险。这是一个预览API。

##### JEP 436: Virtual Threads (Second Preview)
> Introduce virtual threads to the Java Platform. Virtual threads are lightweight threads that dramatically reduce the effort of writing, maintaining, and observing high-throughput concurrent applications. This is a preview API.

向Java平台引入虚拟线程。虚拟线程是轻量级线程，可以显著减少编写、维护和观察高吞吐量并发应用程序的工作量。这是一个预览API。

##### JEP 437: Structured Concurrency (Second Incubator)
> Simplify multithreaded programming by introducing an API for structured concurrency. Structured concurrency treats multiple tasks running in different threads as a single unit of work, thereby streamlining error handling and cancellation, improving reliability, and enhancing observability. This is an incubating API.

通过引入结构化并发的API来简化多线程编程。结构化并发将在不同线程中运行的多个任务视为单个工作单元，从而简化了错误处理和取消，提高了可靠性并增强了可观察性。这是一个正在孵化的API。

##### JEP 438: Vector API (Fifth Incubator)
> Introduce an API to express vector computations that reliably compile at runtime to optimal vector instructions on supported CPU architectures, thus achieving performance superior to equivalent scalar computations.

引入API来表达矢量计算，在运行时可靠地在支持的CPU架构上编译为最优矢量指令，从而实现优于等效标量计算的性能。

## **Java 21▲**：
[https://openjdk.org/projects/jdk/21/](https://openjdk.org/projects/jdk/21/)

JDK 21 will be a long-term support (LTS) release from most vendors.

JDK 21将是大多数供应商提供的长期支持(LTS)版本。

##### JEP 430: String Templates (Preview)
> Enhance the Java programming language with string templates. String templates complement Java's existing string literals and text blocks by coupling literal text with embedded expressions and template processors to produce specialized results. This is a preview language feature and API.

使用字符串模板增强Java编程语言。字符串模板通过将文本与嵌入表达式和模板处理器耦合来产生专门的结果，从而补充了Java现有的字符串文字和文本块。这是一个预览语言特性和API。

##### △ JEP 431: Sequenced Collections
> Introduce new interfaces to represent collections with a defined encounter order. Each such collection has a well-defined first element, second element, and so forth, up to the last element. It also provides uniform APIs for accessing its first and last elements, and for processing its elements in reverse order.

引入新的接口来表示具有定义的相遇顺序的集合。每个这样的集合都有定义良好的第一个元素、第二个元素，依此类推，直到最后一个元素。它还提供了统一的api来访问它的第一个和最后一个元素，并以相反的顺序处理它的元素。

##### ▲ JEP 439: Generational ZGC
> Improve application performance by extending the Z Garbage Collector (ZGC) to maintain separate generations for young and old objects. This will allow ZGC to collect young objects — which tend to die young — more frequently.

通过扩展Z垃圾收集器(ZGC)来为年轻对象和老对象维护单独的代，从而提高应用程序性能。这将允许ZGC更频繁地收集年轻的对象——它们往往会在年轻时死亡。

##### JEP 440: Record Patterns
> Enhance the Java programming language with record patterns to deconstruct record values. Record patterns and type patterns can be nested to enable a powerful, declarative, and composable form of data navigation and processing.

使用记录模式增强Java编程语言，以解构记录值。可以嵌套记录模式和类型模式，以支持强大的、声明性的和可组合的数据导航和处理形式。

##### ▲ JEP 441: Pattern Matching for switch
> Enhance the Java programming language with pattern matching for switch expressions and statements. Extending pattern matching to switch allows an expression to be tested against a number of patterns, each with a specific action, so that complex data-oriented queries can be expressed concisely and safely.

使用switch表达式和语句的模式匹配增强Java编程语言。将模式匹配扩展到switch允许针对多个模式对表达式进行测试，每个模式都有一个特定的操作，这样就可以简明而安全地表达复杂的面向数据的查询。

##### JEP 442: Foreign Function & Memory API (Third Preview)
> Introduce an API by which Java programs can interoperate with code and data outside of the Java runtime. By efficiently invoking foreign functions (i.e., code outside the JVM), and by safely accessing foreign memory (i.e., memory not managed by the JVM), the API enables Java programs to call native libraries and process native data without the brittleness and danger of JNI. This is a preview API.

引入一个API，通过该API, Java程序可以与Java运行时之外的代码和数据进行互操作。通过有效地调用外部函数(即JVM外部的代码)和安全地访问外部内存(即JVM不管理的内存)，API使Java程序能够调用本机库并处理本机数据，而不会出现JNI的脆弱性和危险。这是一个预览API。

##### JEP 443: Unnamed Patterns and Variables (Preview)
> Enhance the Java language with unnamed patterns, which match a record component without stating the component's name or type, and unnamed variables, which can be initialized but not used. Both are denoted by an underscore character, _. This is a preview language feature.

使用未命名模式增强Java语言，未命名模式匹配记录组件而不声明组件的名称或类型，以及未命名变量，这些变量可以初始化但不能使用。两者都由下划线_表示。这是一个预览语言特性。

##### ▲ JEP 444: Virtual Threads
> Introduce virtual threads to the Java Platform. Virtual threads are lightweight threads that dramatically reduce the effort of writing, maintaining, and observing high-throughput concurrent applications.

向Java平台引入虚拟线程。虚拟线程是轻量级线程，可以显著减少编写、维护和观察高吞吐量并发应用程序的工作量。

##### JEP 445: Unnamed Classes and Instance Main Methods (Preview)
> Evolve the Java language so that students can write their first programs without needing to understand language features designed for large programs. Far from using a separate dialect of Java, students can write streamlined declarations for single-class programs and then seamlessly expand their programs to use more advanced features as their skills grow. This is a preview language feature.

发展Java语言，使学生可以编写他们的第一个程序，而不需要了解为大型程序设计的语言特性。学生不必使用单独的Java方言，而是可以为单类程序编写精简的声明，然后随着技能的提高，无缝地扩展程序，使用更高级的功能。这是一个预览语言特性。

##### JEP 446: Scoped Values (Preview)
> Introduce scoped values, values that may be safely and efficiently shared to methods without using method parameters. They are preferred to thread-local variables, especially when using large numbers of virtual threads. This is a preview API.

引入有作用域的值，这些值可以在不使用方法参数的情况下安全有效地共享给方法。它们比线程局部变量更可取，特别是在使用大量虚拟线程时。这是一个预览API。

##### JEP 448: Vector API (Sixth Incubator)
> Introduce an API to express vector computations that reliably compile at runtime to optimal vector instructions on supported CPU architectures, thus achieving performance superior to equivalent scalar computations.

引入API来表达矢量计算，在运行时可靠地在支持的CPU架构上编译为最优矢量指令，从而实现优于等效标量计算的性能。

##### JEP 449: Deprecate the Windows 32-bit x86 Port for Removal
> Deprecate the Windows 32-bit x86 port, with the intent to remove it in a future release.

弃用Windows 32位x86端口，并打算在将来的版本中删除它。

##### ▲ JEP 451: Prepare to Disallow the Dynamic Loading of Agents
> Issue warnings when agents are loaded dynamically into a running JVM. These warnings aim to prepare users for a future release which disallows the dynamic loading of agents by default in order to improve integrity by default. Serviceability tools that load agents at startup will not cause warnings to be issued in any release.

在将代理动态加载到正在运行的JVM中时发出警告。这些警告的目的是让用户为将来的版本做好准备，该版本默认情况下不允许动态加载代理，以便在默认情况下提高完整性。在启动时加载代理的可服务性工具不会在任何版本中发出警告。

##### JEP 452: Key Encapsulation Mechanism API
> Introduce an API for key encapsulation mechanisms (KEMs), an encryption technique for securing symmetric keys using public key cryptography.

引入密钥封装机制(kem)的API，这是一种使用公钥加密保护对称密钥的加密技术。

##### JEP 453: Structured Concurrency (Preview)
> Simplify concurrent programming by introducing an API for structured concurrency. Structured concurrency treats groups of related tasks running in different threads as a single unit of work, thereby streamlining error handling and cancellation, improving reliability, and enhancing observability. This is a preview API.

通过引入结构化并发的API来简化并发编程。结构化并发将在不同线程中运行的相关任务组视为单个工作单元，从而简化了错误处理和取消，提高了可靠性，并增强了可观察性。这是一个预览API。
