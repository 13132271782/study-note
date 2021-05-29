const util = require('../../../.vuepress/utils/index');

module.exports = {
    build(config) {
        config.themeConfig.sidebar["/zh/study/study-Vue/"] = [
            {
                title: "Vue",
                collapsable: false,
                children: [
                    { title: '首页', path: "/zh/study/study-Vue/" },
                    { title: '从零开始搭建vue脚手架', path: "/zh/study/study-Vue-FreeHandCreateVueCli/" },
                ]
            },
        ];
    },
    crumbs: [
        ...util.baseCrumbs,
        { text: '前端学习' },
        { text: 'Vue', link: "/zh/study/study-Vue/" },
    ]
}
