const key = '/zh/_app/';
const util = require('../../.vuepress/utils/index');

module.exports = {
    build(config) {
        config.themeConfig.sidebar[key] = [
            {
                title: "技术文档",
                collapsable: false,
                children: [
                    {
                        title: '首页',
                        path: key
                    },
                    {
                        title: '技术语言学习',
                        collapsable: false,
                        children: [
                            { title: 'C', path: "/zh/study/study-c/" },
                            { title: 'Java', path: "/zh/study/study-Java/" },
                        ]
                    },
                    {
                        title: '前端学习',
                        collapsable: false,
                        children: [
                            { title: 'Vue', path: "/zh/study/study-Vue/" },
                        ]
                    },
                    {
                        title: '后端学习',
                        collapsable: false,
                        children: [
                            { title: 'Activiti', path: "/zh/study/study-Activiti/" },
                            { title: 'Netty', path: "/zh/study/study-Netty/" },
                        ]
                    },
                ]
            },
        ];
    },
    crumbs: [
        ...util.baseCrumbs
    ]
}
