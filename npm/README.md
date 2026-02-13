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
  freeSpace: true
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
  freeSpace: true
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
  freeSpace: true
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
        6,
        25,
        45,
        55,
        71
      ],
      [
        3,
        28,
        42,
        60,
        67
      ],
      [
        7,
        23,
        "FREE",
        46,
        65
      ],
      [
        9,
        17,
        38,
        51,
        64
      ],
      [
        2,
        22,
        40,
        47,
        74
      ]
    ],
    "html": "<html><head><title>Bingo Card</title><style>body {font-family: Arial, sans-serif; padding: 20px;}table {border-collapse: collapse; margin: 0 auto;}td {text-align: center; width: 60px; height: 60px; border: 2px solid #000; font-size: 20px; font-weight: bold;}th {text-align: center; width: 60px; height: 40px; border: 2px solid #000; font-size: 24px; font-weight: bold; background-color: #4CAF50; color: white;}.free-space {background-color: #FFD700; font-size: 14px;}</style></head><body><table><tr><th>B</th><th>I</th><th>N</th><th>G</th><th>O</th></tr><tr><td class=''>6</td><td class=''>25</td><td class=''>45</td><td class=''>55</td><td class=''>71</td></tr><tr><td class=''>3</td><td class=''>28</td><td class=''>42</td><td class=''>60</td><td class=''>67</td></tr><tr><td class=''>7</td><td class=''>23</td><td class='free-space'>FREE</td><td class=''>46</td><td class=''>65</td></tr><tr><td class=''>9</td><td class=''>17</td><td class=''>38</td><td class=''>51</td><td class=''>64</td></tr><tr><td class=''>2</td><td class=''>22</td><td class=''>40</td><td class=''>47</td><td class=''>74</td></tr></table></body></html>",
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
      "imageName": "7a2d29de-e859-4781-9f2b-07e710ce844a_bingo.png",
      "format": ".png",
      "downloadURL": "https://storage.googleapis.com/apiverve.appspot.com/bingocardgenerator/7a2d29de-e859-4781-9f2b-07e710ce844a_bingo.png?GoogleAccessId=635500398038-compute%40developer.gserviceaccount.com&Expires=1763673874&Signature=LqXQF7sY%2FlwYmx9APPty2uCXUfcCOVd%2Fa2%2BAHfbz%2FAdiP3lKDOvWXoL%2FyHbbAkha7ZV4fU4T%2BuJNhzoR4qjBZJS1VALQMmy7uriek4cEn%2BbYD7A4MPn5o3cEVl%2Bx2bsNpRR8LkHeVmrFdlxjjkL9CF36%2BfeX41TNxGwRo8UIfYsGsiMsCu6RjZcDsamGKkh%2FQsPwoAwH%2F2UyDIvAHaeeJDuBiLj7eW51VI8ho0UkdFblw3RD1md%2BJwWQSvuMoUpU1tfxaGHUUImp%2BDF1lqBeeYFBwOHyoypGnp37bkwpkCqW3tBTatWgB5oXFtmBX6lqglINn0tNHCm0sJs2wxS%2BLw%3D%3D",
      "expires": 1763673874491
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
