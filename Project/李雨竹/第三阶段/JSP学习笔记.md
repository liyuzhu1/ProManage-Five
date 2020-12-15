# JSP

- Java动态网页技术标准（Java Server Pages）
    - 是基于Servlet技术以及整个Java体系的Web开发技术
    - 是用于动态生成HTML文档的Web页面模板
    - JSP是为了改进Servlet输出动态的HTML复杂、烦琐等缺点而提出的,JSP允**许Java代码与HTML写在同一页面中**，使开发人员能快速的开发包括大量HTML代码的动态网页

- JSP=HTML文件+Java片段+JSP标签

- ```jsp
    <%@ page contentType="text/html;charset=UTF-8"
        pageEncoding="UTF-8"%>
    <%@page import="java.util.*"%>
    <html>
      <body>
    其他 HTML 语言
    <%
      符合Java 语法的 Java语句
    %>
    
      其他 HTML 语言
    
      </body>
    </html>
    ```

- JSP文件必须包括
    <%@ page language=“java” contentType=“text/html; charset=UTF-8” pageEncoding=“UTF-8“ %>
-  JSP页面元素
    - HTML标签
    - Java代码
    - JSP标签b
    - **伪指令标签<%@ %>  声明标签<%! %>**  
    - **脚本标签<%  %>  表达式标签<%=  %>**
    - **动作标签<jsp:action Name/>**
    - **注释标签<%--注释--%>**

- **JSP伪指令**用来设置全局变量，声明类、要实现的方法以及输出内容的类型等
    - page：指定整个JSP页面的全局属性
        <%@ page  [attribute=“value”……] %>
    - include：通知jsp页面，内嵌指定页面,利用include可以将复杂的页面拆分成简单的页面例:<%@ include file=“/header.html”%>
    - taglib：允许JSP页面开发者自定义标签例:<%@ taglib  uri=“taglibURI”prefix=“perfix”%>

- JSP声明指令

    声明指令包括的是一段java代码

    例：<%!  int  count =0;%>
    例：<%! String color[] = {“red”,”green”,”yellow”};
        String getColor(int i){
            return color[i];
          }
        %>

- JSP脚本指令

    脚本指令是镶嵌在JSP页面中的java代码

    主要用于处理客户端的请求

    <% String name = request.getParameter("name");
          if (name != null) {
                out.println("hello " + name);
             }
           %>

- JSP表达式指令

    表达式指令是JSP提供的一种简单方法用于访问可用的Java取值或其他表达式，还可用于给动作指令动态传递参数

    - 表达式不能使用分号结尾
    - 例:<%=“hello world”%>
        例:<% String name =“header.jsp”%>
           <jsp: include page=“<%=name%>”%> 

- JSP注释指令

    - <%-- 注释内容--%>  一种是只在JSP中显示

    - //注释内容 或者/*  注释内容*/

        第二种是JSP脚本元素中的注释

    - <!- -  注释内容 -->

        第三种是JSP生成的HTML在客户端显示的注释

- JSP动作指令

    动作指令是在请求处理阶段向JSP容器发送指令

    jsp:include  jsp:forward  jsp:getProperty

    jsp:setProperty  jsp:useBean

    格式<jsp:tag attribute=value…>  </ jsp:tag>
    例:<jsp:include page=“header.html”/>

- JSP页面中的伪指令元素会对整个页面产生作用
- 在合成的JSP页面中不能存在两个及以上的同名变量

# JSP基础

- #### Servlet与JSP关系

- JSP工作原理

    - 一个JSP文件第一次被请求时，JSP引擎把该JSP文件转换成为一个servlet
    - JSP引擎使用javac把转换成的servlet的源文件编译成相应的class文件
    - 对每一个请求，JSP引擎创建一个新的线程来处理请求

- JSP的Servlet本质

    - JSP是嵌套Java代码的HTML代码

        JSP转换成对应的Servlet类运行

    - Servlet是嵌套HTML代码的Java代码

- JSP页面生命周期

    1. 转译：将JSP源文件转译成对应的Servlet源文件
    2. 编译：编译Java源文件为类文件
    3. 加载：将类加载至内存
    4. 实例化：创建一个Servlet类实例对象
    5. 初始化：调用_jspInit()方法_ ，最终调用Servlet类的init（）方法初始化
    6. 服务：调用_jspService()方法 ，_最终调用Servlet类的init()方法初始化
    7. 服务：调用__jspService()方法，最终调用Servlet类的init()方法初始化
    8. 销毁：调用_jspDestory()方法，最终调用destory()方法，销毁Servlet_

- JSP生命周期中的方法

    _jspInit()  _ _jspService()_  _jspDestory()_



- JSP与Servlet的内部转换

    1. JSP转译Servlet  解析/校验/转换

    2. JSP转换Servlet

        - 声明标签：转换为Servlet类成员
        - 脚本标签：转换为_jspService() 中的代码
        - HTML代码：转换为_jspService()中的out.write()
        - 表达式标签：转换为_jspService()中的out.write()
        - JSP注释不进行转换

    3. JSP转换Servlet区别

        JSP->Servlet

        <%!   %>声明变量、方法，可以先使用后声明  ---->成员变量、方法

        <%   %>声明变量，必须先声明再使用--->局部变脸

        <%=   %>表达式  ---->out.write();输出表达式结果

- jsp转换为Servlet

    伪指令：

    产生对应的JAVA代码

    例<%@ page import=“”%>转换为import语句

    动作指令：被底层指定的类取代

    例<jsp:useBean id=“” class=“类名” />

- page伪指令属性

    - import属性（相当于java中的import）

        用于描述JSP页面中使用类的全包名，可选属性

        <%@page import=“java.io.*,java.sql.*”%>

        默认导入包：java.lang、javax.servlet、javax.servlet.jsp、javax.servlet.http

    - session属性：

        session属性指定页面是否需要一个http会话

        <%@page session=“true/false”%>

    - errorPage和isErrorPage属性（JSP异常处理）

        JSP产生一个不能捕获的溢出时跳转到一个错误页面

        <%@page errorPage=“error.jsp”%>

        在error.jsp页面中必须加入<%@page isErrorPage=“true”%>才能进行错误处理

    - info属性

        用于指定JSP的描述信息：

        <%@page info=“information”%>

    - language和extends属性

        - language属性指定JSP页面中声明、脚本、和表达式中使用语言，默认是Java

            <%@page language=“java” %>

        - extends属性用于指定JSP页面对应Servlet类的基类，极少使用
            <%@page extends=“mypackage.BaseServlet”%>

    - buffer和autoFlush属性

        - buffer属性指定JSP的输出缓存区的最小值

            <%@page buffer=“32kb” %>

        - autoFlush属性用于指定当缓存区满时，是否自动将数据发送给客户端，默认值为true
            <%@page autoFlush =“false”%>

    - contentType和pageEncoding属性

        - contentType属性指定页面响应的MIME类型和字符编码
            <%@page 
                   contentType =“text/html;charset=UTF-8” %>
        - pageEncoding属性用于指定JSP页面字符编码格式，默认值为ISO-8859-1
            <%@page pageEncoding =“UTF-8”%>

## JSP进阶

- JSP内置对象
    - JSP容器在_jspService()方法中声明并初始化9个内置对象
    - out/application/session/request/response/page/pageContext/config/exception

- out

    类型：Javax.servlet.jsp.JspWriter

    作业：主要用来向客户端输出数据

    作用域：page.每个页面都有一个自己的out对象

    重要方法：print()/println()/write()    向客户端页面输出数据

- 内置对象request

    类型：Javax.servlet.http.HttpServletRequest
    描述：来自客户端的请求经Servlet容器处理后，由request对象进行封装。注：客户端和服务器的一次通信就是一次请求（发送请求或得到相应）
    作用域：request。说明，这次请求结束后，它的生命周期就结束了

    - 重要方法：
        1. getParameter(key)  获取提交表单的数据
        2. getParameterValues(key)  获取提交表单的一组数据
        3. getRequestDispatcher(“list.jsp”).forward(request,response)  转发请求到list.jsp页面
        4. setAttribute(key,Object)  设置请求作用域的key对应的值
        5. getAttribute(key)  获取请求作用域key所对应的值
        6. setCharacterEncoding(“UTF-8”）  对请求数据指定编码

- 内置对象response

    类型：Javax.servlet.http. HttpServletResponse
    描述：它封装了JSP 的响应，然后被发送到客户端以响应客户的请求。
    作用域：page
    重要方法：
    sendRedirect(“list.jsp”)  页面跳转
    setCharacterEncoding(“UTF-8”)  设置响应编码

- 内置对象session

    类型：Javax.servlet.http.HttpSession
    描述：表示一个会话，用来保存用户信息，以便跟踪每个用户的状态。（不要用来保存业务数据，request）
    定义：是指在一段时间内客户端和服务器之间的一连串的相关的交互过程
    作用域：session

    - 重要方法：

        getId()  获取session的id号
        Isnew()  判断session是新建的
        setAttribute(key,Object)  向当前会话设置一个值
        getAttribute(key)  获取当前会话中key所对应的值
        removeAttribute(key)  删除当前会话key所对应的值
        setMaxInactiveInterval(1000*60)  设置session失效时间，Tomcat默认时长为30分钟
        Invalidate()  销毁当前会话，一般用于删除当前会话中所有数据

- 内置对象application

    类型：javax.servlet.ServletContext
    描述：从servlet配置对象获得的servlet上下文
    作用域：application

    - 重要方法：
        setAttribute(key,Object)  向当前application设置一个值
        getAttribute(key)  获取当前application中key所对应的值
        removeAttribute(key)  删除当前application中key所对应的值

- 内置对象pageContext

    类型：javax.servlet.jsp.PageContext
    描述：本JSP的页面上下文
    作用域：page

- 内置对象config和page

    - config
        类型：javax.servlet.ServletConfig
        描述：本JSP的 ServletConfig
        作用域：page
    - page
        类型：java.lang.Object
        描述：实现处理本页当前请求的类的实例（javax.servlet.jsp.HttpJspPage），转换后的Servlet类本身
        作用域：page

- 内置对象exception

    类型：java.lang.Exception
    描述：本JSP页面的异常对象
    作用域：page

- JSP作用域

    JSP页面中的对象，包括用户创建的和JSP内置对象都有一个范围属性

    **JSP中共有4种作用域范围**

    - Application：具有应用程序作用域的对象，在应用程序存活期间均可用
    - Session：具有会话作用域的对象，在会话的存活期间可用
    - Request：具有请求作用域的对象，在所有处理同一个请求的页面内都可以访问
    - Page：具有页面作用域的对象，在当前页内可用

- ##### Application作用域

    Application作用域范围最大

    - 可以被不同页面、不同用户共享
    - 可以通过application内置对象或ServletContext访问Application作用域对象

- Session作用域

    ession作用域范围仅次于Application作用域

    - 可以被同一个客户端的请求访问
    - 可以通过session内置对象访问Session作用域对象

- Request作用域

    Request作用域范围小于Session作用域

    - 可以被forward()方法转向页面或者include()包含页面访问
    - 可以通过request内置对象访问request作用域对象

- Page作用域

    Page作用域范围最小

    - 只能被创建对象的页面访问
    - 可以通过pageContext内置对象访问Page作用域对象