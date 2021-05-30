const util = require('../../../.vuepress/utils/index');

module.exports = {
    build(config) {
        config.themeConfig.sidebar["/zh/study/study-c/"] = [
            {
                title: "C语言学习",
                collapsable: false,
                children: [
                    { title: '首页', path: "/zh/study/study-c/" },
                    {
                        title: '2.C语言基础',
                        children: [
                            {
                                title: '2.1.数据类型',
                                children: [
                                    { title: '2.1.1.数据类型', path: '/zh/study/study-c/2.basics/2.1.data-type/2.1.1.data-type.md' },
                                    { title: '2.1.2.常量', path: '/zh/study/study-c/2.basics/2.1.data-type/2.1.2.constant' },
                                    { title: '2.1.3.变量', path: '/zh/study/study-c/2.basics/2.1.data-type/2.1.3.variable' },
                                ]
                            },
                            { title: '2.2.运算符', path: '/zh/study/study-c/2.basics/2.2.operator' },
                            { title: '2.3.表达式', path: '/zh/study/study-c/2.basics/2.3.expression' }
                        ]
                    },
                ]
            },
        ];
    },
    crumbs: [
        ...util.baseCrumbs,
        { text: '技术语言学习', link: '#' },
        { text: 'C', link: '/zh/study/study-c/' },
    ]
}
