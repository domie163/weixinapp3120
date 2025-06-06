const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmpj5hf/",
            name: "ssmpj5hf",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmpj5hf/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于微信小程序的宠物寄养平台"
        } 
    }
}
export default base
