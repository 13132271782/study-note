const indexPath = { text: '首页', link: '/' };

const config = {
    indexPath,
    baseCrumbs: [
        indexPath,
        { text: '技术文档', link: '/zh/_app/' }
    ]
};

 module.exports = config;
