const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootxtv98/",
            name: "springbootxtv98",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "OA公文发文管理系统"
        } 
    }
}
export default base
