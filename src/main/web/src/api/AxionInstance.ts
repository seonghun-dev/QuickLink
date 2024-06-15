import axios from "axios";

const baseAxiosInstance = () => {
    axios.create({
        headers: {'Content-Type': 'application/json'},
    });
    return axios;
}

export const axiosInstance = baseAxiosInstance();