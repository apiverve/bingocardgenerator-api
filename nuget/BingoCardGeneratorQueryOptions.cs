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
        /// Card size (3-10)
        /// Example: 5
        /// </summary>
        [JsonProperty("size")]
        public string Size { get; set; }

        /// <summary>
        /// Include free space in center
        /// Example: true
        /// </summary>
        [JsonProperty("freeSpace")]
        public string FreeSpace { get; set; }
    }
}
