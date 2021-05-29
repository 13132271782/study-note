const util = require('../../../.vuepress/utils/index');

module.exports = {
    build(config) {
        config.themeConfig.sidebar["/zh/study/study-Vue-FreeHandCreateVueCli/"] = [
            {
                title: "Vue",
                collapsable: false,
                children: [
                    { title: '首页', path: "/zh/study/study-Vue-FreeHandCreateVueCli/" },
                    { title: '1.准备工作', path: "/zh/study/study-Vue-FreeHandCreateVueCli/1.prepare/" },
                    { title: '2.使用webpack-dev-server', path: "/zh/study/study-Vue-FreeHandCreateVueCli/2.webpack-dev-server/" },
                    { title: '3.使用html-webpack-plugin', path: "/zh/study/study-Vue-FreeHandCreateVueCli/3.html-webpack-plugin/" },
                    {
                        title: '4.添加loader',
                        children: [
                            { title: '4.1.使用html-webpack-plugin', path: "/zh/study/study-Vue-FreeHandCreateVueCli/4.add-loader/4.1.vue-loader" },
                        ]
                    },
                ]
            },
        ];
    },
    crumbs: [
        ...util.baseCrumbs,
        { text: '前端学习' },
        { text: 'vue', link: "/zh/study/study-Vue/" },
        { text: '从零开始搭建vue脚手架', link: "/zh/study/study-Vue-FreeHandCreateVueCli/" },
    ]
}
