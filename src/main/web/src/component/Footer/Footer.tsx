import React from 'react';
import './Landing.css';

function Footer() {
    return (
        <div className="footer">
            <p>
                Quick URL Shortener
            </p>
            <p>
                Copyright ⓒ 2024 seonghun-dev.
            </p>
            <p>
                <a href="https://github.com/"
                   target="_blank"
                   rel="noreferrer"
                >Github</a>
            </p>
        </div>
    );
}

export default Footer;