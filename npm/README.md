# Bingo Card Generator API

Bingo Card Generator creates customizable bingo cards with random numbers, HTML rendering, and downloadable PNG images.

![Build Status](https://img.shields.io/badge/build-passing-green)
![Code Climate](https://img.shields.io/badge/maintainability-B-purple)
![Prod Ready](https://img.shields.io/badge/production-ready-blue)
[![npm version](https://img.shields.io/npm/v/@apiverve/bingocardgenerator.svg)](https://www.npmjs.com/package/@apiverve/bingocardgenerator)

This is a Javascript Wrapper for the [Bingo Card Generator API](https://apiverve.com/marketplace/bingocardgenerator?utm_source=npm&utm_medium=readme)

---

## Installation

Using npm:
```shell
npm install @apiverve/bingocardgenerator
```

Using yarn:
```shell
yarn add @apiverve/bingocardgenerator
```

---

## Configuration

Before using the Bingo Card Generator API client, you have to setup your account and obtain your API Key.
You can get it by signing up at [https://apiverve.com](https://apiverve.com?utm_source=npm&utm_medium=readme)

---

## Quick Start

[Get started with the Quick Start Guide](https://docs.apiverve.com/quickstart?utm_source=npm&utm_medium=readme)

The Bingo Card Generator API documentation is found here: [https://docs.apiverve.com/ref/bingocardgenerator](https://docs.apiverve.com/ref/bingocardgenerator?utm_source=npm&utm_medium=readme).
You can find parameters, example responses, and status codes documented here.

### Setup

```javascript
const bingocardgeneratorAPI = require('@apiverve/bingocardgenerator');
const api = new bingocardgeneratorAPI({
    api_key: '[YOUR_API_KEY]'
});
```

---

## Usage

---

### Perform Request

Using the API is simple. All you have to do is make a request. The API will return a response with the data you requested.

```javascript
var query = {
  size: 5,
  freeSpace: true,
  image: false
};

api.execute(query, function (error, data) {
    if (error) {
        return console.error(error);
    } else {
        console.log(data);
    }
});
```

---

### Using Promises

You can also use promises to make requests. The API returns a promise that you can use to handle the response.

```javascript
var query = {
  size: 5,
  freeSpace: true,
  image: false
};

api.execute(query)
    .then(data => {
        console.log(data);
    })
    .catch(error => {
        console.error(error);
    });
```

---

### Using Async/Await

You can also use async/await to make requests. The API returns a promise that you can use to handle the response.

```javascript
async function makeRequest() {
    var query = {
  size: 5,
  freeSpace: true,
  image: false
};

    try {
        const data = await api.execute(query);
        console.log(data);
    } catch (error) {
        console.error(error);
    }
}
```

---

## Example Response

```json
{
  "status": "ok",
  "error": null,
  "data": {
    "card": [
      [
        14,
        19,
        42,
        47,
        71
      ],
      [
        4,
        17,
        36,
        50,
        69
      ],
      [
        11,
        18,
        "FREE",
        53,
        73
      ],
      [
        15,
        23,
        41,
        52,
        68
      ],
      [
        8,
        27,
        43,
        58,
        75
      ]
    ],
    "html": "<html><head><title>Bingo Card</title><style>body {font-family: Arial, sans-serif; padding: 20px;}table {border-collapse: collapse; margin: 0 auto;}td {text-align: center; width: 60px; height: 60px; border: 2px solid #000; font-size: 20px; font-weight: bold;}th {text-align: center; width: 60px; height: 40px; border: 2px solid #000; font-size: 24px; font-weight: bold; background-color: #4CAF50; color: white;}.free-space {background-color: #FFD700; font-size: 14px;}</style></head><body><table><tr><th>B</th><th>I</th><th>N</th><th>G</th><th>O</th></tr><tr><td class=''>14</td><td class=''>19</td><td class=''>42</td><td class=''>47</td><td class=''>71</td></tr><tr><td class=''>4</td><td class=''>17</td><td class=''>36</td><td class=''>50</td><td class=''>69</td></tr><tr><td class=''>11</td><td class=''>18</td><td class='free-space'>FREE</td><td class=''>53</td><td class=''>73</td></tr><tr><td class=''>15</td><td class=''>23</td><td class=''>41</td><td class=''>52</td><td class=''>68</td></tr><tr><td class=''>8</td><td class=''>27</td><td class=''>43</td><td class=''>58</td><td class=''>75</td></tr></table></body></html>",
    "size": 5,
    "freeSpace": true,
    "totalCells": 25,
    "winningPatterns": [
      "horizontal",
      "vertical",
      "diagonal",
      "four corners",
      "blackout (all cells)"
    ],
    "image": {
      "imageName": "8dcb6cee-a419-4501-a13c-ff6eafd393b7_bingo.png",
      "format": ".png",
      "downloadURL": "https://storage.googleapis.com/apiverve/APIData/bingocardgenerator/8dcb6cee-a419-4501-a13c-ff6eafd393b7_bingo.png?GoogleAccessId=635500398038-compute%40developer.gserviceaccount.com&Expires=1766010022&Signature=ErKaS3I1DaHCBxYRxnjx5QLHm0S3zfpJIWzz7BosGyhDwYSejCHlfcSI%2BKOHJzxEiUdSWFFt947%2BLzHGpVZrLYPxGGvgCVPOKZ4H9vfgyJPP%2BF9LICc9kLG6%2FwevlPsAHHHLjoLS%2F7OVByiwzTWguRzcbyYT44XpbbU0IsOA40S7Utqt%2BjAC5%2FSfhW4z%2FdJE2yXsSNqr3acEJB70cVde3qkP80Iv6H7%2FZB08EDjbakauJmjASJ86H%2BWM2b9BPo250bBzLtGPxW8KZUVgy79SDxJu8VVnzAhiWzcmih9UrBUvejuxkbPIAx6ohwHepmh414G0wvAcxtHRaXx4O5cr7g%3D%3D",
      "expires": 1766010022446
    }
  }
}
```

---

## Customer Support

Need any assistance? [Get in touch with Customer Support](https://apiverve.com/contact?utm_source=npm&utm_medium=readme).

---

## Updates

Stay up to date by following [@apiverveHQ](https://twitter.com/apiverveHQ) on Twitter.

---

## Legal

All usage of the APIVerve website, API, and services is subject to the [APIVerve Terms of Service](https://apiverve.com/terms?utm_source=npm&utm_medium=readme), [Privacy Policy](https://apiverve.com/privacy?utm_source=npm&utm_medium=readme), and [Refund Policy](https://apiverve.com/refund?utm_source=npm&utm_medium=readme).

---

## License
Licensed under the The MIT License (MIT)

Copyright (&copy;) 2026 APIVerve, and EvlarSoft LLC

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
