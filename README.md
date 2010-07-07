# org.eclipse.cdt.cross.arm.gnu hack to mips

## Usage

Just like usage of `org.eclipse.cdt.cross.arm.gnu` ？

## Dev

通过阅读 `org.eclipse.cdt.cross.arm.gnu/HowToBuild.txt` 获知基本的在 Eclipse 中编译/运行的方法。

今后用来进一步 hack 、最基本的 hack 参见 git 提交历史中对如下文件的改动：

    org.eclipse.cdt.cross.arm.gnu/plugin.xml
    org.eclipse.cdt.cross.arm.gnu/src/org/eclipse/cdt/cross/arm/gnu/ARMManagedCommandLineGenerator.java
    org.eclipse.cdt.cross.arm.gnu/src/org/eclipse/cdt/cross/arm/gnu/sourcery/linux/IsToolChainSupported.java

为了避免使用 `site.xml` 的 "Build All" 时所生成的 `org.eclipse.cdt.cross.arm.gnu-updatesite/plugins/org.eclipse.cdt.cross.arm.gnu_0.5.3.生成日期.jar` 出现相应的编译参数设置的界面控件能够使用但是无法改变编译参数的问题，需要在 `site.xml` 的 "Build All" 之前先编译/运行 `org.eclipse.cdt.cross.arm.gnu` ，使得 `.jar` 文件中包含 `bin` 目录。
