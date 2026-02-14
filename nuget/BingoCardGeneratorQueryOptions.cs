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
        public string Size { get; set; }

        /// <summary>
        /// Include free space in center
        /// </summary>
        [JsonProperty("freeSpace")]
        public string FreeSpace { get; set; }
    }
}
