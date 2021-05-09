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
                                    { title: '2.1.1.常量', path: '/zh/study/study-c/2.basics/2.1.data-type/2.1.1.constant' },
                                    { title: '2.1.2.变量', path: '/zh/study/study-c/2.basics/2.1.data-type/2.1.2.variable' },
                                ]
                            }
                        ]
                    },
                ]
            },
        ];
    },
    crumbs: [
        { text: '首页', link: '/' },
        { text: '技术语言学习', link: '/zh/language-study/' },
        { text: 'C', link: '/zh/study/study-c/' },
    ]
}
