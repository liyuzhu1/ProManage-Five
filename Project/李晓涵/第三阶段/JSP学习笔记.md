### JSP

### ch01  jsp简介

- java server pages

- JSP是为了改进Servlet输出动态的HTML复杂、烦琐等缺点而提出的

- jsp组成=jsp标签+html文件+java片段

- jsp目录：JSP必须依附项目（站点）
  一个动态站点包括WEB-INF目录（必须大写）
  WEB-INF目录中包括web.xml文件
  JSP文件与WEB-INF同级目录

- ```jsp
  <% String name = request.getParameter("name");
        if (name != null) {
              out.println("hello " + name);
           }
  %>
  
  ```

  

- ```jsp
  //JSP文件必须包括
  <%@ page language=“java” contentType=“text/html; charset=UTF-8” pageEncoding=“UTF-8“ %>
  ```



### ch02  jsp基础

- JSP是嵌套Java代码的HTML代码
  JSP转换成对应的Servlet类运行

- JSP生命周期中的方法

  初始化： _jspInit()
  服务： _jspService()
  销毁： _jspDestroy()



### jsp进阶

- ### 九个内置方法：	

- out：

  print()/println()/write()    向客户端页面输出数据

  

- request：

  getParameter(key)  获取提交表单的数据
  getParameterValues(key)  获取提交表单的一组数据
  getRequestDispatcher(“list.jsp”).forward(request,response)  转发请求到list.jsp页面
  setAttribute(key,Object)  设置请求作用域的key对应的值
  getAttribute(key)  获取请求作用域key所对应的值
  setCharacterEncoding(“UTF-8”）  对请求数据指定编码

  

- response：

  sendRedirect(“list.jsp”)  页面跳转
  setCharacterEncoding(“UTF-8”)  设置响应编码

  

- session：

  getId()  获取session的id号
  Isnew()  判断session是新建的
  setAttribute(key,Object)  向当前会话设置一个值
  getAttribute(key)  获取当前会话中key所对应的值
  removeAttribute(key)  删除当前会话key所对应的值
  setMaxInactiveInterval(1000*60)  设置session失效时间，Tomcat默认时长为30分钟
  Invalidate()  销毁当前会话，一般用于删除当前会话中所有数据

  

- application：

  setAttribute(key,Object)  向当前application设置一个值
  getAttribute(key)  获取当前application中key所对应的值
  removeAttribute(key)  删除当前application中key所对应的值

- pageContext

- config

- page

- exception



- ### jsp作用域

- application：具有应用程序作用域的对象，在应用程序存活期间均可用

- session：具有会话作用域的对象，在会话的存活期间可用

- request：具有请求作用域的对象，在所有处理同一个请求的页面内都可以访问

- page：具有页面作用域的对象，在当前页内可用

- setAttribute(String name,Object attribute)
  getAttribute(String name)



### ch04  web组件复用

- 静态包含：

  在JSP源文件转换成对应Servlet源文件时将当前JSP文件和其包含的所有其他文件合并成一个Servlet文件
  JSP中的include伪指令实现静态包含
  include标准语法：<%@include file=“地址”%>

- 动态包含：

  动态包含是指客户端请求时，将请求转发给当前JSP文件包含的其他对象
  使用JSP的include动作指令和forward动作指令实现动态包含
  include 和forward相当与Servlet中的RequestDispatcher.include()和RequestDispatcher.forward()方法

- include动作指令相当于方法的调用
  标准语法：<jsp:include  page=“地址” flush=“true”>

- 静态包含不存在参数传递的问题
  动态包含可以传递参数：
  直接在包含动作中传递
  使用<jsp:param>
  使用request.set/getAttribute()方法

- jsp中使用javabean

  在JSP中使用<jsp:useBean>操作元素来加载JavaBean程序：class、scope、id、type、beanName

  使用<jsp:setProperty>操作元素来设置JavaBean的属性值：name、property、param、value

  使用<jsp:getProperty>操作元素获取JavaBean的属性值：name、property

-  



### ch05  表达式语言

- JSP表达式的代码：
  The  outside temperature is<%= temp%> degrees
  表达式语言(EL)表达式的代码：
  The outside temperature is ${temp} degrees
- EL语言：没有变量声明，${  }



### sevlet部署

- 每个JavaEE应用必须有一个位于根目录下的WEB-INF的目录(客户端无法直接访问该目录中的文件)
  WEB-INF包括三个子目录
- classes 所有未被jar包含的应用程序中的相关的类文件，通过包组织在一起
- lib 使用到的jar文件
- web.xml 部署描述符，该文件是JavaEE应用的核心，每个JavaEE应用必须有该文件，其包含了Servlet容器（Tomcat）运行JavaEE应用所需要的配置信息



- Request URI=ContextPath+ServletPath+PathInfo
  使用request.getRequestURI()获得
  上下文路径(ContextPath): Web应用的根目录
  Servlet路径(ServletPath): 由部署描述符中Servlet映射指定的路径
  路径信息(PathInfo): Servlet之后的字符串
  HttpServletRequest对象提供: 
  getContextPath(),getServletPath()和getPathInfo()方法，分别获取上下文路径、Servlet路径和路径信息





