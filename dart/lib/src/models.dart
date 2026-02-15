/// Response models for the Bingo Card Generator API.

/// API Response wrapper.
class BingocardgeneratorResponse {
  final String status;
  final dynamic error;
  final BingocardgeneratorData? data;

  BingocardgeneratorResponse({
    required this.status,
    this.error,
    this.data,
  });

  factory BingocardgeneratorResponse.fromJson(Map<String, dynamic> json) => BingocardgeneratorResponse(
    status: json['status'] as String? ?? '',
    error: json['error'],
    data: json['data'] != null ? BingocardgeneratorData.fromJson(json['data']) : null,
  );

  Map<String, dynamic> toJson() => {
    'status': status,
    if (error != null) 'error': error,
    if (data != null) 'data': data,
  };
}

/// Response data for the Bingo Card Generator API.

class BingocardgeneratorData {
  List<BingocardgeneratorDataCardItem>? card;
  String? html;
  int? size;
  bool? freeSpace;
  int? totalCells;
  List<String>? winningPatterns;
  BingocardgeneratorDataImage? image;

  BingocardgeneratorData({
    this.card,
    this.html,
    this.size,
    this.freeSpace,
    this.totalCells,
    this.winningPatterns,
    this.image,
  });

  factory BingocardgeneratorData.fromJson(Map<String, dynamic> json) => BingocardgeneratorData(
      card: (json['card'] as List?)?.map((e) => BingocardgeneratorDataCardItem.fromJson(e)).toList(),
      html: json['html'],
      size: json['size'],
      freeSpace: json['freeSpace'],
      totalCells: json['totalCells'],
      winningPatterns: (json['winningPatterns'] as List?)?.cast<String>(),
      image: json['image'] != null ? BingocardgeneratorDataImage.fromJson(json['image']) : null,
    );
}

class BingocardgeneratorDataCardItem {
  int? 0;
  int? 1;
  int? 2;
  int? 3;
  int? 4;

  BingocardgeneratorDataCardItem({
    this.0,
    this.1,
    this.2,
    this.3,
    this.4,
  });

  factory BingocardgeneratorDataCardItem.fromJson(Map<String, dynamic> json) => BingocardgeneratorDataCardItem(
      0: json['0'],
      1: json['1'],
      2: json['2'],
      3: json['3'],
      4: json['4'],
    );
}

class BingocardgeneratorDataImage {
  String? imageName;
  String? format;
  String? downloadURL;
  int? expires;

  BingocardgeneratorDataImage({
    this.imageName,
    this.format,
    this.downloadURL,
    this.expires,
  });

  factory BingocardgeneratorDataImage.fromJson(Map<String, dynamic> json) => BingocardgeneratorDataImage(
      imageName: json['imageName'],
      format: json['format'],
      downloadURL: json['downloadURL'],
      expires: json['expires'],
    );
}

class BingocardgeneratorRequest {
  int? size;
  bool? freeSpace;

  BingocardgeneratorRequest({
    this.size,
    this.freeSpace,
  });

  Map<String, dynamic> toJson() => {
      if (size != null) 'size': size,
      if (freeSpace != null) 'freeSpace': freeSpace,
    };
}
