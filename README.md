# [Bingo Card Generator API](https://apiverve.com/marketplace/bingocardgenerator?utm_source&#x3D;github&amp;utm_medium&#x3D;readme)

Bingo Card Generator creates customizable bingo cards with random numbers, HTML rendering, and downloadable PNG images.

The Bingo Card Generator API provides a simple, reliable way to integrate bingo card generator functionality into your applications. Built for developers who need production-ready bingo card generator capabilities without the complexity of building from scratch.

**[View API Details →](https://apiverve.com/marketplace/bingocardgenerator?utm_source&#x3D;github&amp;utm_medium&#x3D;readme)**

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![API Status](https://img.shields.io/badge/Status-Active-green.svg)](https://apiverve.com/marketplace/bingocardgenerator?utm_source&#x3D;github&amp;utm_medium&#x3D;readme)
[![Method](https://img.shields.io/badge/Method-GET-blue.svg)](#)
[![Platform](https://img.shields.io/badge/Platform-Multi--Platform-orange.svg)](#installation)

**Available on:**
[![npm](https://img.shields.io/badge/npm-CB3837?style=flat&logo=npm&logoColor=white)](https://www.npmjs.com/package/@apiverve/bingocardgenerator)
[![NuGet](https://img.shields.io/badge/NuGet-004880?style=flat&logo=nuget&logoColor=white)](https://www.nuget.org/packages/APIVerve.API.BingoCardGenerator)
[![PyPI](https://img.shields.io/badge/PyPI-3776AB?style=flat&logo=python&logoColor=white)](https://pypi.org/project/apiverve-bingocardgenerator/)
[![RubyGems](https://img.shields.io/badge/RubyGems-E9573F?style=flat&logo=rubygems&logoColor=white)](https://rubygems.org/gems/apiverve_bingocardgenerator)
[![Packagist](https://img.shields.io/badge/Packagist-F28D1A?style=flat&logo=packagist&logoColor=white)](https://packagist.org/packages/apiverve/bingocardgenerator)
[![Go](https://img.shields.io/badge/Go-00ADD8?style=flat&logo=go&logoColor=white)](#-go)
[![Dart](https://img.shields.io/badge/Dart-0175C2?style=flat&logo=dart&logoColor=white)](https://pub.dev/packages/apiverve_bingocardgenerator)
[![JitPack](https://img.shields.io/badge/JitPack-2E7D32?style=flat&logo=android&logoColor=white)](#-android-jitpack)

---

## Quick Start

### Using JavaScript

```javascript
async function callBingoCardGeneratorAPI() {
    try {
        const params = new URLSearchParams({
            size: 5,
            freeSpace: true
        });

        const response = await fetch(`https://api.apiverve.com/v1/bingocardgenerator?${params}`, {
            method: 'GET',
            headers: {
                'x-api-key': 'YOUR_API_KEY_HERE'
            }
        });

        const data = await response.json();
        console.log(data);
    } catch (error) {
        console.error('Error:', error);
    }
}

callBingoCardGeneratorAPI();
```

### Using cURL

```bash
curl -X GET "https://api.apiverve.com/v1/bingocardgenerator?size=5&freeSpace=true" \
  -H "x-api-key: YOUR_API_KEY_HERE"
```

**Get your API key:** [https://apiverve.com](https://apiverve.com)

**📁 For more examples, see the [examples folder](./examples/)**

---

## Installation

Choose your preferred programming language:

### 📦 NPM (JavaScript/Node.js)

```bash
npm install @apiverve/bingocardgenerator
```

[**View NPM Package →**](https://www.npmjs.com/package/@apiverve/bingocardgenerator) | [**Package Code →**](./npm/)

---

### 🔷 NuGet (.NET/C#)

```bash
dotnet add package APIVerve.API.BingoCardGenerator
```

[**View NuGet Package →**](https://www.nuget.org/packages/APIVerve.API.BingoCardGenerator) | [**Package Code →**](./nuget/)

---

### 🐍 Python (PyPI)

```bash
pip install apiverve-bingocardgenerator
```

[**View PyPI Package →**](https://pypi.org/project/apiverve-bingocardgenerator/) | [**Package Code →**](./python/)

---

### 💎 Ruby (RubyGems)

```bash
gem install apiverve_bingocardgenerator
```

[**View RubyGems Package →**](https://rubygems.org/gems/apiverve_bingocardgenerator) | [**Package Code →**](./ruby/)

---

### 🐘 PHP (Packagist)

```bash
composer require apiverve/bingocardgenerator
```

[**View Packagist Package →**](https://packagist.org/packages/apiverve/bingocardgenerator) | [**Package Code →**](./php/)

---

### 🎯 Dart (pub.dev)

```bash
dart pub add apiverve_bingocardgenerator
```

[**View pub.dev Package →**](https://pub.dev/packages/apiverve_bingocardgenerator) | [**Package Code →**](./dart/)

---

### 🤖 Android (JitPack)

```gradle
implementation 'com.github.apiverve:bingocardgenerator-api:1.0.0'
```

[**Package Code →**](./android/)

---

### 🐹 Go

```bash
go get github.com/apiverve/bingocardgenerator-api/go
```

[**Package Code →**](./go/)

---

## Why Use This API?

| Feature | Benefit |
|---------|---------|
| **Multi-language SDKs** | Native packages for JavaScript, Python, C#, Go, and Android |
| **Simple Integration** | Single API key authentication, consistent response format |
| **Production Ready** | 99.9% uptime SLA, served from 24 global regions |
| **Comprehensive Docs** | Full examples, OpenAPI spec, and dedicated support |

---

## Documentation

- 🏠 **API Home:** [Bingo Card Generator API](https://apiverve.com/marketplace/bingocardgenerator?utm_source&#x3D;github&amp;utm_medium&#x3D;readme)
- 📚 **API Reference:** [docs.apiverve.com/ref/bingocardgenerator](https://docs.apiverve.com/ref/bingocardgenerator)
- 📖 **OpenAPI Spec:** [openapi.yaml](./openapi.yaml)
- 💡 **Examples:** [examples/](./examples/)

---

## What Can You Build?

The Bingo Card Generator API is commonly used for:

- **Web Applications** - Add bingo card generator features to your frontend or backend
- **Mobile Apps** - Native SDKs for Android development
- **Automation** - Integrate with n8n, Zapier, or custom workflows
- **SaaS Products** - Enhance your product with bingo card generator capabilities
- **Data Pipelines** - Process and analyze data at scale

---

## API Reference

### Authentication
All requests require an API key in the header:
```
x-api-key: YOUR_API_KEY_HERE
```

Get your API key: [https://apiverve.com](https://apiverve.com)

### Response Format

Every APIVerve endpoint returns the same envelope — check `status`, then read `data`:

```json
{
  "status": "ok",
  "error": null,
  "data": { ... }
}
```

### Example Response

A real response from the Bingo Card Generator API:

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

## Support & Community

- 🏠 **API Home**: [Bingo Card Generator API](https://apiverve.com/marketplace/bingocardgenerator?utm_source&#x3D;github&amp;utm_medium&#x3D;readme)
- 💬 **Support**: [https://apiverve.com/contact](https://apiverve.com/contact)
- 🐛 **Issues**: [GitHub Issues](../../issues)
- 📖 **Documentation**: [https://docs.apiverve.com](https://docs.apiverve.com)
- 🌐 **Website**: [https://apiverve.com](https://apiverve.com)

---

## Contributing

We welcome contributions! Please see [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines.

---

## Security

For security concerns, please review our [Security Policy](SECURITY.md).

---

## License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

---

## Acknowledgments

Built with ❤️ by [APIVerve](https://apiverve.com)

Copyright © 2026 APIVerve. All rights reserved.
