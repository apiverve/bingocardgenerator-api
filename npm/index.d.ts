declare module '@apiverve/bingocardgenerator' {
  export interface bingocardgeneratorOptions {
    api_key: string;
    secure?: boolean;
  }

  export interface bingocardgeneratorResponse {
    status: string;
    error: string | null;
    data: BingoCardGeneratorData;
    code?: number;
  }


  interface BingoCardGeneratorData {
      card:            Array<Card[]>;
      html:            string;
      size:            number;
      freeSpace:       boolean;
      totalCells:      number;
      winningPatterns: string[];
      image:           Image;
  }
  
  type Card = number | string;
  
  interface Image {
      imageName:   string;
      format:      string;
      downloadURL: string;
      expires:     number;
  }

  export default class bingocardgeneratorWrapper {
    constructor(options: bingocardgeneratorOptions);

    execute(callback: (error: any, data: bingocardgeneratorResponse | null) => void): Promise<bingocardgeneratorResponse>;
    execute(query: Record<string, any>, callback: (error: any, data: bingocardgeneratorResponse | null) => void): Promise<bingocardgeneratorResponse>;
    execute(query?: Record<string, any>): Promise<bingocardgeneratorResponse>;
  }
}
