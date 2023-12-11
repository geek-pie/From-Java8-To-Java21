
# **Java 8**³：
## Stream API
- 实际上，在我们的使用过程中，Stream的使用往往会包含以下多个新的feature，因此先行提及，但后续的介绍让我们能够清晰地了解，在我们进行stream的复杂操作时，分别涉及到的具体特性是什么
- Stream API是Java函数式编程的核心。Stream API可以对集合进行非常复杂的查找、过滤和映射数据等操作。使用Stream API可以极大提高程序效率和程序可读性，同时它也是处理并行操作的好工具²。
  1. **无存储**：Stream不是一种数据结构，它不会保存数据，它只是对数据源进行计算。
  2. **函数式**：对Stream的任何修改都不会修改背后的数据源，比如对Stream执行过滤操作并不会删除被过滤的元素，而是产生一个新的Stream，它包含原Stream中符合条件的元素。
  3. **惰性执行**：Stream API很多操作是延迟执行的，这意味着它们会等到需要结果的时候才执行。
  4. **可消费性**：Stream只能被“消费”一次，一旦这个Stream被消费掉，你需要重新创建一个新的Stream来重新执行相同的操作。
Stream API支持两种类型的操作：
- **中间操作**：返回一个新的Stream，如`filter`、`map`、`sorted`等。
- **结束操作**：返回一个最终结果，如`reduce`、`collect`、`forEach`等。
  例如，下面的代码片段使用Stream API从一组字符串中筛选出以"abc"开头的字符串，并打印出来³：
  ```java
      List<String> list = Arrays.asList("abc1", "abc2", "abc3");
      list.stream()
        .filter(element -> element.startsWith("abc"))
        .forEach(System.out::println);
  ```
##  Lambda 表达式。
Lambda表达式，也称为闭包，是Java 8的重要新特性。Lambda允许把函数作为一个方法的参数（函数作为参数传递进方法中）。使用Lambda表达式可以使代码变得更加简洁紧凑。
- 不需要参数,返回值为 5: `() -> 5`
- 接收一个参数 (数字类型),返回其2倍的值: `x -> 2 * x`
- 接受2个参数 (数字),并返回他们的差值: `(x, y) -> x – y`
- 接收2个int型整数,返回他们的和: `(int x, int y) -> x + y`
- 接受一个 string 对象,并在控制台打印,不返回任何值 (看起来像是返回void): `(String s) -> System.out.print(s)`
##  函数式接口 
函数式接口是只有一个抽象方法的接口，用作Lambda表达式的类型。Java 8引入了`@FunctionalInterface`注解来更明确地标识一个接口是函数式接口。例如，我们可以定义一个函数式接口`MyFunction`，然后使用Lambda表达式来实现它
    ```java
    @FunctionalInterface
    interface MyFunction<T> {
        void sayMessage(T t);
    }
    MyFunction<String> myFunc = msg -> System.out.println(msg);
    myFunc.sayMessage("Hello, world!");
    ```
##  方法引用 
方法引用是用来直接访问类或者实例的已经存在的方法或者构造方法。方法引用提供了一种引用而不执行方法的方式，它需要由兼容的函数式接口构成的目标类型上下文。方法引用可以分为以下几种类型：
- 静态方法引用：`ClassName::methodName`
- 实例上的实例方法引用：`instanceReference::methodName`
- 超类上的实例方法引用：`super::methodName`
- 类型上的实例方法引用：`ClassName::methodName`
- 构造方法引用：`ClassName::new`
- 数组构造方法引用：`TypeName[]::new`
##  Date Time API
- Java 8引入了一个全新的日期/时间API，位于java.time包下。这个API包含了一系列重要的类，用于处理日期和时间¹²⁴。以下是一些主要的类：
  1. **Local**：简化了日期时间的处理，没有时区的问题³⁴。
     - `LocalDate`：用于表示“本地日期”，无“时间”。LocalDate不承载时区信息¹。
     - `LocalTime`：用于表示“本地时间”，无“日期”。LocalTime不承载时区信息¹。
     - `LocalDateTime`：用于表示“本地日期与时间”。LocalDateTime不承载时区信息¹。
  2. **Zoned**：通过指定的时区处理日期时间³⁴。
      - 这些类提供了丰富的方法来获取和操作日期和时间，例如获取年份、月份、日、小时、分钟和秒等¹。此外，它们还提供了用于解析和格式化日期时间字符串的方法¹。这个新的日期/时间API使用ISO-8601（基于公历）作为默认的日历系统¹。它提供了一系列的类，用于处理日期、时间、日期/时间、时区、时刻（instants）、过程（during）以及时钟（clock）³。例如，`LocalDate`、`LocalTime`和`LocalDateTime`这些类代表了观察者所在地的本地日期/时间²。我们主要在不需要明确指定时区的上下文中使用这些类². 此外，新的日期/时间API还提供了一系列的方法，用于格式化和解析日期和时间¹。新的API有以下的改进：
        1. **线程安全**：新的日期时间API是线程安全的。不仅没有setter方法，而且任何对实例的变更都会返回一个新的实例，保证原来的实例不变¹。
        2. **丰富的方法**：新的日期时间API提供了大量的方法，用于修改日期时间的各个部分，并返回一个新的实例¹。
        3. **借鉴了第三方日期时间库joda的优点**¹。
        4. **时区处理**：在时区方面，新的日期时间API引入了域 (domain) 这个概念¹
##  Optional 类
Java 8的Optional类是一个可以为null的容器对象¹。如果值存在，则`isPresent()`方法会返回true，调用`get()`方法会返回该对象¹。Optional是个容器：它可以保存类型T的值，或者仅仅保存null¹。Optional提供很多有用的方法，这样我们就不用显式进行空值检测¹。Optional类的引入很好的解决空指针异常¹。
以下是一些主要的Optional类方法¹：
- `empty()`：返回空的Optional实例¹。
- `filter(Predicate<? super T> predicate)`：如果值存在，并且这个值匹配给定的predicate，返回一个Optional用以描述这个值，否则返回一个空的Optional¹。
- `flatMap(Function<? super T,Optional<U>> mapper)`：如果值存在，返回基于Optional包含的映射方法的值，否则返回一个空的Optional¹。
- `get()`：如果在这个Optional中包含这个值，返回值，否则抛出异常：NoSuchElementException¹.
- `ifPresent(Consumer<? super T> consumer)`：如果值存在则使用该值调用consumer, 否则不做任何事情¹.
- `isPresent()`：如果值存在则方法会返回true，否则返回 false¹.
-  `map(Function<? super T,? extends U> mapper)`：如果有值，则对其执行调用映射函数得到返回值。如果返回值不为null，则创建包含映射返回值的Optional作为map方法返回值，否则返回空Optional¹.
- `of(T value)`：返回一个指定非null值的Optional¹.  
- `ofNullable(T value)`：如果为非空，返回Optional描述的指定值，否则返回空的Optional¹.
- `orElse(T other)`：如果存在该值，返回值，否则返回other¹.
- `orElseGet(Supplier<? extends T> other)`：如果存在该值，返回值，否则触发other，并返回other调用的结果¹.
- `orElseThrow(Supplier<? extends X> exceptionSupplier)`：如果存在该值，返回包含的值，否则抛出由Supplier继承的异常¹.
这些方法使得Optional类在处理可能为null的对象时，能够提供一种更优雅，更安全的方式¹。这样，我们就可以避免在代码中显式进行空值检测，从而使代码更加清晰，可读¹。
##  默认方法 
默认方法就是接口可以有实现方法，而且不需要实现类去实现其方法。我们只需在方法名前面加个`default`关键字即可实现默认方法。例如：
```java
    public interface Vehicle {
        default void print() {
            System.out.println("我是一辆车!");
        }
    }
```
##  新的编译工具，如：Nashorn引擎 jjs、 类依赖分析器jdeps
- Nashorn引擎的jjs：Nashorn是一个JavaScript引擎，它允许我们在JVM上执行JavaScript代码。从JDK 1.8开始，Nashorn取代Rhino成为Java的嵌入式JavaScript引擎。Nashorn完全支持ECMAScript 5.1规范以及一些扩展。它使用基于JSR 292的新语言特性，其中包含在JDK 7中引入的invokedynamic，将JavaScript编译成Java字节码。与先前的Rhino实现相比，这带来了2到10倍的性能提升。jjs是一个基于Nashorn引擎的命令行工具，它接受一些JavaScript源代码为参数，并执行这些源代码。
- 类依赖分析器jdeps：jdeps是Java 8中引入的一个新的命令行工具，用于了解应用程序的静态依赖关系和库。jdeps命令显示Java类文件的包级或类级依赖关系。输入类可以是.class文件、目录、jar文件的路径名，或者可以是完全限定的类名称，以分析所有类文件。jdeps的参数选项决定了输出的内容。默认情况下，jdeps将依赖关系输出到系统输出（控制台）。

# **Java 9**⁶：
##  平台级modularity（原名：Jigsaw） 模块化系统
Jigsaw项目（后期更名为Modularity）是Java 9的一个重要特性，它引入了Java平台模块化系统（JPMS, Java Platform Module System）¹²³⁴。这个项目的工作量和难度大大超出了初始规划，其主体部分被分解成6个JDK Enhancement Proposals (JEP) ¹²³⁴。

模块化系统的引入解决了Java在发展过程中遇到的一些问题，例如Java运行环境的膨胀和臃肿，代码库越来越大导致的管理问题，以及类库交叉依赖等问题¹²。模块化可以根据模块的需要加载程序运行需要的class，这样可以减少内存的开销¹²。此外，模块化使得代码组织上更安全，因为它可以指定哪些部分可以暴露，哪些部分隐藏¹²。

总的来说，模块化系统的引入使得Java SE平台可以适应不同大小的计算设备，改进了其安全性，可维护性，并提高了性能¹²。这对于拥有大量镜像的容器应用场景或复杂依赖关系的大型应用等，都具有非常重要的意义¹²。
##  Java 的 REPL 工具： jShell 命令
##  多版本兼容 jar 包
##  语法改进：接口的私有方法
##  语法改进：UnderScore (下划线)使用的限制
##  底层结构：String 存储结构变更
在Java 9中，String类的内部实现发生了变化¹²。在Java 8及之前的版本中，String类的内部实现是一个char数组¹²。然而，在Java 9中，这个实现改变为一个byte数组加上一个编码标记¹²。
这个改变的原因是，我们知道Java中的char是16位UTF16编码的，但是在许多应用中，大部分的String对象只包含Latin-1字符，这些字符只需要一个字节的存储空间¹²。因此，在Java 8及之前的版本中，String对象的内部char数组的一半空间是被浪费的¹²。
在Java 9中，如果一个String对象的所有字符都小于0xFF，那么每个char将对应一个byte¹²。如果存在一个char大于0xFF，那么byte数组的长度将会变为char数组长度的两倍，用两个字节来存放一个char¹²。
这个改变使得在所有字符都小于0xFF的情况下，String对象可以节省一半的内存¹²。尽管所有的String方法都需要重新实现，但是对外的接口仍然保持一致¹²。

> (1) JDK9的String类内部实现变更了！-CSDN博客. https://blog.csdn.net/keep12moving/article/details/100999667.
>
> (2) java9新特性之-String存储结构变更--集合工厂方法-- InputStream 加强--增强的 Stream API讲解 - CSDN博客. https://blog.csdn.net/apple_67445472/article/details/131389735.
>
> (3) JDK9的String类内部实现变更了！-CSDN博客. https://bing.com/search?q=Java+String+%e5%ad%98%e5%82%a8%e7%bb%93%e6%9e%84%e5%8f%98%e6%9b%b4.
>
> (4) 面试官：讲一下Java中String字符串的存储原理吧！ - 知乎专栏. https://zhuanlan.zhihu.com/p/159443898.
##  集合工厂方法：快速创建只读集合
##  增强的 Stream API
Java 9对Stream API进行了一些增强，添加了一些新的方法，使得流处理更加方便¹²³⁴。以下是一些新增的方法：
1. `takeWhile(Predicate<? super T> predicate)`：这个方法使用一个断言作为参数，返回给定Stream的子集直到断言语句第一次返回false。如果第一个值不满足断言条件，将返回一个空的Stream¹。
2. `dropWhile(Predicate<? super T> predicate)`：这个方法和`takeWhile`作用相反，使用一个断言作为参数，直到断言语句第一次返回false才返回给定Stream的子集¹。
3. `iterate(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next)`：这个方法允许使用初始种子值创建顺序（可能是无限）流，并迭代应用指定的下一个方法。当指定的`hasNext`的predicate返回false时，迭代停止¹。
4. `ofNullable(T t)`：这个方法可以预防NullPointerExceptions异常，可以通过检查流来避免null值。如果指定元素为非null，则获取一个元素并生成单个元素流，元素为null则返回一个空流¹。

# **Java 10**：
##  局部变量的类型推断
##  应用类数据共享
##  向G1引入并行Full GC
##  线程局部管控
##  基于Java的JIT 编译器（试验版本）

# **Java 11**¹⁴：
##  String API 字符串绝对是 Java 中最常用的一个类了，String 类的方法使用率也都非常的高，在 Java 11 中又为 String 类带来了一系列的好用操作。 isBlank () 判空。
##  File API 读写文件变得更加方便。
##  JEP 321 - HTTP Client 在 Java 11 中 Http Client API 得到了标准化的支持。

HttpClient支持HTTP2

HttpClient 到了Java 11后开始支持HTTP2，底层进行了大幅度的优化，并且现在完全支持异步非阻塞。

HttpClient 的包名由 jdk.incubator.http 改为 java.net.http 

##  JEP 323 - Lambda 局部变量推断 在 Java 10 中引入了 var 语法，可以自动推断变量类型。
##  JEP 330 - 单命令运行 Java

## 引入ZGC；
在Java 11 中作为实验功能首次出现，在JDK15开始可以正式投入使用

ZGC（Z Garbage Collector）是一款性能优秀的垃圾收集器，它首次出现在JDK 11中，作为实验性的特性¹²。在JDK 15中，ZGC不再是实验功能，可以正式投入生产使用¹²。ZGC有以下几个重要特性¹²：

1. **暂停时间不会超过10ms**：在JDK 16发布后，GC暂停时间已经缩小到1ms以内，并且时间复杂度是O(1)，这也就是说GC停顿时间是一个固定值了，并不会受堆内存大小影响¹。
2. **最大支持16TB的大堆，最小支持8MB的小堆**¹。
3. **对应用程序吞吐量的影响小于15%**¹。

ZGC的工作原理包括以下几个关键技术¹²：

- **内存多重映射**：ZGC为了更灵活高效地管理内存，使用了内存多重映射，把同一块物理内存映射为Marked0、Marked1和Remapped三个虚拟内存¹²。
- **染色指针**：ZGC的一大创新是将GC信息保存在了染色指针上¹²。
- **读屏障**：读屏障是JVM向应用代码插入一小段代码的技术，当应用线程从堆中读取对象引用时，就会执行这段代码¹²。
- **并发处理算法**：ZGC的并发处理算法利用全局空间视图的切换和对象地址视图的切换，结合SATB算法实现了高效的并发¹²。

以上就是ZGC的基本介绍，更详细的信息可以参考相关文档¹²。希望这些信息对你有所帮助！

> (1) 12 张图带你彻底理解 ZGC - 知乎. https://zhuanlan.zhihu.com/p/473629704.
> 
> (2) Java最前沿技术——ZGC - 知乎. https://zhuanlan.zhihu.com/p/364813270.
> 
> (3) ZGC介绍-腾讯云开发者社区-腾讯云. https://cloud.tencent.com/developer/article/1757573.
> 
> (4) java 21确定将会加入分代zgc，怎么看这一改变对于zgc的影响？将来 .... https://www.zhihu.com/question/598888526.
> 
> (5) Java 21 新特性：分代ZGC（Generational ZGC） | 程序猿DD. https://www.didispace.com/java-features/java21/jep439-generational-zgc.html.

# **Java 12**¹⁶：
##  改进的switch表达式

# **Java 13**¹⁸：
##  多行字符串字面量

# **Java 14**¹⁹：
##  改进的switch表达式
##  instanceof支持 模式匹配 （语言特性）
##  record 特性，省去写get，equals（）等方法
##  NullPointerException（JVM特性）,精确到哪一行
##  加入了java打包工具jpackage的预览版

# **Java 15**²²：
##  CharSequence 增加 isEmpty 默认方法CharSequence 新增了 isEmpty 方法，用于判定字符序列是否为空。

# **Java 16**²³：
##  类型判断的模式匹配（Java 14 开始预览），以下示例在效果上类似于 Kotlin 的智能类型转换： if (obj instanceof String s) { System.out.println(s.length()); }
##  数据类（Java 14 开始预览）： record Point(int x, int y) { } Point p = new Point(3,4); System.out.println(p.x());

# **Java 17** (17是当前最新的LTS版本)：
##  全新的 Java 长期支持版本提供数千个更新，进一步优化语言和平台，帮助开发人员提高工作效率
##  Oracle JDK 17 将为客户提供安全、性能和错误修复更新，至少到 2029 年 9 月
## 标准化了HTTP Client API，该API在JDK 9中首次以孵化API的形式引入，并在JDK 10中进行了更新¹。
  HTTP Client API示例¹：
```java
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create("http://example.com/"))
      .build();
client.sendAsync(request, BodyHandlers.ofString())
      .thenApply(HttpResponse::body)
      .thenAccept(System.out::println);
```
# **Java 18**⁵⁶⁷：
## 引入了向量API，预览了用于switch表达式的模式匹配，采用了UTF##8作为默认字符集，包含了一个简单的web服务器等⁷。
向量API示例⁵：
```java
var a = IntVector.fromArray(SPECIES_128, arrayA, 0);
var b = IntVector.fromArray(SPECIES_128, arrayB, 0);
var c = a.mul(b).add(a).intoArray(result, 0);
```
# **Java 19**⁹[^10^]¹¹：
## 从OpenJDK项目Amber中引入了语言改进（记录模式和用于Switch的模式匹配）；
模式匹配示例⁹：
```java
Object obj = "Hello, World!";
if (obj instanceof String s) {
    System.out.println(s.toLowerCase());
}
```
## 从OpenJDK项目Panama中引入了库增强功能，以便与非Java代码进行互操作（Foreign Function and Memory API）并利用向量指令（Vector API）；
## 预览了Project Loom的首个版本（Virtual Threads和Structured Concurrency），这将大大减少编写和维护高吞吐量并发应用程序所需的工作量[^10^]。

# **Java 20**¹³¹⁴¹⁵：
## 引入了虚拟线程，一种代际Z垃圾收集器，以及一种关键的封装机制API¹⁵。
虚拟线程示例¹³：
```java
Thread.startVirtualThread(() ##> System.out.println("Hello, World!"));
```
# **Java 21**¹⁶¹⁷¹⁸¹⁹：
## 引入了记录模式，以解构记录值¹⁶；
  记录模式示例¹⁶：
```java
record Point(int x, int y) { }
var p = new Point(3, 4);
if (p instanceof Point(int x, int y)) {
    System.out.println("x = " + x + ", y = " + y);
}
```
## 优化了虚拟线程；
## 引入了代际ZGC (*分代* 的ZGC)；
## 准备禁止动态加载代理¹⁶。

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
> 
> (31) New Features in Java 17 | Baeldung. https://www.baeldung.com/java-17-new-features.
> 
> (32) Java 17 New Features (with Examples) - HowToDoInJava. https://howtodoinjava.com/java/new-features/.
> 
> (33) Every change between JDK 11 and the Java 17 LTS release. https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/all-changes-in-Java-17-since-JDK-11-LTS-release.
> 
> (34) Java 18 Features (with Examples) - HappyCoders.eu. https://www.happycoders.eu/java/java-18-features/.
> 
> (35) JDK 18 Release Notes, Important Changes, and Information - Oracle. https://www.oracle.com/java/technologies/javase/18-relnote-issues.html.
> 
> (36) New Features in Java 18 | Developer.com. https://www.developer.com/java/java-18-features/.
> 
> (37) Java 19 Features (with Examples) - HappyCoders.eu. https://www.happycoders.eu/java/java-19-features/.
> 
> (38) JDK 19 Release Notes, Important Changes, and Information - Oracle. https://www.oracle.com/java/technologies/javase/19-relnote-issues.html.
> 
> (39) Latest Java 19 : JDK 19 Arrived- What's new features in Java 19 - TechGeekNext. https://www.techgeeknext.com/java/java19-features.
> 
> (40) JDK 19: The new features in Java 19 | InfoWorld. https://www.infoworld.com/article/3653331/jdk-19-the-new-features-in-java-19.html.
> 
> (41) Java 20 Features (with Examples) - HappyCoders.eu. https://www.happycoders.eu/java/java-20-features/.
> 
> (42) New Features in Java 20 | Baeldung. https://www.baeldung.com/java-20-new-features.
> 
> (43) JDK 20: The new features in Java 20 | InfoWorld. https://www.infoworld.com/article/3676699/jdk-20-the-new-features-in-java-20.html.
> 
> (44) Java 21 Features (LTS): Practical Examples and Insights - HowToDoInJava. https://howtodoinjava.com/java/java-21-new-features/.
> 
> (45) Java 21 Features (with Examples) - HappyCoders.eu. https://www.happycoders.eu/java/java-21-features/.
> 
> (46) JDK 17 - New Features in Java 17 - GeeksforGeeks. https://www.geeksforgeeks.org/jdk-17-new-features-in-java-17/.
> 
> (47) What is new in Java 17 - Mkyong.com. https://mkyong.com/java/what-is-new-in-java-17/.
> 
> (48) JDK 18: The new features in Java 18 | InfoWorld. https://www.infoworld.com/article/3630510/jdk-18-the-new-features-in-java-18.html.
> 
> (49) What is new in Java 19 - Mkyong.com. https://mkyong.com/java/what-is-new-in-java-19/.
> 
> (50) Java 21: Unleashing Exciting Updates for All Developers! - Medium. https://medium.com/@Harshit_Raj_14/java-21-unleashing-exciting-updates-for-all-developers-7913dc106941.
> 
> (51) What's new for developers in JDK 21 | Red Hat Developer. https://developers.redhat.com/articles/2023/09/21/whats-new-developers-jdk-21.
