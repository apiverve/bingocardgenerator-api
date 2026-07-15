declare module '@apiverve/bingocardgenerator' {
  export interface bingocardgeneratorOptions {
    api_key: string;
    secure?: boolean;
  }

  /**
   * Describes fields the current plan does not unlock. Locked fields arrive as null
   * in `data`; `locked_fields` names them, using dot paths for nested fields.
   * Absent when the plan unlocks everything.
   */
  export interface PremiumInfo {
    message: string;
    upgrade_url: string;
    locked_fields: string[];
  }

  export interface bingocardgeneratorResponse {
    status: string;
    error: string | null;
    data: BingoCardGeneratorData;
    code?: number;
    premium?: PremiumInfo;
  }


  interface BingoCardGeneratorData {
      card:            Array<Card[]>;
      html:            null | string;
      size:            number | null;
      freeSpace:       boolean | null;
      totalCells:      number | null;
      winningPatterns: (null | string)[];
      image:           Image;
  }
  
  type Card = number | null | string;
  
  interface Image {
      imageName:   null | string;
      format:      null | string;
      downloadURL: null | string;
      expires:     number | null;
  }

  export default class bingocardgeneratorWrapper {
    constructor(options: bingocardgeneratorOptions);

    execute(callback: (error: any, data: bingocardgeneratorResponse | null) => void): Promise<bingocardgeneratorResponse>;
    execute(query: Record<string, any>, callback: (error: any, data: bingocardgeneratorResponse | null) => void): Promise<bingocardgeneratorResponse>;
    execute(query?: Record<string, any>): Promise<bingocardgeneratorResponse>;
  }
}
