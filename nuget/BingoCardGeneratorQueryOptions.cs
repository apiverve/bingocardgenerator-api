using System;
using System.Collections.Generic;
using System.Text;
using Newtonsoft.Json;

namespace APIVerve.API.BingoCardGenerator
{
    /// <summary>
    /// Query options for the Bingo Card Generator API
    /// </summary>
    public class BingoCardGeneratorQueryOptions
    {
        /// <summary>
        /// Card size (3x3 to 10x10)
        /// </summary>
        [JsonProperty("size")]
        public int? Size { get; set; }

        /// <summary>
        /// Include free space in center
        /// </summary>
        [JsonProperty("freeSpace")]
        public bool? FreeSpace { get; set; }

        /// <summary>
        /// Set to true to generate a downloadable bingo card image
        /// </summary>
        [JsonProperty("image")]
        public bool? Image { get; set; }
    }
}
