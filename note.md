
https://spring.io/blog/2023/09/20/hello-java-21
https://spring.io/blog/2023/09/09/all-together-now-spring-boot-3-2-graalvm-native-images-java-21-and-virtual


是的，Oracle 提供了 Java 平台官方的文档，其中包括了每个 JDK 版本的升级内容。你可以在 Oracle 官方网站上找到这些信息。

具体来说，你可以在以下 URL 中找到 JDK 版本的发行说明和更新信息：

https://www.oracle.com/java/technologies/javase/

在这个页面上，你可以选择你感兴趣的 JDK 版本，然后浏览该版本的发行说明和更新信息。这些信息会详细列出该版本中新增的功能、改进、修复的 bug 以及已知问题。

centos 安装 jdk21具体步骤
安装 JDK 21 可能需要一些额外步骤，因为它可能不在默认的软件仓库中。为了安装 JDK 21，您需要按照以下步骤操作。请注意，JDK 21（或更高版本）可能在您下载时已有更新。

1. **下载 JDK 21**
   访问 Oracle 官方网站（或者其他提供JDK 21的官方渠道），下载适合您的系统的 JDK 21 安装文件。通常情况下是一个 .tar.gz 文件。

2. **上传文件到 CentOS 服务器**
   如果您的 CentOS 服务器不具有直接访问互联网的权限，您可能需要把下载的 JDK 21 文件上传到服务器上。您可以使用工具如 `scp` 或 `rsync` 来实现。

3. **解压 JDK 21 安装文件**
   在 CentOS 服务器上，通过以下命令解压下载的 JDK 21 安装文件。
   ```bash
   tar -xzvf jdk-21.tar.gz
   ```

4. **移动 JDK 文件**
   解压后，会生成一个目录，例如 `jdk-21`. 您可以选择将其移动到 `/usr/local` 目录下。
   ```bash
   sudo mv jdk-21 /usr/local/
   ```

5. **配置环境变量**
   现在，需要设置系统环境变量 `JAVA_HOME` 和将 JDK 可执行文件路径添加到 `PATH` 变量中。打开 `~/.bashrc` 或 `~/.bash_profile` 文件（根据您的系统和配置方式而定）并添加以下内容：
   ```bash
   export JAVA_HOME=/usr/local/jdk-21
   export PATH=$PATH:$JAVA_HOME/bin
   ```

6. **使环境变量生效**
   运行以下命令使环境变量生效：
   ```bash
   source ~/.bashrc
   ```

7. **验证安装**
   运行以下命令验证 JDK 是否已经正确安装：
   ```bash
   java -version
   ```

   如果一切顺利，您应该看到 JDK 21 的版本信息。

通过这些步骤，您应该成功在 CentOS 服务器上安装了 JDK 21。
