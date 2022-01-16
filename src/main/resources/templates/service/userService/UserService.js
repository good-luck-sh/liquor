import axios  from "axios";

const http = axios.create({
    baseURL:"http://localhost:8081/api",//설정한 URL 
    withCredentials:false,
    headers:{
        Accept:'appllication/json',//응답컨텐츠 타입
        'Content-Type':'application/json'//요청컨텐츠 타입
    }
});
export default{
    name:"UserService",
    insertUser(user) {//insert user
        return http.post('/user',user);//데이터가 user인 객체를 /user로 전달한다. 
    },
    getUser(no) {
        return http.get("/user",no);
    }
}