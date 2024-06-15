import {axiosInstance} from "./AxionInstance";
import {AxiosResponse} from "axios";


const ShortUrlApi = {
    async createShortUrl(url: string): Promise<AxiosResponse> {
        return axiosInstance.post("/url", {
            url: url
        });
    }
};

export default ShortUrlApi;