module.exports = {
    build(config) {
        config.themeConfig.sidebar["/zh/study/study-Java/"] = [
            {
                title: "Java学习",
                collapsable: false,
                children: [
                    { title: '首页', path: "/zh/study/study-Java/" },
                    {
                        title: '1.Java基础',
                        children: []
                    }, {
                        title: '2.自定义监听器',
                        children: [
                            { title: '2.1.自定义监听器', path: '/zh/study/study-Java/2.CustomListener/2.1.CustomListener' }
                        ]
                    },
                ]
            },
        ];
    },
    crumbs: [
        { text: '首页', link: '/' },
        { text: '技术语言学习', link: '/zh/language-study/' },
        { text: 'Java', link: '/zh/study/study-Java/' },
    ]
}
