# Bingo Card Generator API - Dart/Flutter Client

Bingo Card Generator creates customizable bingo cards with random numbers, HTML rendering, and downloadable PNG images.

[![pub package](https://img.shields.io/pub/v/apiverve_bingocardgenerator.svg)](https://pub.dev/packages/apiverve_bingocardgenerator)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

This is the Dart/Flutter client for the [Bingo Card Generator API](https://apiverve.com/marketplace/bingocardgenerator?utm_source=dart&utm_medium=readme).

## Installation

Add this to your `pubspec.yaml`:

```yaml
dependencies:
  apiverve_bingocardgenerator: ^1.1.14
```

Then run:

```bash
dart pub get
# or for Flutter
flutter pub get
```

## Usage

```dart
import 'package:apiverve_bingocardgenerator/apiverve_bingocardgenerator.dart';

void main() async {
  final client = BingocardgeneratorClient('YOUR_API_KEY');

  try {
    final response = await client.execute({
      'size': 5,
      'freeSpace': true
    });

    print('Status: ${response.status}');
    print('Data: ${response.data}');
  } catch (e) {
    print('Error: $e');
  }
}
```

## Response

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

## API Reference

- **API Home:** [Bingo Card Generator API](https://apiverve.com/marketplace/bingocardgenerator?utm_source=dart&utm_medium=readme)
- **Documentation:** [docs.apiverve.com/ref/bingocardgenerator](https://docs.apiverve.com/ref/bingocardgenerator?utm_source=dart&utm_medium=readme)

## Authentication

All requests require an API key. Get yours at [apiverve.com](https://apiverve.com?utm_source=dart&utm_medium=readme).

## License

MIT License - see [LICENSE](LICENSE) for details.

---

Built with Dart for [APIVerve](https://apiverve.com?utm_source=dart&utm_medium=readme)
