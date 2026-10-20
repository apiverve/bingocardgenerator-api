Bingo Card Generator API
============

Bingo Card Generator is a bingo API that creates customizable bingo cards with random numbers as JSON, with HTML rendering and downloadable PNG images on paid plans.


[![PyPI version](https://img.shields.io/pypi/v/apiverve-bingocardgenerator.svg)](https://pypi.org/project/apiverve-bingocardgenerator/)

This is a Python wrapper for the [Bingo Card Generator API](https://apiverve.com/marketplace/bingocardgenerator?utm_source=pypi&utm_medium=referral&utm_content=readme)

---

## Installation

Using `pip`:

```bash
pip install apiverve-bingocardgenerator
```

Using `pip3`:

```bash
pip3 install apiverve-bingocardgenerator
```

---

## Configuration

Before using the Bingo Card Generator API client, you have to setup your account and obtain your API Key.
You can get it by signing up at [https://apiverve.com](https://apiverve.com?utm_source=pypi&utm_medium=referral&utm_content=readme)

---

## Quick Start

Here's a simple example to get you started quickly:

```python
from apiverve_bingocardgenerator.apiClient import BingocardgeneratorAPIClient

# Initialize the client with your APIVerve API key
api = BingocardgeneratorAPIClient("[YOUR_API_KEY]")

query = {
    "size": 5,
    "freeSpace": true,
    "image": true
}

try:
    # Make the API call
    result = api.execute(query)

    # Print the result
    print(result)
except Exception as e:
    print(f"Error: {e}")
```

---

## Usage

The Bingo Card Generator API documentation is found here: [https://docs.apiverve.com/ref/bingocardgenerator](https://docs.apiverve.com/ref/bingocardgenerator?utm_source=pypi&utm_medium=referral&utm_content=readme).
You can find parameters, example responses, and status codes documented here.

### Setup

```python
# Import the client module
from apiverve_bingocardgenerator.apiClient import BingocardgeneratorAPIClient

# Initialize the client with your APIVerve API key
api = BingocardgeneratorAPIClient("[YOUR_API_KEY]")
```

---

## Perform Request

Using the API client, you can perform requests to the API.

###### Define Query

```python
query = {
    "size": 5,
    "freeSpace": true,
    "image": true
}
```

###### Simple Request

```python
# Make a request to the API
result = api.execute(query)

# Print the result
print(result)
```

###### Example Response

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

## Error Handling

The API client provides comprehensive error handling through the `BingocardgeneratorAPIClientError` exception. Here are some examples:

### Basic Error Handling

```python
from apiverve_bingocardgenerator.apiClient import BingocardgeneratorAPIClient, BingocardgeneratorAPIClientError

api = BingocardgeneratorAPIClient("[YOUR_API_KEY]")

query = {
    "size": 5,
    "freeSpace": true,
    "image": true
}

try:
    result = api.execute(query)
    print("Success!")
    print(result)
except BingocardgeneratorAPIClientError as e:
    print(f"API Error: {e.message}")
    if e.status_code:
        print(f"Status Code: {e.status_code}")
    if e.response:
        print(f"Response: {e.response}")
```

### Handling Specific Error Types

```python
from apiverve_bingocardgenerator.apiClient import BingocardgeneratorAPIClient, BingocardgeneratorAPIClientError

api = BingocardgeneratorAPIClient("[YOUR_API_KEY]")

query = {
    "size": 5,
    "freeSpace": true,
    "image": true
}

try:
    result = api.execute(query)

    # Check for successful response
    if result.get('status') == 'success':
        print("Request successful!")
        print(result.get('data'))
    else:
        print(f"API returned an error: {result.get('error')}")

except BingocardgeneratorAPIClientError as e:
    # Handle API client errors
    if e.status_code == 401:
        print("Unauthorized: Invalid API key")
    elif e.status_code == 429:
        print("Rate limit exceeded")
    elif e.status_code >= 500:
        print("Server error - please try again later")
    else:
        print(f"API error: {e.message}")
except Exception as e:
    # Handle unexpected errors
    print(f"Unexpected error: {str(e)}")
```

### Using Context Manager (Recommended)

The client supports the context manager protocol for automatic resource cleanup:

```python
from apiverve_bingocardgenerator.apiClient import BingocardgeneratorAPIClient, BingocardgeneratorAPIClientError

query = {
    "size": 5,
    "freeSpace": true,
    "image": true
}

# Using context manager ensures proper cleanup
with BingocardgeneratorAPIClient("[YOUR_API_KEY]") as api:
    try:
        result = api.execute(query)
        print(result)
    except BingocardgeneratorAPIClientError as e:
        print(f"Error: {e.message}")
# Session is automatically closed here
```

---

## Advanced Features

### Debug Mode

Enable debug logging to see detailed request and response information:

```python
from apiverve_bingocardgenerator.apiClient import BingocardgeneratorAPIClient

# Enable debug mode
api = BingocardgeneratorAPIClient("[YOUR_API_KEY]", debug=True)

query = {
    "size": 5,
    "freeSpace": true,
    "image": true
}

# Debug information will be printed to console
result = api.execute(query)
```

### Manual Session Management

If you need to manually manage the session lifecycle:

```python
from apiverve_bingocardgenerator.apiClient import BingocardgeneratorAPIClient

api = BingocardgeneratorAPIClient("[YOUR_API_KEY]")

query = {
    "size": 5,
    "freeSpace": true,
    "image": true
}

try:
    result = api.execute(query)
    print(result)
finally:
    # Manually close the session when done
    api.close()
```

---

## Customer Support

Need any assistance? [Get in touch with Customer Support](https://apiverve.com/contact?utm_source=pypi&utm_medium=referral&utm_content=readme).

---

## Updates
Stay up to date by following [@apiverveHQ](https://twitter.com/apiverveHQ) on Twitter.

---

## Legal

All usage of the APIVerve website, API, and services is subject to the [APIVerve Terms of Service](https://apiverve.com/terms?utm_source=pypi&utm_medium=referral&utm_content=readme) and all legal documents and agreements.

---

## License
Licensed under the MIT License (MIT)

Copyright (&copy;) 2026 APIVerve, and EvlarSoft LLC

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
