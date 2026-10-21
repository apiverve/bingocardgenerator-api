# Bingo Card Generator API - Ruby Gem

Bingo Card Generator is a bingo API that creates customizable bingo cards with random numbers as JSON, with HTML rendering and downloadable PNG images on paid plans.

## Installation

Add this line to your application's Gemfile:

```ruby
gem 'apiverve_bingocardgenerator'
```

And then execute:

```bash
$ bundle install
```

Or install it yourself as:

```bash
$ gem install apiverve_bingocardgenerator
```

## Getting Started

Get your API key at [APIVerve](https://apiverve.com)

### Basic Usage

```ruby
require 'apiverve_bingocardgenerator'

# Initialize the client
client = APIVerve::Bingocardgenerator::Client.new(api_key: "YOUR_API_KEY")

# Make a request
response = client.execute({
  size: 5,
  freeSpace: true,
  image: true
})

# Print the response
puts response
```


### Error Handling

```ruby
begin
  response = client.execute({ size: 5, freeSpace: true, image: true })
  puts response["data"]
rescue APIVerve::Bingocardgenerator::ValidationError => e
  puts "Validation error: #{e.errors.join(', ')}"
rescue APIVerve::Bingocardgenerator::APIError => e
  puts "API error: #{e.message}"
  puts "Status code: #{e.status_code}"
end
```

### Debug Mode

```ruby
# Enable debug logging
client = APIVerve::Bingocardgenerator::Client.new(
  api_key: "YOUR_API_KEY",
  debug: true
)
```

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

## Documentation

For more information, visit the [API Documentation](https://docs.apiverve.com/ref/bingocardgenerator?utm_source=rubygems&utm_medium=referral&utm_content=readme).

## Support

- Website: [https://apiverve.com/marketplace/bingocardgenerator?utm_source=ruby&utm_medium=referral&utm_content=readme](https://apiverve.com/marketplace/bingocardgenerator?utm_source=ruby&utm_medium=referral&utm_content=readme)
- Email: hello@apiverve.com

## License

This gem is available under the [MIT License](LICENSE).
