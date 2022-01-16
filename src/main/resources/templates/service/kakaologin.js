import axios from "axios";
import VueCookies from "VueCookies";

const kakaoHeader = {
    'Authorization': '38a13ad7fe2aebde526554b83ffe7909',
    'Content-type': 'application/x-www-form-urlencoded;charset=utf-8',
};

const getKakaoToken = async (code) => {
    console.log('loginWithKakao');
    try {
        const data = {
            grant_type: 'authorization_code',
            client_id: '9c623de548b22198462d3914a8c18080',
            redirect_uri: 'http://localhost:8081/kakaologin',
            code: code,
        };
        const queryString = Object.keys(data)
            .map(k => encodeURIComponent(k) + '=' + encodeURIComponent(data[k]))
            .join('&');

        console.log(queryString)
        console.log(('https://kauth.kakao.com/oauth/token', queryString, { headers: kakaoHeader }))
        const server_token = await axios.get(`http://127.0.0.1:8000/accounts/login/kakao`, { headers: token_header });
        console.log(server_token)
        return result;
    } catch (e) {
        return e;
    }
};

const refreshToken = async () => {
    try {
        const { result } = (await axios.get('/refreshToken')).data;
        VueCookies.set('access-token', result.access_token);
        console.log('Refresh API 성공', result);
        return result;
    } catch (e) {
        console.log(e);
    }
}
const server_token = await axios.get(`http://127.0.0.1:8000/accounts/login/kakao`, { headers: token_header });
        console.log(server_token)
        return result;
    } catch (e) {
        return e;
    }
export {
    getKakaoToken,
    refreshToken,
};