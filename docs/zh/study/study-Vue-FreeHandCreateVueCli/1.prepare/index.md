<crumbs config-path="zh/study/study-Vue-FreeHandCreateVueCli/_config.js"/>

# 1.准备工作

## 1）初始化项目

创建文件夹并进入该文件夹，执行命令初始化 `Webpack` 项目

```cmd
npm init
```

执行完成后文件夹内出现 `package.json`

## 2）创建目录结构

创建如下目录结构：

```txt
vue-cli
    ┣━public
    ┃    ┗━index.html （模板文件）
    ┣━src
    ┃    ┗━index.js （总入口文件）
    ┗━package.json
```

## 3）使用webpack

执行命令安装 `webpack`

```cmd
npm install webpack-cli webpack --save-dev
```

`webpack` 默认只能打包js模块，它可以将你写的多个js模块打包成一个js文件，最后在入口页面引入它

`webpack4` 开始默认大于配置，换句话说可以不用再引入一个配置文件来打包项目，因此他有很多默认值

默认入口文件是`src`下的`index.js`，输出为`dist`目录下的`main.js`（假如没有dist目录会自动创建）

但是它仍然是高配置的，假如需要我们只需在项目根目录下新建`webpack.config.js`来进行一切的配置

## 4）webpack.config.js

在项目根目录创建 `webpack.config.js`

## 5）使用vue

执行命令安装 `vue`

```cmd
npm i vue
```

在 `src/index.js` 中编写如下内容：

```js
import Vue from 'vue'

new Vue({
    el: '#app'
});
```

在 `public/index.html` 中编写如下内容：

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>首页</title>
</head>
<body>
<div id ="app"></div>
</body>
</html>
```
