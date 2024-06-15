import React, {useState} from 'react';
import './App.css';
import ShortUrlApi from "./api/ShortUrlApi";
import Footer from "./component/Footer/Footer";
import TextUtils from "./utils/TextUtils";

function App() {
    const [url, setUrl] = useState('');
    const [shortUrl, setShortUrl] = useState('');

    const handleInputChange = (e: React.ChangeEvent<HTMLInputElement>) => {
        setUrl(e.target.value);
    };
    const handleShortenUrl = async () => {
        try {
            const response = await ShortUrlApi.createShortUrl(url);
            const shortUrl = window.location.origin + "/r/" + response.data;
            setShortUrl(shortUrl);
        } catch (error) {
            console.error('Error shortening URL', error);
        }
    };

    return (
        <div className="App">
            <header className="App-header">
                <div className="background-circle"/>
                <div className="App-content">
                    <div className="title">
                        가장 빠르게
                    </div>
                    <div className="title">
                        URL을 단축하세요.
                    </div>

                    <div className="input-container">
                        <input
                            type="text"
                            value={url}
                            onChange={handleInputChange}
                            placeholder="URL을 입력하세요."
                            className="url-input"
                        />
                        <button onClick={handleShortenUrl} className="shorten-button">
                            단축하기
                        </button>
                    </div>

                    {shortUrl && (
                        <div className="result-container">
                            <div className="result">
                                <p className="result-info">
                                    {new Date().toLocaleDateString()}
                                </p>
                                <p className="result-highlight">
                                    {shortUrl}
                                </p>
                                <p className="result-info">
                                    {TextUtils.truncate(url, 40)}
                                </p>
                            </div>
                        </div>
                    )}
                </div>
                <div className="footer">
                    <Footer/>
                </div>
            </header>

        </div>
    );

}

export default App;
