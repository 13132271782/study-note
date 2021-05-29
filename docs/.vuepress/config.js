const config = {
    title: '学习笔记',
    description: '学习笔记',
    base: '/',
    dest: 'dist',
    themeConfig: {
        search: true,//搜索
        searchMaxSuggestions: 10,
        nav: [{
            text: '技术文档', items: [
                {text: '首页', link: '/zh/_app/'},
                {text: '技术语言学习', link: '/zh/language-study/'},
                {text: '前端学习', link: '/zh/front-study/'},
                {text: '后端学习', link: '/zh/back-study/'},
            ]
        }],
        // 左侧导航
        sidebar: {},
        // 最后更新时间
        lastUpdated: 'Last Update', // string | boolean
    },
    markdown: {
        lineNumbers: true
    },
    plugins: [
        ['@vuepress/last-updated']
        ['@vuepress/active-header-links'],
        ['@vuepress/back-to-top'],
        ['@vuepress/medium-zoom'],
        ['@vuepress/nprogress'],
    ],
    devTemplate: '.vuepress/theme/templates/dev.html',
    ssrTemplate: '.vuepress/theme/templates/ssr.html'
};

require('../zh/_app/_config.js').build(config);
require('../zh/language-study/_config.js').build(config);
require('../zh/study/study-c/_config.js').build(config);
require('../zh/study/study-Java/_config.js').build(config);
require('../zh/front-study/_config.js').build(config);
require('../zh/study/study-Vue/_config.js').build(config);
require('../zh/study/study-Vue-FreeHandCreateVueCli/_config.js').build(config);
require('../zh/back-study/_config.js').build(config);
require('../zh/study/study-Activiti/_config.js').build(config);

module.exports = config;
