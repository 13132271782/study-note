module.exports = {
    build(config) {
        config.themeConfig.sidebar["/zh/language-study/"] = [
            {
                title: "技术语言学习",
                collapsable: false,
                children: [
                    { title: '首页', path: "/zh/language-study/" },
                    { title: 'C', path: "/zh/study/study-c/" },
                    { title: 'Java', path: "/zh/study/study-Java/" },
                ]
            },
        ];
    },
    crumbs: [
        { text: '首页', link: '/' },
        { text: '技术语言学习', link: '/zh/language-study/' },
    ]
}
