Bingo Card Generator API
============

Bingo Card Generator creates customizable bingo cards with random numbers, HTML rendering, and downloadable PNG images.

![Build Status](https://img.shields.io/badge/build-passing-green)
![Code Climate](https://img.shields.io/badge/maintainability-B-purple)
![Prod Ready](https://img.shields.io/badge/production-ready-blue)

This is a Python API Wrapper for the [Bingo Card Generator API](https://apiverve.com/marketplace/api/bingocardgenerator)

---

## Installation
	pip install apiverve-bingocardgenerator

---

## Configuration

Before using the bingocardgenerator API client, you have to setup your account and obtain your API Key.  
You can get it by signing up at [https://apiverve.com](https://apiverve.com)

---

## Usage

The Bingo Card Generator API documentation is found here: [https://docs.apiverve.com/api/bingocardgenerator](https://docs.apiverve.com/api/bingocardgenerator).  
You can find parameters, example responses, and status codes documented here.

### Setup

```
# Import the client module
from apiverve_bingocardgenerator.apiClient import BingocardgeneratorAPIClient

# Initialize the client with your APIVerve API key
api = BingocardgeneratorAPIClient("[YOUR_API_KEY]")
```

---


### Perform Request
Using the API client, you can perform requests to the API.

###### Define Query

```
query = { "size": 5, "freeSpace": true }
```

###### Simple Request

```
# Make a request to the API
result = api.execute(query)

# Print the result
print(result)
```

###### Example Response

```
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

Need any assistance? [Get in touch with Customer Support](https://apiverve.com/contact).

---

## Updates
Stay up to date by following [@apiverveHQ](https://twitter.com/apiverveHQ) on Twitter.

---

## Legal

All usage of the APIVerve website, API, and services is subject to the [APIVerve Terms of Service](https://apiverve.com/terms) and all legal documents and agreements.

---

## License
Licensed under the The MIT License (MIT)

Copyright (&copy;) 2025 APIVerve, and EvlarSoft LLC

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.